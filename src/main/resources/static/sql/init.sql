create database user;

create table `user`.`info`(
    `id` int(10) not null auto_increment primary key,
    `date` date,
    `name` varchar(45) not null,
    `phone` varchar(45) not null,
    `girl` varchar (45) not null,
    `time_start` time,
    `time_end` time,
    `euro` varchar (45),
    `dinar` varchar (45),
    `signature` varchar (45),
    `on_duty` varchar(45));
    
    INSERT INTO `user`.`info`
(`id`,
`date`,
`name`,
`phone`,
`girl`,
`time_start`,
`time_end`,
`euro`,
`dinar`,
`signature`,
`on_duty`)
VALUES
(2,
'2017-11-15',
'dragan',
'555666',
'milena',
'15:30',
'15:35',
'100',
'',
'yes',
'milos');
