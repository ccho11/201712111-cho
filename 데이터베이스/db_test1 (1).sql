create role programmer;

grant connect,resource, create view to programmer;

create user dituser101
identified by ditdb20;

grant programmer to dituser101;

select trunc(4.875, 0)
from dual;

select round(4.652,2)
from dual;

select custid "고객번호", round(AVG(saleprice),-2) "평균금액"
from orders
group by custid
order by custid;

select ename, lower(ename), job, initcap(job)
from employee;

select bookname, length(bookname)
from book
where bookid=1;

select bookid, replace(bookname, '야구','농구') bookname,
publisher, price
from book;

select substr(name,1,1)"성",count(*)"인원"
from customer
group by substr(name,1,1);

select sysdate from dual;

select round(sysdate-hiredate)"근무일수"
from employee;

select ename, sysdate, hiredate,
trunc(month_between(sysdate, hiredate)) "근무월수"
from employee;

select orderid "주문번호", orderdate "주문일",
orderdate+10 "확장일"
from orders;

select ename, hiredate
from employee
where hiredate = to_date(19810220,'YYYYMMDD');

select orderid, to_char(orderdate, 'yyyy-mm-dd dy') custid, bookid
from orders
where orderdate=to_date('20190707', 'yyyymmdd');

select * from employee
where commission is not null;

insert into customer(custid, name, address)
values(7,'손흥민','영국 토트넘');

SELECT
    *
FROM customer;

select name "이름", nvl(phone,'연락처없음')"전화번호"
from customer;

select rownum "순번", custid, name, phone
from customer
where address like '대한민국%';

select rownum "순번", custid, name, phone
from customer
where rownum <=2
order by name;

select rownum "순번", custid, name, phone
from(select custid, name, phone
from customer
order by name)
where rownum<=2;

