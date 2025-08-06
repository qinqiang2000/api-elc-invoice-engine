
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
 * Certificate. Details
 * <p>
 * A class to define a certificate applied to the item. Certificated can be a requirement to sell goods or services in a jurisdiction.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "CertificateTypeCode",
    "CertificateType",
    "Remarks",
    "IssuerParty",
    "DocumentReference",
    "Signature"
})
@Generated("jsonschema2pojo")
public class Certificate {

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
     * Certificate. Identifier
     * <p>
     * An identifier for this certificate.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this certificate.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Certificate. Certificate Type Code. Code
     * <p>
     * The type of this certificate, expressed as a code. The type specifies what array it belongs to, e.g.. Environmental, security, health improvement etc.
     * (Required)
     * 
     */
    @JsonProperty("CertificateTypeCode")
    @JsonPropertyDescription("The type of this certificate, expressed as a code. The type specifies what array it belongs to, e.g.. Environmental, security, health improvement etc.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<CodeType> certificateTypeCode = new ArrayList<CodeType>();
    /**
     * Certificate. Certificate Type. Text
     * <p>
     * The type of this certificate, expressed as a code. The type specifies what array it belongs to, e.g.. Environmental, security, health improvement etc.
     * (Required)
     * 
     */
    @JsonProperty("CertificateType")
    @JsonPropertyDescription("The type of this certificate, expressed as a code. The type specifies what array it belongs to, e.g.. Environmental, security, health improvement etc.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<TextType> certificateType = new ArrayList<TextType>();
    /**
     * Certificate. Remarks. Text
     * <p>
     * Remarks by the applicant for this certificate.
     * 
     */
    @JsonProperty("Remarks")
    @JsonPropertyDescription("Remarks by the applicant for this certificate.")
    @Size(min = 1)
    @Valid
    private List<TextType> remarks = new ArrayList<TextType>();
    /**
     * Certificate. Issuer_ Party. Party
     * <p>
     * The authorized organization that issued this certificate, the provider of the certificate.
     * (Required)
     * 
     */
    @JsonProperty("IssuerParty")
    @JsonPropertyDescription("The authorized organization that issued this certificate, the provider of the certificate.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<Party> issuerParty = new ArrayList<Party>();
    /**
     * Certificate. Document Reference
     * <p>
     * A reference to a document relevant to this certificate or an application for this certificate.
     * 
     */
    @JsonProperty("DocumentReference")
    @JsonPropertyDescription("A reference to a document relevant to this certificate or an application for this certificate.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> documentReference = new ArrayList<DocumentReference>();
    /**
     * Certificate. Signature
     * <p>
     * A signature applied to this certificate.
     * 
     */
    @JsonProperty("Signature")
    @JsonPropertyDescription("A signature applied to this certificate.")
    @Size(min = 1)
    @Valid
    private List<Signature> signature = new ArrayList<Signature>();

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

    public Certificate withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Certificate. Identifier
     * <p>
     * An identifier for this certificate.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Certificate. Identifier
     * <p>
     * An identifier for this certificate.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Certificate withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Certificate. Certificate Type Code. Code
     * <p>
     * The type of this certificate, expressed as a code. The type specifies what array it belongs to, e.g.. Environmental, security, health improvement etc.
     * (Required)
     * 
     */
    @JsonProperty("CertificateTypeCode")
    public List<CodeType> getCertificateTypeCode() {
        return certificateTypeCode;
    }

    /**
     * Certificate. Certificate Type Code. Code
     * <p>
     * The type of this certificate, expressed as a code. The type specifies what array it belongs to, e.g.. Environmental, security, health improvement etc.
     * (Required)
     * 
     */
    @JsonProperty("CertificateTypeCode")
    public void setCertificateTypeCode(List<CodeType> certificateTypeCode) {
        this.certificateTypeCode = certificateTypeCode;
    }

    public Certificate withCertificateTypeCode(List<CodeType> certificateTypeCode) {
        this.certificateTypeCode = certificateTypeCode;
        return this;
    }

    /**
     * Certificate. Certificate Type. Text
     * <p>
     * The type of this certificate, expressed as a code. The type specifies what array it belongs to, e.g.. Environmental, security, health improvement etc.
     * (Required)
     * 
     */
    @JsonProperty("CertificateType")
    public List<TextType> getCertificateType() {
        return certificateType;
    }

    /**
     * Certificate. Certificate Type. Text
     * <p>
     * The type of this certificate, expressed as a code. The type specifies what array it belongs to, e.g.. Environmental, security, health improvement etc.
     * (Required)
     * 
     */
    @JsonProperty("CertificateType")
    public void setCertificateType(List<TextType> certificateType) {
        this.certificateType = certificateType;
    }

    public Certificate withCertificateType(List<TextType> certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * Certificate. Remarks. Text
     * <p>
     * Remarks by the applicant for this certificate.
     * 
     */
    @JsonProperty("Remarks")
    public List<TextType> getRemarks() {
        return remarks;
    }

    /**
     * Certificate. Remarks. Text
     * <p>
     * Remarks by the applicant for this certificate.
     * 
     */
    @JsonProperty("Remarks")
    public void setRemarks(List<TextType> remarks) {
        this.remarks = remarks;
    }

    public Certificate withRemarks(List<TextType> remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * Certificate. Issuer_ Party. Party
     * <p>
     * The authorized organization that issued this certificate, the provider of the certificate.
     * (Required)
     * 
     */
    @JsonProperty("IssuerParty")
    public List<Party> getIssuerParty() {
        return issuerParty;
    }

    /**
     * Certificate. Issuer_ Party. Party
     * <p>
     * The authorized organization that issued this certificate, the provider of the certificate.
     * (Required)
     * 
     */
    @JsonProperty("IssuerParty")
    public void setIssuerParty(List<Party> issuerParty) {
        this.issuerParty = issuerParty;
    }

    public Certificate withIssuerParty(List<Party> issuerParty) {
        this.issuerParty = issuerParty;
        return this;
    }

    /**
     * Certificate. Document Reference
     * <p>
     * A reference to a document relevant to this certificate or an application for this certificate.
     * 
     */
    @JsonProperty("DocumentReference")
    public List<DocumentReference> getDocumentReference() {
        return documentReference;
    }

    /**
     * Certificate. Document Reference
     * <p>
     * A reference to a document relevant to this certificate or an application for this certificate.
     * 
     */
    @JsonProperty("DocumentReference")
    public void setDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
    }

    public Certificate withDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
        return this;
    }

    /**
     * Certificate. Signature
     * <p>
     * A signature applied to this certificate.
     * 
     */
    @JsonProperty("Signature")
    public List<Signature> getSignature() {
        return signature;
    }

    /**
     * Certificate. Signature
     * <p>
     * A signature applied to this certificate.
     * 
     */
    @JsonProperty("Signature")
    public void setSignature(List<Signature> signature) {
        this.signature = signature;
    }

    public Certificate withSignature(List<Signature> signature) {
        this.signature = signature;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Certificate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("certificateTypeCode");
        sb.append('=');
        sb.append(((this.certificateTypeCode == null)?"<null>":this.certificateTypeCode));
        sb.append(',');
        sb.append("certificateType");
        sb.append('=');
        sb.append(((this.certificateType == null)?"<null>":this.certificateType));
        sb.append(',');
        sb.append("remarks");
        sb.append('=');
        sb.append(((this.remarks == null)?"<null>":this.remarks));
        sb.append(',');
        sb.append("issuerParty");
        sb.append('=');
        sb.append(((this.issuerParty == null)?"<null>":this.issuerParty));
        sb.append(',');
        sb.append("documentReference");
        sb.append('=');
        sb.append(((this.documentReference == null)?"<null>":this.documentReference));
        sb.append(',');
        sb.append("signature");
        sb.append('=');
        sb.append(((this.signature == null)?"<null>":this.signature));
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
        result = ((result* 31)+((this.certificateTypeCode == null)? 0 :this.certificateTypeCode.hashCode()));
        result = ((result* 31)+((this.signature == null)? 0 :this.signature.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.issuerParty == null)? 0 :this.issuerParty.hashCode()));
        result = ((result* 31)+((this.documentReference == null)? 0 :this.documentReference.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.remarks == null)? 0 :this.remarks.hashCode()));
        result = ((result* 31)+((this.certificateType == null)? 0 :this.certificateType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Certificate) == false) {
            return false;
        }
        Certificate rhs = ((Certificate) other);
        return (((((((((this.certificateTypeCode == rhs.certificateTypeCode)||((this.certificateTypeCode!= null)&&this.certificateTypeCode.equals(rhs.certificateTypeCode)))&&((this.signature == rhs.signature)||((this.signature!= null)&&this.signature.equals(rhs.signature))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.issuerParty == rhs.issuerParty)||((this.issuerParty!= null)&&this.issuerParty.equals(rhs.issuerParty))))&&((this.documentReference == rhs.documentReference)||((this.documentReference!= null)&&this.documentReference.equals(rhs.documentReference))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.remarks == rhs.remarks)||((this.remarks!= null)&&this.remarks.equals(rhs.remarks))))&&((this.certificateType == rhs.certificateType)||((this.certificateType!= null)&&this.certificateType.equals(rhs.certificateType))));
    }

}
