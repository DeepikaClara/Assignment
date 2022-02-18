use college_management;
create table student_details(name varchar(55) not null,id int NOT NULL PRIMARY KEY,
sex varchar(55) not null,city varchar(55) not null);
describe table student_details;
 insert into student_details values('Arvind',1,'M','Chennai');
insert into student_details values('Bindhu',2,'F','Bangalore');
insert into student_details values('Charu',3,'F','Kochi');
insert into student_details values('Dipankar',4,'M','Kolkata');
alter table student_details add age varchar(25);
select*from student_details;
 update student_details set age=18 where id=1;
  select*from student_details;
  delete from student_details where id=3;
  select*from student_details;
  update student_details set age=18 where id=2;
  update student_details set age=18 where id=4;
   select*from student_details;
  