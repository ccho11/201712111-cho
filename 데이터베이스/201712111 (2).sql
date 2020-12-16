SELECT*FROM book;
SELECT*FROM customer;
SELECT*FROM orders;

select * from customer, orders
where customer.custid=orders.custid;

select orderid,orders.custid,name,address,bookid
from customer, orders
where customer.custid=orders.custid
order by orders.custid;


