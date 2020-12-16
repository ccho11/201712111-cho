select * from customer;
select * from book;
select * from bookorders;

select bk.bookname"도서명", nvl(bko.saleprice,0)"판매가격"
from book bk left outer join bookorders bko
on bko.bookid = bk.bookid;

select cu.name "고객명", (select bookname from book bk
where bk.bookid=bko.bookid) "구매도서명"
from customer cu left outer join bookorders bko
on cu.custid = bko.custid;
--서브쿼리사용

select cu.name "고객명", nvl((select bookname from book bk 
where bk.bookid=bko.bookid),'구매이력없음')"도서명"
from customer cu left outer join bookorders bko
on cu.custid = bko.custid;

select name from customer
where custid in(select custid from bookorders);

select name from customer
where custid in(select custid from bookorders
where bookid in(select bookid from book where publisher='대한미디어'));

insert into customer(custid,name,address)
values (6,'김연아','대한민국 대전');

insert into bookorders(orderid, custid, bookid, saleprice) 
values(12, 6, 3, 21000);

select bko.custid,name,sum(saleprice)
from customer cu, bookorders bko
where bko.custid=cu.custid
group by bko.custid, cu.name
order by bko.custid;

select cu.custid, cu.name, count(*)
from customer cu, bookorders bko
where bko.custid=cu.custid
group by cu.custid, cu.name;
-- 횟수 count

select cu.custid, cu.name, count(*)
from customer cu, bookorders bko
where bko.custid=cu.custid
group by cu.custid, cu.name
having count(*) >= (select avg(count(*)) from bookorders
group by custid);

select rownum "순번", cu.custid,cu.name,bk.bookname
from customer cu, book bk,bookorders bko
where cu.custid=bko.custid and bk.bookid=bko.bookid
and saleprice >=20000;

select bko.bookid,bk.bookname, count(*), sum(saleprice)
from book bk, bookorders bko
where bk.bookid=bko.bookid
group by bko.bookid, bk.bookname;

create view salebook_vw
as select bko.bookid,bk.bookname, count(*)"권수", sum(saleprice)"판매액"
from book bk, bookorders bko
where bk.bookid=bko.bookid
group by bko.bookid, bk.bookname;

select * from salebook_vw
order by bookid;

drop table salebook_vw;


create table newbookorders(
orderid number,
memberid number,
bookid number,
saleprice number not null,
orderdate date DEFAULT sysdate,
primary key(orderid),
foreign key(memberid) references customer
);

alter table newbookorders
add FOREIGN KEY(bookid) REFERENCES book(bookid);
--외래키 기본키 추가


insert into newbookorders(orderid,memberid,bookid,saleprice)
values (1,1,1,10000);

update book set publisher='굿스포츠'
where bookid=3;

update customer
set address='대한민국 부산'
where custid=6;

select bookname, sum(saleprice) "판매액",
round(avg(saleprice),0)"평균"
from book bk, bookorders bko
where bko.bookid=bk.bookid
group by bookname;

select count(*) "판매부수", sum(saleprice) "총판매액", avg(saleprice) "평균"
from bookorders;

