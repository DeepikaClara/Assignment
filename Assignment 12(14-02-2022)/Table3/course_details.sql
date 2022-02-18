use college_management;
drop table course_details
create table course_details(course_name varchar(255) not null,starting_year int not null ,ending_year int not null,
fees_per_semester int not null);
insert into course_details values('Maths',2015,2018,30000);
insert into course_details values('Psychology',2015,2018,32000);
insert into course_details values('Astrophysics',2015,2018,45000);
select*from course_details