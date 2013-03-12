
create user reuse identified by 'of!card5';

create database if not exists reuse_tc
 DEFAULT CHARACTER SET utf8
 DEFAULT COLLATE utf8_general_ci;
grant all privileges on reuse_tc.* to reuse@"%" identified by "of!card5";
grant all privileges on reuse_tc.* to reuse@localhost identified by "of!card5";

-- You may have to explicitly define your hostname in order for things
-- to work correctly.  For example:
-- grant all privileges on reuse_tc.* to reuse@host.domain.com identified by "of!card5";

use reuse_tc;

-- 充值卡充值信息
drop table if exists cardinfo;
create table `cardinfo` (
  `id`            bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '默认id',
  `card_no`       varchar(50) NOT NULL DEFAULT ''             COMMENT '卡号',
  `card_pass`     varchar(50) NOT NULL DEFAULT ''             COMMENT '卡密',
  `card_parvalue` varchar(20) NOT NULL DEFAULT ''             COMMENT '卡的实际面值',
  `operators`     enum('CM','CU','CT') NOT NULL DEFAULT 'CM'  COMMENT '运营商(CM:移动,CU:联通,CT:电信)',
  `acct_no`       varchar(20) NOT NULL DEFAULT ''             COMMENT '充值账号(号码、固话、宽带账号等)',
  `acct_no_his`   varchar(20)                                 COMMENT '原始充值账号',
  `state`         tinyint(3) NOT NULL DEFAULT '0'             COMMENT '状态(0:异常,1:待充值,2:充值中,3:充值成功,4:卡密失效,5:卡密有效,6:其它)',
  `state_his`     smallint(5)                                 COMMENT '原始状态',
  `statemsg`      varchar(10)                                 COMMENT '状态信息',
  `statemsg_his`  varchar(50)                                 COMMENT '原始状态信息',
  `usetime`       timestamp NOT NULL                          COMMENT '使用时间',
  `usetime_his`   timestamp NOT NULL                          COMMENT '原始使用时间',
  `supname_inner` varchar(50)                                 COMMENT '内部供货商',
  `supname_outer` varchar(20)                                 COMMENT '外部供货商',
  `supcode_outer` varchar(50)                                 COMMENT '外部供货商编号',
  PRIMARY KEY (`id`),
  KEY `card_no` (`card_no`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 接受充值的账号
drop table if exists acctinfo;
CREATE TABLE `acctinfo` (
  `id`           int(10) unsigned NOT NULL AUTO_INCREMENT    COMMENT '默认id',
  `acct_no`      varchar(20)                                 COMMENT '充值账号(号码、固话、宽带账号等)',
  `operators`    enum('CM','CU','CT') NOT NULL DEFAULT 'CM'  COMMENT '运营商(CM:移动,CU:联通,CT:电信)',
  `total_amount` int(10) NOT NULL DEFAULT '0'                COMMENT '总充值金额',
  PRIMARY KEY (`id`),
  KEY `acct_no` (`acct_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

使用到的查询语句
select card_no ,card_pass, card_parvalue,operators ,state,statemsg from cardinfo where state='1' order by usetime  limit 0,20;

select acct_no ,total_amount from acctinfo where operators='CT' order by total_amount   limit 0,1;
