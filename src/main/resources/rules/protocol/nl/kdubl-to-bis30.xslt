<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:inv="urn:oasis:names:specification:ubl:schema:xsd:Invoice-2"
                xmlns:cn="urn:oasis:names:specification:ubl:schema:xsd:CreditNote-2"
                xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2"
                xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2"
                exclude-result-prefixes="inv cn cac cbc">

    <xsl:output method="xml" indent="yes"/>

    <!-- 检测文档类型并应用相应转换 -->
    <xsl:template match="/">
        <xsl:choose>
            <!-- 处理红票转换 (InvoiceTypeCode = 381) -->
            <xsl:when test="inv:Invoice/cbc:InvoiceTypeCode = '381'">
<!--                <CreditNote xmlns="urn:oasis:names:specification:ubl:schema:xsd:CreditNote-2">-->
<!--                    <xsl:copy-of select="namespace::*"/>-->
                    <xsl:apply-templates select="inv:Invoice" mode="creditnote"/>
<!--                </CreditNote>-->
            </xsl:when>

            <!-- 处理普通发票 -->
            <xsl:otherwise>
                <xsl:apply-templates select="inv:Invoice" mode="invoice"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    <!-- ======================== -->
    <!-- 普通发票转换模式 (mode="invoice") -->
    <!-- ======================== -->
    <xsl:template match="inv:Invoice" mode="invoice">
        <Invoice xmlns="urn:oasis:names:specification:ubl:schema:xsd:Invoice-2"
                 xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2"
                 xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2">
            <xsl:copy-of select="namespace::*"/>
            <xsl:apply-templates select="@* | node()" mode="invoice"/>
        </Invoice>
    </xsl:template>

    <!-- ======================== -->
    <!-- 红票转换模式 (mode="creditnote") -->
    <!-- ======================== -->
    <xsl:template match="inv:Invoice" mode="creditnote">
        <CreditNote xmlns="urn:oasis:names:specification:ubl:schema:xsd:CreditNote-2"
                    xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2"
                    xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2">
            <xsl:copy-of select="namespace::*[name()]"/>
            <xsl:apply-templates select="@* | node()" mode="creditnote"/>
        </CreditNote>
    </xsl:template>

    <!-- 普通发票的通用转换规则 -->
    <xsl:template match="@* | node()" mode="invoice">
        <xsl:copy copy-namespaces="no">
            <xsl:apply-templates select="@* | node()" mode="invoice"/>
        </xsl:copy>
    </xsl:template>

    <!-- 红票的通用转换规则 -->
    <xsl:template match="@* | node()" mode="creditnote">
        <xsl:copy copy-namespaces="no">
            <xsl:apply-templates select="@* | node()" mode="creditnote"/>
        </xsl:copy>
    </xsl:template>


    <!-- Transform CustomizationID to SG INV value -->
    <xsl:template match="cbc:CustomizationID" mode="invoice creditnote">
        <cbc:CustomizationID>
            <xsl:text>urn:cen.eu:en16931:2017#compliant#urn:fdc:peppol.eu:2017:poacc:billing:3.0</xsl:text>
        </cbc:CustomizationID>
    </xsl:template>

    <!-- Transform ProfileID to SG INV value -->
    <xsl:template match="cbc:ProfileID" mode="invoice creditnote">
        <cbc:ProfileID>
            <xsl:text>urn:fdc:peppol.eu:2017:poacc:billing:01:1.0</xsl:text>
        </cbc:ProfileID>
    </xsl:template>
    <!-- 删除具有 ID="SubmissionType" 且 schemeName="InvoiceTag" 的 AdditionalDocumentReference -->
    <xsl:template match="cac:AdditionalDocumentReference[cbc:ID[@schemeName='InvoiceTag']='SubmissionType']" mode="invoice creditnote"/>
    <xsl:template match="cac:AdditionalDocumentReference[cbc:ID[@schemeName='InvoiceTag']='Selfbilled']" mode="invoice creditnote"/>

    <!-- 精确删除目标元素 -->
    <xsl:template match="cac:AccountingSupplierParty/cac:Party/cac:PartyIdentification" mode="invoice creditnote"/>
    <xsl:template match="cac:AccountingCustomerParty/cac:Party/cac:PartyIdentification" mode="invoice creditnote"/>

