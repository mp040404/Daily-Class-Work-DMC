-- 1. Write a query that counts the number of salespeople registering orders
-- for each day. (If a salesperson has more than one order on a given day,
-- he or she should be counted only once.).

mysql> select odate,count(distinct snum) as count from orders
    -> group by odate;
+------------+-------+
| odate      | count |
+------------+-------+
| 1990-10-03 |     4 |
| 1990-10-04 |     3 |
+------------+-------+
2 rows in set (0.00 sec)

------------------------------===========================================================================


-- 2. Write a query on the Customers table that will find the highest rating in each city. Put the output in this form: For the city (city), the highest rating is: (rating).

mysql> select concat(city ,' Highest rating is : ',max(rating)) from customers
    -> group by city;
+---------------------------------------------------+
| concat(city ,' Highest rating is : ',max(rating)) |
+---------------------------------------------------+
| London Highest rating is : 100                    |
| Rome Highest rating is : 200                      |
| San Jose Highest rating is : 300                  |
| Berlin Highest rating is : 300                    |
+---------------------------------------------------+
4 rows in set (0.01 sec)

------------------------------===========================================================================


-- 3 Write an SQL query to calculate the total order amount for each day and display the results in descending order of total orders

mysql> select odate,sum(amt)
    -> from orders
    -> group by odate
    -> order by sum(amt) desc;
+------------+----------+
| odate      | sum(amt) |
+------------+----------+
| 1990-10-04 | 16713.81 |
| 1990-10-03 |  8944.59 |
+------------+----------+
2 rows in set (0.00 sec)


------------------------------===========================================================================


-- 4. Write a query that selects the total amount in orders for each salesperson for whom this total is greater than the average amount of the order in the table. (Note Use the average amount value directly →2565.84)

mysql> select snum,sum(amt)
    -> from orders
    -> group by snum
    -> having sum(amt)>2565.84;
+------+----------+
| snum | sum(amt) |
+------+----------+
| 1001 | 15382.07 |
| 1002 |  5546.15 |
+------+----------+
2 rows in set (0.00 sec)

------------------------------===========================================================================


-- 5. Write a query that selects the highest rating in each city.
mysql> select city , max(rating)
    -> from customers
    -> group by city;
+----------+-------------+
| city     | max(rating) |
+----------+-------------+
| London   |         100 |
| Rome     |         200 |
| San Jose |         300 |
| Berlin   |         300 |
+----------+-------------+
4 rows in set (0.00 sec)

------------------------------===========================================================================

-- 6. Retrieve the maximum order amount for each salesperson from the orders table, including only those orders whose value exceeds Rs. 3000.

mysql> select snum , max(amt)
    -> from orders
    -> where amt > 3000
    -> group by snum ;
+------+----------+
| snum | max(amt) |
+------+----------+
| 1002 |  5160.45 |
| 1001 |  9891.88 |
+------+----------+
2 rows in set (0.00 sec)

------------------------------===========================================================================


-- 7. Write an SQL query to find the smallest order placed by every customer.

mysql> select cnum,min(amt)
    -> from orders
    -> group by cnum;
+------+----------+
| cnum | min(amt) |
+------+----------+
| 2008 |    18.69 |
| 2001 |   767.19 |
| 2007 |  1900.10 |
| 2003 |  5160.45 |
| 2002 |  1713.23 |
| 2004 |    75.75 |
| 2006 |  4723.00 |
+------+----------+
7 rows in set (0.00 sec)


------------------------------===========================================================================

-- 1. Display manager ID and number of employees managed by the manager.

mysql> select MANAGER_ID , count(EMPLOYEE_ID)
    -> from employees
    -> group by MANAGER_ID;
+------------+--------------------+
| MANAGER_ID | count(EMPLOYEE_ID) |
+------------+--------------------+
|       NULL |                  1 |
|        100 |                 14 |
|        101 |                  5 |
|        102 |                  1 |
|        103 |                  4 |
|        108 |                  5 |
|        114 |                  5 |
|        120 |                  8 |
|        121 |                  8 |
|        122 |                  8 |
|        123 |                  8 |
|        124 |                  8 |
|        145 |                  6 |
|        146 |                  6 |
|        147 |                  6 |
|        148 |                  6 |
|        149 |                  6 |
|        201 |                  1 |
|        205 |                  1 |
+------------+--------------------+
19 rows in set (0.00 sec)

