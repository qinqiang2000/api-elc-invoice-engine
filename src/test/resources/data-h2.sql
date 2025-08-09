-- Minimal sample data for local tests
DELETE FROM t_element_metadata;
INSERT INTO t_element_metadata (fid, felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdefault_value, ffixed_value, fenum_values, fdescription, flevel, frule, fname_space) VALUES
  (1, 'Invoice', 1, NULL, 'Invoice', NULL, 0, 0, 0, 1, 0, NULL, NULL, NULL, 'Root element', 1, NULL, NULL),
  (2, 'UBLVersionID', 1, 1, 'UBLVersionID', NULL, 0, 0, 0, 1, 0, NULL, NULL, NULL, 'Version', 2, NULL, NULL),
  (3, 'ID', 1, 1, 'ID', NULL, 0, 0, 0, 1, 0, NULL, NULL, NULL, 'Invoice ID', 2, NULL, NULL);

-- Clear tables before inserting
DELETE FROM t_invoice_rules;
DELETE FROM t_company_info;
DELETE FROM t_product_tax;
DELETE FROM t_rule_subscription;

-- Insert company information for tax ID lookups
INSERT INTO t_company_info (fcompany_name, ftax_id, fcountry, factive) VALUES
  ('Buyer Company Name', 'TAX123456789', 'CN', 1),
  ('Supplier Company Name', 'TAX987654321', 'CN', 1),
  ('Test Company', 'TAX000000000', 'CN', 1);

-- Insert product tax information
INSERT INTO t_product_tax (fproduct_name, fproduct_code, ftax_category, ftax_rate, fcountry, factive) VALUES
  ('Product A', 'PROD001', 'S', '13.0', 'CN', 1),
  ('Product B', 'PROD002', 'AA', '6.0', 'CN', 1),
  ('Product C', 'PROD003', 'Z', '0.0', 'CN', 1);

-- Insert validation rules (with proper applyTo/ruleExpression separation)
INSERT INTO t_invoice_rules (frule_code, frule_name, frule_type, factive, fapply_to, ferror_message, ffield_path, fpriority, frule_expression, fcountry, fstart_time, fend_time) 
VALUES
  ('CN-VALID-001', 'Buyer name validation', 1, 1, 
   'invoice.AccountingCustomerParty != null && invoice.AccountingCustomerParty.Party != null && invoice.AccountingCustomerParty.Party.PartyLegalEntity != null', 
   'Buyer name is required', 'AccountingCustomerParty.Party.PartyLegalEntity.RegistrationName', 1, 
   'invoice.AccountingCustomerParty.Party.PartyLegalEntity.RegistrationName != null && !invoice.AccountingCustomerParty.Party.PartyLegalEntity.RegistrationName.toString().trim().isEmpty()', 'CN', TIMESTAMP '2000-01-01 00:00:00', TIMESTAMP '2099-12-31 00:00:00'),
  ('CN-VALID-002', 'Supplier name validation', 1, 1, 
   'invoice.AccountingSupplierParty != null && invoice.AccountingSupplierParty.Party != null && invoice.AccountingSupplierParty.Party.PartyLegalEntity != null', 
   'Supplier name is required', 'AccountingSupplierParty.Party.PartyLegalEntity.RegistrationName', 2,
   'invoice.AccountingSupplierParty.Party.PartyLegalEntity.RegistrationName != null && !invoice.AccountingSupplierParty.Party.PartyLegalEntity.RegistrationName.toString().trim().isEmpty()', 'CN', TIMESTAMP '2000-01-01 00:00:00', TIMESTAMP '2099-12-31 00:00:00'),
  ('CN-VALID-003', 'Item name validation', 1, 1, 
   'invoice.InvoiceLine != null && invoice.InvoiceLine.size() > 0 && invoice.InvoiceLine.get(0)["Item"] != null', 
   'Item name is required', 'InvoiceLine.Item.Name', 3,
   'invoice.InvoiceLine.get(0)["Item"]["Name"] != null && !invoice.InvoiceLine.get(0)["Item"]["Name"].toString().trim().isEmpty()', 'CN', TIMESTAMP '2000-01-01 00:00:00', TIMESTAMP '2099-12-31 00:00:00');

