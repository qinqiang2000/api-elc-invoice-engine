
package com.kingdee.fpy.model.ubl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Size;


/**
 * Result Of Verification. Details
 * <p>
 * A class to describe the result of an attempt to verify a signature.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ValidatorID",
    "ValidationResultCode",
    "ValidationDate",
    "ValidationTime",
    "ValidateProcess",
    "ValidateTool",
    "ValidateToolVersion",
    "SignatoryParty"
})
@Generated("jsonschema2pojo")
public class ResultOfVerification {

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
     * Result Of Verification. Validator. Identifier
     * <p>
     * An identifier for the organization, person, service, or server that verified the signature.
     * 
     */
    @JsonProperty("ValidatorID")
    @JsonPropertyDescription("An identifier for the organization, person, service, or server that verified the signature.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> validatorID = new ArrayList<IdentifierType>();
    /**
     * Result Of Verification. Validation_ Result Code. Code
     * <p>
     * A code signifying the result of the verification.
     * 
     */
    @JsonProperty("ValidationResultCode")
    @JsonPropertyDescription("A code signifying the result of the verification.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> validationResultCode = new ArrayList<CodeType>();
    /**
     * Result Of Verification. Validation Date. Date
     * <p>
     * The date upon which verification took place.
     * 
     */
    @JsonProperty("ValidationDate")
    @JsonPropertyDescription("The date upon which verification took place.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> validationDate = new ArrayList<DateType>();
    /**
     * Result Of Verification. Validation Time. Time
     * <p>
     * The time at which verification took place.
     * 
     */
    @JsonProperty("ValidationTime")
    @JsonPropertyDescription("The time at which verification took place.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> validationTime = new ArrayList<TimeType>();
    /**
     * Result Of Verification. Validate_ Process. Text
     * <p>
     * The verification process.
     * 
     */
    @JsonProperty("ValidateProcess")
    @JsonPropertyDescription("The verification process.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> validateProcess = new ArrayList<TextType>();
    /**
     * Result Of Verification. Validate_ Tool. Text
     * <p>
     * The tool used to verify the signature.
     * 
     */
    @JsonProperty("ValidateTool")
    @JsonPropertyDescription("The tool used to verify the signature.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> validateTool = new ArrayList<TextType>();
    /**
     * Result Of Verification. Validate_ Tool Version. Text
     * <p>
     * The version of the tool used to verify the signature.
     * 
     */
    @JsonProperty("ValidateToolVersion")
    @JsonPropertyDescription("The version of the tool used to verify the signature.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> validateToolVersion = new ArrayList<TextType>();
    /**
     * Result Of Verification. Signatory_ Party. Party
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

    public ResultOfVerification withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Result Of Verification. Validator. Identifier
     * <p>
     * An identifier for the organization, person, service, or server that verified the signature.
     * 
     */
    @JsonProperty("ValidatorID")
    public List<IdentifierType> getValidatorID() {
        return validatorID;
    }

    /**
     * Result Of Verification. Validator. Identifier
     * <p>
     * An identifier for the organization, person, service, or server that verified the signature.
     * 
     */
    @JsonProperty("ValidatorID")
    public void setValidatorID(List<IdentifierType> validatorID) {
        this.validatorID = validatorID;
    }

    public ResultOfVerification withValidatorID(List<IdentifierType> validatorID) {
        this.validatorID = validatorID;
        return this;
    }

    /**
     * Result Of Verification. Validation_ Result Code. Code
     * <p>
     * A code signifying the result of the verification.
     * 
     */
    @JsonProperty("ValidationResultCode")
    public List<CodeType> getValidationResultCode() {
        return validationResultCode;
    }

    /**
     * Result Of Verification. Validation_ Result Code. Code
     * <p>
     * A code signifying the result of the verification.
     * 
     */
    @JsonProperty("ValidationResultCode")
    public void setValidationResultCode(List<CodeType> validationResultCode) {
        this.validationResultCode = validationResultCode;
    }

    public ResultOfVerification withValidationResultCode(List<CodeType> validationResultCode) {
        this.validationResultCode = validationResultCode;
        return this;
    }

    /**
     * Result Of Verification. Validation Date. Date
     * <p>
     * The date upon which verification took place.
     * 
     */
    @JsonProperty("ValidationDate")
    public List<DateType> getValidationDate() {
        return validationDate;
    }

    /**
     * Result Of Verification. Validation Date. Date
     * <p>
     * The date upon which verification took place.
     * 
     */
    @JsonProperty("ValidationDate")
    public void setValidationDate(List<DateType> validationDate) {
        this.validationDate = validationDate;
    }

    public ResultOfVerification withValidationDate(List<DateType> validationDate) {
        this.validationDate = validationDate;
        return this;
    }

    /**
     * Result Of Verification. Validation Time. Time
     * <p>
     * The time at which verification took place.
     * 
     */
    @JsonProperty("ValidationTime")
    public List<TimeType> getValidationTime() {
        return validationTime;
    }

    /**
     * Result Of Verification. Validation Time. Time
     * <p>
     * The time at which verification took place.
     * 
     */
    @JsonProperty("ValidationTime")
    public void setValidationTime(List<TimeType> validationTime) {
        this.validationTime = validationTime;
    }

    public ResultOfVerification withValidationTime(List<TimeType> validationTime) {
        this.validationTime = validationTime;
        return this;
    }

    /**
     * Result Of Verification. Validate_ Process. Text
     * <p>
     * The verification process.
     * 
     */
    @JsonProperty("ValidateProcess")
    public List<TextType> getValidateProcess() {
        return validateProcess;
    }

    /**
     * Result Of Verification. Validate_ Process. Text
     * <p>
     * The verification process.
     * 
     */
    @JsonProperty("ValidateProcess")
    public void setValidateProcess(List<TextType> validateProcess) {
        this.validateProcess = validateProcess;
    }

    public ResultOfVerification withValidateProcess(List<TextType> validateProcess) {
        this.validateProcess = validateProcess;
        return this;
    }

    /**
     * Result Of Verification. Validate_ Tool. Text
     * <p>
     * The tool used to verify the signature.
     * 
     */
    @JsonProperty("ValidateTool")
    public List<TextType> getValidateTool() {
        return validateTool;
    }

    /**
     * Result Of Verification. Validate_ Tool. Text
     * <p>
     * The tool used to verify the signature.
     * 
     */
    @JsonProperty("ValidateTool")
    public void setValidateTool(List<TextType> validateTool) {
        this.validateTool = validateTool;
    }

    public ResultOfVerification withValidateTool(List<TextType> validateTool) {
        this.validateTool = validateTool;
        return this;
    }

    /**
     * Result Of Verification. Validate_ Tool Version. Text
     * <p>
     * The version of the tool used to verify the signature.
     * 
     */
    @JsonProperty("ValidateToolVersion")
    public List<TextType> getValidateToolVersion() {
        return validateToolVersion;
    }

    /**
     * Result Of Verification. Validate_ Tool Version. Text
     * <p>
     * The version of the tool used to verify the signature.
     * 
     */
    @JsonProperty("ValidateToolVersion")
    public void setValidateToolVersion(List<TextType> validateToolVersion) {
        this.validateToolVersion = validateToolVersion;
    }

    public ResultOfVerification withValidateToolVersion(List<TextType> validateToolVersion) {
        this.validateToolVersion = validateToolVersion;
        return this;
    }

    /**
     * Result Of Verification. Signatory_ Party. Party
     * <p>
     * The signing party.
     * 
     */
    @JsonProperty("SignatoryParty")
    public List<Party> getSignatoryParty() {
        return signatoryParty;
    }

    /**
     * Result Of Verification. Signatory_ Party. Party
     * <p>
     * The signing party.
     * 
     */
    @JsonProperty("SignatoryParty")
    public void setSignatoryParty(List<Party> signatoryParty) {
        this.signatoryParty = signatoryParty;
    }

    public ResultOfVerification withSignatoryParty(List<Party> signatoryParty) {
        this.signatoryParty = signatoryParty;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResultOfVerification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("validatorID");
        sb.append('=');
        sb.append(((this.validatorID == null)?"<null>":this.validatorID));
        sb.append(',');
        sb.append("validationResultCode");
        sb.append('=');
        sb.append(((this.validationResultCode == null)?"<null>":this.validationResultCode));
        sb.append(',');
        sb.append("validationDate");
        sb.append('=');
        sb.append(((this.validationDate == null)?"<null>":this.validationDate));
        sb.append(',');
        sb.append("validationTime");
        sb.append('=');
        sb.append(((this.validationTime == null)?"<null>":this.validationTime));
        sb.append(',');
        sb.append("validateProcess");
        sb.append('=');
        sb.append(((this.validateProcess == null)?"<null>":this.validateProcess));
        sb.append(',');
        sb.append("validateTool");
        sb.append('=');
        sb.append(((this.validateTool == null)?"<null>":this.validateTool));
        sb.append(',');
        sb.append("validateToolVersion");
        sb.append('=');
        sb.append(((this.validateToolVersion == null)?"<null>":this.validateToolVersion));
        sb.append(',');
        sb.append("signatoryParty");
        sb.append('=');
        sb.append(((this.signatoryParty == null)?"<null>":this.signatoryParty));
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
        result = ((result* 31)+((this.validateProcess == null)? 0 :this.validateProcess.hashCode()));
        result = ((result* 31)+((this.validationTime == null)? 0 :this.validationTime.hashCode()));
        result = ((result* 31)+((this.validateToolVersion == null)? 0 :this.validateToolVersion.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.validatorID == null)? 0 :this.validatorID.hashCode()));
        result = ((result* 31)+((this.validationResultCode == null)? 0 :this.validationResultCode.hashCode()));
        result = ((result* 31)+((this.validationDate == null)? 0 :this.validationDate.hashCode()));
        result = ((result* 31)+((this.validateTool == null)? 0 :this.validateTool.hashCode()));
        result = ((result* 31)+((this.signatoryParty == null)? 0 :this.signatoryParty.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResultOfVerification) == false) {
            return false;
        }
        ResultOfVerification rhs = ((ResultOfVerification) other);
        return ((((((((((this.validateProcess == rhs.validateProcess)||((this.validateProcess!= null)&&this.validateProcess.equals(rhs.validateProcess)))&&((this.validationTime == rhs.validationTime)||((this.validationTime!= null)&&this.validationTime.equals(rhs.validationTime))))&&((this.validateToolVersion == rhs.validateToolVersion)||((this.validateToolVersion!= null)&&this.validateToolVersion.equals(rhs.validateToolVersion))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.validatorID == rhs.validatorID)||((this.validatorID!= null)&&this.validatorID.equals(rhs.validatorID))))&&((this.validationResultCode == rhs.validationResultCode)||((this.validationResultCode!= null)&&this.validationResultCode.equals(rhs.validationResultCode))))&&((this.validationDate == rhs.validationDate)||((this.validationDate!= null)&&this.validationDate.equals(rhs.validationDate))))&&((this.validateTool == rhs.validateTool)||((this.validateTool!= null)&&this.validateTool.equals(rhs.validateTool))))&&((this.signatoryParty == rhs.signatoryParty)||((this.signatoryParty!= null)&&this.signatoryParty.equals(rhs.signatoryParty))));
    }

}