------------------------------===========================================================================

-- 2. Display the country ID and number of cities we have in the country.

mysql>  select  c.country_id ,count( l.city)
    ->  from  countries c
    ->     join locations l
    ->  on  c.country_id=l.country_id
    ->  group by country_id;
+------------+----------------+
| country_id | count( l.city) |
+------------+----------------+
| IT         |              2 |
| JP         |              2 |
| US         |              4 |
| CA         |              2 |
| CN         |              1 |
| IN         |              1 |
| AU         |              1 |
| SG         |              1 |
| GB         |              3 |
| DE         |              1 |
| BR         |              1 |
| CH         |              2 |
| NL         |              1 |
| MX         |              1 |
+------------+----------------+
14 rows in set (0.01 sec)

------------------------------===========================================================================

-- 3. Display average salary of employees in each department who have commission percentage.

mysql> SELECT department_id, AVG(salary) AS "Average Salary"
    -> FROM employees
    -> WHERE commission_pct IS NOT NULL
    -> GROUP BY department_id;
+---------------+----------------+
| department_id | Average Salary |
+---------------+----------------+
|          NULL |    7000.000000 |
|            80 |    8955.882353 |
+---------------+----------------+
2 rows in set (0.01 sec)

------------------------------===========================================================================

-- 4. Display job ID, number of employees, sum of salary, and difference between highest salary and lowest salary of the employees for each job.
mysql> select job_id , count(employee_id),sum(salary),max(salary)-min(salary) as difference from employees
    -> group by job_id;
+------------+--------------------+-------------+------------+
| job_id     | count(employee_id) | sum(salary) | difference |
+------------+--------------------+-------------+------------+
| AC_ACCOUNT |                  1 |     8300.00 |       0.00 |
| AC_MGR     |                  1 |    12008.00 |       0.00 |
| AD_ASST    |                  1 |     4400.00 |       0.00 |
| AD_PRES    |                  1 |    24000.00 |       0.00 |
| AD_VP      |                  2 |    34000.00 |       0.00 |
| FI_ACCOUNT |                  5 |    39600.00 |    2100.00 |
| FI_MGR     |                  1 |    12008.00 |       0.00 |
| HR_REP     |                  1 |     6500.00 |       0.00 |
| IT_PROG    |                  5 |    28800.00 |    4800.00 |
| MK_MAN     |                  1 |    13000.00 |       0.00 |
| MK_REP     |                  1 |     6000.00 |       0.00 |
| PR_REP     |                  1 |    10000.00 |       0.00 |
| PU_CLERK   |                  5 |    13900.00 |     600.00 |
| PU_MAN     |                  1 |    11000.00 |       0.00 |
| SA_MAN     |                  5 |    61000.00 |    3500.00 |
| SA_REP     |                 30 |   250500.00 |    5400.00 |
| SH_CLERK   |                 20 |    64300.00 |    1700.00 |
| ST_CLERK   |                 20 |    55700.00 |    1500.00 |
| ST_MAN     |                  5 |    36400.00 |    2400.00 |
+------------+--------------------+-------------+------------+
19 rows in set (0.01 sec)

------------------------------===========================================================================

-- 5. Display job ID for jobs with average salary more than 10000
mysql> select job_id , avg(salary) as avg_salary
    -> from employees
    -> group by job_id
    -> having avg(salary) > 10000;
+---------+--------------+
| job_id  | avg_salary   |
+---------+--------------+
| AC_MGR  | 12008.000000 |
| AD_PRES | 24000.000000 |
| AD_VP   | 17000.000000 |
| FI_MGR  | 12008.000000 |
| MK_MAN  | 13000.000000 |
| PU_MAN  | 11000.000000 |
| SA_MAN  | 12200.000000 |
+---------+--------------+
7 rows in set (0.01 sec)
------------------------------===========================================================================