-- Insert completion rules (with proper applyTo/ruleExpression separation)
INSERT INTO t_invoice_rules (frule_code, frule_name, frule_type, factive, fapply_to, ferror_message, ffield_path, fpriority, frule_expression, fcountry, fstart_time, fend_time)
VALUES
  ('CN-COMP-001', 'Buyer tax ID completion', 2, 1, 
   'invoice.AccountingCustomerParty != null && invoice.AccountingCustomerParty.Party != null && invoice.AccountingCustomerParty.Party.PartyLegalEntity != null && invoice.AccountingCustomerParty.Party.PartyLegalEntity.RegistrationName != null && (invoice.AccountingCustomerParty.Party["PartyTaxScheme"] == null || invoice.AccountingCustomerParty.Party["PartyTaxScheme"]["CompanyID"] == null)', 
   'Unable to complete buyer tax ID', 'AccountingCustomerParty.Party.PartyTaxScheme.CompanyID', 1, 
   'if (invoice.AccountingCustomerParty.Party["PartyTaxScheme"] == null) { invoice.AccountingCustomerParty.Party["PartyTaxScheme"] = new java.util.HashMap(); } var buyerName = invoice.AccountingCustomerParty.Party.PartyLegalEntity.RegistrationName; var taxId = db.query("t_company_info", "ftax_id", {"fcompany_name": buyerName}); if (taxId != null) { invoice.AccountingCustomerParty.Party["PartyTaxScheme"]["CompanyID"] = taxId; return true; } return false;', 'CN', TIMESTAMP '2000-01-01 00:00:00', TIMESTAMP '2099-12-31 00:00:00'),
  ('CN-COMP-002', 'Supplier tax ID completion', 2, 1, 
   'invoice.AccountingSupplierParty != null && invoice.AccountingSupplierParty.Party != null && invoice.AccountingSupplierParty.Party.PartyLegalEntity != null && invoice.AccountingSupplierParty.Party.PartyLegalEntity.RegistrationName != null && (invoice.AccountingSupplierParty.Party["PartyTaxScheme"] == null || invoice.AccountingSupplierParty.Party["PartyTaxScheme"]["CompanyID"] == null)', 
   'Unable to complete supplier tax ID', 'AccountingSupplierParty.Party.PartyTaxScheme.CompanyID', 2, 
   'if (invoice.AccountingSupplierParty.Party["PartyTaxScheme"] == null) { invoice.AccountingSupplierParty.Party["PartyTaxScheme"] = new java.util.HashMap(); } var supplierName = invoice.AccountingSupplierParty.Party.PartyLegalEntity.RegistrationName; var taxId = db.query("t_company_info", "ftax_id", {"fcompany_name": supplierName}); if (taxId != null) { invoice.AccountingSupplierParty.Party["PartyTaxScheme"]["CompanyID"] = taxId; return true; } return false;', 'CN', TIMESTAMP '2000-01-01 00:00:00', TIMESTAMP '2099-12-31 00:00:00'),
  ('CN-COMP-003', 'Item tax category completion', 2, 1, 
   'invoice.InvoiceLine != null && invoice.InvoiceLine.size() > 0 && invoice.InvoiceLine.get(0)["Item"] != null && invoice.InvoiceLine.get(0)["Item"]["Name"] != null && (invoice.InvoiceLine.get(0)["Item"]["ClassifiedTaxCategory"] == null)', 
   'Unable to complete item tax category', 'InvoiceLine.Item.ClassifiedTaxCategory', 3, 
   'for (var i = 0; i < invoice.InvoiceLine.size(); i++) { var line = invoice.InvoiceLine.get(i); if (line["Item"] != null && line["Item"]["Name"] != null && line["Item"]["ClassifiedTaxCategory"] == null) { var productName = line["Item"]["Name"]; var taxCategory = db.query("t_product_tax", "ftax_category", {"fproduct_name": productName}); var taxRate = db.query("t_product_tax", "ftax_rate", {"fproduct_name": productName}); if (taxCategory != null && taxRate != null) { line["Item"]["ClassifiedTaxCategory"] = new java.util.HashMap(); line["Item"]["ClassifiedTaxCategory"]["ID"] = taxCategory; line["Item"]["ClassifiedTaxCategory"]["Percent"] = Double.parseDouble(taxRate); } } } return true;', 'CN', TIMESTAMP '2000-01-01 00:00:00', TIMESTAMP '2099-12-31 00:00:00');

-- Insert rule subscriptions
INSERT INTO t_rule_subscription (ftenant_id, fcompany_id, frule_code) VALUES
  ('', '', 'CN-VALID-001'),
  ('', '', 'CN-VALID-002'),
  ('', '', 'CN-VALID-003'),
  ('', '', 'CN-COMP-001'),
  ('', '', 'CN-COMP-002'),
  ('', '', 'CN-COMP-003'); 