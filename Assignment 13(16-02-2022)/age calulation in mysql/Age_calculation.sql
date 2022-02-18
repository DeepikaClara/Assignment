use Age_calculation
create table student2_details(name varchar(55)not null,
id int not null primary key auto_increment, birthdate date)
describe student2_details
insert into student2_details(name,birthdate)values('Ram','1990-10-13')
insert into student2_details(name,birthdate)values('Seetha','1998-05-12')
select*from student2_details
select curdate()
select*,year(curdate())- year(birthdate) as age from student2_details
