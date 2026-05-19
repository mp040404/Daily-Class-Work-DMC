
drop procedure if EXISTS sp3 ;
    
DELIMITER //

CREATE FUNCTION sp3(f_temp DECIMAL(10,2)) 
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE c_temp DECIMAL(10,2);
    SET c_temp = (f_temp - 32) * 5 / 9;
    RETURN c_temp;
END //

DELIMITER ;

SET @res = sp3(98);

mysql> select @res;
+-------+
| @res  |
+-------+
| 36.67 |
+-------+
1 row in set (0.00 sec)