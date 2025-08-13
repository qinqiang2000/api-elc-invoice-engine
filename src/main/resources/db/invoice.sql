CREATE TABLE `t_field_metadata` (
  `fid` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `ffield_name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL COMMENT '标签名',
  `ffield_type` int DEFAULT '1' COMMENT '元素类型1元素，2属性',
  `flevel` int DEFAULT '1' COMMENT '层级，根节点为1',
  `fparent_id` bigint DEFAULT NULL COMMENT '父标签ID，根节点为NULL',
  `forder` int DEFAULT '1' COMMENT '顺序，值越小越靠前',
  `fxpath` varchar(256) COLLATE utf8mb4_general_ci NOT NULL COMMENT '标签的XPath路径',
  `ffield_path` varchar(100) COLLATE utf8mb4_general_ci NOT NULL COMMENT '字段路径',
  `fdata_type` tinyint(1) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '数据类型（如1.string、2.int、3.date等）',
  `fdefault_value` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '默认值',
  `fdescription` varchar(1024) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '描述/注释',
  `fcreate_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fupdate_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`fid`),
  KEY `idx_fparent_id` (`fparent_id`),
  KEY `idx_fxpath` (`fxpath`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='XML标签元数据表';

-- test_jin.t_invoice_rules definition

CREATE TABLE `t_invoice_rules` (
  `fid` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `fcountry` varchar(4) COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '国家二字码',
  `ftrade_area` varchar(64) COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '贸易区',
  `fprovince` varchar(64) COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '省',
  `fcity` varchar(64) COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '城市',
  `ftags` varchar(64) COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '行业',
  `finvoice_type` varchar(12) COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '发票类型',
  `frule_code` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '规则唯一编码，三段式，洲-sys/user-流水号',
  `frule_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '规则名称',
  `frule_type` tinyint NOT NULL DEFAULT '2' COMMENT '1校验，2补全',
  `factive` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否启用1启用2停用',
  `fstatus` tinyint(1) NOT NULL DEFAULT '1' COMMENT '规则状态：1草稿 2测试通过 3已发布',
  `fapply_to` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '规则应用条件',
  `ferror_message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '错误提示信息',
  `ffield_path` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '字段路径',
  `fpriority` int NOT NULL DEFAULT '0' COMMENT '优先级',
  `frule_expression` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '规则表达式',
  `fstart_time` datetime DEFAULT NULL COMMENT '规则生效开始时间',
  `fend_time` datetime DEFAULT NULL COMMENT '规则生效结束时间',
  `fcreate_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fupdate_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`fid`),
  UNIQUE KEY `uk_rule_code` (`frule_code`),
  KEY `idx_field_path` (`ffield_path`),
  KEY `idx_active_time` (`factive`,`fstart_time`,`fend_time`),
  KEY `idx_status` (`fstatus`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='验证规则表';

CREATE TABLE `t_rule_subscription` (
  `fid` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `frule_code` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '规则唯一编码',
  `ftenant_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '关联租户',
  `fcompany_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '关联企业',
  `fcreate_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fupdate_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='XML标签元数据表';

CREATE TABLE `t_rule_log` (
  `fid` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `fbill_no` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '执行结果',
  `finvoice_no` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '执行结果',
  `frule_code` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '执行结果',
  `fexecution_result` tinyint(1) NOT NULL DEFAULT '1' COMMENT '执行结果状态1成功2失败',
  `ferror_message` varchar(255) COLLATE utf8mb4_general_ci NOT NULL COMMENT '执行结果描述',
  `finput_data` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '输入',
  `foutput_data` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '输出',
  `fcompany_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '企业ID',
  `frequest_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '请求ID',
  `fcreate_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fupdate_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='规则执行日志表';
