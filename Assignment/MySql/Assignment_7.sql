-- 1. Write a query that lists each order number followed by the name of the customer who made the order.

mysql> select  o.onum  , c.cname
    -> from customers c
    -> join orders o
    -> on o.cnum=c.cnum;
+------+----------+
| onum | cname    |
+------+----------+
| 3001 | Cisneros |
| 3003 | Hoffman  |
| 3002 | Pereira  |
| 3005 | Liu      |
| 3006 | Cisneros |
| 3009 | Giovanni |
| 3007 | Grass    |
| 3008 | Clemens  |
| 3010 | Grass    |
| 3011 | Clemens  |
+------+----------+
10 rows in set (0.00 sec)


------------------------------===========================================================================

-- 2. Write a query that gives the names of both the salesperson and the customer for each order along with the order number

mysql> select o.onum , c.cname , s.sname
    -> from orders o
    -> join customers c
    -> on o.cnum = c.cnum
    -> join salespeople s
    -> on o.snum = s.snum ;
+------+----------+---------+
| onum | cname    | sname   |
+------+----------+---------+
| 3003 | Hoffman  | Peel    |
| 3009 | Giovanni | Axelrod |
| 3005 | Liu      | Serres  |
| 3010 | Grass    | Serres  |
| 3007 | Grass    | Serres  |
| 3011 | Clemens  | Peel    |
| 3008 | Clemens  | Peel    |
| 3006 | Cisneros | Rifkin  |
| 3001 | Cisneros | Rifkin  |
| 3002 | Pereira  | Motika  |
+------+----------+---------+
10 rows in set (0.01 sec)

------------------------------===========================================================================

-- 3. Write a query that produces all customers serviced by salespeople with a commission above 12%. Display the customer’s name, the salesperson’s name, and the salesperson’s rate of commission.


mysql> select c.cname , s.sname , s.comm
    -> from salespeople s
    -> join customers c
    -> on s.snum=c.snum
    -> where s.comm > .12 ;
+----------+--------+------+
| cname    | sname  | comm |
+----------+--------+------+
| Liu      | Serres | 0.13 |
| Grass    | Serres | 0.13 |
| Cisneros | Rifkin | 0.15 |
+----------+--------+------+
3 rows in set (0.00 sec)


------------------------------===========================================================================..


-- 4. Write a query that calculates the commission earned by each salesperson for orders placed by customers with a rating above 100

mysql> select o.onum , s.comm  , s.comm * o.amt
    -> from salespeople s
    -> inner join orders o
    -> on o.snum=s.snum
    -> inner join customers c
    -> on c.cnum=o.cnum
    -> where rating > 100 ;
+------+------+----------------+
| onum | comm | s.comm * o.amt |
+------+------+----------------+
| 3010 | 0.13 |        40.2935 |
| 3007 | 0.13 |         9.8475 |
| 3005 | 0.13 |       670.8585 |
| 3006 | 0.15 |       164.7240 |
| 3001 | 0.15 |         2.8035 |
| 3009 | 0.10 |       171.3230 |
+------+------+----------------+
6 rows in set (0.00 sec)


------------------------------===========================================================================

-- 5. Write a query that produces all pairs of salespeople who are living in the same city. Exclude combinations of salespeople with themselves as well as duplicate rows with the order reversed.


select s.sname , p.sname , s.city, p.city
    from salespeople s
    inner join
    salespeople p
    on s.city = p.city  and s.sname > p.sname;

    +-------+--------+--------+
| sname | sname  | city   |
+-------+--------+--------+
| Peel  | Motika | London |
+-------+--------+--------+
1 row in set (0.00 sec)


------------------------------===========================================================================

------------------------------===========================================================================

-- 1. Display the Supplier name and the Quantity sold.

mysql>  select s.sname , sum(qty)
    ->      from s
    ->      inner join sp
    ->      on s.`s#`= sp.`s#`
    ->      group by s.sname;
+-------+----------+
| sname | sum(qty) |
+-------+----------+
| Smith |      900 |
| Jones |     3200 |
| Blake |      700 |
| Clark |      600 |
| Adams |     3100 |
+-------+----------+
5 rows in set (0.01 sec)

------------------------------===========================================================================

-- 2. Display the Part name and Quantity sold

mysql> select pname,sum(sp.qty)
    -> from parts p
    -> inner join
    -> sp
    -> on p.`p#`=sp.`p#`
    -> group by pname ;
