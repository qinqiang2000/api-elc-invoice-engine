CREATE TABLE IF NOT EXISTS t_element_metadata (
  fid BIGINT AUTO_INCREMENT PRIMARY KEY,
  felement_name VARCHAR(255),
  felement_type INT,
  fparent_id BIGINT,
  fxpath VARCHAR(512),
  fdata_type VARCHAR(128),
  fis_required TINYINT,
  fis_required_ui TINYINT,
  fmin_occurs INT,
  fmax_occurs INT,
  fis_nillable TINYINT,
  fdefault_value VARCHAR(512),
  ffixed_value VARCHAR(512),
  fenum_values VARCHAR(1024),
  fdescription VARCHAR(1024),
  flevel INT,
  frule VARCHAR(1024),
  fname_space VARCHAR(255)
);

-- Invoice rules table
CREATE TABLE IF NOT EXISTS t_invoice_rules (
  fid BIGINT AUTO_INCREMENT PRIMARY KEY,
  fcountry VARCHAR(4) DEFAULT '',
  ftrade_area VARCHAR(64) DEFAULT '',
  fprovince VARCHAR(64) DEFAULT '',
  fcity VARCHAR(64) DEFAULT '',
  ftags VARCHAR(64) DEFAULT '',
  finvoice_type VARCHAR(12) DEFAULT '',
  fsub_invoice_type VARCHAR(12) DEFAULT '',
  frule_code VARCHAR(64) NOT NULL,
  frule_name VARCHAR(100) NOT NULL,
  frule_type TINYINT NOT NULL DEFAULT 2,
  factive TINYINT(1) NOT NULL DEFAULT 1,
  fstatus TINYINT(1) NOT NULL DEFAULT 1,
  fapply_to VARCHAR(1024) NOT NULL,
  ferror_message VARCHAR(255) NOT NULL,
  ffield_path VARCHAR(100) NOT NULL,
  fpriority INT NOT NULL DEFAULT 0,
  frule_expression VARCHAR(2048) NOT NULL,
  fdescription VARCHAR(1024) DEFAULT '',
  fstart_time TIMESTAMP NULL,
  fend_time TIMESTAMP NULL,
  fcreate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fupdate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Rule log table
CREATE TABLE IF NOT EXISTS t_rule_log (
  fid BIGINT AUTO_INCREMENT PRIMARY KEY,
  fbill_no VARCHAR(64) DEFAULT '',
  finvoice_no VARCHAR(64) DEFAULT '',
  frule_code VARCHAR(64) NOT NULL,
  fexecution_result TINYINT DEFAULT 1,
  ferror_message VARCHAR(255) DEFAULT '',
  finput_data TEXT,
  foutput_data TEXT,
  fcompany_id VARCHAR(64) DEFAULT '',
  frequest_id VARCHAR(64) DEFAULT '',
  fcreate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fupdate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Invoice table (aligned with InvoiceMapper.xml)
CREATE TABLE IF NOT EXISTS t_invoice (
  fid BIGINT AUTO_INCREMENT PRIMARY KEY,
  ftenant_id VARCHAR(64) DEFAULT '',
  fcompany_id VARCHAR(64) DEFAULT '',
  finvoice_type VARCHAR(10) DEFAULT '',
  finvoice_sub_type VARCHAR(20) DEFAULT '',
  fsubmission_type VARCHAR(10) DEFAULT '',
  fsell_billed VARCHAR(100) DEFAULT '',
  finvoice_no VARCHAR(64) DEFAULT '',
  fissue_date TIMESTAMP NULL,
  fsend_company_id VARCHAR(64) DEFAULT '',
  freceive_company_id VARCHAR(64) DEFAULT '',
  fsend_company_name VARCHAR(100) DEFAULT '',
  freceiver_company_name VARCHAR(100) DEFAULT '',
  ftotal_amount DECIMAL(15,2) DEFAULT 0,
  ftax_amount DECIMAL(15,2) DEFAULT 0,
  fcurrency VARCHAR(3) DEFAULT '',
  forder_refid VARCHAR(64) DEFAULT '',
  fbilling_refid VARCHAR(64) DEFAULT '',
  fext_field TEXT,
  fissue_status TINYINT DEFAULT 0,
  faudit_id VARCHAR(64) DEFAULT '',
  fsubmission_id VARCHAR(64) DEFAULT '',
  fstatus TINYINT DEFAULT 0,
  ferror_message VARCHAR(255) DEFAULT '',
  fcreate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fupdate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Invoice request table
CREATE TABLE IF NOT EXISTS t_invoice_request (
  fid BIGINT AUTO_INCREMENT PRIMARY KEY,
  ftenant_id VARCHAR(64) DEFAULT '',
  fcompany_id VARCHAR(64) DEFAULT '',
  finvoice_type VARCHAR(10) DEFAULT '',
  finvoice_sub_type VARCHAR(20) DEFAULT '',
  fsubmission_type VARCHAR(10) DEFAULT '',
  finvoice_no VARCHAR(64) DEFAULT '',
  fissue_date TIMESTAMP NULL,
  fsell_billed VARCHAR(100) DEFAULT '',
  fsend_company_id VARCHAR(64) DEFAULT '',
  freceive_company_id VARCHAR(64) DEFAULT '',
  fsend_company_name VARCHAR(100) DEFAULT '',
  freceiver_company_name VARCHAR(100) DEFAULT '',
  ftotal_amount DECIMAL(15,2) DEFAULT 0,
  ftax_amount DECIMAL(15,2) DEFAULT 0,
  fcurrency VARCHAR(3) DEFAULT '',
  forder_refid VARCHAR(64) DEFAULT '',
  fbilling_refid VARCHAR(64) DEFAULT '',
  fext_field TEXT,
  fsource_document_type VARCHAR(20) DEFAULT '',
  fsource_document_id VARCHAR(64) DEFAULT '',
  ftarget_document_id VARCHAR(64) DEFAULT '',
  fstatus TINYINT DEFAULT 0,
  ferror_message VARCHAR(255) DEFAULT '',
  fcreate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fupdate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Invoice line table
CREATE TABLE IF NOT EXISTS t_invoice_line (
  fid BIGINT AUTO_INCREMENT PRIMARY KEY,
  finvoice_id BIGINT,
  finvoice_request_id BIGINT,
  fseq INT DEFAULT 1,
  finvoice_line_amount DECIMAL(15,2) DEFAULT 0,
  famount DECIMAL(15,2) DEFAULT 0,
  ftype TINYINT DEFAULT 0,
  funit VARCHAR(20) DEFAULT '',
  fquantity DECIMAL(15,2) DEFAULT 0,
  fprice DECIMAL(15,2) DEFAULT 0,
  fitem_name VARCHAR(255) DEFAULT '',
  fcategory_code VARCHAR(20) DEFAULT '',
  ftax_rate DECIMAL(5,2) DEFAULT 0,
  fext_field TEXT,
  fstatus TINYINT DEFAULT 0,
  fcreate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fupdate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Company information table (for tax ID lookups)
CREATE TABLE IF NOT EXISTS t_company_info (
  fid BIGINT AUTO_INCREMENT PRIMARY KEY,
  fcompany_name VARCHAR(255) NOT NULL,
  ftax_id VARCHAR(64) NOT NULL,
  fcountry VARCHAR(4) DEFAULT 'CN',
  factive TINYINT(1) DEFAULT 1,
  fcreate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fupdate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Product tax information table (for product tax category and rate lookups)
CREATE TABLE IF NOT EXISTS t_product_tax (
  fid BIGINT AUTO_INCREMENT PRIMARY KEY,
  fproduct_name VARCHAR(255) NOT NULL,
  fproduct_code VARCHAR(64) DEFAULT '',
  ftax_category VARCHAR(64) NOT NULL,
  ftax_rate VARCHAR(10) NOT NULL,
  fcountry VARCHAR(4) DEFAULT 'CN',
  factive TINYINT(1) DEFAULT 1,
  fcreate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fupdate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Rule subscription table
CREATE TABLE IF NOT EXISTS t_rule_subscription (
  fid BIGINT AUTO_INCREMENT PRIMARY KEY,
  ftenant_id VARCHAR(64) DEFAULT '',
  fcompany_id VARCHAR(64) DEFAULT '',
  frule_code VARCHAR(64) NOT NULL,
  fcreate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  fupdate_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Bastax tax area group master table
CREATE TABLE IF NOT EXISTS t_bastax_taxareagroup (
  fid BIGINT PRIMARY KEY,
  fnumber VARCHAR(64),
  fstatus VARCHAR(32),
  fcreatorid BIGINT,
  fmodifierid BIGINT,
  fenable VARCHAR(8),
  fcreatetime VARCHAR(32),
  fmodifytime VARCHAR(32),
  fmasterid BIGINT,
  fissystem VARCHAR(8)
);

-- Bastax tax area group language table
CREATE TABLE IF NOT EXISTS t_bastax_taxareagroup_l (
  fpkid VARCHAR(64) PRIMARY KEY,
  fid BIGINT,
  flocaleid VARCHAR(16),
  fname VARCHAR(255)
); 