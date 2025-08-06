
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
 * Signature. Details
 * <p>
 * A class to define a signature.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Note",
    "ValidationDate",
    "ValidationTime",
    "ValidatorID",
    "CanonicalizationMethod",
    "SignatureMethod",
    "SignatoryParty",
    "DigitalSignatureAttachment",
    "OriginalDocumentReference"
})
@Generated("jsonschema2pojo")
public class Signature {

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
     * Signature. Identifier
     * <p>
     * An identifier for this signature.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this signature.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Signature. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures; in particular, information regarding the circumstances in which the signature is being used.
     * 
     */
    @JsonProperty("Note")
    @JsonPropertyDescription("Free-form text conveying information that is not contained explicitly in other structures; in particular, information regarding the circumstances in which the signature is being used.")
    @Size(min = 1)
    @Valid
    private List<TextType> note = new ArrayList<TextType>();
    /**
     * Signature. Validation Date. Date
     * <p>
     * The date upon which this signature was verified.
     * 
     */
    @JsonProperty("ValidationDate")
    @JsonPropertyDescription("The date upon which this signature was verified.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> validationDate = new ArrayList<DateType>();
    /**
     * Signature. Validation Time. Time
     * <p>
     * The time at which this signature was verified.
     * 
     */
    @JsonProperty("ValidationTime")
    @JsonPropertyDescription("The time at which this signature was verified.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> validationTime = new ArrayList<TimeType>();
    /**
     * Signature. Validator. Identifier
     * <p>
     * An identifier for the organization, person, service, or server that verified this signature.
     * 
     */
    @JsonProperty("ValidatorID")
    @JsonPropertyDescription("An identifier for the organization, person, service, or server that verified this signature.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> validatorID = new ArrayList<IdentifierType>();
    /**
     * Signature. Canonicalization Method. Text
     * <p>
     * The method used to perform XML canonicalization of this signature.
     * 
     */
    @JsonProperty("CanonicalizationMethod")
    @JsonPropertyDescription("The method used to perform XML canonicalization of this signature.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> canonicalizationMethod = new ArrayList<TextType>();
    /**
     * Signature. Signature Method. Text
     * <p>
     * Text describing the method of signature.
     * 
     */
    @JsonProperty("SignatureMethod")
    @JsonPropertyDescription("Text describing the method of signature.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> signatureMethod = new ArrayList<TextType>();
    /**
     * Signature. Signatory_ Party. Party
     * <p>
     * The signing party.
     * 
     */
    @JsonProperty("SignatoryParty")
    @JsonPropertyDescription("The signing party.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> signatoryParty = new ArrayList<Party>();
    /**
     * Signature. Digital Signature_ Attachment. Attachment
     * <p>
     * The actual encoded signature (e.g., in XMLDsig format).
     * 
     */
    @JsonProperty("DigitalSignatureAttachment")
    @JsonPropertyDescription("The actual encoded signature (e.g., in XMLDsig format).")
    @Size(min = 1, max = 1)
    @Valid
    private List<Attachment> digitalSignatureAttachment = new ArrayList<Attachment>();
    /**
     * Signature. Original_ Document Reference. Document Reference
     * <p>
     * A reference to the document that the signature applies to. For evidentiary purposes, this may be the document image that the signatory party saw when applying their signature.
     * 
     */
    @JsonProperty("OriginalDocumentReference")
    @JsonPropertyDescription("A reference to the document that the signature applies to. For evidentiary purposes, this may be the document image that the signatory party saw when applying their signature.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DocumentReference> originalDocumentReference = new ArrayList<DocumentReference>();

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

    public Signature withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Signature. Identifier
     * <p>
     * An identifier for this signature.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Signature. Identifier
     * <p>
     * An identifier for this signature.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Signature withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Signature. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures; in particular, information regarding the circumstances in which the signature is being used.
     * 
     */
    @JsonProperty("Note")
    public List<TextType> getNote() {
        return note;
    }

    /**
     * Signature. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures; in particular, information regarding the circumstances in which the signature is being used.
     * 
     */
    @JsonProperty("Note")
    public void setNote(List<TextType> note) {
        this.note = note;
    }

    public Signature withNote(List<TextType> note) {
        this.note = note;
        return this;
    }

    /**
     * Signature. Validation Date. Date
     * <p>
     * The date upon which this signature was verified.
     * 
     */
    @JsonProperty("ValidationDate")
    public List<DateType> getValidationDate() {
        return validationDate;
    }

    /**
     * Signature. Validation Date. Date
     * <p>
     * The date upon which this signature was verified.
     * 
     */
    @JsonProperty("ValidationDate")
    public void setValidationDate(List<DateType> validationDate) {
        this.validationDate = validationDate;
    }

    public Signature withValidationDate(List<DateType> validationDate) {
        this.validationDate = validationDate;
        return this;
    }

    /**
     * Signature. Validation Time. Time
     * <p>
     * The time at which this signature was verified.
     * 
     */
    @JsonProperty("ValidationTime")
    public List<TimeType> getValidationTime() {
        return validationTime;
    }

    /**
     * Signature. Validation Time. Time
     * <p>
     * The time at which this signature was verified.
     * 
     */
    @JsonProperty("ValidationTime")
    public void setValidationTime(List<TimeType> validationTime) {
        this.validationTime = validationTime;
    }

    public Signature withValidationTime(List<TimeType> validationTime) {
        this.validationTime = validationTime;
        return this;
    }

    /**
     * Signature. Validator. Identifier
     * <p>
     * An identifier for the organization, person, service, or server that verified this signature.
     * 
     */
    @JsonProperty("ValidatorID")
    public List<IdentifierType> getValidatorID() {
        return validatorID;
    }

    /**
     * Signature. Validator. Identifier
     * <p>
     * An identifier for the organization, person, service, or server that verified this signature.
     * 
     */
    @JsonProperty("ValidatorID")
    public void setValidatorID(List<IdentifierType> validatorID) {
        this.validatorID = validatorID;
    }

    public Signature withValidatorID(List<IdentifierType> validatorID) {
        this.validatorID = validatorID;
        return this;
    }

    /**
     * Signature. Canonicalization Method. Text
     * <p>
     * The method used to perform XML canonicalization of this signature.
     * 
     */
    @JsonProperty("CanonicalizationMethod")
    public List<TextType> getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    /**
     * Signature. Canonicalization Method. Text
     * <p>
     * The method used to perform XML canonicalization of this signature.
     * 
     */
    @JsonProperty("CanonicalizationMethod")
    public void setCanonicalizationMethod(List<TextType> canonicalizationMethod) {
        this.canonicalizationMethod = canonicalizationMethod;
    }

    public Signature withCanonicalizationMethod(List<TextType> canonicalizationMethod) {
        this.canonicalizationMethod = canonicalizationMethod;
        return this;
    }

    /**
     * Signature. Signature Method. Text
     * <p>
     * Text describing the method of signature.
     * 
     */
    @JsonProperty("SignatureMethod")
    public List<TextType> getSignatureMethod() {
        return signatureMethod;
    }

    /**
     * Signature. Signature Method. Text
     * <p>
     * Text describing the method of signature.
     * 
     */
    @JsonProperty("SignatureMethod")
    public void setSignatureMethod(List<TextType> signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public Signature withSignatureMethod(List<TextType> signatureMethod) {
        this.signatureMethod = signatureMethod;
        return this;
    }

    /**
     * Signature. Signatory_ Party. Party
     * <p>
     * The signing party.
     * 
     */
    @JsonProperty("SignatoryParty")
    public List<Party> getSignatoryParty() {
        return signatoryParty;
    }

    /**
     * Signature. Signatory_ Party. Party
     * <p>
     * The signing party.
     * 
     */
    @JsonProperty("SignatoryParty")
    public void setSignatoryParty(List<Party> signatoryParty) {
        this.signatoryParty = signatoryParty;
    }

    public Signature withSignatoryParty(List<Party> signatoryParty) {
        this.signatoryParty = signatoryParty;
        return this;
    }

    /**
     * Signature. Digital Signature_ Attachment. Attachment
     * <p>
     * The actual encoded signature (e.g., in XMLDsig format).
     * 
     */
    @JsonProperty("DigitalSignatureAttachment")
    public List<Attachment> getDigitalSignatureAttachment() {
        return digitalSignatureAttachment;
    }

    /**
     * Signature. Digital Signature_ Attachment. Attachment
     * <p>
     * The actual encoded signature (e.g., in XMLDsig format).
     * 
     */
    @JsonProperty("DigitalSignatureAttachment")
    public void setDigitalSignatureAttachment(List<Attachment> digitalSignatureAttachment) {
        this.digitalSignatureAttachment = digitalSignatureAttachment;
    }

    public Signature withDigitalSignatureAttachment(List<Attachment> digitalSignatureAttachment) {
        this.digitalSignatureAttachment = digitalSignatureAttachment;
        return this;
    }

    /**
     * Signature. Original_ Document Reference. Document Reference
     * <p>
     * A reference to the document that the signature applies to. For evidentiary purposes, this may be the document image that the signatory party saw when applying their signature.
     * 
     */
    @JsonProperty("OriginalDocumentReference")
    public List<DocumentReference> getOriginalDocumentReference() {
        return originalDocumentReference;
    }

    /**
     * Signature. Original_ Document Reference. Document Reference
     * <p>
     * A reference to the document that the signature applies to. For evidentiary purposes, this may be the document image that the signatory party saw when applying their signature.
     * 
     */
    @JsonProperty("OriginalDocumentReference")
    public void setOriginalDocumentReference(List<DocumentReference> originalDocumentReference) {
        this.originalDocumentReference = originalDocumentReference;
    }

    public Signature withOriginalDocumentReference(List<DocumentReference> originalDocumentReference) {
        this.originalDocumentReference = originalDocumentReference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Signature.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("validationDate");
        sb.append('=');
        sb.append(((this.validationDate == null)?"<null>":this.validationDate));
        sb.append(',');
        sb.append("validationTime");
        sb.append('=');
        sb.append(((this.validationTime == null)?"<null>":this.validationTime));
        sb.append(',');
        sb.append("validatorID");
        sb.append('=');
        sb.append(((this.validatorID == null)?"<null>":this.validatorID));
        sb.append(',');
        sb.append("canonicalizationMethod");
        sb.append('=');
        sb.append(((this.canonicalizationMethod == null)?"<null>":this.canonicalizationMethod));
        sb.append(',');
        sb.append("signatureMethod");
        sb.append('=');
        sb.append(((this.signatureMethod == null)?"<null>":this.signatureMethod));
        sb.append(',');
        sb.append("signatoryParty");
        sb.append('=');
        sb.append(((this.signatoryParty == null)?"<null>":this.signatoryParty));
        sb.append(',');
        sb.append("digitalSignatureAttachment");
        sb.append('=');
        sb.append(((this.digitalSignatureAttachment == null)?"<null>":this.digitalSignatureAttachment));
        sb.append(',');
        sb.append("originalDocumentReference");
        sb.append('=');
        sb.append(((this.originalDocumentReference == null)?"<null>":this.originalDocumentReference));
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
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.canonicalizationMethod == null)? 0 :this.canonicalizationMethod.hashCode()));
        result = ((result* 31)+((this.validationTime == null)? 0 :this.validationTime.hashCode()));
        result = ((result* 31)+((this.originalDocumentReference == null)? 0 :this.originalDocumentReference.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.validatorID == null)? 0 :this.validatorID.hashCode()));
        result = ((result* 31)+((this.signatureMethod == null)? 0 :this.signatureMethod.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.validationDate == null)? 0 :this.validationDate.hashCode()));
        result = ((result* 31)+((this.signatoryParty == null)? 0 :this.signatoryParty.hashCode()));
        result = ((result* 31)+((this.digitalSignatureAttachment == null)? 0 :this.digitalSignatureAttachment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Signature) == false) {
            return false;
        }
        Signature rhs = ((Signature) other);
        return ((((((((((((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note)))&&((this.canonicalizationMethod == rhs.canonicalizationMethod)||((this.canonicalizationMethod!= null)&&this.canonicalizationMethod.equals(rhs.canonicalizationMethod))))&&((this.validationTime == rhs.validationTime)||((this.validationTime!= null)&&this.validationTime.equals(rhs.validationTime))))&&((this.originalDocumentReference == rhs.originalDocumentReference)||((this.originalDocumentReference!= null)&&this.originalDocumentReference.equals(rhs.originalDocumentReference))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.validatorID == rhs.validatorID)||((this.validatorID!= null)&&this.validatorID.equals(rhs.validatorID))))&&((this.signatureMethod == rhs.signatureMethod)||((this.signatureMethod!= null)&&this.signatureMethod.equals(rhs.signatureMethod))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.validationDate == rhs.validationDate)||((this.validationDate!= null)&&this.validationDate.equals(rhs.validationDate))))&&((this.signatoryParty == rhs.signatoryParty)||((this.signatoryParty!= null)&&this.signatoryParty.equals(rhs.signatoryParty))))&&((this.digitalSignatureAttachment == rhs.digitalSignatureAttachment)||((this.digitalSignatureAttachment!= null)&&this.digitalSignatureAttachment.equals(rhs.digitalSignatureAttachment))));
    }

}