+-------+-------------+
| pname | sum(sp.qty) |
+-------+-------------+
| Nut   |        1000 |
| Screw |        4800 |
| Cam   |        1100 |
| Cog   |        1300 |
| Bolt  |         300 |
+-------+-------------+
5 rows in set (0.00 sec)

------------------------------===========================================================================

-- 3. Display the Job name and Quantity sold.

mysql> select jname,sum(sp.qty)
    -> from sp
    -> inner join
    -> jobs j
    -> on sp.`j#`=j.`j#`
    -> group by jname ;
+----------+-------------+
| jname    | sum(sp.qty) |
+----------+-------------+
| Sorter   |         800 |
| Console  |        3300 |
| Punch    |        1200 |
| Reader   |         500 |
| Collator |        1100 |
| Terminal |         400 |
| Tape     |        1200 |
+----------+-------------+
7 rows in set (0.01 sec)

------------------------------===========================================================================
-- 4. Display the Supplier name, Part name, Job name and Quantity sold.

select s.sname,p.pname,j.jname,sp.qty
from sp 
inner join 
parts p 
on p.`p#`=sp.`p#`
inner join 
s 
on s.`s#`=sp.`s#`
inner join 
jobs j
on sp.`j#` = j.`j#`;

+-------+-------+----------+------+
| sname | pname | jname    | qty  |
+-------+-------+----------+------+
| Jones | Screw | Sorter   |  400 |
| Blake | Screw | Sorter   |  200 |
| Smith | Nut   | Sorter   |  200 |
| Adams | Cog   | Punch    |  200 |
| Jones | Cam   | Punch    |  100 |
| Blake | Screw | Punch    |  500 |
| Jones | Screw | Punch    |  200 |
| Adams | Bolt  | Punch    |  200 |
| Clark | Cog   | Reader   |  300 |
| Jones | Screw | Reader   |  200 |
| Adams | Cog   | Console  |  500 |
| Adams | Cam   | Console  |  400 |
| Adams | Screw | Console  |  800 |
| Jones | Screw | Console  |  500 |
| Adams | Screw | Console  |  200 |
| Adams | Bolt  | Console  |  100 |
| Smith | Nut   | Console  |  700 |
| Adams | Nut   | Console  |  100 |
| Adams | Cam   | Collator |  500 |
| Jones | Screw | Collator |  600 |
| Jones | Screw | Terminal |  400 |
| Clark | Cog   | Tape     |  300 |
| Adams | Cam   | Tape     |  100 |
| Jones | Screw | Tape     |  800 |
+-------+-------+----------+------+
24 rows in set (0.00 sec)

------------------------------===========================================================================

-- 5. Display the Supplier name, Supplying Parts to a Job in the same City.

mysql> select s.sname
    -> from s
    -> inner join
    -> s p
    -> on s.city = p.city
    -> group by s.sname;
+-------+
| sname |
+-------+
| Clark |
| Smith |
| Blake |
| Jones |
| Adams |
+-------+
5 rows in set (0.00 sec)

------------------------------===========================================================================

-- 6. Display the Part name that is ‘Red’ in color, and the Total Quantity sold for that part.

mysql> select p.pname,sum(qty)
    -> from parts p
    -> inner join sp
    -> on p.`p#` = sp.`p#`
    -> where p.color = 'red'
    -> group by p.pname;
+-------+----------+
| pname | sum(qty) |
+-------+----------+
| Nut   |     1000 |
| Cam   |     1100 |
| Screw |     1300 |
| Cog   |     1300 |
+-------+----------+
4 rows in set (0.00 sec)

------------------------------===========================================================================

-- 7. Display all the Quantity sold by Suppliers with the Status = 20.

select sname,sum(qty)
from sp 
inner join s 
on sp.`s#`=s.`s#` 
where status = 20 
group by sname ;

+-------+----------+
| sname | sum(qty) |
+-------+----------+
| Smith |      900 |
| Clark |      600 |
+-------+----------+
2 rows in set (0.00 sec)

------------------------------===========================================================================

-- 8. Display all the Parts and their Total Quantity for the parts with the Weight > 14.

mysql> select * from parts;
+----+-------+-------+--------+--------+
| p# | pname | color | weight | city   |
+----+-------+-------+--------+--------+
| P1 | Nut   | Red   |     12 | London |
| P2 | Bolt  | Green |     17 | Paris  |
| P3 | Screw | Blue  |     17 | Rome   |
| P4 | Screw | Red   |     12 | London |
| P5 | Cam   | Red   |     12 | Paris  |
| P6 | Cog   | Red   |     12 | London |
+----+-------+-------+--------+--------+
6 rows in set (0.00 sec)