-- 6. Display the years in which more than 10 employees joined
mysql> select year(hire_date),count(employee_id)
     from employees
     group by year(hire_date)
    having count(employee_id) > 10 ;
+-----------------+--------------------+
| year(hire_date) | count(employee_id) |
+-----------------+--------------------+
|            2015 |                 29 |
|            2016 |                 24 |
|            2017 |                 19 |
|            2018 |                 11 |
+-----------------+--------------------+
4 rows in set (0.00 sec)

------------------------------===========================================================================

-- 7. Display departments in which more than five employees have commission percentage.


mysql> SELECT d.department_id, COUNT(e.employee_id) AS "Total_Commissioned"
    -> FROM employees e
    -> JOIN departments d ON e.department_id = d.department_id
    -> WHERE e.commission_pct IS NOT NULL
    -> GROUP BY d.department_id
    -> HAVING COUNT(e.employee_id) > 5;
+---------------+--------------------+
| department_id | Total_Commissioned |
+---------------+--------------------+
|            80 |                 34 |
+---------------+--------------------+
1 row in set (0.00 sec)

------------------------------===========================================================================

-- 8. Display employee ID for the employees who did more than one job in the past.
 
 mysql> SELECT job_id, COUNT(employee_id)
    -> FROM job_history
    -> GROUP BY job_id
    -> HAVING COUNT(employee_id) > 1;
+------------+--------------------+
| job_id     | COUNT(employee_id) |
+------------+--------------------+
| AC_ACCOUNT |                  2 |
| ST_CLERK   |                  2 |
+------------+--------------------+
2 rows in set (0.01 sec)

------------------------------===========================================================================

-- 9. Display job ID of jobs that were done by 2 or more employees for more than 100 days individually.

mysql> select job_id , count(employee_id)
    -> from job_history
    -> where datediff(end_date,start_date) > 100
    -> group by job_id
    -> having count(employee_id) >= 2 ;
+------------+--------------------+
| job_id     | count(employee_id) |
+------------+--------------------+
| AC_ACCOUNT |                  2 |
| ST_CLERK   |                  2 |
+------------+--------------------+
2 rows in set (0.00 sec)

------------------------------===========================================================================

-- 10.Display the department ID, year of hiring, and the number of employees
-- who joined each department in each year

 mysql> select department_id,year(hire_date),count(employee_id)
    ->  from employees
    ->  group by employee_id
    -> order by department_id ;
