
package com.kingdee.fpy.model.ubl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * Document Reference. Details
 * <p>
 * A class to define a reference to a document.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "CopyIndicator",
    "UUID",
    "IssueDate",
    "IssueTime",
    "DocumentTypeCode",
    "DocumentType",
    "XPath",
    "LanguageID",
    "LocaleCode",
    "VersionID",
    "DocumentStatusCode",
    "DocumentDescription",
    "Attachment",
    "ValidityPeriod",
    "IssuerParty",
    "ResultOfVerification"
})
@Generated("jsonschema2pojo")
public class DocumentReference {

    /**
     * UBLExtensions
     * <p>
     * An optional set of extensions to the committee model
     * 
     */
    @JsonProperty("UBLExtensions")
    @JsonPropertyDescription("An optional set of extensions to the committee model")
    @Size(min = 1, max = 1)
    @Valid
    private List<UBLExtensions> uBLExtensions = new ArrayList<UBLExtensions>();
    /**
     * Document Reference. Identifier
     * <p>
     * An identifier for the referenced document.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for the referenced document.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Document Reference. Copy_ Indicator. Indicator
     * <p>
     * An indicator that the referenced document is a copy (true) or the original (false).
     * 
     */
    @JsonProperty("CopyIndicator")
    @JsonPropertyDescription("An indicator that the referenced document is a copy (true) or the original (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> copyIndicator = new ArrayList<IndicatorType>();
    /**
     * Document Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for this document reference.
     * 
     */
    @JsonProperty("UUID")
    @JsonPropertyDescription("A universally unique identifier for this document reference.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> uuid = new ArrayList<IdentifierType>();
    /**
     * Document Reference. Issue Date. Date
     * <p>
     * The date, assigned by the sender of the referenced document, on which the document was issued.
     * 
     */
    @JsonProperty("IssueDate")
    @JsonPropertyDescription("The date, assigned by the sender of the referenced document, on which the document was issued.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> issueDate = new ArrayList<DateType>();
    /**
     * Document Reference. Issue Time. Time
     * <p>
     * The time, assigned by the sender of the referenced document, at which the document was issued.
     * 
     */
    @JsonProperty("IssueTime")
    @JsonPropertyDescription("The time, assigned by the sender of the referenced document, at which the document was issued.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> issueTime = new ArrayList<TimeType>();
    /**
     * Document Reference. Document Type Code. Code
     * <p>
     * The type of document being referenced, expressed as a code.
     * 
     */
    @JsonProperty("DocumentTypeCode")
    @JsonPropertyDescription("The type of document being referenced, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> documentTypeCode = new ArrayList<CodeType>();
    /**
     * Document Reference. Document Type. Text
     * <p>
     * The type of document being referenced, expressed as text.
     * 
     */
    @JsonProperty("DocumentType")
    @JsonPropertyDescription("The type of document being referenced, expressed as text.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> documentType = new ArrayList<TextType>();
    /**
     * Document Reference. XPath. Text
     * <p>
     * A reference to another place in the same XML document instance in which DocumentReference appears.
     * 
     */
    @JsonProperty("XPath")
    @JsonPropertyDescription("A reference to another place in the same XML document instance in which DocumentReference appears.")
    @Size(min = 1)
    @Valid
    private List<TextType> xPath = new ArrayList<TextType>();
    /**
     * Document Reference. Language. Identifier
     * <p>
     * An identifier for the language used in the referenced document.
     * 
     */
    @JsonProperty("LanguageID")
    @JsonPropertyDescription("An identifier for the language used in the referenced document.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> languageID = new ArrayList<IdentifierType>();
    /**
     * Document Reference. Locale Code. Code
     * <p>
     * A code signifying the locale in which the language in the referenced document is used.
     * 
     */
    @JsonProperty("LocaleCode")
    @JsonPropertyDescription("A code signifying the locale in which the language in the referenced document is used.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> localeCode = new ArrayList<CodeType>();
    /**
     * Document Reference. Version. Identifier
     * <p>
     * An identifier for the current version of the referenced document.
     * 
     */
    @JsonProperty("VersionID")
    @JsonPropertyDescription("An identifier for the current version of the referenced document.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> versionID = new ArrayList<IdentifierType>();
    /**
     * Document Reference. Document Status Code. Code
     * <p>
     * A code signifying the status of the reference document with respect to its original state.
     * 
     */
    @JsonProperty("DocumentStatusCode")
    @JsonPropertyDescription("A code signifying the status of the reference document with respect to its original state.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> documentStatusCode = new ArrayList<CodeType>();
    /**
     * Document Reference. Document_ Description. Text
     * <p>
     * Text describing the referenced document.
     * 
     */
    @JsonProperty("DocumentDescription")
    @JsonPropertyDescription("Text describing the referenced document.")
    @Size(min = 1)
    @Valid
    private List<TextType> documentDescription = new ArrayList<TextType>();
    /**
     * Document Reference. Attachment
     * <p>
     * The referenced document as an attachment to the document from which it is referenced.
     * 
     */
    @JsonProperty("Attachment")
    @JsonPropertyDescription("The referenced document as an attachment to the document from which it is referenced.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Attachment> attachment = new ArrayList<Attachment>();
    /**
     * Document Reference. Validity_ Period. Period
     * <p>
     * The period for which this document reference is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    @JsonPropertyDescription("The period for which this document reference is valid.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> validityPeriod = new ArrayList<Period>();
    /**
     * Document Reference. Issuer_ Party. Party
     * <p>
     * The party who issued the referenced document.
     * 
     */
    @JsonProperty("IssuerParty")
    @JsonPropertyDescription("The party who issued the referenced document.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> issuerParty = new ArrayList<Party>();
    /**
     * Document Reference. Result Of Verification
     * <p>
     * The result of an attempt to verify a signature associated with the referenced document.
     * 
     */
    @JsonProperty("ResultOfVerification")
    @JsonPropertyDescription("The result of an attempt to verify a signature associated with the referenced document.")
    @Size(min = 1, max = 1)
    @Valid
    private List<ResultOfVerification> resultOfVerification = new ArrayList<ResultOfVerification>();

    /**
     * UBLExtensions
     * <p>
     * An optional set of extensions to the committee model
     * 
     */
    @JsonProperty("UBLExtensions")
    public List<UBLExtensions> getUBLExtensions() {
        return uBLExtensions;
    }

    /**
     * UBLExtensions
     * <p>
     * An optional set of extensions to the committee model
     * 
     */
    @JsonProperty("UBLExtensions")
    public void setUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
    }

    public DocumentReference withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Document Reference. Identifier
     * <p>
     * An identifier for the referenced document.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Document Reference. Identifier
     * <p>
     * An identifier for the referenced document.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public DocumentReference withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Document Reference. Copy_ Indicator. Indicator
     * <p>
     * An indicator that the referenced document is a copy (true) or the original (false).
     * 
     */
    @JsonProperty("CopyIndicator")
    public List<IndicatorType> getCopyIndicator() {
        return copyIndicator;
    }

    /**
     * Document Reference. Copy_ Indicator. Indicator
     * <p>
     * An indicator that the referenced document is a copy (true) or the original (false).
     * 
     */
    @JsonProperty("CopyIndicator")
    public void setCopyIndicator(List<IndicatorType> copyIndicator) {
        this.copyIndicator = copyIndicator;
    }

    public DocumentReference withCopyIndicator(List<IndicatorType> copyIndicator) {
        this.copyIndicator = copyIndicator;
        return this;
    }

    /**
     * Document Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for this document reference.
     * 
     */
    @JsonProperty("UUID")
    public List<IdentifierType> getUuid() {
        return uuid;
    }

    /**
     * Document Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for this document reference.
     * 
     */
    @JsonProperty("UUID")
    public void setUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
    }

    public DocumentReference withUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Document Reference. Issue Date. Date
     * <p>
     * The date, assigned by the sender of the referenced document, on which the document was issued.
     * 
     */
    @JsonProperty("IssueDate")
    public List<DateType> getIssueDate() {
        return issueDate;
    }

    /**
     * Document Reference. Issue Date. Date
     * <p>
     * The date, assigned by the sender of the referenced document, on which the document was issued.
     * 
     */
    @JsonProperty("IssueDate")
    public void setIssueDate(List<DateType> issueDate) {
        this.issueDate = issueDate;
    }

    public DocumentReference withIssueDate(List<DateType> issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * Document Reference. Issue Time. Time
     * <p>
     * The time, assigned by the sender of the referenced document, at which the document was issued.
     * 
     */
    @JsonProperty("IssueTime")
    public List<TimeType> getIssueTime() {
        return issueTime;
    }

    /**
     * Document Reference. Issue Time. Time
     * <p>
     * The time, assigned by the sender of the referenced document, at which the document was issued.
     * 
     */
    @JsonProperty("IssueTime")
    public void setIssueTime(List<TimeType> issueTime) {
        this.issueTime = issueTime;
    }

    public DocumentReference withIssueTime(List<TimeType> issueTime) {
        this.issueTime = issueTime;
        return this;
    }

    /**
     * Document Reference. Document Type Code. Code
     * <p>
     * The type of document being referenced, expressed as a code.
     * 
     */
    @JsonProperty("DocumentTypeCode")
    public List<CodeType> getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * Document Reference. Document Type Code. Code
     * <p>
     * The type of document being referenced, expressed as a code.
     * 
     */
    @JsonProperty("DocumentTypeCode")
    public void setDocumentTypeCode(List<CodeType> documentTypeCode) {
        this.documentTypeCode = documentTypeCode;
    }

    public DocumentReference withDocumentTypeCode(List<CodeType> documentTypeCode) {
        this.documentTypeCode = documentTypeCode;
        return this;
    }

    /**
     * Document Reference. Document Type. Text
     * <p>
     * The type of document being referenced, expressed as text.
     * 
     */
    @JsonProperty("DocumentType")
    public List<TextType> getDocumentType() {
        return documentType;
    }

    /**
     * Document Reference. Document Type. Text
     * <p>
     * The type of document being referenced, expressed as text.
     * 
     */
    @JsonProperty("DocumentType")
    public void setDocumentType(List<TextType> documentType) {
        this.documentType = documentType;
    }

    public DocumentReference withDocumentType(List<TextType> documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * Document Reference. XPath. Text
     * <p>
     * A reference to another place in the same XML document instance in which DocumentReference appears.
     * 
     */
    @JsonProperty("XPath")
    public List<TextType> getXPath() {
        return xPath;
    }

    /**
     * Document Reference. XPath. Text
     * <p>
     * A reference to another place in the same XML document instance in which DocumentReference appears.
     * 
     */
    @JsonProperty("XPath")
    public void setXPath(List<TextType> xPath) {
        this.xPath = xPath;
    }

    public DocumentReference withXPath(List<TextType> xPath) {
        this.xPath = xPath;
        return this;
    }

    /**
     * Document Reference. Language. Identifier
     * <p>
     * An identifier for the language used in the referenced document.
     * 
     */
    @JsonProperty("LanguageID")
    public List<IdentifierType> getLanguageID() {
        return languageID;
    }

    /**
     * Document Reference. Language. Identifier
     * <p>
     * An identifier for the language used in the referenced document.
     * 
     */
    @JsonProperty("LanguageID")
    public void setLanguageID(List<IdentifierType> languageID) {
        this.languageID = languageID;
    }

    public DocumentReference withLanguageID(List<IdentifierType> languageID) {
        this.languageID = languageID;
        return this;
    }

    /**
     * Document Reference. Locale Code. Code
     * <p>
     * A code signifying the locale in which the language in the referenced document is used.
     * 
     */
    @JsonProperty("LocaleCode")
    public List<CodeType> getLocaleCode() {
        return localeCode;
    }

    /**
     * Document Reference. Locale Code. Code
     * <p>
     * A code signifying the locale in which the language in the referenced document is used.
     * 
     */
    @JsonProperty("LocaleCode")
    public void setLocaleCode(List<CodeType> localeCode) {
        this.localeCode = localeCode;
    }

    public DocumentReference withLocaleCode(List<CodeType> localeCode) {
        this.localeCode = localeCode;
        return this;
    }

    /**
     * Document Reference. Version. Identifier
     * <p>
     * An identifier for the current version of the referenced document.
     * 
     */
    @JsonProperty("VersionID")
    public List<IdentifierType> getVersionID() {
        return versionID;
    }

    /**
     * Document Reference. Version. Identifier
     * <p>
     * An identifier for the current version of the referenced document.
     * 
     */
    @JsonProperty("VersionID")
    public void setVersionID(List<IdentifierType> versionID) {
        this.versionID = versionID;
    }

    public DocumentReference withVersionID(List<IdentifierType> versionID) {
        this.versionID = versionID;
        return this;
    }

    /**
     * Document Reference. Document Status Code. Code
     * <p>
     * A code signifying the status of the reference document with respect to its original state.
     * 
     */
    @JsonProperty("DocumentStatusCode")
    public List<CodeType> getDocumentStatusCode() {
        return documentStatusCode;
    }

    /**
     * Document Reference. Document Status Code. Code
     * <p>
     * A code signifying the status of the reference document with respect to its original state.
     * 
     */
    @JsonProperty("DocumentStatusCode")
    public void setDocumentStatusCode(List<CodeType> documentStatusCode) {
        this.documentStatusCode = documentStatusCode;
    }

    public DocumentReference withDocumentStatusCode(List<CodeType> documentStatusCode) {
        this.documentStatusCode = documentStatusCode;
        return this;
    }

    /**
     * Document Reference. Document_ Description. Text
     * <p>
     * Text describing the referenced document.
     * 
     */
    @JsonProperty("DocumentDescription")
    public List<TextType> getDocumentDescription() {
        return documentDescription;
    }

    /**
     * Document Reference. Document_ Description. Text
     * <p>
     * Text describing the referenced document.
     * 
     */
    @JsonProperty("DocumentDescription")
    public void setDocumentDescription(List<TextType> documentDescription) {
        this.documentDescription = documentDescription;
    }

    public DocumentReference withDocumentDescription(List<TextType> documentDescription) {
        this.documentDescription = documentDescription;
        return this;
    }

    /**
     * Document Reference. Attachment
     * <p>
     * The referenced document as an attachment to the document from which it is referenced.
     * 
     */
    @JsonProperty("Attachment")
    public List<Attachment> getAttachment() {
        return attachment;
    }

    /**
     * Document Reference. Attachment
     * <p>
     * The referenced document as an attachment to the document from which it is referenced.
     * 
     */
    @JsonProperty("Attachment")
    public void setAttachment(List<Attachment> attachment) {
        this.attachment = attachment;
    }

    public DocumentReference withAttachment(List<Attachment> attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * Document Reference. Validity_ Period. Period
     * <p>
     * The period for which this document reference is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    public List<Period> getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Document Reference. Validity_ Period. Period
     * <p>
     * The period for which this document reference is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    public void setValidityPeriod(List<Period> validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public DocumentReference withValidityPeriod(List<Period> validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Document Reference. Issuer_ Party. Party
     * <p>
     * The party who issued the referenced document.
     * 
     */
    @JsonProperty("IssuerParty")
    public List<Party> getIssuerParty() {
        return issuerParty;
    }

    /**
     * Document Reference. Issuer_ Party. Party
     * <p>
     * The party who issued the referenced document.
     * 
     */
    @JsonProperty("IssuerParty")
    public void setIssuerParty(List<Party> issuerParty) {
        this.issuerParty = issuerParty;
    }

    public DocumentReference withIssuerParty(List<Party> issuerParty) {
        this.issuerParty = issuerParty;
        return this;
    }

    /**
     * Document Reference. Result Of Verification
     * <p>
     * The result of an attempt to verify a signature associated with the referenced document.
     * 
     */
    @JsonProperty("ResultOfVerification")
    public List<ResultOfVerification> getResultOfVerification() {
        return resultOfVerification;
    }

    /**
     * Document Reference. Result Of Verification
     * <p>
     * The result of an attempt to verify a signature associated with the referenced document.
     * 
     */
    @JsonProperty("ResultOfVerification")
    public void setResultOfVerification(List<ResultOfVerification> resultOfVerification) {
        this.resultOfVerification = resultOfVerification;
    }

    public DocumentReference withResultOfVerification(List<ResultOfVerification> resultOfVerification) {
        this.resultOfVerification = resultOfVerification;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DocumentReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("copyIndicator");
        sb.append('=');
        sb.append(((this.copyIndicator == null)?"<null>":this.copyIndicator));
        sb.append(',');
        sb.append("uuid");
        sb.append('=');
        sb.append(((this.uuid == null)?"<null>":this.uuid));
        sb.append(',');
        sb.append("issueDate");
        sb.append('=');
        sb.append(((this.issueDate == null)?"<null>":this.issueDate));
        sb.append(',');
        sb.append("issueTime");
        sb.append('=');
        sb.append(((this.issueTime == null)?"<null>":this.issueTime));
        sb.append(',');
        sb.append("documentTypeCode");
        sb.append('=');
        sb.append(((this.documentTypeCode == null)?"<null>":this.documentTypeCode));
        sb.append(',');
        sb.append("documentType");
        sb.append('=');
        sb.append(((this.documentType == null)?"<null>":this.documentType));
        sb.append(',');
        sb.append("xPath");
        sb.append('=');
        sb.append(((this.xPath == null)?"<null>":this.xPath));
        sb.append(',');
        sb.append("languageID");
        sb.append('=');
        sb.append(((this.languageID == null)?"<null>":this.languageID));
        sb.append(',');
        sb.append("localeCode");
        sb.append('=');
        sb.append(((this.localeCode == null)?"<null>":this.localeCode));
        sb.append(',');
        sb.append("versionID");
        sb.append('=');
        sb.append(((this.versionID == null)?"<null>":this.versionID));
        sb.append(',');
        sb.append("documentStatusCode");
        sb.append('=');
        sb.append(((this.documentStatusCode == null)?"<null>":this.documentStatusCode));
        sb.append(',');
        sb.append("documentDescription");
        sb.append('=');
        sb.append(((this.documentDescription == null)?"<null>":this.documentDescription));
        sb.append(',');
        sb.append("attachment");
        sb.append('=');
        sb.append(((this.attachment == null)?"<null>":this.attachment));
        sb.append(',');
        sb.append("validityPeriod");
        sb.append('=');
        sb.append(((this.validityPeriod == null)?"<null>":this.validityPeriod));
        sb.append(',');
        sb.append("issuerParty");
        sb.append('=');
        sb.append(((this.issuerParty == null)?"<null>":this.issuerParty));
        sb.append(',');
        sb.append("resultOfVerification");
        sb.append('=');
        sb.append(((this.resultOfVerification == null)?"<null>":this.resultOfVerification));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.copyIndicator == null)? 0 :this.copyIndicator.hashCode()));
        result = ((result* 31)+((this.documentDescription == null)? 0 :this.documentDescription.hashCode()));
        result = ((result* 31)+((this.issueTime == null)? 0 :this.issueTime.hashCode()));
        result = ((result* 31)+((this.documentType == null)? 0 :this.documentType.hashCode()));
        result = ((result* 31)+((this.documentStatusCode == null)? 0 :this.documentStatusCode.hashCode()));
        result = ((result* 31)+((this.languageID == null)? 0 :this.languageID.hashCode()));
        result = ((result* 31)+((this.issuerParty == null)? 0 :this.issuerParty.hashCode()));
        result = ((result* 31)+((this.uuid == null)? 0 :this.uuid.hashCode()));
        result = ((result* 31)+((this.resultOfVerification == null)? 0 :this.resultOfVerification.hashCode()));
        result = ((result* 31)+((this.validityPeriod == null)? 0 :this.validityPeriod.hashCode()));
        result = ((result* 31)+((this.versionID == null)? 0 :this.versionID.hashCode()));
        result = ((result* 31)+((this.documentTypeCode == null)? 0 :this.documentTypeCode.hashCode()));
        result = ((result* 31)+((this.localeCode == null)? 0 :this.localeCode.hashCode()));
        result = ((result* 31)+((this.attachment == null)? 0 :this.attachment.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.issueDate == null)? 0 :this.issueDate.hashCode()));
        result = ((result* 31)+((this.xPath == null)? 0 :this.xPath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentReference) == false) {
            return false;
        }
        DocumentReference rhs = ((DocumentReference) other);
        return (((((((((((((((((((this.copyIndicator == rhs.copyIndicator)||((this.copyIndicator!= null)&&this.copyIndicator.equals(rhs.copyIndicator)))&&((this.documentDescription == rhs.documentDescription)||((this.documentDescription!= null)&&this.documentDescription.equals(rhs.documentDescription))))&&((this.issueTime == rhs.issueTime)||((this.issueTime!= null)&&this.issueTime.equals(rhs.issueTime))))&&((this.documentType == rhs.documentType)||((this.documentType!= null)&&this.documentType.equals(rhs.documentType))))&&((this.documentStatusCode == rhs.documentStatusCode)||((this.documentStatusCode!= null)&&this.documentStatusCode.equals(rhs.documentStatusCode))))&&((this.languageID == rhs.languageID)||((this.languageID!= null)&&this.languageID.equals(rhs.languageID))))&&((this.issuerParty == rhs.issuerParty)||((this.issuerParty!= null)&&this.issuerParty.equals(rhs.issuerParty))))&&((this.uuid == rhs.uuid)||((this.uuid!= null)&&this.uuid.equals(rhs.uuid))))&&((this.resultOfVerification == rhs.resultOfVerification)||((this.resultOfVerification!= null)&&this.resultOfVerification.equals(rhs.resultOfVerification))))&&((this.validityPeriod == rhs.validityPeriod)||((this.validityPeriod!= null)&&this.validityPeriod.equals(rhs.validityPeriod))))&&((this.versionID == rhs.versionID)||((this.versionID!= null)&&this.versionID.equals(rhs.versionID))))&&((this.documentTypeCode == rhs.documentTypeCode)||((this.documentTypeCode!= null)&&this.documentTypeCode.equals(rhs.documentTypeCode))))&&((this.localeCode == rhs.localeCode)||((this.localeCode!= null)&&this.localeCode.equals(rhs.localeCode))))&&((this.attachment == rhs.attachment)||((this.attachment!= null)&&this.attachment.equals(rhs.attachment))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.issueDate == rhs.issueDate)||((this.issueDate!= null)&&this.issueDate.equals(rhs.issueDate))))&&((this.xPath == rhs.xPath)||((this.xPath!= null)&&this.xPath.equals(rhs.xPath))));
    }

}
