-- 1. Display department name and manager first name
select d.department_name,
e.first_name as manager_name
from departmentS d
inner join employees e
on d.manager_id = e.employee_id;

+------------------+--------------+
| department_name  | manager_name |
+------------------+--------------+
| Administration   | Jennifer     |
| Marketing        | Michael      |
| Purchasing       | Den          |
| Human Resources  | Susan        |
| Shipping         | Adam         |
| IT               | Alexander    |
| Public Relations | Hermann      |
| Sales            | John         |
| Executive        | Steven       |
| Finance          | Nancy        |
| Accounting       | Shelley      |
+------------------+--------------+
11 rows in set (0.00 sec)

--______________________________________________________________________________

-- 2. Display department name, manager name, and city

select d.department_name , e.first_name as manager_name , city
from employees e 
inner join departmentS d
on d.manager_id = e.manager_id 
inner join locations l
on l.location_id = d.location_id ;

+------------------+--------------+---------------------+
| department_name  | manager_name | city                |
+------------------+--------------+---------------------+
| Administration   | Jennifer     | Seattle             |
| Marketing        | Michael      | Toronto             |
| Marketing        | Pat          | Toronto             |
| Purchasing       | Den          | Seattle             |
| Purchasing       | Alexander    | Seattle             |
| Purchasing       | Shelli       | Seattle             |
| Purchasing       | Sigal        | Seattle             |
| Purchasing       | Guy          | Seattle             |
| Purchasing       | Karen        | Seattle             |
| Human Resources  | Susan        | London              |

--_______________________________________________________________________________________

-- 3. Display country name, city, and department name

select c.country_name,l.city,d.department_name
from countries c
inner join locations l 
on c.country_id=l.country_id
inner join departmentS d
on d.location_id = l.location_id ;

+------------------------------------------+---------------------+----------------------+
| country_name                             | city                | department_name      |
+------------------------------------------+---------------------+----------------------+
| United States of America                 | Seattle             | Administration       |
| Canada                                   | Toronto             | Marketing            |
| United States of America                 | Seattle             | Purchasing           |
| United Kingdom of Great Britain and Nort | London              | Human Resources      |
| United States of America                 | South San Francisco | Shipping             |
| United States of America                 | Southlake           | IT                   |
| Germany                                  | Munich              | Public Relations     |
| United Kingdom of Great Britain and Nort | Oxford              | Sales                |
| United States of America                 | Seattle             | Executive            |
| United States of America                 | Seattle             | Finance              |
| United States of America                 | Seattle             | Accounting           |
| United States of America                 | Seattle             | Treasury             |
--____________________________________________________________________

-- 4. Display job title, department name, employee last name, starting date for all jobs from 2011 to 2015.

select j.job_title , d.department_name,e.last_name,e.hire_date
from employees e 
inner join departments d 
on e.department_id = d.department_id 
inner join jobs j
on e.job_id = j.job_id
where year(hire_date) between '2011' and '2015';


--__________________________________________________________________________________________________________________

-- 5. Display job title and average salary of employees

select j.job_title,avg(e.salary) 
from employees e
inner join jobs j
on j.job_id=e.job_id 
group by j.job_title;
+---------------------------------+---------------+
| job_title                       | avg(e.salary) |
+---------------------------------+---------------+
| Public Accountant               |   8300.000000 |
| Accounting Manager              |  12008.000000 |
| Administration Assistant        |   4400.000000 |
| President                       |  24000.000000 |
| Administration Vice President   |  17000.000000 |
| Accountant                      |   7920.000000 |
| Finance Manager                 |  12008.000000 |
| Human Resources Representative  |   6500.000000 |
| Programmer                      |   5760.000000 |
| Marketing Manager               |  13000.000000 |
| Marketing Representative        |   6000.000000 |
| Public Relations Representative |  10000.000000 |
| Purchasing Clerk                |   2780.000000 |
| Purchasing Manager              |  11000.000000 |
| Sales Manager                   |  12200.000000 |
| Sales Representative            |   8350.000000 |
| Shipping Clerk                  |   3215.000000 |
| Stock Clerk                     |   2785.000000 |
| Stock Manager                   |   7280.000000 |
+---------------------------------+---------------+
19 rows in set (0.01 sec)
--________________________________________________________________________________________________________________________________

-- 6. Display job title, employee name, and the difference between maximum salary for that job and salary of the employee.
select j.job_title,e.last_name,(j.max_salary)-( e.salary) difference_salary
from employees e
inner join jobs j 
on j.job_id = e.job_id ;

