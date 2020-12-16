select * from customer;
select * from book;
select * from bookorders;

select bk.bookname"������", nvl(bko.saleprice,0)"�ǸŰ���"
from book bk left outer join bookorders bko
on bko.bookid = bk.bookid;

select cu.name "����", (select bookname from book bk
where bk.bookid=bko.bookid) "���ŵ�����"
from customer cu left outer join bookorders bko
on cu.custid = bko.custid;
--�����������

select cu.name "����", nvl((select bookname from book bk 
where bk.bookid=bko.bookid),'�����̷¾���')"������"
from customer cu left outer join bookorders bko
on cu.custid = bko.custid;

select name from customer
where custid in(select custid from bookorders);

select name from customer
where custid in(select custid from bookorders
where bookid in(select bookid from book where publisher='���ѹ̵��'));

insert into customer(custid,name,address)
values (6,'�迬��','���ѹα� ����');

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
-- Ƚ�� count

select cu.custid, cu.name, count(*)
from customer cu, bookorders bko
where bko.custid=cu.custid
group by cu.custid, cu.name
having count(*) >= (select avg(count(*)) from bookorders
group by custid);

select rownum "����", cu.custid,cu.name,bk.bookname
from customer cu, book bk,bookorders bko
where cu.custid=bko.custid and bk.bookid=bko.bookid
and saleprice >=20000;

select bko.bookid,bk.bookname, count(*), sum(saleprice)
from book bk, bookorders bko
where bk.bookid=bko.bookid
group by bko.bookid, bk.bookname;

create view salebook_vw
as select bko.bookid,bk.bookname, count(*)"�Ǽ�", sum(saleprice)"�Ǹž�"
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
--�ܷ�Ű �⺻Ű �߰�


insert into newbookorders(orderid,memberid,bookid,saleprice)
values (1,1,1,10000);

update book set publisher='�½�����'
where bookid=3;

update customer
set address='���ѹα� �λ�'
where custid=6;

select bookname, sum(saleprice) "�Ǹž�",
round(avg(saleprice),0)"���"
from book bk, bookorders bko
where bko.bookid=bk.bookid
group by bookname;

select count(*) "�Ǹźμ�", sum(saleprice) "���Ǹž�", avg(saleprice) "���"
from bookorders;

