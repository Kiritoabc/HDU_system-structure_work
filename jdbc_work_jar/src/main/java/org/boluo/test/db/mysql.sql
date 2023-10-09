-- 用于本次作业的数据库文件，先创建一个数据库jdbc_test,再执行sql文件
create table if not exists user
(
    id       int          not null,
    username varchar(256) not null,
    password varchar(256) null
    );

