-- Minimal sample data for local tests
DELETE FROM t_element_metadata;
INSERT INTO t_element_metadata (fid, felement_name, felement_type, fparent_id, fxpath, fdata_type, fis_required, fis_required_ui, fmin_occurs, fmax_occurs, fis_nillable, fdefault_value, ffixed_value, fenum_values, fdescription, flevel, frule, fname_space) VALUES
  (1, 'Invoice', 1, NULL, 'Invoice', NULL, 0, 0, 0, 1, 0, NULL, NULL, NULL, 'Root element', 1, NULL, NULL),
  (2, 'UBLVersionID', 1, 1, 'UBLVersionID', NULL, 0, 0, 0, 1, 0, NULL, NULL, NULL, 'Version', 2, NULL, NULL),
  (3, 'ID', 1, 1, 'ID', NULL, 0, 0, 0, 1, 0, NULL, NULL, NULL, 'Invoice ID', 2, NULL, NULL); 