package com.kingdee.fpy.client.rpa;

import com.kingdee.fpy.client.rpa.dto.request.*;
import com.kingdee.fpy.client.rpa.dto.response.*;
import com.kingdee.fpy.client.rpa.exception.RpaClientException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

/**
 * RPA平台API客户端实现
 *
 * @author Claude Code
 * @date 2025-08-11
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class RpaClientImpl implements RpaClient {

    private final RpaProperties properties;
    private final RestTemplate restTemplate = new RestTemplate();

    // ================== 文件操作 ==================

    @Override
    public FileCreateResponse createFile(FileCreateRequest request) {
        String url = properties.getBaseUrl() + "/v1/file";
        
        logRequest("createFile", url, request.getRequestId());
        
        try {
            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
            body.add("requestId", request.getRequestId());
            if (request.getFile() != null) {
                body.add("file", request.getFile());
            }
            body.add("noise", request.getNoise());
            body.add("sign", request.getSign());

            HttpHeaders headers = createMultipartHeaders();
            HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(body, headers);
            
            ResponseEntity<FileCreateResponse> response = restTemplate.postForEntity(url, entity, FileCreateResponse.class);
            logResponse("createFile", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("createFile", e);
            throw handleException("文件创建失败", e);
        }
    }

    @Override
    public FileDeleteResponse deleteFile(String fileId) {
        String url = properties.getBaseUrl() + "/v1/file/" + fileId;
        
        logRequest("deleteFile", url, fileId);
        
        try {
            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
            HttpHeaders headers = createMultipartHeaders();
            HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(body, headers);
            
            ResponseEntity<FileDeleteResponse> response = restTemplate.exchange(url, HttpMethod.DELETE, entity, FileDeleteResponse.class);
            logResponse("deleteFile", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("deleteFile", e);
            throw handleException("文件删除失败", e);
        }
    }

    // ================== 文档管理 ==================

    @Override
    public DocumentCreateResponse createDocument(DocumentCreateRequest request) {
        String url = properties.getBaseUrl() + "/v1/documents";
        
        logRequest("createDocument", url, request.getRequestId());
        
        try {
            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
            body.add("requestId", request.getRequestId());
            if (request.getPayload() != null) {
                body.add("payload", request.getPayload());
            }
            body.add("documentType", request.getDocumentType());
            if (request.getProtocol() != null) {
                body.add("protocol", request.getProtocol());
            }
            body.add("noise", request.getNoise());
            body.add("sign", request.getSign());

            HttpHeaders headers = createMultipartHeaders();
            addDocumentHeaders(headers, request.getAuthorization(), request.getCompanyId(), 
                             request.getTimezone(), request.getClientTraceId());
            HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(body, headers);
            
            ResponseEntity<DocumentCreateResponse> response = restTemplate.postForEntity(url, entity, DocumentCreateResponse.class);
            logResponse("createDocument", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("createDocument", e);
            throw handleException("文档创建失败", e);
        }
    }

    @Override
    public DocumentDetailResponse getDocument(String documentId, DocumentHeaders headers) {
        String url = properties.getBaseUrl() + "/v1/Documents/" + documentId;
        
        logRequest("getDocument", url, documentId);
        
        try {
            HttpHeaders httpHeaders = createJsonHeaders();
            if (headers != null) {
                addDocumentHeaders(httpHeaders, headers.getAuthorization(), headers.getCompanyId(),
                                 headers.getTimezone(), headers.getClientTraceId());
            }
            HttpEntity<Void> entity = new HttpEntity<>(httpHeaders);
            
            ResponseEntity<DocumentDetailResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, DocumentDetailResponse.class);
            logResponse("getDocument", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("getDocument", e);
            throw handleException("文档获取失败", e);
        }
    }

    @Override
    public DocumentListResponse getDocuments(DocumentListRequest request, DocumentHeaders headers) {
        String url = properties.getBaseUrl() + "/v1/Documents";
        
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
                .queryParam("direction", request.getDirection())
                .queryParam("startUpdateTime", request.getStartUpdateTime())
                .queryParam("endUpdateTime", request.getEndUpdateTime())
                .queryParam("documentType", request.getDocumentType());
        
        if (request.getCursor() != null) {
            builder.queryParam("cursor", request.getCursor());
        }
        if (request.getLimit() != null) {
            builder.queryParam("limit", request.getLimit());
        }
        
        URI uri = builder.build().toUri();
        logRequest("getDocuments", uri.toString(), null);
        
        try {
            HttpHeaders httpHeaders = createJsonHeaders();
            if (headers != null) {
                addDocumentHeaders(httpHeaders, headers.getAuthorization(), headers.getCompanyId(),
                                 headers.getTimezone(), headers.getClientTraceId());
            }
            HttpEntity<Void> entity = new HttpEntity<>(httpHeaders);
            
            ResponseEntity<DocumentListResponse> response = restTemplate.exchange(uri, HttpMethod.GET, entity, DocumentListResponse.class);
            logResponse("getDocuments", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("getDocuments", e);
            throw handleException("文档列表获取失败", e);
        }
    }

    @Override
    public Resource getDocumentFile(String documentId, String fileType, DocumentHeaders headers) {
        String url = properties.getBaseUrl() + "/v1/Documents/" + documentId + "/file";
        
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url);
        if (fileType != null) {
            builder.queryParam("filetype", fileType);
        }
        
        URI uri = builder.build().toUri();
        logRequest("getDocumentFile", uri.toString(), documentId);
        
        try {
            HttpHeaders httpHeaders = createJsonHeaders();
            if (headers != null) {
                addDocumentHeaders(httpHeaders, headers.getAuthorization(), headers.getCompanyId(),
                                 headers.getTimezone(), headers.getClientTraceId());
            }
            HttpEntity<Void> entity = new HttpEntity<>(httpHeaders);
            
            ResponseEntity<Resource> response = restTemplate.exchange(uri, HttpMethod.GET, entity, Resource.class);
            logResponse("getDocumentFile", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("getDocumentFile", e);
            throw handleException("文档文件获取失败", e);
        }
    }

    @Override
    public HumanReadableResponse generateHumanReadable(String documentId, HumanReadableRequest request) {
        String url = properties.getBaseUrl() + "/v1/documents/" + documentId + "/humanreadable";
        
        logRequest("generateHumanReadable", url, documentId);
        
        try {
            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
            body.add("requestId", request.getRequestId());
            if (request.getTemplateFileId() != null) {
                body.add("templateFileId", request.getTemplateFileId());
            }
            if (request.getLogoFileId() != null) {
                body.add("logoFileId", request.getLogoFileId());
            }
            body.add("noise", request.getNoise());
            body.add("sign", request.getSign());

            HttpHeaders headers = createMultipartHeaders();
            addDocumentHeaders(headers, request.getAuthorization(), request.getCompanyId(),
                             request.getTimezone(), request.getClientTraceId());
            HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(body, headers);
            
            ResponseEntity<HumanReadableResponse> response = restTemplate.postForEntity(url, entity, HumanReadableResponse.class);
            logResponse("generateHumanReadable", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("generateHumanReadable", e);
            throw handleException("人类可读文件生成失败", e);
        }
    }

    @Override
    public DocumentSendResponse sendDocument(String documentId, DocumentSendRequest request) {
        String url = properties.getBaseUrl() + "/v1/document/" + documentId + "/send";
        
        logRequest("sendDocument", url, documentId);
        
        try {
            HttpHeaders headers = createJsonHeaders();
            addDocumentHeaders(headers, request.getAuthorization(), request.getCompanyId(),
                             request.getTimezone(), request.getClientTraceId());
            HttpEntity<DocumentSendRequest> entity = new HttpEntity<>(request, headers);
            
            ResponseEntity<DocumentSendResponse> response = restTemplate.postForEntity(url, entity, DocumentSendResponse.class);
            logResponse("sendDocument", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("sendDocument", e);
            throw handleException("文档发送失败", e);
        }
    }

    @Override
    public DocumentSendResultResponse getDocumentSendResult(String documentId, String requestId, DocumentHeaders headers) {
        String url = properties.getBaseUrl() + "/v1/document/" + documentId + "/send/" + requestId;
        
        logRequest("getDocumentSendResult", url, requestId);
        
        try {
            HttpHeaders httpHeaders = createJsonHeaders();
            if (headers != null) {
                addDocumentHeaders(httpHeaders, headers.getAuthorization(), headers.getCompanyId(),
                                 headers.getTimezone(), headers.getClientTraceId());
            }
            HttpEntity<Void> entity = new HttpEntity<>(httpHeaders);
            
            ResponseEntity<DocumentSendResultResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, DocumentSendResultResponse.class);
            logResponse("getDocumentSendResult", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("getDocumentSendResult", e);
            throw handleException("文档发送结果获取失败", e);
        }
    }

    @Override
    public Resource
    previewDocument(DocumentPreviewRequest request) {
        String url = properties.getBaseUrl() + "/v1/documents/preview";
        
        logRequest("previewDocument", url, request.getRequestId());
        
        try {
            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
            body.add("requestId", request.getRequestId());
            body.add("payload", request.getPayload());
            if (request.getTemplateFileId() != null) {
                body.add("templateFileId", request.getTemplateFileId());
            }
            if (request.getLogoFileId() != null) {
                body.add("logoFileId", request.getLogoFileId());
            }
            body.add("noise", request.getNoise());
            body.add("sign", request.getSign());

            HttpHeaders headers = createMultipartHeaders();
            HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(body, headers);
            
            ResponseEntity<Resource> response = restTemplate.postForEntity(url, entity, Resource.class);
            logResponse("previewDocument", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("previewDocument", e);
            throw handleException("文档预览失败", e);
        }
    }

    @Override
    public DocumentValidateResponse validateDocument(DocumentValidateRequest request) {
        String url = properties.getBaseUrl() + "/v1/documents/validate";
        
        logRequest("validateDocument", url, null);
        
        try {
            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
            body.add("documentType", request.getDocumentType());
            body.add("payload", request.getPayload());
            body.add("noise", request.getNoise());
            body.add("sign", request.getSign());

            HttpHeaders headers = createMultipartHeaders();
            HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(body, headers);
            
            ResponseEntity<DocumentValidateResponse> response = restTemplate.postForEntity(url, entity, DocumentValidateResponse.class);
            logResponse("validateDocument", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("validateDocument", e);
            throw handleException("文档验证失败", e);
        }
    }

    @Override
    public Resource convertDocument(DocumentConvertRequest request) {
        String url = properties.getBaseUrl() + "/v1/documents/covert";
        
        logRequest("convertDocument", url, null);
        
        try {
            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
            body.add("payload", request.getPayload());
            body.add("documentType", request.getDocumentType());
            if (request.getProtocol() != null) {
                body.add("protocol", request.getProtocol());
            }
            body.add("noise", request.getNoise());
            body.add("sign", request.getSign());

            HttpHeaders headers = createMultipartHeaders();
            HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(body, headers);
            
            ResponseEntity<Resource> response = restTemplate.postForEntity(url, entity, Resource.class);
            logResponse("convertDocument", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("convertDocument", e);
            throw handleException("文档转换失败", e);
        }
    }

    @Override
    public DocumentDeliveryResponse getDocumentDelivery(String documentId, DocumentHeaders headers) {
        String url = properties.getBaseUrl() + "/v1/Documents/" + documentId + "/delivery";
        
        logRequest("getDocumentDelivery", url, documentId);
        
        try {
            HttpHeaders httpHeaders = createJsonHeaders();
            if (headers != null) {
                addDocumentHeaders(httpHeaders, headers.getAuthorization(), headers.getCompanyId(),
                                 headers.getTimezone(), headers.getClientTraceId());
            }
            HttpEntity<Void> entity = new HttpEntity<>(httpHeaders);
            
            ResponseEntity<DocumentDeliveryResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, DocumentDeliveryResponse.class);
            logResponse("getDocumentDelivery", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("getDocumentDelivery", e);
            throw handleException("文档投递信息获取失败", e);
        }
    }

    // ================== 清算操作 ==================

    @Override
    public ClearanceUsageResponse uploadInvoiceUsage(ClearanceUsageRequest request) {
        String url = properties.getBaseUrl() + "/v1/clearnace/usage/upload";
        
        logRequest("uploadInvoiceUsage", url, request.getRequestId());
        
        try {
            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
            body.add("requestId", request.getRequestId());
            body.add("payload", request.getPayload());
            if (request.getClearanceChannel() != null) {
                body.add("clearanceChannel", request.getClearanceChannel());
            }
            if (request.getProtocol() != null) {
                body.add("protocol", request.getProtocol());
            }
            body.add("noise", request.getNoise());
            body.add("sign", request.getSign());

            HttpHeaders headers = createMultipartHeaders();
            HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(body, headers);
            
            ResponseEntity<ClearanceUsageResponse> response = restTemplate.postForEntity(url, entity, ClearanceUsageResponse.class);
            logResponse("uploadInvoiceUsage", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("uploadInvoiceUsage", e);
            throw handleException("发票使用量上传失败", e);
        }
    }

    @Override
    public ClearanceUsageResultResponse getClearanceUsageResult(String requestId) {
        String url = properties.getBaseUrl() + "/v1/clearnace/usage/upload/" + requestId;
        
        logRequest("getClearanceUsageResult", url, requestId);
        
        try {
            HttpHeaders headers = createJsonHeaders();
            HttpEntity<Void> entity = new HttpEntity<>(headers);
            
            ResponseEntity<ClearanceUsageResultResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, ClearanceUsageResultResponse.class);
            logResponse("getClearanceUsageResult", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("getClearanceUsageResult", e);
            throw handleException("清算使用量结果获取失败", e);
        }
    }

    @Override
    public ClearanceIssueResponse uploadInvoiceIssue(ClearanceIssueRequest request) {
        String url = properties.getBaseUrl() + "/v1/clearnace/issue/upload";
        
        logRequest("uploadInvoiceIssue", url, request.getRequestId());
        
        try {
            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
            body.add("requestId", request.getRequestId());
            body.add("payload", request.getPayload());
            if (request.getClearanceChannel() != null) {
                body.add("clearanceChannel", request.getClearanceChannel());
            }
            if (request.getProtocol() != null) {
                body.add("protocol", request.getProtocol());
            }
            body.add("noise", request.getNoise());
            body.add("sign", request.getSign());

            HttpHeaders headers = createMultipartHeaders();
            HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(body, headers);
            
            ResponseEntity<ClearanceIssueResponse> response = restTemplate.postForEntity(url, entity, ClearanceIssueResponse.class);
            logResponse("uploadInvoiceIssue", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("uploadInvoiceIssue", e);
            throw handleException("发票签发上传失败", e);
        }
    }

    @Override
    public ClearanceIssueResultResponse getClearanceIssueResult(String requestId) {
        String url = properties.getBaseUrl() + "/v1/clearnace/issue/upload/" + requestId;
        
        logRequest("getClearanceIssueResult", url, requestId);
        
        try {
            HttpHeaders headers = createJsonHeaders();
            HttpEntity<Void> entity = new HttpEntity<>(headers);
            
            ResponseEntity<ClearanceIssueResultResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, ClearanceIssueResultResponse.class);
            logResponse("getClearanceIssueResult", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("getClearanceIssueResult", e);
            throw handleException("清算签发结果获取失败", e);
        }
    }

    // ================== 公司通道管理 ==================

    @Override
    public ChannelCreateResponse createChannel(ChannelCreateRequest request) {
        String url = properties.getBaseUrl() + "/v1/company/channels";
        
        logRequest("createChannel", url, null);
        
        try {
            HttpHeaders headers = createJsonHeaders();
            HttpEntity<ChannelCreateRequest> entity = new HttpEntity<>(request, headers);
            
            ResponseEntity<ChannelCreateResponse> response = restTemplate.postForEntity(url, entity, ChannelCreateResponse.class);
            logResponse("createChannel", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("createChannel", e);
            throw handleException("通道创建失败", e);
        }
    }

    @Override
    public ChannelUpdateResponse updateChannel(ChannelUpdateRequest request) {
        String url = properties.getBaseUrl() + "/v1/company/channels";
        
        logRequest("updateChannel", url, request.getRequestId());
        
        try {
            HttpHeaders headers = createJsonHeaders();
            HttpEntity<ChannelUpdateRequest> entity = new HttpEntity<>(request, headers);
            
            ResponseEntity<ChannelUpdateResponse> response = restTemplate.exchange(url, HttpMethod.PUT, entity, ChannelUpdateResponse.class);
            logResponse("updateChannel", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("updateChannel", e);
            throw handleException("通道更新失败", e);
        }
    }

    @Override
    public ChannelDetailResponse getChannel(String channelId, ChannelHeaders headers) {
        String url = properties.getBaseUrl() + "/v1/company/channels/" + channelId;
        
        logRequest("getChannel", url, channelId);
        
        try {
            HttpHeaders httpHeaders = createJsonHeaders();
            if (headers != null) {
                addChannelHeaders(httpHeaders, headers.getAuthorization(), headers.getCompanyId(), headers.getTimezone());
            }
            HttpEntity<Void> entity = new HttpEntity<>(httpHeaders);
            
            ResponseEntity<ChannelDetailResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, ChannelDetailResponse.class);
            logResponse("getChannel", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("getChannel", e);
            throw handleException("通道信息获取失败", e);
        }
    }

    @Override
    public ChannelStatusResponse enableChannel(String channelId, ChannelHeaders headers) {
        return updateChannelStatus(channelId, "enable", headers);
    }

    @Override
    public ChannelStatusResponse disableChannel(String channelId, ChannelHeaders headers) {
        return updateChannelStatus(channelId, "disable", headers);
    }

    @Override
    public ChannelStatusResponse cancelChannel(String channelId, ChannelHeaders headers) {
        return updateChannelStatus(channelId, "cancel", headers);
    }

    // ================== 参与方查询 ==================

    @Override
    public PartyQueryResponse queryParty(PartyQueryRequest request) {
        String url = properties.getBaseUrl() + "/v1/party/query";
        
        logRequest("queryParty", url, request.getRequestId());
        
        try {
            HttpHeaders headers = createJsonHeaders();
            HttpEntity<PartyQueryRequest> entity = new HttpEntity<>(request, headers);
            
            ResponseEntity<PartyQueryResponse> response = restTemplate.postForEntity(url, entity, PartyQueryResponse.class);
            logResponse("queryParty", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("queryParty", e);
            throw handleException("参与方查询失败", e);
        }
    }

    @Override
    public PartyQueryResultResponse getPartyQueryResult(String requestId) {
        String url = properties.getBaseUrl() + "/v1/party/query/" + requestId;
        
        logRequest("getPartyQueryResult", url, requestId);
        
        try {
            HttpHeaders headers = createJsonHeaders();
            HttpEntity<Void> entity = new HttpEntity<>(headers);
            
            ResponseEntity<PartyQueryResultResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, PartyQueryResultResponse.class);
            logResponse("getPartyQueryResult", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("getPartyQueryResult", e);
            throw handleException("参与方查询结果获取失败", e);
        }
    }

    // ================== 发票操作 ==================

    @Override
    public InvoiceSendResponse sendInvoice(InvoiceSendRequest request) {
        String url = properties.getBaseUrl() + "/v1/invoice/send";
        
        logRequest("sendInvoice", url, request.getRequestId());
        
        try {
            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
            body.add("requestId", request.getRequestId());
            if (request.getPayload() != null) {
                for (Resource resource : request.getPayload()) {
                    body.add("payload", resource);
                }
            }
            if (request.getClearanceChannel() != null) {
                body.add("clearanceChannel", request.getClearanceChannel());
            }
            if (request.getProtocol() != null) {
                body.add("protocol", request.getProtocol());
            }
            if (request.getTemplateFileId() != null) {
                body.add("templateFileId", request.getTemplateFileId());
            }
            if (request.getLogoFileId() != null) {
                body.add("logoFileId", request.getLogoFileId());
            }
            body.add("noise", request.getNoise());
            body.add("sign", request.getSign());

            HttpHeaders headers = createMultipartHeaders();
            addInvoiceHeaders(headers, request.getAuthorization(), request.getCompanyId(),
                            request.getTimezone(), request.getClientTraceId(), request.getAcceptLanguage());
            HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(body, headers);
            
            ResponseEntity<InvoiceSendResponse> response = restTemplate.postForEntity(url, entity, InvoiceSendResponse.class);
            logResponse("sendInvoice", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("sendInvoice", e);
            throw handleException("发票发送失败", e);
        }
    }

    @Override
    public InvoiceSendResultResponse getInvoiceSendResult(String requestId, InvoiceHeaders headers) {
        String url = properties.getBaseUrl() + "/v1/Invoice/sent/" + requestId;
        
        logRequest("getInvoiceSendResult", url, requestId);
        
        try {
            HttpHeaders httpHeaders = createJsonHeaders();
            if (headers != null) {
                addInvoiceHeaders(httpHeaders, headers.getAuthorization(), headers.getCompanyId(),
                                headers.getTimezone(), headers.getClientTraceId(), null);
            }
            HttpEntity<Void> entity = new HttpEntity<>(httpHeaders);
            
            ResponseEntity<InvoiceSendResultResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, InvoiceSendResultResponse.class);
            logResponse("getInvoiceSendResult", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("getInvoiceSendResult", e);
            throw handleException("发票发送结果获取失败", e);
        }
    }

    // ================== 私有方法 ==================

    private ChannelStatusResponse updateChannelStatus(String channelId, String action, ChannelHeaders headers) {
        String url = properties.getBaseUrl() + "/v1/company/channels/" + channelId + "/" + action;
        
        logRequest("updateChannelStatus", url, channelId + " - " + action);
        
        try {
            HttpHeaders httpHeaders = createJsonHeaders();
            if (headers != null) {
                addChannelHeaders(httpHeaders, headers.getAuthorization(), headers.getCompanyId(), headers.getTimezone());
            }
            HttpEntity<Void> entity = new HttpEntity<>(httpHeaders);
            
            ResponseEntity<ChannelStatusResponse> response = restTemplate.postForEntity(url, entity, ChannelStatusResponse.class);
            logResponse("updateChannelStatus", response.getStatusCode());
            return response.getBody();
            
        } catch (Exception e) {
            logError("updateChannelStatus", e);
            throw handleException("通道状态更新失败", e);
        }
    }

    private HttpHeaders createJsonHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        addDefaultHeaders(headers);
        return headers;
    }

    private HttpHeaders createMultipartHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        addDefaultHeaders(headers);
        return headers;
    }

    private void addDefaultHeaders(HttpHeaders headers) {
        if (properties.getApiKey() != null) {
            headers.setBearerAuth(properties.getApiKey());
        }
    }

    private void addDocumentHeaders(HttpHeaders headers, String authorization, String companyId, String timezone, String clientTraceId) {
        if (authorization != null) {
            headers.set("Authorization", authorization);
        }
        if (companyId != null) {
            headers.set("X-Company-ID", companyId);
        }
        if (timezone != null) {
            headers.set("X-Timezone", timezone);
        }
        if (clientTraceId != null) {
            headers.set("X-Client-TraceID", clientTraceId);
        }
    }

    private void addInvoiceHeaders(HttpHeaders headers, String authorization, String companyId, String timezone, String clientTraceId, String acceptLanguage) {
        addDocumentHeaders(headers, authorization, companyId, timezone, clientTraceId);
        if (acceptLanguage != null) {
            headers.set("Accept-Language", acceptLanguage);
        }
    }

    private void addChannelHeaders(HttpHeaders headers, String authorization, String companyId, String timezone) {
        if (authorization != null) {
            headers.set("Authorization", authorization);
        }
        if (companyId != null) {
            headers.set("X-Company-ID", companyId);
        }
        if (timezone != null) {
            headers.set("X-Timezone", timezone);
        }
    }

    private void logRequest(String operation, String url, String identifier) {
        if (properties.isEnableLogging()) {
            log.info("RPA request: operation={}, url={}, identifier={}", operation, url, identifier);
        }
    }

    private void logResponse(String operation, HttpStatus status) {
        if (properties.isEnableLogging()) {
            log.info("RPA response: operation={}, status={}", operation, status);
        }
    }

    private void logError(String operation, Exception e) {
        log.error("RPA error: operation={}, error={}", operation, e.getMessage(), e);
    }

    private RpaClientException handleException(String message, Exception e) {
        if (e instanceof HttpClientErrorException) {
            HttpClientErrorException clientError = (HttpClientErrorException) e;
            return new RpaClientException(message + ": " + clientError.getResponseBodyAsString(), 
                                         null, clientError.getRawStatusCode(), e);
        } else if (e instanceof HttpServerErrorException) {
            HttpServerErrorException serverError = (HttpServerErrorException) e;
            return new RpaClientException(message + ": " + serverError.getResponseBodyAsString(), 
                                         null, serverError.getRawStatusCode(), e);
        } else {
            return new RpaClientException(message, e);
        }
    }
}