
DROP PROCEDURE IF EXISTS sp6;

DELIMITER // 

CREATE PROCEDURE sp6(num_1 DOUBLE, num_2 DOUBLE)
BEGIN 
    DECLARE product DOUBLE;
    
    SET product = num_1 * num_2;
    IF product > 100 THEN
        SELECT 'Product is greater than 100' AS Status, product;
    ELSE
        SELECT 'Product is not greater than 100' AS Status, product;
    END IF;

END //

DELIMITER ;