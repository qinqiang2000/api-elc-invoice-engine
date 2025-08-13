package com.kingdee.fpy.service;

import com.kingdee.fpy.client.rpa.RpaClient;
import com.kingdee.fpy.client.rpa.dto.request.*;
import com.kingdee.fpy.client.rpa.dto.response.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * RPA平台集成服务
 * 演示如何使用RPA客户端进行各种操作
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class RpaPlatformService {

    private final RpaClient rpaClient;

    /**
     * 创建并发送发票的完整流程示例
     *
     * @param invoiceFiles 发票文件列表
     * @param companyId 公司ID
     * @param authorization 认证令牌
     * @return 发送结果
     */
    public InvoiceSendResponse processAndSendInvoices(List<Resource> invoiceFiles, String companyId, String authorization) {
        String requestId = UUID.randomUUID().toString();
        
        try {
            log.info("开始处理发票发送流程，requestId: {}, 文件数量: {}", requestId, invoiceFiles.size());
            
            // 构建发票发送请求
            InvoiceSendRequest request = new InvoiceSendRequest();
            request.setRequestId(requestId);
            request.setPayload(invoiceFiles);
            request.setAuthorization(authorization);
            request.setCompanyId(companyId);
            request.setTimezone("UTC0");
            request.setAcceptLanguage("zh-CN");
            
            // 设置签名参数（实际使用时需要根据业务逻辑生成）
            request.setNoise(generateNoise());
            request.setSign(generateSignature(request));
            
            // 发送发票
            InvoiceSendResponse response = rpaClient.sendInvoice(request);
            
            log.info("发票发送完成，requestId: {}, 状态: {}", requestId, response.getData().getStatus());
            
            return response;
            
        } catch (Exception e) {
            log.error("发票发送失败，requestId: {}", requestId, e);
            throw new RuntimeException("发票发送失败: " + e.getMessage(), e);
        }
    }

    /**
     * 查询发票发送结果
     *
     * @param requestId 请求ID
     * @param headers 请求头信息
     * @return 发送结果
     */
    public InvoiceSendResultResponse getInvoiceSendResult(String requestId, InvoiceHeaders headers) {
        try {
            log.info("查询发票发送结果，requestId: {}", requestId);
            
            InvoiceSendResultResponse response = rpaClient.getInvoiceSendResult(requestId, headers);
            
            if (response.getData() != null && response.getData().getResult() != null) {
                response.getData().getResult().forEach(result -> {
                    log.info("发票处理结果 - 文档ID: {}, 签发状态: {}, 文件名: {}", 
                            result.getDocumentId(), result.getIssueStatus(), result.getFilename());
                });
            }
            
            return response;
            
        } catch (Exception e) {
            log.error("查询发票发送结果失败，requestId: {}", requestId, e);
            throw new RuntimeException("查询发票发送结果失败: " + e.getMessage(), e);
        }
    }

    /**
     * 上传文件到RPA平台
     *
     * @param file 要上传的文件
     * @return 文件创建响应
     */
    public FileCreateResponse uploadFile(Resource file) {
        String requestId = UUID.randomUUID().toString();
        
        try {
            log.info("开始上传文件到RPA平台，requestId: {}", requestId);
            
            FileCreateRequest request = new FileCreateRequest();
            request.setRequestId(requestId);
            request.setFile(file);
            request.setNoise(generateNoise());
            request.setSign(generateSignature(request));
            
            FileCreateResponse response = rpaClient.createFile(request);
            
            log.info("文件上传完成，requestId: {}, fileId: {}", requestId, response.getData().getFileId());
            
            return response;
            
        } catch (Exception e) {
            log.error("文件上传失败，requestId: {}", requestId, e);
            throw new RuntimeException("文件上传失败: " + e.getMessage(), e);
        }
    }

    /**
     * 创建文档
     *
     * @param documentFile 文档文件
     * @param documentType 文档类型（Order, GoodReceipt, Invoice, InvoiceResponse）
     * @param companyId 公司ID
     * @param authorization 认证令牌
     * @return 文档创建响应
     */
    public DocumentCreateResponse createDocument(Resource documentFile, String documentType, String companyId, String authorization) {
        String requestId = UUID.randomUUID().toString();
        
        try {
            log.info("开始创建文档，requestId: {}, 文档类型: {}", requestId, documentType);
            
            DocumentCreateRequest request = new DocumentCreateRequest();
            request.setRequestId(requestId);
            request.setPayload(documentFile);
            request.setDocumentType(documentType);
            request.setAuthorization(authorization);
            request.setCompanyId(companyId);
            request.setTimezone("UTC0");
            request.setNoise(generateNoise());
            request.setSign(generateSignature(request));
            
            DocumentCreateResponse response = rpaClient.createDocument(request);
            
            log.info("文档创建完成，requestId: {}, documentId: {}", requestId, response.getData().getDocumentId());
            
            return response;
            
        } catch (Exception e) {
            log.error("文档创建失败，requestId: {}", requestId, e);
            throw new RuntimeException("文档创建失败: " + e.getMessage(), e);
        }
    }

    /**
     * 查询参与方信息
     *
     * @param countryCode 国家代码
     * @param identifierType 标识符类型
     * @param identifierValue 标识符值
     * @param taxpayerName 纳税人名称
     * @return 参与方查询响应
     */
    public PartyQueryResponse queryPartyInformation(String countryCode, String identifierType, String identifierValue, String taxpayerName) {
        String requestId = UUID.randomUUID().toString();
        
        try {
            log.info("开始查询参与方信息，requestId: {}, 国家代码: {}, 标识符类型: {}", requestId, countryCode, identifierType);
            
            PartyQueryRequest.PartyQueryData queryData = new PartyQueryRequest.PartyQueryData();
            queryData.setCountryCode(countryCode);
            queryData.setIdentifierType(identifierType);
            queryData.setIdentifierValue(identifierValue);
            queryData.setTaxpayerName(taxpayerName);
            
            PartyQueryRequest request = new PartyQueryRequest();
            request.setRequestId(requestId);
            request.setData(queryData);
            request.setNoise(generateNoise());
            request.setSign(generateSignature(request));
            
            PartyQueryResponse response = rpaClient.queryParty(request);
            
            log.info("参与方查询完成，requestId: {}, 税务状态: {}", requestId, 
                    response.getData() != null ? response.getData().getTaxStatus() : "未知");
            
            return response;
            
        } catch (Exception e) {
            log.error("参与方查询失败，requestId: {}", requestId, e);
            throw new RuntimeException("参与方查询失败: " + e.getMessage(), e);
        }
    }

    /**
     * 生成PDF格式的人类可读发票
     *
     * @param documentId 文档ID
     * @param templateFileId 模版文件ID（可选）
     * @param logoFileId LOGO文件ID（可选）
     * @param companyId 公司ID
     * @param authorization 认证令牌
     * @return 人类可读文件生成响应
     */
    public HumanReadableResponse generatePdfInvoice(String documentId, String templateFileId, String logoFileId, 
                                                   String companyId, String authorization) {
        String requestId = UUID.randomUUID().toString();
        
        try {
            log.info("开始生成PDF发票，requestId: {}, documentId: {}", requestId, documentId);
            
            HumanReadableRequest request = new HumanReadableRequest();
            request.setRequestId(requestId);
            request.setTemplateFileId(templateFileId);
            request.setLogoFileId(logoFileId);
            request.setAuthorization(authorization);
            request.setCompanyId(companyId);
            request.setTimezone("UTC0");
            request.setNoise(generateNoise());
            request.setSign(generateSignature(request));
            
            HumanReadableResponse response = rpaClient.generateHumanReadable(documentId, request);
            
            log.info("PDF发票生成完成，requestId: {}, documentId: {}", requestId, documentId);
            
            return response;
            
        } catch (Exception e) {
            log.error("PDF发票生成失败，requestId: {}, documentId: {}", requestId, documentId, e);
            throw new RuntimeException("PDF发票生成失败: " + e.getMessage(), e);
        }
    }

    /**
     * 预览文档
     *
     * @param request 文档预览请求
     * @return 预览文档内容
     */
    public Resource previewDocument(DocumentPreviewRequest request) {
        try {
            log.info("开始预览文档，requestId: {}", request.getRequestId());
            
            Resource previewResult = rpaClient.previewDocument(request);
            
            log.info("文档预览完成，requestId: {}", request.getRequestId());
            
            return previewResult;
            
        } catch (Exception e) {
            log.error("文档预览失败，requestId: {}", request.getRequestId(), e);
            throw new RuntimeException("文档预览失败: " + e.getMessage(), e);
        }
    }

    // ================== 私有辅助方法 ==================

    /**
     * 生成噪声值（示例实现）
     */
    private String generateNoise() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 16);
    }

    /**
     * 生成签名（示例实现，实际使用时需要根据具体的签名算法实现）
     */
    private String generateSignature(Object request) {
        // 这里应该实现实际的签名算法
        // 示例返回固定值，实际使用时需要根据请求参数和密钥生成真实签名
        return "sample_signature_" + UUID.randomUUID().toString().substring(0, 8);
    }
}