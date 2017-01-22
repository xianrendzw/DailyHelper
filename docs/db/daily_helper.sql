CREATE DATABASE IF NOT EXISTS daily_helper DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

use daily_helper;

CREATE TABLE dh_record
(
    id INT(11) PRIMARY KEY NOT NULL COMMENT '自增标识' AUTO_INCREMENT,
    staff_id INT(11) NOT NULL COMMENT '员工工号',
    date INT(11) NOT NULL COMMENT '晨会日期',
    yestoday VARCHAR(2000) NOT NULL COMMENT '昨日工作情况',
    today VARCHAR(2000) NOT NULL COMMENT '今日计划工作',
    memo VARCHAR(500) NOT NULL COMMENT '备注说明',
    gmt_created DATETIME NOT NULL COMMENT '记录创建时间',
    gmt_updated DATETIME NOT NULL COMMENT '记录更新时间'
);
CREATE UNIQUE INDEX dh_record_staff_id_date_uindex ON dh_record (staff_id, date);

CREATE TABLE dh_staff
(
    id INT(11) PRIMARY KEY NOT NULL COMMENT '工号',
    name VARCHAR(50) NOT NULL COMMENT '姓名',
    nick_name VARCHAR(50) NOT NULL COMMENT '花名',
    gmt_created DATETIME NOT NULL COMMENT '创建时间',
    gmt_updated DATETIME NOT NULL COMMENT '更新时间'
);
CREATE UNIQUE INDEX dh_staff_nick_name_uindex ON dh_staff (nick_name);