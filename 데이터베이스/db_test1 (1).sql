create role programmer;

grant connect,resource, create view to programmer;

create user dituser101
identified by ditdb20;

grant programmer to dituser101;

select trunc(4.875, 0)
from dual;

select round(4.652,2)
from dual;

select custid "����ȣ", round(AVG(saleprice),-2) "��ձݾ�"
from orders
group by custid
order by custid;

select ename, lower(ename), job, initcap(job)
from employee;

select bookname, length(bookname)
from book
where bookid=1;

select bookid, replace(bookname, '�߱�','��') bookname,
publisher, price
from book;

select substr(name,1,1)"��",count(*)"�ο�"
from customer
group by substr(name,1,1);

select sysdate from dual;

select round(sysdate-hiredate)"�ٹ��ϼ�"
from employee;

select ename, sysdate, hiredate,
trunc(month_between(sysdate, hiredate)) "�ٹ�����"
from employee;

select orderid "�ֹ���ȣ", orderdate "�ֹ���",
orderdate+10 "Ȯ����"
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
values(7,'�����','���� ��Ʈ��');

SELECT
    *
FROM customer;

select name "�̸�", nvl(phone,'����ó����')"��ȭ��ȣ"
from customer;

select rownum "����", custid, name, phone
from customer
where address like '���ѹα�%';

select rownum "����", custid, name, phone
from customer
where rownum <=2
order by name;

select rownum "����", custid, name, phone
from(select custid, name, phone
from customer
order by name)
where rownum<=2;

