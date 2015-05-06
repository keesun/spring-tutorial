
CREATE TABLE IF NOT EXISTS users ( 
 id varchar(10) primary key,  
 name varchar(20) not null, 
 password varchar(10) not null,
 level smallint,
 login smallint,
 recommend smallint,
 email varchar(30)
);