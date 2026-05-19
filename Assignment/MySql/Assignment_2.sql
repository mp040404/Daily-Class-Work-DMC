
 select * from customers ;
+------+----------+----------+--------+------+
| cnum | cname    | city     | rating | snum |
+------+----------+----------+--------+------+
| 2001 | Hoffman  | London   |    100 | 1001 |
| 2002 | Giovanni | Rome     |    200 | 1003 |
| 2003 | Liu      | San Jose |    200 | 1002 |
| 2004 | Grass    | Berlin   |    300 | 1002 |
| 2006 | Clemens  | London   |    100 | 1001 |
| 2008 | Cisneros | San Jose |    300 | 1007 |
| 2007 | Pereira  | Rome     |    100 | 1004 |
+------+----------+----------+--------+------+
-----------------------------------------------------------------------------------------------------------
-- 1. Write a query that produces all rows from the Customers table
-- for which the salesperson’s number is 1001.

mysql> select * from customers
    -> where snum = 1001 ;
+------+---------+--------+--------+------+
| cnum | cname   | city   | rating | snum |
+------+---------+--------+--------+------+
| 2001 | Hoffman | London |    100 | 1001 |
| 2006 | Clemens | London |    100 | 1001 |
+------+---------+--------+--------+------+
2 rows in set (0.00 sec)
--------------------------------------------------------------------------------------------------------------
-- 2. Write a select command that produces the rating followed by
-- the name of each customer in San Jose.

mysql> select cname,rating
    -> from customers
    -> where city= 'San Jose';
+----------+--------+
| cname    | rating |
+----------+--------+
| Liu      |    200 |
| Cisneros |    300 |
+----------+--------+
2 rows in set (0.00 sec)
-----------------------------------------------------------------------------------------------------------------
-- 3. Write a query that will produce the snum values of all
-- salespeople from the Orders table (with the duplicate values
-- suppressed).

mysql> select DISTINCT snum
    -> from customers;
+------+
| snum |
+------+
| 1001 |
| 1003 |
| 1002 |
| 1007 |
| 1004 |
+------+
5 rows in set (0.00 sec)

-------------------------------------------------------------------------------------------------------------------
-- 4. Write a query that will display all the orders for amount
-- more than Rs. 1,000

mysql> select * from orders
    -> where amt>1000;
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
6 rows in set (0.00 sec)
----------------------------------------------------------------------------------------------------------------------
-- 5. Write a query that will give you the names and cities of all
-- salespeople in London with a commission above 0.10.

mysql> select sname , city
    -> from salespeople
    -> where city='london' and comm > 0.10 ;
+--------+--------+
| sname  | city   |
+--------+--------+
| Peel   | London |
| Motika | London |
+--------+--------+
2 rows in set (0.00 sec)
------------------------------------------------------------------------------------------------------------------------
-- 6. Write an SQL query that returns all customers who have a
-- rating greater than 100, along with the customers located in
-- Rome regardless of their rating.

mysql> select * from
    -> customers
    -> where rating > 100 or city = 'rome';
+------+----------+----------+--------+------+
| cnum | cname    | city     | rating | snum |
+------+----------+----------+--------+------+
| 2002 | Giovanni | Rome     |    200 | 1003 |
| 2003 | Liu      | San Jose |    200 | 1002 |
| 2004 | Grass    | Berlin   |    300 | 1002 |
| 2008 | Cisneros | San Jose |    300 | 1007 |
| 2007 | Pereira  | Rome     |    100 | 1004 |
+------+----------+----------+--------+------+
5 rows in set (0.00 sec)
------------------------------------------------------------------------------------------------------------------------------

-- 7. What will be the output from the following query?
-- Select * from Orders where (amt < 1000 OR NOT (odate = ‘1990-10-
-- 03’ AND cnum > 2003));

mysql> Select * from Orders where (amt < 1000 OR NOT (odate = '1990-10-03' and cnum > 2003));
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3010 |  309.95 | 1990-10-04 | 2004 | 1002 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
8 rows in set (0.00 sec)

-----------------------------------------------------------------------------------------------------------------------------------
-- 8. What will be the output of the following query?
-- Select * from Orders where NOT (odate = ‘1990-10-03’ OR snum
-- >1006) AND amt >= 1500;

mysql> Select * from Orders
    -> where NOT (odate = '1990-10-03' OR snum >1006) AND amt >= 1500;
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
3 rows in set (0.00 sec)
-------------------------------------------------------------------------------------------------------------------------------------
-- 9. What is a simpler way to write this query?
-- Select snum, sname, city, comm from Salespeople
-- Where (comm >= .12 AND comm <= .14);

mysql> Select snum, sname, city, comm from Salespeople
    -> Where (comm >= .12 AND comm <= .14);
+------+--------+----------+------+
| snum | sname  | city     | comm |
+------+--------+----------+------+
| 1001 | Peel   | London   | 0.12 |
| 1002 | Serres | San Jose | 0.13 |
+------+--------+----------+------+
2 rows in set (0.00 sec)
----------------------------------------------------------------------------------------------------------------------------------------
-- 10. Write a query that selects all orders except those with
-- amount less than 100.

mysql> select * from
    -> orders
    -> where amt>100 ;
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3010 |  309.95 | 1990-10-04 | 2004 | 1002 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
8 rows in set (0.00 sec)