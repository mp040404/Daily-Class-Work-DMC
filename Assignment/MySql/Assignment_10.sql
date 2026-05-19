-- 1. Write a procedure that computes the perimeter and the area of a
-- rectangle. Define your own values for the length and width. (Assuming
-- that L and W are the length and width of the rectangle,
-- Perimeter = 2*(L+W) and Area = L*W.

DROP PROCEDURE IF EXISTS sp1;
DELIMITER #
CREATE PROCEDURE sp1(l double,w double)
BEGIN
    DECLARE per double defult 0.0;

    set per = 2*(l + w) ;

    select per as perimeter ;
END;
#
DELIMITER ;

mysql> call sp1(5,2);
+-----------+
| perimeter |
+-----------+
|        14 |
+-----------+
1 row in set (0.00 sec)

Query OK, 0 rows affected (0.00 sec)

--_________________________________________________________________________________________________

-- 2. Write a procedure that declares an integer variable called num, assigns
-- a value to it, computes and inserts into the temp table the value of the
-- variable itself, its square, and its cube.

drop procedure if EXISTS sp2 ;

delimiter #
CREATE procedure sp2(num double)
BEGIN 
    declare square double ;
    declare c_cube double ;


    set square = num * num ;
    set c_cube = num * num * num ;

    select num,square,c_cube as 'cube' ;
end ;
#
delimiter ;

mysql> source D:\CDAC\Git Rdbms\RDBMS-Assingments\sp2.sql
Query OK, 0 rows affected, 1 warning (0.01 sec)

Query OK, 0 rows affected (0.00 sec)

mysql> call sp2(10);
+------+--------+------+
| num  | square | cube |
+------+--------+------+
|   10 |    100 | 1000 |
+------+--------+------+
1 row in set (0.00 sec)

Query OK, 0 rows affected (0.00 sec)

--______________________________________________________________________________

-- 3. Create a procedure to Convert a temperature in Fahrenheit (F) to its
-- equivalent in Celsius (C) and vice versa. The required formulae are
-- C= (F-32) *5/9 F= 9/5*C + 32


    


DELIMITER //

CREATE FUNCTION sp77(val DECIMAL(10,2), unit CHAR(1)) 
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    IF UPPER(unit) = 'C' THEN
        RETURN (1.8 * val) + 32;
    ELSEIF UPPER(unit) = 'F' THEN
        RETURN (val - 32) * 5 / 9;
    ELSE
        RETURN NULL;
    END IF;
END //

DELIMITER ;

mysql> select sp77(97,'f');
+--------------+
| sp77(97,'f') |
+--------------+
|        36.11 |
+--------------+
1 row in set, 1 warning (0.01 sec)

mysql> select sp77(37,'c');
+--------------+
| sp77(37,'c') |
+--------------+
|        98.60 |
+--------------+
1 row in set (0.00 sec)
--_____________________________________________________________________________________________________________

-- 4. Create a procedure to Convert a number of inches into yards, feet, and inches. For example, 124 inches equals 3 yards, 1 foot, and 4 inches

drop procedure if EXISTS sp4 ;

delimiter // 
create procedure sp4(num double)
begin 
    declare yard double ;
    declare foot double ;

   set foot = num / 12 ;
    set yard = num / 36 ;
select num as inches , foot , yard  ;
end ;
//
delimiter ;

mysql> source D:\CDAC\Git Rdbms\RDBMS-Assingments\sp5.sql
Query OK, 0 rows affected (0.01 sec)

Query OK, 0 rows affected (0.00 sec)

mysql> call sp4(124)
    -> ;
+--------+--------------------+--------------------+
| inches | foot               | yard               |
+--------+--------------------+--------------------+
|    124 | 10.333333333333334 | 3.4444444444444446 |
+--------+--------------------+--------------------+
1 row in set (0.00 sec)


Query OK, 0 rows affected (0.01 sec)

--_______________________________________________________________________________________________________

-- 5. Create a procedure to read two real numbers and tell whether the product of the two numbers is equal to or greater than 100

DROP PROCEDURE IF EXISTS sp6;

DELIMITER // 

CREATE PROCEDURE sp6(num_1 DOUBLE, num_2 DOUBLE)
BEGIN 
    DECLARE product DOUBLE;
    
    SET product = num_1 * num_2;
    IF product > 100 THEN
    SELECT 'Product is greater than 100' AS 
    Status, product;
    ELSE
    SELECT 'Product is not greater than 100' AS Status, product;
    END IF;

END //

DELIMITER ;


mysql> call sp6(25,5);
+-----------------------------+---------+
| Status                      | product |
+-----------------------------+---------+
| Product is greater than 100 |     125 |
+-----------------------------+---------+
1 row in set (0.00 sec)

Query OK, 0 rows affected (0.01 sec)