create database office
use office
create table department_details( Dep_id int not null primary key auto_increment,
Dep_name varchar(65) not null, manager_id int not null )
describe department_details
insert into department_details(Dep_name,manager_id) values('Human Resources',101)
insert into department_details(Dep_name,manager_id) values('Accounting',104)
insert into department_details(Dep_name,manager_id) values('IT Support',108)
insert into department_details(Dep_name,manager_id) values('Manufacturing',107)
insert into department_details(Dep_name,manager_id) values('IT help desk',105)
select*from department_details
use office
create table employee_details(emp_id int not null primary key auto_increment,Name varchar(55) not null,
salary int not null,hire_date date)
describe employee_details
insert into employee_details(emp_id,Name,salary,hire_date) values(100,'Janu',45000,'2017-09-12')
insert into employee_details(Name,salary,hire_date) values('Jo',45000,'2016-08-17')
insert into employee_details(Name,salary,hire_date) values('Dinesh',22000,'2018-09-10')
insert into employee_details(Name,salary,hire_date) values('Ilakkiya',42000,'2015-03-25')
insert into employee_details(Name,salary,hire_date) values('Sanjay',30000,'2019-05-27')
insert into employee_details(Name,salary,hire_date) values('Gokul',40000,'2019-05-27')
insert into employee_details(Name,salary,hire_date) values('Kishore',30000,'2012-08-28')
insert into employee_details(Name,salary,hire_date) values('Mohan',50000,'2013-10-30')
insert into employee_details(Name,salary,hire_date) values('Santhosh',55000,'2010-07-16')
select*from employee_details
select Name,dep_name,hire_date,salary,
(datediff(now(),hire_date))/365 Experience
from department_details d join employee_details e
on (d.manager_id = e.emp_id)
where (datediff(now(),hire_date))/365>5 