select p.pname,p.weight,sum(qty)
from sp 
inner join parts p 
on sp.`p#`=p.`p#` 
where p.Weight > 14 
group by pname,p.weight;

+-------+--------+----------+
| pname | weight | sum(qty) |
+-------+--------+----------+
| Screw |     17 |     3500 |
| Bolt  |     17 |      300 |
+-------+--------+----------+
2 rows in set (0.00 sec)

------------------------------===========================================================================

-- 9. Display all the Job names and City, which has bought more than 500 Parts.

select j.jname,city,sum(sp.qty)
from sp 
inner join 
jobs j
on sp.`j#` = j.`j#` 
group by jname,city
having sum(sp.qty) > 500;
+----------+--------+-------------+
| jname    | city   | sum(sp.qty) |
+----------+--------+-------------+
| Sorter   | Paris  |         800 |
| Console  | Athens |        3300 |
| Punch    | Rome   |        1200 |
| Collator | London |        1100 |
| Tape     | London |        1200 |
+----------+--------+-------------+
5 rows in set (0.00 sec)

------------------------------===========================================================================

-- 10. Display all the Part names and Quantity sold that have a Weight less than 15.

select p.pname , sum(sp.qty)
from sp 
inner join Parts p
on sp.`p#`=p.`p#`
where weight < 15 
group by pname ;

+-------+-------------+
| pname | sum(sp.qty) |
+-------+-------------+
| Nut   |        1000 |
| Cam   |        1100 |
| Screw |        1300 |
| Cog   |        1300 |
+-------+-------------+
4 rows in set (0.00 sec)

------------------------------===========================================================================

-- 11. Display all the Suppliers with the same Status as the supplier, ‘CLARK’

 select s.sname , s.status
 from s
 inner join s p
 on s.status = p.status
 where p.sname='clark'
 order by sname desc
 limit 1 ;

 +-------+--------+
| sname | status |
+-------+--------+
| Smith |     20 |
+-------+--------+
1 row in set (0.00 sec)

------------------------------===========================================================================

-- 12. Display all the Parts which have more Weight than any “Red” parts.


mysql> SELECT p1.pname, p1.weight, p1.color
    -> FROM parts p1
    -> INNER JOIN parts p2 ON p1.weight > p2.weight
    -> WHERE p2.color = 'Red'
    -> GROUP BY p1.pname, p1.weight, p1.color;
+-------+--------+-------+
| pname | weight | color |
+-------+--------+-------+
| Bolt  |     17 | Green |
| Screw |     17 | Blue  |
+-------+--------+-------+
2 rows in set (0.00 sec)

------------------------------===========================================================================

-- 13. Display all the Jobs going on in the same city as the job ‘TAPE’.

mysql>  select j.jname , j.city
    ->  from jobs j
    ->  inner join jobs p
    ->  on j.city = p.city
    ->  where p.jname='tape'
    -> and j.jname <> 'tape' ;
+----------+--------+
| jname    | city   |
+----------+--------+
| Collator | London |
+----------+--------+
1 row in set (0.00 sec)

------------------------------===========================================================================

-- 14. Display all the Parts with Weight less than any of the “Green” parts
 
 select p1.pname , p1.weight , p1.color
 from parts p1 
 inner join parts p2 
 on p1.weight < p2.weight 
 where p2.color = "Green"
 group by p1.pname,p1.weight,p1.color;

+-------+--------+-------+
| pname | weight | color |
+-------+--------+-------+
| Nut   |     12 | Red   |
| Screw |     12 | Red   |
| Cam   |     12 | Red   |
| Cog   |     12 | Red   |
+-------+--------+-------+
4 rows in set (0.00 sec)

------------------------------===========================================================================

-- 15. Display the name of the Supplier who has sold the maximum Quantity (in one sale).

select sname,max(sp.qty) max_qty
from sp 
inner join s
on sp.`s#`=s.`s#` 
group by s.sname
order by max_qty desc
limit 2
;
+-------+---------+
| sname | max_qty |
+-------+---------+
| Jones |     800 |
| Adams |     800 |
+-------+---------+
2 rows in set (0.00 sec)

--****** two values are same 

------------------------------===========================================================================

-- 16. Display the name of the Supplier who has sold the maximum overall Quantity (sum of Sales)

select sname,sum(sp.qty)
from sp 
inner join s
on s.`s#`=sp.`s#` 
group by sname
order by sum(sp.qty) desc
limit 1;

+-------+-------------+
| sname | sum(sp.qty) |
+-------+-------------+
| Jones |        3200 |
+-------+-------------+
1 row in set (0.00 sec)