| job_title                       | last_name   | difference_salary |
+---------------------------------+-------------+-------------------+
| Public Accountant               | Gietz       |            700.00 |
| Accounting Manager              | Higgins     |           3992.00 |
| Administration Assistant        | Whalen      |           1600.00 |
| President                       | King        |          16000.00 |
| Administration Vice President   | Yang        |          13000.00 |
| Administration Vice President   | Garcia      |          13000.00 |
| Accountant                      | Faviet      |              0.00 |
| Accountant                      | Chen        |            800.00 |
| Accountant                      | Sciarra     |           1300.00 |
| Accountant                      | Urman       |           1200.00 |
| Accountant                      | Popp        |           2100.00 |
| Finance Manager                 | Gruenberg   |           3992.00 |
| Human Resources Representative  | Jacobs      |           2500.00 |

--________________________________________________________________________

-- 7. Display the last name and job title of employees who earn a commission but do not belong to any department.

select e.last_name ,j.job_title ,  e.COMMISSION_PCT 
from employees e 
inner join jobs j
on j.job_id = e.job_id 
where COMMISSION_PCT is not null 
and department_id is null ;
+-----------+----------------------+----------------+
| last_name | job_title            | COMMISSION_PCT |
+-----------+----------------------+----------------+
| Grant     | Sales Representative |           0.15 |
+-----------+----------------------+----------------+
1 row in set (0.00 sec)

--______________________________________________________________________

-- 8. Display details of jobs that were done by any employee who is currently drawing more than 15000 of salary.

select j.job_id,j.job_title,e.last_name,e.salary
from employees e
inner join jobs j
on j.job_id = e.job_id 
where e.salary > 15000 ;

 +---------+-------------------------------+-----------+----------+
| job_id  | job_title                     | last_name | salary   |
+---------+-------------------------------+-----------+----------+
| AD_PRES | President                     | King      | 24000.00 |
| AD_VP   | Administration Vice President | Yang      | 17000.00 |
| AD_VP   | Administration Vice President | Garcia    | 17000.00 |
+---------+-------------------------------+-----------+----------+
3 rows in set (0.00 sec)

-------__________________________________________________________________

-- 9. Display department name, manager name, and salary of the managers, who have the experience of more than 12 years.

select d.department_name,e.last_name,e.salary
from employees e 
inner join departments d
on d.department_id=e.department_id
inner join job_history j 
on j.employee_id=e.employee_id
where (year(j.end_date)-year(j.start_date)) > 3 ;
+-----------------+-----------+----------+
| department_name | last_name | salary   |
+-----------------+-----------+----------+
| Executive       | Yang      | 17000.00 |
| Executive       | Yang      | 17000.00 |
| Executive       | Garcia    | 17000.00 |
| Administration  | Whalen    |  4400.00 |
| Administration  | Whalen    |  4400.00 |
+-----------------+-----------+----------+
5 rows in set (0.00 sec)
--_________________________________________________________________________

-- 10. Display employee name if the employee joined before his manager


select e.first_name employee_name , e1.first_name manager_name , e.hire_date , e1.hire_date
from employees e 
inner join employees e1 
on e.employee_id=e1.MANAGER_ID
where date(e.hire_date) < date(e1.hire_date); 
+---------------+--------------+------------+------------+
| employee_name | manager_name | hire_date  | hire_date  |
+---------------+--------------+------------+------------+
| Steven        | Neena        | 2013-06-17 | 2015-09-21 |
| Lex           | Alexander    | 2011-01-13 | 2016-01-03 |
| Alexander     | Bruce        | 2016-01-03 | 2017-05-21 |
| Alexander     | Valli        | 2016-01-03 | 2016-02-05 |
| Alexander     | Diana        | 2016-01-03 | 2017-02-07 |
| Nancy         | John         | 2012-08-17 | 2015-09-28 |
| Nancy         | Ismael       | 2012-08-17 | 2015-09-30 |
| Nancy         | Jose Manuel  | 2012-08-17 | 2016-03-07 
--__________________________________________________________________

-- 11. Display the employee’s name, job title for the jobs, employee did in the past where the job was done less than 12 months.

select  e.employee_id,e.first_name , j1.job_title ,timestampdiff(month,j.start_date,j.end_date) as no_of_month
from employees e 
inner join job_history j
on j.employee_id = e.employee_id 
inner join jobs j1
on j1.job_id=e.job_id
where timestampdiff(month,j.start_date,j.end_date) < 12;

