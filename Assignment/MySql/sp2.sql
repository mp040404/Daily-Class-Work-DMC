
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
