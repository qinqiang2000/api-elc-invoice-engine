
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
 * Contract. Details
 * <p>
 * A class to describe a contract.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "IssueDate",
    "IssueTime",
    "NominationDate",
    "NominationTime",
    "ContractTypeCode",
    "ContractType",
    "Note",
    "VersionID",
    "Description",
    "ValidityPeriod",
    "ContractDocumentReference",
    "NominationPeriod",
    "ContractualDelivery"
})
@Generated("jsonschema2pojo")
public class Contract {

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
     * Contract. Identifier
     * <p>
     * An identifier for this contract.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this contract.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Contract. Issue Date. Date
     * <p>
     * The date on which this contract was issued.
     * 
     */
    @JsonProperty("IssueDate")
    @JsonPropertyDescription("The date on which this contract was issued.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> issueDate = new ArrayList<DateType>();
    /**
     * Contract. Issue Time. Time
     * <p>
     * The time at which this contract was issued.
     * 
     */
    @JsonProperty("IssueTime")
    @JsonPropertyDescription("The time at which this contract was issued.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> issueTime = new ArrayList<TimeType>();
    /**
     * Contract. Nomination Date. Date
     * <p>
     * In a transportation contract, the deadline date by which the services referred to in the transport execution plan have to be booked. For example, if this service is a carrier service scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011.
     * 
     */
    @JsonProperty("NominationDate")
    @JsonPropertyDescription("In a transportation contract, the deadline date by which the services referred to in the transport execution plan have to be booked. For example, if this service is a carrier service scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> nominationDate = new ArrayList<DateType>();
    /**
     * Contract. Nomination Time. Time
     * <p>
     * In a transportation contract, the deadline time by which the services referred to in the transport execution plan have to be booked. For example, if this service is a carrier service scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011 and the nomination time 4 p.m. at the latest.
     * 
     */
    @JsonProperty("NominationTime")
    @JsonPropertyDescription("In a transportation contract, the deadline time by which the services referred to in the transport execution plan have to be booked. For example, if this service is a carrier service scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011 and the nomination time 4 p.m. at the latest.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> nominationTime = new ArrayList<TimeType>();
    /**
     * Contract. Contract Type Code. Code
     * <p>
     * The type of this contract, expressed as a code, such as "Cost plus award fee" and "Cost plus fixed fee" from UNCEFACT Contract Type code list.
     * 
     */
    @JsonProperty("ContractTypeCode")
    @JsonPropertyDescription("The type of this contract, expressed as a code, such as \"Cost plus award fee\" and \"Cost plus fixed fee\" from UNCEFACT Contract Type code list.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> contractTypeCode = new ArrayList<CodeType>();
    /**
     * Contract. Contract Type. Text
     * <p>
     * The type of this contract, expressed as text, such as "Cost plus award fee" and "Cost plus fixed fee" from UNCEFACT Contract Type code list.
     * 
     */
    @JsonProperty("ContractType")
    @JsonPropertyDescription("The type of this contract, expressed as text, such as \"Cost plus award fee\" and \"Cost plus fixed fee\" from UNCEFACT Contract Type code list.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> contractType = new ArrayList<TextType>();
    /**
     * Contract. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    @JsonPropertyDescription("Free-form text conveying information that is not contained explicitly in other structures.")
    @Size(min = 1)
    @Valid
    private List<TextType> note = new ArrayList<TextType>();
    /**
     * Contract. Version. Identifier
     * <p>
     * An identifier for the current version of this contract.
     * 
     */
    @JsonProperty("VersionID")
    @JsonPropertyDescription("An identifier for the current version of this contract.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> versionID = new ArrayList<IdentifierType>();
    /**
     * Contract. Description. Text
     * <p>
     * Text describing this contract.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("Text describing this contract.")
    @Size(min = 1)
    @Valid
    private List<TextType> description = new ArrayList<TextType>();
    /**
     * Contract. Validity_ Period. Period
     * <p>
     * The period during which this contract is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    @JsonPropertyDescription("The period during which this contract is valid.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> validityPeriod = new ArrayList<Period>();
    /**
     * Contract. Contract_ Document Reference. Document Reference
     * <p>
     * A reference to a contract document.
     * 
     */
    @JsonProperty("ContractDocumentReference")
    @JsonPropertyDescription("A reference to a contract document.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> contractDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Contract. Nomination_ Period. Period
     * <p>
     * In a transportation contract, the period required to book the services specified in the contract before the services can begin.
     * 
     */
    @JsonProperty("NominationPeriod")
    @JsonPropertyDescription("In a transportation contract, the period required to book the services specified in the contract before the services can begin.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> nominationPeriod = new ArrayList<Period>();
    /**
     * Contract. Contractual_ Delivery. Delivery
     * <p>
     * In a transportation contract, the delivery of the services required to book the services specified in the contract.
     * 
     */
    @JsonProperty("ContractualDelivery")
    @JsonPropertyDescription("In a transportation contract, the delivery of the services required to book the services specified in the contract.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Delivery> contractualDelivery = new ArrayList<Delivery>();

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

    public Contract withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Contract. Identifier
     * <p>
     * An identifier for this contract.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Contract. Identifier
     * <p>
     * An identifier for this contract.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Contract withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Contract. Issue Date. Date
     * <p>
     * The date on which this contract was issued.
     * 
     */
    @JsonProperty("IssueDate")
    public List<DateType> getIssueDate() {
        return issueDate;
    }

    /**
     * Contract. Issue Date. Date
     * <p>
     * The date on which this contract was issued.
     * 
     */
    @JsonProperty("IssueDate")
    public void setIssueDate(List<DateType> issueDate) {
        this.issueDate = issueDate;
    }

    public Contract withIssueDate(List<DateType> issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * Contract. Issue Time. Time
     * <p>
     * The time at which this contract was issued.
     * 
     */
    @JsonProperty("IssueTime")
    public List<TimeType> getIssueTime() {
        return issueTime;
    }

    /**
     * Contract. Issue Time. Time
     * <p>
     * The time at which this contract was issued.
     * 
     */
    @JsonProperty("IssueTime")
    public void setIssueTime(List<TimeType> issueTime) {
        this.issueTime = issueTime;
    }

    public Contract withIssueTime(List<TimeType> issueTime) {
        this.issueTime = issueTime;
        return this;
    }

    /**
     * Contract. Nomination Date. Date
     * <p>
     * In a transportation contract, the deadline date by which the services referred to in the transport execution plan have to be booked. For example, if this service is a carrier service scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011.
     * 
     */
    @JsonProperty("NominationDate")
    public List<DateType> getNominationDate() {
        return nominationDate;
    }

    /**
     * Contract. Nomination Date. Date
     * <p>
     * In a transportation contract, the deadline date by which the services referred to in the transport execution plan have to be booked. For example, if this service is a carrier service scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011.
     * 
     */
    @JsonProperty("NominationDate")
    public void setNominationDate(List<DateType> nominationDate) {
        this.nominationDate = nominationDate;
    }

    public Contract withNominationDate(List<DateType> nominationDate) {
        this.nominationDate = nominationDate;
        return this;
    }

    /**
     * Contract. Nomination Time. Time
     * <p>
     * In a transportation contract, the deadline time by which the services referred to in the transport execution plan have to be booked. For example, if this service is a carrier service scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011 and the nomination time 4 p.m. at the latest.
     * 
     */
    @JsonProperty("NominationTime")
    public List<TimeType> getNominationTime() {
        return nominationTime;
    }

    /**
     * Contract. Nomination Time. Time
     * <p>
     * In a transportation contract, the deadline time by which the services referred to in the transport execution plan have to be booked. For example, if this service is a carrier service scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011 and the nomination time 4 p.m. at the latest.
     * 
     */
    @JsonProperty("NominationTime")
    public void setNominationTime(List<TimeType> nominationTime) {
        this.nominationTime = nominationTime;
    }

    public Contract withNominationTime(List<TimeType> nominationTime) {
        this.nominationTime = nominationTime;
        return this;
    }

    /**
     * Contract. Contract Type Code. Code
     * <p>
     * The type of this contract, expressed as a code, such as "Cost plus award fee" and "Cost plus fixed fee" from UNCEFACT Contract Type code list.
     * 
     */
    @JsonProperty("ContractTypeCode")
    public List<CodeType> getContractTypeCode() {
        return contractTypeCode;
    }

    /**
     * Contract. Contract Type Code. Code
     * <p>
     * The type of this contract, expressed as a code, such as "Cost plus award fee" and "Cost plus fixed fee" from UNCEFACT Contract Type code list.
     * 
     */
    @JsonProperty("ContractTypeCode")
    public void setContractTypeCode(List<CodeType> contractTypeCode) {
        this.contractTypeCode = contractTypeCode;
    }

    public Contract withContractTypeCode(List<CodeType> contractTypeCode) {
        this.contractTypeCode = contractTypeCode;
        return this;
    }

    /**
     * Contract. Contract Type. Text
     * <p>
     * The type of this contract, expressed as text, such as "Cost plus award fee" and "Cost plus fixed fee" from UNCEFACT Contract Type code list.
     * 
     */
    @JsonProperty("ContractType")
    public List<TextType> getContractType() {
        return contractType;
    }

    /**
     * Contract. Contract Type. Text
     * <p>
     * The type of this contract, expressed as text, such as "Cost plus award fee" and "Cost plus fixed fee" from UNCEFACT Contract Type code list.
     * 
     */
    @JsonProperty("ContractType")
    public void setContractType(List<TextType> contractType) {
        this.contractType = contractType;
    }

    public Contract withContractType(List<TextType> contractType) {
        this.contractType = contractType;
        return this;
    }

    /**
     * Contract. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    public List<TextType> getNote() {
        return note;
    }

    /**
     * Contract. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    public void setNote(List<TextType> note) {
        this.note = note;
    }

    public Contract withNote(List<TextType> note) {
        this.note = note;
        return this;
    }

    /**
     * Contract. Version. Identifier
     * <p>
     * An identifier for the current version of this contract.
     * 
     */
    @JsonProperty("VersionID")
    public List<IdentifierType> getVersionID() {
        return versionID;
    }

    /**
     * Contract. Version. Identifier
     * <p>
     * An identifier for the current version of this contract.
     * 
     */
    @JsonProperty("VersionID")
    public void setVersionID(List<IdentifierType> versionID) {
        this.versionID = versionID;
    }

    public Contract withVersionID(List<IdentifierType> versionID) {
        this.versionID = versionID;
        return this;
    }

    /**
     * Contract. Description. Text
     * <p>
     * Text describing this contract.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * Contract. Description. Text
     * <p>
     * Text describing this contract.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public Contract withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    /**
     * Contract. Validity_ Period. Period
     * <p>
     * The period during which this contract is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    public List<Period> getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Contract. Validity_ Period. Period
     * <p>
     * The period during which this contract is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    public void setValidityPeriod(List<Period> validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public Contract withValidityPeriod(List<Period> validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Contract. Contract_ Document Reference. Document Reference
     * <p>
     * A reference to a contract document.
     * 
     */
    @JsonProperty("ContractDocumentReference")
    public List<DocumentReference> getContractDocumentReference() {
        return contractDocumentReference;
    }

    /**
     * Contract. Contract_ Document Reference. Document Reference
     * <p>
     * A reference to a contract document.
     * 
     */
    @JsonProperty("ContractDocumentReference")
    public void setContractDocumentReference(List<DocumentReference> contractDocumentReference) {
        this.contractDocumentReference = contractDocumentReference;
    }

    public Contract withContractDocumentReference(List<DocumentReference> contractDocumentReference) {
        this.contractDocumentReference = contractDocumentReference;
        return this;
    }

    /**
     * Contract. Nomination_ Period. Period
     * <p>
     * In a transportation contract, the period required to book the services specified in the contract before the services can begin.
     * 
     */
    @JsonProperty("NominationPeriod")
    public List<Period> getNominationPeriod() {
        return nominationPeriod;
    }

    /**
     * Contract. Nomination_ Period. Period
     * <p>
     * In a transportation contract, the period required to book the services specified in the contract before the services can begin.
     * 
     */
    @JsonProperty("NominationPeriod")
    public void setNominationPeriod(List<Period> nominationPeriod) {
        this.nominationPeriod = nominationPeriod;
    }

    public Contract withNominationPeriod(List<Period> nominationPeriod) {
        this.nominationPeriod = nominationPeriod;
        return this;
    }

    /**
     * Contract. Contractual_ Delivery. Delivery
     * <p>
     * In a transportation contract, the delivery of the services required to book the services specified in the contract.
     * 
     */
    @JsonProperty("ContractualDelivery")
    public List<Delivery> getContractualDelivery() {
        return contractualDelivery;
    }

    /**
     * Contract. Contractual_ Delivery. Delivery
     * <p>
     * In a transportation contract, the delivery of the services required to book the services specified in the contract.
     * 
     */
    @JsonProperty("ContractualDelivery")
    public void setContractualDelivery(List<Delivery> contractualDelivery) {
        this.contractualDelivery = contractualDelivery;
    }

    public Contract withContractualDelivery(List<Delivery> contractualDelivery) {
        this.contractualDelivery = contractualDelivery;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contract.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("issueDate");
        sb.append('=');
        sb.append(((this.issueDate == null)?"<null>":this.issueDate));
        sb.append(',');
        sb.append("issueTime");
        sb.append('=');
        sb.append(((this.issueTime == null)?"<null>":this.issueTime));
        sb.append(',');
        sb.append("nominationDate");
        sb.append('=');
        sb.append(((this.nominationDate == null)?"<null>":this.nominationDate));
        sb.append(',');
        sb.append("nominationTime");
        sb.append('=');
        sb.append(((this.nominationTime == null)?"<null>":this.nominationTime));
        sb.append(',');
        sb.append("contractTypeCode");
        sb.append('=');
        sb.append(((this.contractTypeCode == null)?"<null>":this.contractTypeCode));
        sb.append(',');
        sb.append("contractType");
        sb.append('=');
        sb.append(((this.contractType == null)?"<null>":this.contractType));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("versionID");
        sb.append('=');
        sb.append(((this.versionID == null)?"<null>":this.versionID));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("validityPeriod");
        sb.append('=');
        sb.append(((this.validityPeriod == null)?"<null>":this.validityPeriod));
        sb.append(',');
        sb.append("contractDocumentReference");
        sb.append('=');
        sb.append(((this.contractDocumentReference == null)?"<null>":this.contractDocumentReference));
        sb.append(',');
        sb.append("nominationPeriod");
        sb.append('=');
        sb.append(((this.nominationPeriod == null)?"<null>":this.nominationPeriod));
        sb.append(',');
        sb.append("contractualDelivery");
        sb.append('=');
        sb.append(((this.contractualDelivery == null)?"<null>":this.contractualDelivery));
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
        result = ((result* 31)+((this.contractDocumentReference == null)? 0 :this.contractDocumentReference.hashCode()));
        result = ((result* 31)+((this.issueTime == null)? 0 :this.issueTime.hashCode()));
        result = ((result* 31)+((this.contractType == null)? 0 :this.contractType.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.contractualDelivery == null)? 0 :this.contractualDelivery.hashCode()));
        result = ((result* 31)+((this.nominationDate == null)? 0 :this.nominationDate.hashCode()));
        result = ((result* 31)+((this.nominationPeriod == null)? 0 :this.nominationPeriod.hashCode()));
        result = ((result* 31)+((this.validityPeriod == null)? 0 :this.validityPeriod.hashCode()));
        result = ((result* 31)+((this.nominationTime == null)? 0 :this.nominationTime.hashCode()));
        result = ((result* 31)+((this.versionID == null)? 0 :this.versionID.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.issueDate == null)? 0 :this.issueDate.hashCode()));
        result = ((result* 31)+((this.contractTypeCode == null)? 0 :this.contractTypeCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contract) == false) {
            return false;
        }
        Contract rhs = ((Contract) other);
        return ((((((((((((((((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note)))&&((this.contractDocumentReference == rhs.contractDocumentReference)||((this.contractDocumentReference!= null)&&this.contractDocumentReference.equals(rhs.contractDocumentReference))))&&((this.issueTime == rhs.issueTime)||((this.issueTime!= null)&&this.issueTime.equals(rhs.issueTime))))&&((this.contractType == rhs.contractType)||((this.contractType!= null)&&this.contractType.equals(rhs.contractType))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.contractualDelivery == rhs.contractualDelivery)||((this.contractualDelivery!= null)&&this.contractualDelivery.equals(rhs.contractualDelivery))))&&((this.nominationDate == rhs.nominationDate)||((this.nominationDate!= null)&&this.nominationDate.equals(rhs.nominationDate))))&&((this.nominationPeriod == rhs.nominationPeriod)||((this.nominationPeriod!= null)&&this.nominationPeriod.equals(rhs.nominationPeriod))))&&((this.validityPeriod == rhs.validityPeriod)||((this.validityPeriod!= null)&&this.validityPeriod.equals(rhs.validityPeriod))))&&((this.nominationTime == rhs.nominationTime)||((this.nominationTime!= null)&&this.nominationTime.equals(rhs.nominationTime))))&&((this.versionID == rhs.versionID)||((this.versionID!= null)&&this.versionID.equals(rhs.versionID))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.issueDate == rhs.issueDate)||((this.issueDate!= null)&&this.issueDate.equals(rhs.issueDate))))&&((this.contractTypeCode == rhs.contractTypeCode)||((this.contractTypeCode!= null)&&this.contractTypeCode.equals(rhs.contractTypeCode))));
    }

}
