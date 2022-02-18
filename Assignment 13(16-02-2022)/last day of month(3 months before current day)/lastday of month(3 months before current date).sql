create database date_time_format
use date_time_format
SELECT (SUBDATE(subDATE(CURDATE(),INTERVAL 3 MONTH),INTERVAL DAYOFMONTH(CURDATE())DAY)) 
            AS LastDayOfTheMonth
            /*select subdate('2022-02-18 10:34:21',interval 05 hour)*/
            /* syntax:subdate(data type(date or time or day),interval(day/time))*/
            /*select subtime('2022-02-18 10:54:24','03:02:05')*/
