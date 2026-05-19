drop procedure if EXISTS sp7 ;
    
DELIMITER //

CREATE FUNCTION sp7(c_temp DECIMAL(10,2)) 
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE f_temp DECIMAL(10,2);
    SET f_temp = (9 / 5 * c_temp )+32;
    RETURN c_temp;
END //

DELIMITER ;