+---------------+-----------------+--------------------+
| department_id | year(hire_date) | count(employee_id) |
+---------------+-----------------+--------------------+
|          NULL |            2017 |                  1 |
|            10 |            2013 |                  1 |
|            20 |            2014 |                  1 |
|            20 |            2015 |                  1 |
|            30 |            2012 |                  1 |
|            30 |            2013 |                  1 |
|            30 |            2015 |                  1 |
|            30 |            2015 |                  1 |
|            30 |            2016 |                  1 |
|            30 |            2017 |                  1 |
|            40 |            2012 |                  1 |
|            50 |            2014 |                  1 |
|            50 |            2015 |                  1 |
|            50 |            2013 |                  1 |
|            50 |            2015 |                  1 |
|            50 |            2017 |                  1 |
|            50 |            2015 |                  1 |
|            50 |            2016 |                  1 |
|            50 |            2017 |                  1 |
|            50 |            2018 |                  1 |
|            50 |            2015 |                  1 |
|            50 |            2015 |                  1 |
|            50 |            2015 |                  1 |
|            50 |            2017 |                  1 |
|            50 |            2014 |                  1 |
|            50 |            2016 |                  1 |
|            50 |            2017 |                  1 |
|            50 |            2018 |                  1 |
|            50 |            2013 |                  1 |
|            50 |            2015 |                  1 |
|            50 |            2016 |                  1 |
|            50 |            2016 |                  1 |
|            50 |            2013 |                  1 |
|            50 |            2015 |                  1 |
|            50 |            2016 |                  1 |
|            50 |            2016 |                  1 |
|            50 |            2016 |                  1 |
|            50 |            2016 |                  1 |
|            50 |            2017 |                  1 |
|            50 |            2018 |                  1 |
|            50 |            2014 |                  1 |
|            50 |            2015 |                  1 |
|            50 |            2016 |                  1 |
|            50 |            2017 |                  1 |
|            50 |            2015 |                  1 |
|            50 |            2015 |                  1 |
|            50 |            2016 |                  1 |
|            50 |            2017 |                  1 |
|            50 |            2014 |                  1 |
|            50 |            2015 |                  1 |
|            50 |            2016 |                  1 |
|            50 |            2017 |                  1 |
|            50 |            2016 |                  1 |
|            50 |            2016 |                  1 |
|            50 |            2017 |                  1 |
|            50 |            2018 |                  1 |
|            60 |            2016 |                  1 |
|            60 |            2017 |                  1 |
|            60 |            2015 |                  1 |
|            60 |            2016 |                  1 |
|            60 |            2017 |                  1 |
|            70 |            2012 |                  1 |
|            80 |            2014 |                  1 |
|            80 |            2015 |                  1 |
|            80 |            2015 |                  1 |
|            80 |            2017 |                  1 |
|            80 |            2018 |                  1 |
|            80 |            2015 |                  1 |
|            80 |            2015 |                  1 |
|            80 |            2015 |                  1 |
|            80 |            2016 |                  1 |
|            80 |            2016 |                  1 |
|            80 |            2017 |                  1 |
|            80 |            2014 |                  1 |
|            80 |            2014 |                  1 |
|            80 |            2014 |                  1 |
|            80 |            2015 |                  1 |
|            80 |            2015 |                  1 |
|            80 |            2016 |                  1 |
|            80 |            2015 |                  1 |
|            80 |            2017 |                  1 |
|            80 |            2018 |                  1 |
|            80 |            2018 |                  1 |
|            80 |            2018 |                  1 |
|            80 |            2018 |                  1 |
|            80 |            2015 |                  1 |
|            80 |            2016 |                  1 |
|            80 |            2016 |                  1 |
|            80 |            2017 |                  1 |
|            80 |            2017 |                  1 |
|            80 |            2018 |                  1 |
|            80 |            2014 |                  1 |
|            80 |            2015 |                  1 |
|            80 |            2016 |                  1 |
|            80 |            2016 |                  1 |
|            80 |            2018 |                  1 |
|            90 |            2013 |                  1 |
|            90 |            2015 |                  1 |
|            90 |            2011 |                  1 |
|           100 |            2012 |                  1 |
|           100 |            2012 |                  1 |
|           100 |            2015 |                  1 |
|           100 |            2015 |                  1 |
|           100 |            2016 |                  1 |
|           100 |            2017 |                  1 |
|           110 |            2012 |                  1 |
|           110 |            2012 |                  1 |
+---------------+-----------------+--------------------+
107 rows in set (0.00 sec)

------------------------------===========================================================================

-- 11. Display the count of employees joined in each month of the year 2017.

mysql> select count(employee_id) , date_format(hire_date,"%M") as Month
    -> from employees
    -> where year(hire_date) = '2017'
    -> group by month;
+--------------------+----------+
| count(employee_id) | Month    |
+--------------------+----------+
|                  2 | May      |
|                  3 | February |
|                  3 | December |
|                  1 | August   |
|                  2 | November |
|                  1 | January  |
|                  1 | April    |
|                  1 | October  |
|                  3 | March    |
|                  2 | June     |
+--------------------+----------+
10 rows in set (0.01 sec)

------------------------------===========================================================================

-- 12. Display the details of departments in which the maximum salary is more than 10000

mysql> select department_id , max(salary)
    -> from employees
    -> group by department_id
    -> having max(salary) > 10000;
+---------------+-------------+
| department_id | max(salary) |
+---------------+-------------+
|            20 |    13000.00 |
|            30 |    11000.00 |
|            80 |    14000.00 |
|            90 |    24000.00 |
|           100 |    12008.00 |
|           110 |    12008.00 |
+---------------+-------------+
6 rows in set (0.01 sec)