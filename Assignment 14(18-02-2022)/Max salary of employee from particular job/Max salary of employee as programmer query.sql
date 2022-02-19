use office
create table Salary(EMPLOYEE_ID int not null primary key,FIRST_NAME varchar(255),LAST_NAME varchar(255),
EMAIL varchar(255),PHONE_NUMBER varchar(255), HIRE_DATE date,JOB_ID int not null,JOB_TITLE varchar(255),
SALARY int not null,COMMISSION_PCT float,MANAGER_ID int not null,DEPARTMENT_ID int not null) 
alter table Salary modify EMPLOYEE_ID int not null auto_increment
alter table Salary modify JOB_ID varchar(255) 
describe table Salary 
insert into Salary values(100,'SHRUTHIKA','ARJUN',
'shruhtika','9840228788','2017-05-29','IT_PROG','PROGRAMMER',
4500,0.12,102,30),(101,'POOJA','MANI',
'poojamani','9840228786','2016-05-09','IT_PROG','PROGRAMMER',
3500,0.11,104,30),(102,'KADHIR','VELAN',
'kadhirvelan','9840254788','2016-09-27','IT_PROG','IT SUPPORT',
15000,0.10,103,30),(103,'BALA','ARUMUGAM',
'balaarumugam12','7940228788','2022-05-12','IT_PROG','PROGRAMMER',
25500,0.13,105,30),(104,'SANJAY','BABU',
'sanjaybabu','7840228789','2015-03-29','ACC','CLERK',
5000,0.14,107,40),(105,'ALYA','SANJEEV',
'alyamanasa33','7980228788','2002-10-13','ACC','ACCOUNTANT',
10000,0.19,106,40)
select*from Salary
select JOB_TITLE,FIRST_NAME,LAST_NAME,EMAIL, max(salary) as Maximum_salary, count(*)from Salary where JOB_TITLE='PROGRAMMER'