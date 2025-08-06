-- XML元数据表数据插入脚本
-- 基于tw_NL_DE_KDUBL2025077.xml文件结构

-- 清空表数据（如果需要重新插入）
-- DELETE FROM t_element_metadata;

-- 根节点
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) 
VALUES (Invoice', 1 NULL, '/Invoice, complex', 1, 1 1, 1,0,发票根节点, 1);

-- 获取根节点ID
SET @root_id = LAST_INSERT_ID();

-- 第2层：基本元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
(UBLVersionID, 1, @root_id,/Invoice/cbc:UBLVersionID, string', 1, 1, 1,10, 'UBL版本号', 2),
(CustomizationID, 1, @root_id, '/Invoice/cbc:CustomizationID, string', 1, 1 1, 1, 0ID, 2),
('ProfileID, 1, @root_id, '/Invoice/cbc:ProfileID, string', 1,1, 1,10, 配置文件ID, 2),
(ID, 1, @root_id, /Invoice/cbc:ID, string', 11, 110发票号码, 2),
('IssueDate, 1, @root_id, '/Invoice/cbc:IssueDate, date', 11, 110发票日期, 2,
('DueDate, 1, @root_id,/Invoice/cbc:DueDate, date', 01, 011日期',2
(InvoiceTypeCode, 1, @root_id, '/Invoice/cbc:InvoiceTypeCode, string', 11, 1,10, '发票类型代码,2
('Note, 1, @root_id, /Invoice/cbc:Note, string', 01, 011注', 2),
('DocumentCurrencyCode, 1, @root_id, '/Invoice/cbc:DocumentCurrencyCode, string', 11, 1,10, '发票货币代码', 2),
(BuyerReference, 1, @root_id,/Invoice/cbc:BuyerReference, string', 0, 1, 0,11 购买方联系人, 2

-- 获取第2层元素ID
SET @invoice_period_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'InvoicePeriodAND fparent_id = @root_id LIMIT1T @order_reference_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'OrderReferenceAND fparent_id = @root_id LIMIT1-- 第2层：复合元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
(InvoicePeriod, 1, @root_id, '/Invoice/cac:InvoicePeriod, complex', 01, 011发票周期', 2),
(OrderReference, 1, @root_id, '/Invoice/cac:OrderReference, complex', 01,0, 11关联采购订单号, 2),
('AdditionalDocumentReference, 1, @root_id, '/Invoice/cac:AdditionalDocumentReference, complex,0, 10, -11, '附加文档引用', 2),
('AccountingSupplierParty, 1, @root_id, '/Invoice/cac:AccountingSupplierParty, complex', 11, 110, 2),
('AccountingCustomerParty, 1, @root_id, '/Invoice/cac:AccountingCustomerParty, complex', 11, 110买方信息2TaxRepresentativeParty, 1, @root_id,/Invoice/cac:TaxRepresentativeParty, complex', 01, 011理', 2),
('Delivery, 1, @root_id, '/Invoice/cac:Delivery, complex', 01, 011信息,2,
(PaymentMeans, 1, @root_id, '/Invoice/cac:PaymentMeans, complex', 01, 0,11, '银行账户信息', 2,
(PaymentTerms, 1, @root_id, '/Invoice/cac:PaymentTerms, complex', 01, 011付款条款, 2),
(AllowanceCharge, 1, @root_id, '/Invoice/cac:AllowanceCharge, complex, 0, 1, 0 -11表头折扣/收费', 2),
('TaxTotal, 1, @root_id,/Invoice/cac:TaxTotal, complex', 11, 110税额统计', 2),
('LegalMonetaryTotal, 1, @root_id, '/Invoice/cac:LegalMonetaryTotal, complex', 1 1, 1, 1总计',2),
('InvoiceLine, 1, @root_id, '/Invoice/cac:InvoiceLine, complex,1,1, 1,-10,商品行项目',2;

-- 获取复合元素ID
SET @invoice_period_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'InvoicePeriodAND fparent_id = @root_id LIMIT1T @order_reference_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'OrderReferenceAND fparent_id = @root_id LIMIT 1);
SET @additional_doc_ref_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'AdditionalDocumentReferenceAND fparent_id = @root_id LIMIT1);
SET @supplier_party_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'AccountingSupplierPartyAND fparent_id = @root_id LIMIT1);
SET @customer_party_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'AccountingCustomerPartyAND fparent_id = @root_id LIMIT 1SET @tax_rep_party_id = (SELECT fid FROM t_element_metadata WHERE felement_name = TaxRepresentativePartyAND fparent_id = @root_id LIMIT1;
SET @delivery_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'DeliveryAND fparent_id = @root_id LIMIT1SET @payment_means_id = (SELECT fid FROM t_element_metadata WHERE felement_name = PaymentMeansAND fparent_id = @root_id LIMIT1SET @payment_terms_id = (SELECT fid FROM t_element_metadata WHERE felement_name = PaymentTermsAND fparent_id = @root_id LIMIT 1);
SET @allowance_charge_id = (SELECT fid FROM t_element_metadata WHERE felement_name =AllowanceChargeAND fparent_id = @root_id LIMIT 1
SET @tax_total_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'TaxTotalAND fparent_id = @root_id LIMIT 1ET @legal_monetary_total_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'LegalMonetaryTotalAND fparent_id = @root_id LIMIT 1);
SET @invoice_line_id = (SELECT fid FROM t_element_metadata WHERE felement_name =InvoiceLineAND fparent_id = @root_id LIMIT 1);

-- 第3层：InvoicePeriod子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('StartDate,1@invoice_period_id, '/Invoice/cac:InvoicePeriod/cbc:StartDate, date', 01, 011开始日期, 3,
('EndDate,1@invoice_period_id, '/Invoice/cac:InvoicePeriod/cbc:EndDate, date', 01, 0, 1, 结束日期',3第3：OrderReference子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
(ID, @order_reference_id, '/Invoice/cac:OrderReference/cbc:ID, string', 0, 1,01 1, 订单号', 3);

-- 第3层：AdditionalDocumentReference子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('ID', 1additional_doc_ref_id, '/Invoice/cac:AdditionalDocumentReference/cbc:ID, string', 11, 110D', 3('DocumentTypeCode', 1additional_doc_ref_id, '/Invoice/cac:AdditionalDocumentReference/cbc:DocumentTypeCode, string', 01, 0,11, '文档类型代码', 3,
(DocumentType', 1additional_doc_ref_id, '/Invoice/cac:AdditionalDocumentReference/cbc:DocumentType, string', 01, 011型', 3),
('DocumentDescription', 1additional_doc_ref_id, '/Invoice/cac:AdditionalDocumentReference/cbc:DocumentDescription, string', 01, 0, 1, 文档描述;

-- 获取AdditionalDocumentReference子元素ID
SET @attachment_id = (SELECT fid FROM t_element_metadata WHERE felement_name = AttachmentAND fparent_id = @additional_doc_ref_id LIMIT 1);

-- 第4层：AdditionalDocumentReference/Attachment子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
(Attachment', 1additional_doc_ref_id, '/Invoice/cac:AdditionalDocumentReference/cac:Attachment, complex', 0 1, 0,1,1, '附件', 4);

-- 获取Attachment ID
SET @attachment_id = (SELECT fid FROM t_element_metadata WHERE felement_name = AttachmentAND fparent_id = @additional_doc_ref_id LIMIT 1);

-- 第5层：Attachment子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
(ExternalReference', 1@attachment_id, '/Invoice/cac:AdditionalDocumentReference/cac:Attachment/cac:ExternalReference, complex', 01, 011外部引用', 5),
('EmbeddedDocumentBinaryObject', 1@attachment_id, '/Invoice/cac:AdditionalDocumentReference/cac:Attachment/cbc:EmbeddedDocumentBinaryObject, base64Binary', 010, 1,1嵌入文档二进制对象', 5取ExternalReference ID
SET @external_ref_id = (SELECT fid FROM t_element_metadata WHERE felement_name = ExternalReferenceAND fparent_id = @attachment_id LIMIT 1);

-- 第6层：ExternalReference子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('URI', 1, @external_ref_id, '/Invoice/cac:AdditionalDocumentReference/cac:Attachment/cac:ExternalReference/cbc:URI, string', 0, 1 0, 1,1, URI地址', 6);

-- 第3层：AccountingSupplierParty子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('Party', 1@supplier_party_id, '/Invoice/cac:AccountingSupplierParty/cac:Party, complex', 1, 1 1, 1,0,卖方方信息,3);

-- 获取Party ID
SET @supplier_party_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'PartyAND fparent_id = @supplier_party_id LIMIT 1;

-- 第4rty子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('PartyIdentification', 1@supplier_party_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PartyIdentification, complex',0, 1,01, 1, 方标识, 4),
('PartyName', 1@supplier_party_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PartyName, complex',1, 1,11, 0,方名称', 4),
(PostalAddress', 1@supplier_party_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PostalAddress, complex', 11, 110邮政地址', 4),
(PartyTaxScheme', 1@supplier_party_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PartyTaxScheme, complex',1, 1 1, 1, 0税务方案', 4),
('PartyLegalEntity', 1@supplier_party_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PartyLegalEntity, complex',1, 1 1, 1, 0实体, 4,
('Contact', 1@supplier_party_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:Contact, complex', 01, 0, 1, 联系信息, 4;

-- 获取Party子元素ID
SET @party_identification_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'PartyIdentificationAND fparent_id = @supplier_party_id LIMIT 1);
SET @party_name_id = (SELECT fid FROM t_element_metadata WHERE felement_name =PartyNameAND fparent_id = @supplier_party_id LIMIT 1);
SET @postal_address_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'PostalAddressAND fparent_id = @supplier_party_id LIMIT 1;
SET @party_tax_scheme_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'PartyTaxSchemeAND fparent_id = @supplier_party_id LIMIT 1);
SET @party_legal_entity_id = (SELECT fid FROM t_element_metadata WHERE felement_name = PartyLegalEntityAND fparent_id = @supplier_party_id LIMIT 1);
SET @contact_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'ContactAND fparent_id = @supplier_party_id LIMIT1artyIdentification子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('ID', 1, @party_identification_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PartyIdentification/cbc:ID, string', 11, 1, 1, 0,销方其他企业ID:GLN',5

-- 第5层：PartyName子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('Name', 1@party_name_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PartyName/cbc:Name, string',1, 1,11 0, 方名称', 5 第5层：PostalAddress子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
(StreetName', 1@postal_address_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PostalAddress/cbc:StreetName, string', 11, 110街道名称', 5),
('CityName', 1@postal_address_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PostalAddress/cbc:CityName, string', 11, 110城市名称', 5),
(PostalZone', 1@postal_address_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PostalAddress/cbc:PostalZone, string', 0,1, 0, 1, 邮政编码5;

-- 获取Country ID
SET @country_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'CountryAND fparent_id = @postal_address_id LIMIT 1 第6层：PostalAddress/Country子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('Country', 1@postal_address_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PostalAddress/cac:Country, complex', 1 1, 1,1,0, '国家',6;

-- 获取Country ID
SET @country_id = (SELECT fid FROM t_element_metadata WHERE felement_name = 'CountryAND fparent_id = @postal_address_id LIMIT 1);

-- 第7层：Country子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('IdentificationCode,1ntry_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PostalAddress/cac:Country/cbc:IdentificationCode, string', 11, 1, 0, 国家代码',7;

-- 第5：PartyTaxScheme子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('CompanyID,1 @party_tax_scheme_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PartyTaxScheme/cbc:CompanyID, string', 11, 1, 0, 税务ID', 5);

-- 获取TaxScheme ID
SET @tax_scheme_id = (SELECT fid FROM t_element_metadata WHERE felement_name =TaxSchemeAND fparent_id = @party_tax_scheme_id LIMIT1;

-- 第6层：PartyTaxScheme/TaxScheme子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('TaxScheme,1 @party_tax_scheme_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PartyTaxScheme/cac:TaxScheme, complex', 11, 1, 0, 税务方案', 6);

-- 获取TaxScheme ID
SET @tax_scheme_id = (SELECT fid FROM t_element_metadata WHERE felement_name =TaxSchemeAND fparent_id = @party_tax_scheme_id LIMIT 1);

-- 第7层：TaxScheme子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
(ID', 1@tax_scheme_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PartyTaxScheme/cac:TaxScheme/cbc:ID, string', 1 1, 1,1, 0, 税种7
-- 第5层：PartyLegalEntity子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('RegistrationName, 1, @party_legal_entity_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PartyLegalEntity/cbc:RegistrationName, string', 11, 110名称, 5),
('CompanyID, 1, @party_legal_entity_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:PartyLegalEntity/cbc:CompanyID, string', 11, 1,10 合法国家ID', 5);

-- 第5层：Contact子元素
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
(ElectronicMail,1tact_id, '/Invoice/cac:AccountingSupplierParty/cac:Party/cac:Contact/cbc:ElectronicMail, string', 0,1, 0, 1, 电子邮件, 5);-- 属性定义
-- InvoiceTypeCode的name属性
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
(name', 2, (SELECT fid FROM t_element_metadata WHERE felement_name =InvoiceTypeCodeAND fparent_id = @root_id LIMIT 1nvoice/cbc:InvoiceTypeCode/@name, string', 01, 0,11发票类型名称',2);

-- ID元素的schemeName属性
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
(schemeName', 2, (SELECT fid FROM t_element_metadata WHERE felement_name = 'IDAND fparent_id = @additional_doc_ref_id LIMIT 1ice/cac:AdditionalDocumentReference/cbc:ID/@schemeName, string', 01, 0, 1, 3
-- CompanyID的schemeID属性
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('schemeID', 2, (SELECT fid FROM t_element_metadata WHERE felement_name =CompanyIDAND fparent_id = @party_legal_entity_id LIMIT 1ice/cac:AccountingSupplierParty/cac:Party/cac:PartyLegalEntity/cbc:CompanyID/@schemeID, string', 01, 0, 1, 方案ID, 5);

-- 货币相关属性
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
(currencyID', 2, (SELECT fid FROM t_element_metadata WHERE felement_name = 'Amount' AND fxpath LIKE %AllowanceCharge%' LIMIT 1/Invoice/cac:AllowanceCharge/cbc:Amount/@currencyID, string', 11, 1, 0, 货币代码, 3);

-- 单位相关属性
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('unitCode', 2, (SELECT fid FROM t_element_metadata WHERE felement_name = InvoicedQuantity' AND fxpath LIKE '%InvoiceLine%' LIMIT 1nvoice/cac:InvoiceLine/cbc:InvoicedQuantity/@unitCode, string', 11, 1, 0, 单位代码, 3);

-- 文件相关属性
INSERT INTO t_element_metadata (felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdescription, flevel) VALUES
('filename', 2, (SELECT fid FROM t_element_metadata WHERE felement_name =EmbeddedDocumentBinaryObject' LIMIT 1ice/cac:AdditionalDocumentReference/cac:Attachment/cbc:EmbeddedDocumentBinaryObject/@filename, string', 0, 1,01,1文件名', 5),
('mimeCode', 2, (SELECT fid FROM t_element_metadata WHERE felement_name =EmbeddedDocumentBinaryObject' LIMIT 1ice/cac:AdditionalDocumentReference/cac:Attachment/cbc:EmbeddedDocumentBinaryObject/@mimeCode, string',01, 0,11 MIME类型',5);

-- 更新一些重要字段的规则和枚举值
UPDATE t_element_metadata SET 
    frule =AUTO_GENERATE',
    fdescription =发票号码，自动生成'
WHERE felement_name =ID' AND fxpath = '/Invoice/cbc:ID';

UPDATE t_element_metadata SET 
    fdefault_value = '2.1',
    fdescription = 'UBL版本号，固定为20.1HERE felement_name =UBLVersionID';

UPDATE t_element_metadata SET 
    fenum_values = ["380,381,
    fdescription = 发票类型：380=发票，381=红票，1381款单'
WHERE felement_name = 'InvoiceTypeCode';

UPDATE t_element_metadata SET 
    fenum_values = ["EUR,USD",CNY","GBP"]',
    fdescription =货币代码枚举'
WHERE felement_name =DocumentCurrencyCode';

UPDATE t_element_metadata SET 
    fenum_values = '["S",K","G,O","AE","E"]',
    fdescription = 税码枚举：S=标准税率，K=零税率，G=免税，O=欧盟内供应，AE=欧盟外供应，E=出口'
WHERE felement_name = 'ID' AND fxpath LIKE %TaxCategory%';

-- 设置必填字段
UPDATE t_element_metadata SET fis_required = 1 fis_required_ui = 1 WHERE felement_name IN (ID', 'IssueDate',DocumentCurrencyCode', 'AccountingSupplierParty', 'AccountingCustomerParty', TaxTotal', 'LegalMonetaryTotal',InvoiceLine');

-- 设置UI显示字段
UPDATE t_element_metadata SET fis_required_ui = 1 WHERE felement_name IN ('UBLVersionID', CustomizationID',ProfileID', 'DueDate', InvoiceTypeCode', 'Note,BuyerReference', InvoicePeriod,OrderReference', 'AdditionalDocumentReference');

-- 设置数据类型
UPDATE t_element_metadata SET fdata_type = 'date' WHERE felement_name IN ('IssueDate',DueDate',StartDate', EndDate, ActualDeliveryDate');
UPDATE t_element_metadata SET fdata_type = decimal' WHERE felement_name IN ('Amount,BaseAmount',TaxAmount', TaxableAmount', 'LineExtensionAmount', 'TaxExclusiveAmount', 'TaxInclusiveAmount, lowanceTotalAmount', ChargeTotalAmount', PayableAmount', 'PriceAmount',Percent', MultiplierFactorNumeric');
UPDATE t_element_metadata SET fdata_type = integer' WHERE felement_name IN ('InvoicedQuantity', TransportModeCode');
UPDATE t_element_metadata SET fdata_type = boolean' WHERE felement_name IN ('ChargeIndicator');
UPDATE t_element_metadata SET fdata_type = 'base64ry' WHERE felement_name =EmbeddedDocumentBinaryObject';

COMMIT; 