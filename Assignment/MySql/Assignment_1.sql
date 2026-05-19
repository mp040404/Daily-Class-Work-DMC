--1. Create 'spj' database'. (Database for suppliers, parts and jobs)

CREATE DATABASE spj;

 USE spj DATABASE;

  CREATE TABLE S(`S#` CHAR(5) NOT NULL,Sname CHAR(20),status SMALLINT ,city CHAR(15));

  INSERT INTO S VALUES ('S1','Smith',20,'London');
  INSERT INTO S VALUES ('S2','Jones',10,'Paris');
  INSERT INTO S VALUES ('S3','Blake',30,'Paris');
  INSERT INTO S VALUES ('S4','Clark',20,'London');
  INSERT INTO S VALUES ('S5','Adams',30,'Athens');

  SELECT * FROM S;

  CREATE TABLE parts(`p#` CHAR(6) NOT NULL , pname CHAR(20),color CHAR(6),weight SMALLINT , city CHAR(15));

  INSERT INTO parts VALUES('P1','Nut','Red',12,'London');
  INSERT INTO parts VALUES('P2','Bolt','Green',17,'Paris');
  INSERT INTO parts VALUES('P3','Screw','Blue',17,'Rome');
  INSERT INTO parts VALUES('P4','Screw','Red',12,'London');
  INSERT INTO parts VALUES('P5','Cam','Red',12,'Paris');
  INSERT INTO parts VALUES('P6','Cog','Red',12,'London');

  SELECT * FROM parts;

  CREATE TABLE jobs(`J#` CHAR(6) NOT NULL ,Jname CHAR(15),City CHAR(15) );

   INSERT INTO jobs VALUES('J1','Sorter','Paris');
   INSERT INTO jobs VALUES('J2','Punch','Rome');
   INSERT INTO jobs VALUES('J3','Reader','Athens');
   INSERT INTO jobs VALUES('J4','Console','Athens');
   INSERT INTO jobs VALUES('J5','Collator','London');
   INSERT INTO jobs VALUES('J6','Terminal','Oslo');
   INSERT INTO jobs VALUES('J7','Tape','London');

   SELECT * FROM jobs;
   

    CREATE TABLE sp(`S#` CHAR(4) NOT NULL,`P#`CHAR(4) NOT NULL,`J#` CHAR(4) NOT NULL,QTY INT );
    
    INSERT INTO sp VALUES('S1','P1','J1',200);
    INSERT INTO sp VALUES('S1','P1','J4',700);
    INSERT INTO sp VALUES('S2','P3','J1',400);
    INSERT INTO sp VALUES('S2','P3','J2',200);
    INSERT INTO sp VALUES('S2','P3','J3',200);
    INSERT INTO sp VALUES('S2','P3','J4',500);
    INSERT INTO sp VALUES('S2','P3','J5',600);
    INSERT INTO sp VALUES('S2','P3','J6',400);
    INSERT INTO sp VALUES('S2','P3','J7',800);
    INSERT INTO sp VALUES('S2','P5','J2',100);
    INSERT INTO sp VALUES('S3','P3','J1',200);
    INSERT INTO sp VALUES('S3','P4','J2',500);
    INSERT INTO sp VALUES('S4','P6','J3',300);
    INSERT INTO sp VALUES('S4','P6','J7',300);
    INSERT INTO sp VALUES('S5','P2','J2',200);
    INSERT INTO sp VALUES('S5','P2','J4',100);
    INSERT INTO sp VALUES('S5','P5','J5',500);
    INSERT INTO sp VALUES('S5','P5','J7',100);
    INSERT INTO sp VALUES('S5','P6','J2',200);
    INSERT INTO sp VALUES('S5','P1','J4',100);
    INSERT INTO sp VALUES('S5','P3','J4',200);
    INSERT INTO sp VALUES('S5','P4','J4',800);
    INSERT INTO sp VALUES('S5','P5','J4',400);
    INSERT INTO sp VALUES('S5','P6','J4',500);


