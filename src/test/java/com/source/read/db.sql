create database `mybatis-source`;

use `mybatis-source`;

create table user
(
    id int not null auto_increment primary key comment 'id',
    name varchar(255) not null default '' comment '姓名',
    birthday datetime not null comment '生日'
);
