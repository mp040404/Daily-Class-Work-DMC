drop procedure if EXISTS sp4 ;

delimiter // 
create procedure sp4(num double)
begin 
    declare yard double ;
    declare foot double ;

    set foot = num / 124 ;
    set yard = num / 41.33 ;

select num as inches , foot , yard  ;
end ;
//
delimiter ;
