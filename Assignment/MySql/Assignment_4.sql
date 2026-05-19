-- 1. Display the PNAME and COLOR from the P table for the
-- CITY=”London”.


mysql> select pname,color , city
    -> from parts
    -> where city='london';
+-------+-------+--------+
| pname | color | city   |
+-------+-------+--------+
| Nut   | Red   | London |
| Screw | Red   | London |
| Cog   | Red   | London |
+-------+-------+--------+
3 rows in set (0.00 sec)

-------------------------------------------------------------------

-- 2. Display all the Suppliers from London.

mysql> select * from
    -> s
    -> where city = 'london';
+----+-------+--------+--------+
| S# | Sname | status | city   |
+----+-------+--------+--------+
| s1 | Smith |     20 | London |
| S4 | Clark |     20 | London |
+----+-------+--------+--------+
2 rows in set (0.01 sec)

--------------------------------------------------------------------

-- 3. Display all the Suppliers from Paris or Athens.

mysql> select * from
    -> s
    -> where city in ('paris','athens');
+----+-------+--------+--------+
| S# | Sname | status | city   |
+----+-------+--------+--------+
| S2 | Jones |     10 | Paris  |
| S3 | Blake |     30 | Paris  |
| S5 | Adams |     30 | Athens |
+----+-------+--------+--------+
3 rows in set (0.00 sec)

------------------------------------------------------------------------------

--4. Display all the Jobs in Athens.

mysql> select * from jobs
    -> where city = 'athens';
+----+---------+--------+
| J# | Jname   | City   |
+----+---------+--------+
| J3 | Reader  | Athens |
| J4 | Console | Athens |
+----+---------+--------+
2 rows in set (0.01 sec)


-----------------------------------------------------------------------------------------


-- 5. Display all the Part names with the weight between 12 and 14
-- (inclusive of both).


mysql> select pname from
    -> parts
    -> where weight between '11.5' and '14.5';
+-------+
| pname |
+-------+
| Nut   |
| Screw |
| Cam   |
| Cog   |
+-------+
4 rows in set (0.00 sec)

-----------------------------------------------------------------------------------

-- 6. Display all the Suppliers with a Status greater than or equal
-- to 20.

mysql> select * from s
    -> where status >= 20 ;
+----+-------+--------+--------+
| S# | Sname | status | city   |
+----+-------+--------+--------+
| s1 | Smith |     20 | London |
| S3 | Blake |     30 | Paris  |
| S4 | Clark |     20 | London |
| S5 | Adams |     30 | Athens |
+----+-------+--------+--------+
4 rows in set (0.01 sec)
---------------------------------------------------------------------------
-- 7. Display all the Suppliers except the Suppliers from London.

mysql> select * from s
    -> where city != 'london';
+----+-------+--------+--------+
| S# | Sname | status | city   |
+----+-------+--------+--------+
| S2 | Jones |     10 | Paris  |
| S3 | Blake |     30 | Paris  |
| S5 | Adams |     30 | Athens |
+----+-------+--------+--------+
3 rows in set (0.01 sec)

------------------------------------------------------------------
-- 8. Display only the Cities from where the Suppliers come from.

mysql> select distinct city from s;
+--------+
| city   |
+--------+
| London |
| Paris  |
| Athens |
+--------+
3 rows in set (0.01 sec)

--------------------------------------------------------------------------------------------------------------------------------------------------------

-- 9. Display the Supplier table in the descending order of CITY.

mysql> select * from s
    -> order by city desc;
+----+-------+--------+--------+
| S# | Sname | status | city   |
+----+-------+--------+--------+
| S2 | Jones |     10 | Paris  |
| S3 | Blake |     30 | Paris  |
| s1 | Smith |     20 | London |
| S4 | Clark |     20 | London |
| S5 | Adams |     30 | Athens |
+----+-------+--------+--------+
5 rows in set (0.01 sec)

-----------------------------------------------------------------------------------------------------------------

-- 10. Display the Part Table in the ascending order of CITY and
-- within the city in the ascending order of Part names.


mysql> select * from parts
    -> order by city , pname ;
+----+-------+-------+--------+--------+
| p# | pname | color | weight | city   |
+----+-------+-------+--------+--------+
| P6 | Cog   | Red   |     12 | London |
| P1 | Nut   | Red   |     12 | London |
| P4 | Screw | Red   |     12 | London |
| P2 | Bolt  | Green |     17 | Paris  |
| P5 | Cam   | Red   |     12 | Paris  |
| P3 | Screw | Blue  |     17 | Rome   |
+----+-------+-------+--------+--------+
6 rows in set (0.00 sec)

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- 11. Display all the Suppliers with a status between 10 and 20.

mysql> select * from s
    -> where status between 10 and 20 ;
+----+-------+--------+--------+
| S# | Sname | status | city   |
+----+-------+--------+--------+
| s1 | Smith |     20 | London |
| S2 | Jones |     10 | Paris  |
| S4 | Clark |     20 | London |
+----+-------+--------+--------+
3 rows in set (0.00 sec)


--------------------------------------------------------------------------------------------------------------------------------------------------------

-- 12. Display all the Parts and their Weight, which are not in the
-- range of 10 and 15.
mysql> select * from parts
    -> where weight not between 10 and 15 ;
+----+-------+-------+--------+-------+
| p# | pname | color | weight | city  |
+----+-------+-------+--------+-------+
| P2 | Bolt  | Green |     17 | Paris |
| P3 | Screw | Blue  |     17 | Rome  |
+----+-------+-------+--------+-------+
2 rows in set (0.00 sec)

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------