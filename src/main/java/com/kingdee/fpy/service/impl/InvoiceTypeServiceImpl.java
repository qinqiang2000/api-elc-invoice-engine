package com.kingdee.fpy.service.impl;

import com.kingdee.fpy.mapper.InvoiceTypeMapper;
import com.kingdee.fpy.model.InvoiceType;
import com.kingdee.fpy.service.InvoiceTypeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * InvoiceType服务实现类
 */
@Slf4j
@Service
public class InvoiceTypeServiceImpl implements InvoiceTypeService {

    @Autowired
    private InvoiceTypeMapper invoiceTypeMapper;

    @Override
    public int insert(InvoiceType invoiceType) {
        return invoiceTypeMapper.insert(invoiceType);
    }

    @Override
    @Transactional
    public int batchInsert(List<InvoiceType> invoiceTypes) {
        if (invoiceTypes == null || invoiceTypes.isEmpty()) {
            return 0;
        }
        return invoiceTypeMapper.batchInsert(invoiceTypes);
    }

    @Override
    public int deleteById(Long id) {
        return invoiceTypeMapper.deleteById(id);
    }

    @Override
    public int updateById(InvoiceType invoiceType) {
        return invoiceTypeMapper.updateById(invoiceType);
    }

    @Override
    public InvoiceType selectById(Long id) {
        return invoiceTypeMapper.selectById(id);
    }

    @Override
    public List<InvoiceType> selectAll() {
        return invoiceTypeMapper.selectAll();
    }

    @Override
    public InvoiceType selectByInvoiceCode(String invoiceCode) {
        return invoiceTypeMapper.selectByInvoiceCode(invoiceCode);
    }

    @Override
    public List<InvoiceType> selectByCountryAndTradeArea(String country, String tradeArea) {
        return invoiceTypeMapper.selectByCountryAndTradeArea(country, tradeArea);
    }

    @Override
    @Transactional
    public String importFromExcel(MultipartFile file) throws Exception {
        if (file == null || file.isEmpty()) {
            throw new IllegalArgumentException("Excel文件不能为空");
        }

        List<InvoiceType> invoiceTypes = parseExcelFile(file);
        
        if (invoiceTypes.isEmpty()) {
            return "Excel文件中没有有效数据";
        }

        int insertCount = batchInsert(invoiceTypes);
        log.info("成功导入发票类型数据：{} 条", insertCount);
        
        return String.format("成功导入 %d 条发票类型数据", insertCount);
    }

    /**
     * 解析Excel文件
     * @param file Excel文件
     * @return InvoiceType实体列表
     * @throws Exception 处理异常
     */
    private List<InvoiceType> parseExcelFile(MultipartFile file) throws Exception {
        List<InvoiceType> invoiceTypes = new ArrayList<>();
        
        try (InputStream inputStream = file.getInputStream();
             Workbook workbook = new XSSFWorkbook(inputStream)) {
            
            Sheet sheet = workbook.getSheetAt(0); // 读取第一个工作表
            
            // 跳过标题行，从第二行开始读取数据
            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                if (row == null) {
                    continue;
                }
                
                InvoiceType invoiceType = parseRowToInvoiceType(row, rowIndex);
                if (invoiceType != null) {
                    invoiceTypes.add(invoiceType);
                }
            }
        }
        
        return invoiceTypes;
    }

    /**
     * 解析行数据为InvoiceType实体
     * @param row Excel行
     * @param rowIndex 行索引
     * @return InvoiceType实体
     */
    private InvoiceType parseRowToInvoiceType(Row row, int rowIndex) {
        try {
            // 根据Excel表结构解析字段：
            // 列1: 发票 Code, 列2: UBL Code, 列3: Description - EN（Default）, 列4: 描述 - 中文
            // 列5: Level等级, 列6: Parent上级发票类型, 列7: Selfbilled是否自开发票, 列8: SubmissionType
            // 列9: 税种 TaxType, 列10: 国家简码（国家模块）, 列11: Country Code
            
            String invoiceCode = getCellStringValue(row.getCell(0));        // 发票 Code
            String ublCode = getCellStringValue(row.getCell(1));            // UBL Code
            String descriptionEn = getCellStringValue(row.getCell(2));      // Description - EN（Default）
            String descriptionCn = getCellStringValue(row.getCell(3));      // 描述 - 中文
            String levelStr = getCellStringValue(row.getCell(4));           // Level等级
            String parentCode = getCellStringValue(row.getCell(5));         // Parent上级发票类型
            String selfbilledStr = getCellStringValue(row.getCell(6));      // Selfbilled是否自开发票
            String submissionType = getCellStringValue(row.getCell(7));     // SubmissionType
            String taxType = getCellStringValue(row.getCell(8));            // 税种 TaxType
            String countryName = getCellStringValue(row.getCell(9));        // 国家简码（国家模块）
            String countryCode = getCellStringValue(row.getCell(10));       // Country Code
            
            // 验证必填字段（保留原来的注释掉的验证，因为可能有空数据）
            /*if (!StringUtils.hasText(invoiceCode) || !StringUtils.hasText(descriptionEn)) {
                log.warn("第{}行数据不完整，跳过处理", rowIndex + 1);
                return null;
            }*/
            
            InvoiceType invoiceType = new InvoiceType();
            invoiceType.setInvoiceCode(invoiceCode);
            invoiceType.setUblCode(ublCode);
            invoiceType.setDescriptionEn(descriptionEn);
            invoiceType.setDescriptionCn(descriptionCn);
            
            // 处理Level等级字段
            Integer level = 1; // 默认值
            if (StringUtils.hasText(levelStr) && levelStr.matches("\\d+")) {
                level = Integer.parseInt(levelStr);
            }
            invoiceType.setLevel(level);
            
            invoiceType.setParentCode(parentCode);
            
            // 处理是否自开发票字段
            Boolean selfbilled = false; // 默认为否
            if (StringUtils.hasText(selfbilledStr)) {
                selfbilled = "TRUE".equalsIgnoreCase(selfbilledStr) || "1".equals(selfbilledStr) || "是".equals(selfbilledStr);
            }
            invoiceType.setSelfbilled(selfbilled);
            
            invoiceType.setSubmissionType(submissionType);
            invoiceType.setTaxType(taxType);
            invoiceType.setCountryName(countryName);
            invoiceType.setCountryCode(countryCode);
            
            // 默认启用
            invoiceType.setActive(true);
            
            return invoiceType;
            
        } catch (Exception e) {
            log.error("解析第{}行数据出错：{}", rowIndex + 1, e.getMessage());
            return null;
        }
    }

    /**
     * 获取单元格字符串值
     * @param cell 单元格
     * @return 字符串值
     */
    private String getCellStringValue(Cell cell) {
        if (cell == null) {
            return "";
        }
        
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue().trim();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    return String.valueOf((long) cell.getNumericCellValue());
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }
}