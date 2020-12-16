select * from book;

select name, sum(saleprice)
from customer, orders
where customer.custid=orders.custid
group by name
order by name;

alter table orders
add foreign key(bookid) references book(bookid);

select name, bookname
from customer cu, orders od, book bk
where cu.custid=od.custid
and od.bookid=bk.bookid;

select name, bookname
from customer cu, orders od, book bk
where cu.custid=od.custid
and od.bookid=bk.bookid
and price=20000;

select stff.eno, stff.ename, stff.job, stff.manager
from employee stff, employee mgr
where stff.manager=mgr.eno
and mgr.ename like 'BLAKE';

select name, saleprice
from customer left outer join
orders on customer.custid=orders.custid;

select a.bookid, a.bookname, s.orderid, s.orderdate
from book a left outer join orders s
on a.bookid=s.bookid
order by a.bookid;

select a.bookname, count(s.bookid)
from book a left outer join orders s
on a.bookid=s.bookid
group by a.bookname;

select a.publisher, count(s.bookid) as salecount
from book a left outer join orders s
on a.bookid = s.bookid
group by a.publisher;

select a.dno, a.dname
from department a, employee s
where a.dno=s.dno
and s.ename like 'SCOTT';

select stff.ename, stff.job, stff.hiredate, mgr.ename as "manager"
from employee stff, employee mgr
where stff.manager=mgr.eno
and stff.hiredate<mgr.hiredate;

select name, bookname, orderdate
from customer cu, orders od, book bk
where cu.custid=od.custid
and od.bookid=bk.bookid
order by orderdate;

create user dituser1
IDENTIFIED BY ditdb20;

create user cho1
IDENTIFIED BY ditdb20;

GRANT CONNECT, RESOURCE to cho1;