<!--    <xsl:template match="cac:PartyLegalEntity/cbc:CompanyID/@schemeID" mode="invoice creditnote"/>-->

    <!-- 替换cac:PartyLegalEntity/cbc:CompanyID/@schemeID 的值-->
    <xsl:template match="cac:AccountingSupplierParty/cac:Party/cac:PartyLegalEntity/cbc:CompanyID
                 | cac:AccountingCustomerParty/cac:Party/cac:PartyLegalEntity/cbc:CompanyID"
                  mode="invoice creditnote">
        <xsl:variable name="countryCode" select="ancestor::cac:Party/cac:PostalAddress/cac:Country/cbc:IdentificationCode"/>
        <!-- 获取原始schemeID -->
        <xsl:variable name="originalSchemeID" select="normalize-space(@schemeID)"/>
        <!-- 确定新schemeID -->
        <xsl:variable name="newSchemeID">
            <xsl:choose>
                <xsl:when test="$countryCode = 'NL' and $originalSchemeID = 'KVK'">0106</xsl:when>
                <xsl:when test="$countryCode = 'SK' and $originalSchemeID = 'DPH'">9950</xsl:when>
                <xsl:when test="$countryCode = 'DE' and $originalSchemeID = 'HR'">0094</xsl:when>
                <!-- 保留原始值 -->
<!--                <xsl:otherwise>-->
<!--                    <xsl:value-of select="$originalSchemeID"/>-->
<!--                </xsl:otherwise>-->
            </xsl:choose>
        </xsl:variable>
        <!-- 重建CompanyID元素 -->
        <cbc:CompanyID>
            <!-- 非NL国家不输出schemeID属性 -->
            <xsl:if test="$newSchemeID != ''">
                <xsl:attribute name="schemeID">
                    <xsl:value-of select="$newSchemeID"/>
                </xsl:attribute>
            </xsl:if>
            <!-- 保持原始内容 -->
            <xsl:apply-templates select="node()"/>
        </cbc:CompanyID>
    </xsl:template>

    <!-- 将InvoiceTypeCode转换为CreditNoteTypeCode -->
    <xsl:template match="cbc:InvoiceTypeCode" mode="creditnote">
        <cbc:CreditNoteTypeCode>
            <xsl:value-of select="."/>
        </cbc:CreditNoteTypeCode>
    </xsl:template>

    <!-- 将InvoiceLine转换为CreditNoteLine -->
    <xsl:template match="cac:InvoiceLine" mode="creditnote">
        <cac:CreditNoteLine>
            <xsl:apply-templates select="@* | node()" mode="creditnote"/>
        </cac:CreditNoteLine>
    </xsl:template>

    <xsl:template match="cbc:InvoicedQuantity" mode="creditnote">
        <cbc:CreditedQuantity>
            <xsl:apply-templates select="@* | node()" mode="creditnote"/>
        </cbc:CreditedQuantity>
    </xsl:template>

    <xsl:template match="cac:AccountingSupplierParty/cac:Party | cac:AccountingCustomerParty/cac:Party" mode="invoice creditnote">
        <xsl:copy copy-namespaces="no">
            <!-- 获取国家代码和税务ID -->
            <xsl:variable name="countryCode" select="normalize-space(cac:PostalAddress/cac:Country/cbc:IdentificationCode)"/>
            <xsl:variable name="taxID" select="normalize-space(cac:PartyTaxScheme/cbc:CompanyID)"/>

            <!-- 确定schemeID -->
            <xsl:variable name="schemeID">
                <xsl:choose>
                    <xsl:when test="$countryCode = 'AT'">9914</xsl:when>
                    <xsl:when test="$countryCode = 'BG'">9926</xsl:when>
                    <xsl:when test="$countryCode = 'DE'">9930</xsl:when>
                    <xsl:when test="$countryCode = 'DK'">0184</xsl:when>
                    <xsl:when test="$countryCode = 'FR'">9957</xsl:when>
                    <xsl:when test="$countryCode = 'GB'">9932</xsl:when>
                    <xsl:when test="$countryCode = 'GR'">9933</xsl:when>
                    <xsl:when test="$countryCode = 'HR'">9934</xsl:when>
                    <xsl:when test="$countryCode = 'HU'">9910</xsl:when>
                    <xsl:when test="$countryCode = 'IE'">9935</xsl:when>
                    <xsl:when test="$countryCode = 'NL'">9944</xsl:when>
                    <xsl:when test="$countryCode = 'PL'">9945</xsl:when>
                    <xsl:when test="$countryCode = 'PT'">9946</xsl:when>
                    <xsl:when test="$countryCode = 'RO'">9947</xsl:when>
                    <xsl:when test="$countryCode = 'SI'">9949</xsl:when>
                    <xsl:when test="$countryCode = 'CH'">9927</xsl:when>
                    <xsl:otherwise>0088</xsl:otherwise> <!-- 默认VAT -->
                </xsl:choose>
            </xsl:variable>
            <xsl:if test="string-length($taxID) &gt; 0">
                <cbc:EndpointID schemeID="{$schemeID}">
                    <xsl:value-of select="$taxID"/>
                </cbc:EndpointID>
            </xsl:if>
            <xsl:apply-templates select="*[not(self::cbc:EndpointID or self::cac:PartyIdentification)]" mode="#current"/>
        </xsl:copy>
    </xsl:template>

</xsl:stylesheet>