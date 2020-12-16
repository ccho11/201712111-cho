SELECT
    *
FROM employee; 

SELECT ename,salary, salary*12
FROM employee;

SELECT ename, salary*12+nvl(commission,0) "¿¬ºÀ"
from employee;

SELECT DISTINCT dno FROM employee;

SELECT  *  FROM employee
WHERE salary>=1500; 

SELECT eno, job, hiredate, salary from employee
WHERE ename='SCOTT';

SELECT * FROM employee
where hiredate <= '1981/01/01';

SELECT * FROM employee
where salary>=1000 and salary<=1500;

SELECT * FROM employee
where salary between 1000 and 1500;

SELECT * FROM employee
where commission in(300,500,1400);

SELECT * FROM employee
where ename LIKE '_A%';

SELECT * FROM employee
where ename like '%A%';

SELECT * FROM employee
where ename not like '%A%';

SELECT * FROM employee
where commission is null;

SELECT * FROM employee
where commission is not null;

SELECT * from employee
order by salary desc, ename asc;

select ename,salary,salary+300 from employee;

select ename,salary,salary*12 from employee
order by salary*12 desc;

select ename,salary from employee
where salary>=2000 
order by salary desc;

select ename,dno from employee
where eno=7788;

select ename,salary from employee
where salary not between 2000 and 3000;

select ename,manager,job,hiredate from employee
where hiredate between '1981/02/20' and '1981/05/01';