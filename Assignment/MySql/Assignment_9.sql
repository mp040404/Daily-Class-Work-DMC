-- 1.Create an index that will enable a user to pull orders for ‘1990-10-03

Create index idx_order_odate on orders(odate);

Query OK, 0 rows affected (0.07 sec)
Records: 0  Duplicates: 0  Warnings: 0
--___________________________________________________
show index from orders;
+--------+------------+-----------------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
| Table  | Non_unique | Key_name        | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
+--------+------------+-----------------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
| orders |          1 | idx_order_odate |            1 | odate       | A         |           2 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |
+--------+------------+-----------------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
1 row in set (0.01 sec)

--____________________________________________________________

select * from orders where odate='1990-10-03';
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
+------+---------+------------+------+------+
5 rows in set (0.00 sec)
--_________________________________________________________________________________________________________________________________________________________________________

-- 2.If the Orders table has already been created, how can you force the onum field t

create unique index idx_order_onum on orders(onum);

Query OK, 0 rows affected (0.05 sec)
Records: 0  Duplicates: 0  Warnings: 0

--_____________________________________
mysql> desc orders;
+-------+--------------+------+-----+---------+-------+
| Field | Type         | Null | Key | Default | Extra |
+-------+--------------+------+-----+---------+-------+
| onum  | int          | YES  | UNI | NULL    |       |
| amt   | decimal(7,2) | YES  |     | NULL    |       |
| odate | date         | YES  | MUL | NULL    |       |
| cnum  | int          | YES  |     | NULL    |       |
| snum  | int          | YES  |     | NULL    |       |
+-------+--------------+------+-----+---------+-------+
5 rows in set (0.02 sec)
--_________________________________________________________________________________________________________________________

-- 3.Create an index that would permit salesperson to retrieve his orders.

create index idx_order_snum on orders(snum);

Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select snum,onum from orders ;
+------+------+
| snum | onum |
+------+------+
| 1007 | 3001 |
| 1001 | 3003 |
| 1004 | 3002 |
| 1002 | 3005 |
| 1007 | 3006 |
| 1003 | 3009 |
| 1002 | 3007 |
| 1001 | 3008 |
| 1002 | 3010 |
| 1001 | 3011 |
+------+------+
10 rows in set (0.00 sec)

---__________________________________________________________________

-- 4.Let us assume that each salesperson is to have only one customer of a given rating, and this is currently the case. Create an index that enforc

 create index idx_customers_cnum on customers(snum);
Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0

create index idx_customers_rating on customers(rating);
Query OK, 0 rows affected (0.05 sec)
Records: 0  Duplicates: 0  Warnings: 0

--________________________________________________________________

-- 5.Create an index to speed up searching order on a given date by given customer.

create index idx_orders_cnum on orders(cnum);

Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0