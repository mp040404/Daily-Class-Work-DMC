-- 1. Write a query to display the order amount, customer names and ratings of all
-- customers where the amount is greater than the average amount from the orders table.

select o.amt, c.cname,c.rating from 
orders o  
inner join customers c
on o.cnum = c.cnum
where amt > (select avg(amt) from orders );   

+---------+---------+--------+
| amt     | cname   | rating |
+---------+---------+--------+
| 5160.45 | Liu     |    200 |
| 4723.00 | Clemens |    100 |
| 9891.88 | Clemens |    100 |
+---------+---------+--------+
3 rows in set (0.01 sec)

--___________________________________________________________________________________________

-- 2. Write a query that selects the total amount in orders for each salesperson for whom
-- this total is greater than the amount of the largest order in the table.


select snum , sum(amt) from orders 
group by snum
having sum(amt) > (select max(amt) from orders);


+------+----------+
| snum | sum(amt) |
+------+----------+
| 1001 | 15382.07 |
+------+----------+
1 row in set (0.00 sec)

--___________________________________________________________________________________________________

-- 3. Write a query that selects all customers whose ratings are equal to or greater than
-- ANY of Serres’. (Hint: find all customers of serres salesperson).

-- select c.rating 
-- from customers c 
-- inner join salespeople s  
-- on c.snum = s.snum 
-- where sname = 'serres' ;  

select * from 
customers 
where rating =ANY 
(select c.rating 
from customers c 
inner join salespeople s  
on c.snum = s.snum 
where sname = 'serres' );

+------+----------+----------+--------+------+
| cnum | cname    | city     | rating | snum |
+------+----------+----------+--------+------+
| 2002 | Giovanni | Rome     |    200 | 1003 |
| 2003 | Liu      | San Jose |    200 | 1002 |
| 2004 | Grass    | Berlin   |    300 | 1002 |
| 2008 | Cisneros | San Jose |    300 | 1007 |
+------+----------+----------+--------+------+
4 rows in set (0.01 sec)

---_________________________________________________________________________________________

-- 4. Write a query that selects all orders for amounts greater than any for the customers in London

select * from orders
where amt >any 
(select amt from 
customers c 
inner join orders o 
on c.cnum = o. cnum
where city = 'london');

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
6 rows in set (0.01 sec)

--__________________________________________________________________________________________________________________________________________________________

-- 5. Find salespeople number, name and city who have multiple customers. Display the count of customers as well.




SELECT s.snum, s.sname, s.city, 
(SELECT COUNT(*) 
FROM customers c2
WHERE c2.snum = s.snum) 
AS customer_count
FROM salespeople s
WHERE s.snum IN (
SELECT snum
FROM customers
GROUP BY snum
HAVING COUNT(cnum) > 1
);

+------+--------+----------+----------------+
| snum | sname  | city     | customer_count |
+------+--------+----------+----------------+
| 1001 | Peel   | London   |              2 |
| 1002 | Serres | San Jose |              2 |
+------+--------+----------+----------------+
2 rows in set (0.00 sec)

--____________________________________________________________________________________________________________________________

-- 6. Find all orders with amounts smaller than any amount for a customer in San Jose.

select * from orders
where amt <any 
(select amt from 
customers c 
inner join orders o 
on c.cnum = o. cnum
where city = 'san jose');

+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3010 |  309.95 | 1990-10-04 | 2004 | 1002 |
+------+---------+------------+------+------+
8 rows in set (0.00 sec)