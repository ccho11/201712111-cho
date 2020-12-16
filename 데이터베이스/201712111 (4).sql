
create table dept(
        dno number(2),
        dname varchar2(14),
        loc varchar2(13),
        PRIMARY KEY (dno)
);

desc dept;

create table dept_second
as
SELECT 
* 
FROM department;

SELECT * FROM dept_second;

create table dept20
as
select eno, ename, salary*12 annsal
from employee
where dno=20;

desc dept20;
SELECT * FROM dept20;

create table dept_third
as
select dno, dname
from dept
where 0=1;

desc dept_third;
select * from dept_third;

create table NewBook(
        bookid NUMBER,
        bookname VARCHAR2(20),
        publisher VARCHAR2(20),
        price NUMBER,
        PRIMARY KEY (bookid)
);

alter table dept20
add birth date;

desc dept20;

select * from dept20;

alter table dept20
    modify ename varchar2(30);
    
desc dept20;

alter table dept20
    drop column ename;
    
desc dept20;

desc NewBook;

alter table NewBook
    add isbn varchar2(13);
    
alter table NewBook
    modify isbn number;
    
alter table NewBook
    drop column isbn;
    
alter table NewBook
    modify bookname not null;


rename dept20 to emp20;
desc dept20;
desc emp20;

drop table emp20;
desc emp20;

truncate table dept_second;
select * from dept_second;

desc dept_second;