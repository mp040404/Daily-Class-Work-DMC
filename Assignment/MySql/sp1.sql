DROP PROCEDURE IF EXISTS sp1;
DELIMITER #
CREATE PROCEDURE sp1(l double,w double)
BEGIN
    DECLARE per double default 0.0;

    set per = 2*(l + w) ;

    select per as perimeter ;
END;
#
DELIMITER ;