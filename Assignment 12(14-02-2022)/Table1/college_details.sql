use college_management;
drop table college_details;
create table college_details(name varchar(55) not null,code int not null primary key,
city varchar(55) not null,state varchar(55) not null);
 insert into college_details values('ABC COLLEGE',1222,'chennai','Tamil Nadu');
  insert into college_details values('XYZ COLLEGE',1441,'Bangalore','Karnataka');
  select*from college_details;