+-------------+------------+----------------------+-------------+
| employee_id | first_name | job_title            | no_of_month |
+-------------+------------+----------------------+-------------+
|         122 | Payam      | Stock Manager        |          11 |
|         176 | Jonathon   | Sales Representative |           9 |
|         176 | Jonathon   | Sales Representative |          11 |
+-------------+------------+----------------------+-------------+
3 rows in set (0.00 sec)

--__________________________________________________________

-- 12. Display employee name and country in which he is working.

select e.first_name,e.last_name,country_name
from employees e 
inner join departments d
on d.department_id = e.department_id
inner join locations l
on l.location_id = d.location_id
inner join countries c
on c.country_id = l.country_id ;

+-------------+-------------+------------------------------------------+
| first_name  | last_name   | country_name                             |
+-------------+-------------+------------------------------------------+
| Alexander   | James       | United States of America                 |
| Bruce       | Miller      | United States of America                 |
| David       | Williams    | United States of America                 |
| Valli       | Jackson     | United States of America                 |
| Diana       | Nguyen      | United States of America                 |
| Matthew     | Weiss       | United States of America                 |
| Adam        | Fripp       | United States of America                 |
| Payam       | Kaufling    | United States of America                 |
| Shanta      | Vollman     | United States of America                 |
| Kevin       | Mourgos     | United States of America                 |
| Julia       | Nayer       | United States of America                 |
| Irene       | Mikkilineni | United States of America                 |
| James       | Landry      | United States of America                 |
| Steven      | Markle      | United States of America                 |

--___________________________________________________________________________________________________________________________________________________

-- 13. Display department name, average salary and number of employees with commission within the department.

select d.DEPARTMENT_NAME , avg(salary) ,count(employee_id)
from employees e
inner join departments d
on d.department_id = e.department_id
where e.COMMISSION_PCT is not null
group by department_name ;

+-----------------+-------------+--------------------+
| DEPARTMENT_NAME | avg(salary) | count(employee_id) |
+-----------------+-------------+--------------------+
| Sales           | 8955.882353 |                 34 |
+-----------------+-------------+--------------------+
1 row in set (0.00 sec)

--____________________________________________________________________________________________

-- 14. Display the count of employees, month and the year in which 3 or more employees joined in any department located in ‘Seattle’.

SELECT 
    COUNT(employee_id) AS e,
    EXTRACT(MONTH FROM hire_date) AS join_month,
    EXTRACT(YEAR FROM hire_date) AS join_year
FROM employees e
JOIN departments d 
ON e.department_id = d.department_id
JOIN locations l 
ON d.location_id = l.location_id
WHERE l.city = 'Seattle'
GROUP BY 
    EXTRACT(YEAR FROM hire_date), 
    EXTRACT(MONTH FROM hire_date)
HAVING COUNT(employee_id) >= 3;

+----------------+------------+-----------+
| employee_count | join_month | join_year |
+----------------+------------+-----------+
|              3 |          9 |      2015 |
+----------------+------------+-----------+
1 row in set (0.01 sec)

--_________________________________________________________________________________________________

-- 15. Display employee name, job title, start date, and end date of past jobs of all employees with commission percentage null


select e.last_name,j1.job_title,j.start_date,j.end_date
from employees e
inner join job_history j
on e.employee_id = j.employee_id 
inner join jobs j1 
on e.job_id=j1.job_id
where COMMISSION_PCT is null;

+-----------+-------------------------------+------------+------------+
| last_name | job_title                     | start_date | end_date   |
+-----------+-------------------------------+------------+------------+
| Yang      | Administration Vice President | 2007-09-21 | 2011-10-27 |
| Yang      | Administration Vice President | 2011-10-28 | 2015-03-15 |
| Garcia    | Administration Vice President | 2011-01-13 | 2016-07-24 |
| Li        | Purchasing Manager            | 2016-03-24 | 2017-12-31 |
| Kaufling  | Stock Manager                 | 2017-01-01 | 2017-12-31 |
| Whalen    | Administration Assistant      | 2005-09-17 | 2011-06-17 |
| Whalen    | Administration Assistant      | 2012-07-01 | 2016-12-31 |
| Martinez  | Marketing Manager             | 2014-02-17 | 2017-12-19 |
+-----------+-------------------------------+------------+------------+
8 rows in set (0.00 sec)