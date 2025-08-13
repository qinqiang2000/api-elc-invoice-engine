package com.kingdee.fpy.client.rpa;

import com.kingdee.fpy.client.rpa.dto.request.*;
import com.kingdee.fpy.client.rpa.dto.response.*;
import org.springframework.core.io.Resource;

import java.io.File;

/**
 * RPA平台API客户端接口
 * 提供对RPA基础平台所有API端点的访问
 *
 * @author Claude Code
 * @date 2025-08-11
 */
public interface RpaClient {

    // ================== 文件操作 ==================

    /**
     * 创建/上传文件
     *
     * @param request 文件上传请求
     * @return 文件创建响应
     */
    FileCreateResponse createFile(FileCreateRequest request);

    /**
     * 删除文件
     *
     * @param fileId 文件ID
     * @return 文件删除响应
     */
    FileDeleteResponse deleteFile(String fileId);

    // ================== 文档管理 ==================

    /**
     * 创建文档
     *
     * @param request 文档创建请求
     * @return 文档创建响应
     */
    DocumentCreateResponse createDocument(DocumentCreateRequest request);

    /**
     * 获取文档详情
     *
     * @param documentId 文档ID
     * @param headers 可选的请求头
     * @return 文档详情响应
     */
    DocumentDetailResponse getDocument(String documentId, DocumentHeaders headers);

    /**
     * 获取文档列表
     *
     * @param request 文档列表请求
     * @param headers 可选的请求头
     * @return 文档列表响应
     */
    DocumentListResponse getDocuments(DocumentListRequest request, DocumentHeaders headers);

    /**
     * 获取文档文件
     *
     * @param documentId 文档ID
     * @param fileType 文件类型（source/humanreadable/target）
     * @param headers 可选的请求头
     * @return 文档文件
     */
    Resource getDocumentFile(String documentId, String fileType, DocumentHeaders headers);

    /**
     * 生成人类可读文件（PDF格式发票）
     *
     * @param documentId 文档ID
     * @param request 人类可读文件生成请求
     * @return 生成响应
     */
    HumanReadableResponse generateHumanReadable(String documentId, HumanReadableRequest request);

    /**
     * 发送文档
     *
     * @param documentId 文档ID
     * @param request 文档发送请求
     * @return 文档发送响应
     */
    DocumentSendResponse sendDocument(String documentId, DocumentSendRequest request);

    /**
     * 获取文档发送结果
     *
     * @param documentId 文档ID
     * @param requestId 请求ID
     * @param headers 可选的请求头
     * @return 发送结果响应
     */
    DocumentSendResultResponse getDocumentSendResult(String documentId, String requestId, DocumentHeaders headers);

    /**
     * 预览文档
     *
     * @param request 文档预览请求
     * @return 预览文档内容
     */
    Resource previewDocument(DocumentPreviewRequest request);

    /**
     * 验证文档
     *
     * @param request 文档验证请求
     * @return 验证结果响应
     */
    DocumentValidateResponse validateDocument(DocumentValidateRequest request);

    /**
     * 转换文档
     *
     * @param request 文档转换请求
     * @return 转换结果
     */
    Resource convertDocument(DocumentConvertRequest request);

    /**
     * 获取文档投递信息
     *
     * @param documentId 文档ID
     * @param headers 可选的请求头
     * @return 投递信息响应
     */
    DocumentDeliveryResponse getDocumentDelivery(String documentId, DocumentHeaders headers);

    // ================== 清算操作 ==================

    /**
     * 发票使用量上传（通过清算）
     *
     * @param request 使用量上传请求
     * @return 上传响应
     */
    ClearanceUsageResponse uploadInvoiceUsage(ClearanceUsageRequest request);

    /**
     * 获取使用量上传结果
     *
     * @param requestId 请求ID
     * @return 上传结果响应
     */
    ClearanceUsageResultResponse getClearanceUsageResult(String requestId);

    /**
     * 发票签发上传（通过清算）
     *
     * @param request 签发上传请求
     * @return 上传响应
     */
    ClearanceIssueResponse uploadInvoiceIssue(ClearanceIssueRequest request);

    /**
     * 获取签发上传结果
     *
     * @param requestId 请求ID
     * @return 签发结果响应
     */
    ClearanceIssueResultResponse getClearanceIssueResult(String requestId);

    // ================== 公司通道管理 ==================

    /**
     * 创建通道
     *
     * @param request 通道创建请求
     * @return 创建响应
     */
    ChannelCreateResponse createChannel(ChannelCreateRequest request);

    /**
     * 更新通道
     *
     * @param request 通道更新请求
     * @return 更新响应
     */
    ChannelUpdateResponse updateChannel(ChannelUpdateRequest request);

    /**
     * 获取通道信息
     *
     * @param channelId 通道ID
     * @param headers 可选的请求头
     * @return 通道信息响应
     */
    ChannelDetailResponse getChannel(String channelId, ChannelHeaders headers);

    /**
     * 启用通道
     *
     * @param channelId 通道ID
     * @param headers 可选的请求头
     * @return 启用响应
     */
    ChannelStatusResponse enableChannel(String channelId, ChannelHeaders headers);

    /**
     * 禁用通道
     *
     * @param channelId 通道ID
     * @param headers 可选的请求头
     * @return 禁用响应
     */
    ChannelStatusResponse disableChannel(String channelId, ChannelHeaders headers);

    /**
     * 取消通道
     *
     * @param channelId 通道ID
     * @param headers 可选的请求头
     * @return 取消响应
     */
    ChannelStatusResponse cancelChannel(String channelId, ChannelHeaders headers);

    // ================== 参与方查询 ==================

    /**
     * 查询参与方信息
     *
     * @param request 参与方查询请求
     * @return 查询响应
     */
    PartyQueryResponse queryParty(PartyQueryRequest request);

    /**
     * 获取参与方查询结果
     *
     * @param requestId 请求ID
     * @return 查询结果响应
     */
    PartyQueryResultResponse getPartyQueryResult(String requestId);

    // ================== 发票操作 ==================

    /**
     * 批量发送发票
     *
     * @param request 发票发送请求
     * @return 发送响应
     */
    InvoiceSendResponse sendInvoice(InvoiceSendRequest request);

    /**
     * 获取发票发送结果
     *
     * @param requestId 请求ID
     * @param headers 可选的请求头
     * @return 发送结果响应
     */
    InvoiceSendResultResponse getInvoiceSendResult(String requestId, InvoiceHeaders headers);
}