CREATE TABLE `t_invoice_request` (
  `fid` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `ftenant_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联租户',
  `fcompany_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '关联企业',
  `finvoice_type` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '发票类型，380,381..',
  `finvoice_sub_type` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '发票子类型',
  `fsubmission_type` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '业务类型',
  `fsell_billed` varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '是否反向开票',
  `finvoice_no` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '发票号码',
  `fissue_date` datetime NOT NULL COMMENT '开票日期',
  `fsend_company_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '销方企业ID',
  `freceive_company_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '购方企业id',
  `fsend_company_name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '销方企业名称',
  `fcountry` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '销方国家',
  `frequest_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '请求id',
  `freceiver_company_name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '购方企业名称',
  `ftotal_amount` decimal(23,10) NOT NULL COMMENT '总金额',
  `ftax_amount` decimal(23,10) NOT NULL COMMENT '税额',
  `fcurrency` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '币种代码',
  `forder_refid` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '订单ID',
  `fbilling_refid` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '单据ID',
  `fext_field` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'json',
  `fsource_document_type` VARCHAR(50),
  `fsource_document_id` VARCHAR(36),
	`ftarget_document_id` VARCHAR(36),
	`fstatus` tinyint(2) DEFAULT 1 COMMENT '单据综合状态',
    `ferror_message` TEXT,
  `fcreate_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fupdate_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='invoicequest表';

CREATE TABLE `t_invoice` (
  `fid` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `ftenant_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关联租户',
  `fcompany_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '关联企业',
  `finvoice_type` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '发票类型，380,381..',
  `finvoice_sub_type` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '发票子类型',
  `fsubmission_type` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '业务类型',
  `fsell_billed` varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '是否反向开票',
  `finvoice_no` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '发票号码',
  `fissue_date` datetime NOT NULL COMMENT '开票日期',
  `fsend_company_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '销方企业ID',
  `freceive_company_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '购方企业id',
  `fsend_company_name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '销方企业名称',
  `freceiver_company_name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '购方企业名称',
  `ftotal_amount` decimal(23,10) NOT NULL COMMENT '总金额',
  `ftax_amount` decimal(23,10) NOT NULL COMMENT '税额',
  `fcurrency` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '币种代码',
  `forder_refid` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '订单ID',
  `fbilling_refid` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '单据ID',
  `fext_field` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'json',
   `fissue_status` tinyint(2) DEFAULT 1 COMMENT '开具状态',
   `faudit_id` VARCHAR(36) COMMENT '税局确认ID',
    `fsubmission_id` VARCHAR(36) COMMENT '税局传输id',
    `fstatus` tinyint(2) DEFAULT 1 COMMENT '上传税局状态',
    `ferror_message` TEXT,
  `fcreate_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fupdate_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='invoicequest表';


CREATE TABLE `t_invoice_line` (
    `fid` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `finvoice_request_id` bigint COMMENT '申请单id',
    `fseq` int DEFAULT 1 COMMENT '行序列号',
    `finvoice_line_amount` DECIMAL(18, 2) COMMENT '行金额',
    `fstatus` tinyint(2) DEFAULT 1 COMMENT '开具状态',
    `fhas_multiline` TINYINT(1) DEFAULT 0 COMMENT '是否多开',
    `finvoice_id` bigint COMMENT '关联发票id',
	
	 `famount` DECIMAL(18, 2) DEFAULT 0 COMMENT '行金额',
    `ftype` tinyint(1) DEFAULT 1 COMMENT '行类型。 0正常行，1折扣2收费',
    `fitem_name` VARCHAR(255) COMMENT '商品名称',
    `funit` VARCHAR(50) COMMENT '单位',
    `fquantity` DECIMAL(18, 2) COMMENT '数量',
	`fprice` DECIMAL(18, 2) COMMENT '单价',
    `fcategory_code` VARCHAR(50) COMMENT '税码',
    `ftax_rate` DECIMAL(5, 2)  COMMENT '税率',
    `fext_field` TEXT,
     `fcreate_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fupdate_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`fid`)
);

-- DDL for DeliveryInformation
CREATE TABLE `t_delivery` (
    `fid` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `finvoice_id` VARCHAR(36) NOT NULL,
    `fdelivery_method` VARCHAR(50),
    `fstatus` VARCHAR(50),
    `ferror_message` TEXT,
    `fcontent` TEXT,
	 `fcreate_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fupdate_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`fid`)
);



-- DDL for InvoiceRequestLineLog
CREATE TABLE `t_invoice_request_history` (
    `fid` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `finvoice_id` VARCHAR(36),
	`finvoice_line_id` VARCHAR(36),
    `fstatus` VARCHAR(50),
     `fcreate_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fupdate_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`fid`)
);


-- DDL for File
CREATE TABLE `t_invoice_file` (
   `fid` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `ftenant_id` VARCHAR(36) NOT NULL,
    `frelatino_id` VARCHAR(36) NOT NULL,
	`ftype` tinyint(2) NOT NULL,
    `fdocument_type` VARCHAR(50),
    `fattachments` TEXT,
    `ffile_id` VARCHAR(36),
	 `fcreate_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fupdate_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`fid`)
);