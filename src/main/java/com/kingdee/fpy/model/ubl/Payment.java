
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
 * Payment. Details
 * <p>
 * A class to describe a payment.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "PaidAmount",
    "ReceivedDate",
    "PaidDate",
    "PaidTime",
    "InstructionID"
})
@Generated("jsonschema2pojo")
public class Payment {

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
     * Payment. Identifier
     * <p>
     * An identifier for this payment.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this payment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Payment. Paid_ Amount. Amount
     * <p>
     * The amount of this payment.
     * 
     */
    @JsonProperty("PaidAmount")
    @JsonPropertyDescription("The amount of this payment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> paidAmount = new ArrayList<AmountType>();
    /**
     * Payment. Received_ Date. Date
     * <p>
     * The date on which this payment was received.
     * 
     */
    @JsonProperty("ReceivedDate")
    @JsonPropertyDescription("The date on which this payment was received.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> receivedDate = new ArrayList<DateType>();
    /**
     * Payment. Paid_ Date. Date
     * <p>
     * The date on which this payment was made.
     * 
     */
    @JsonProperty("PaidDate")
    @JsonPropertyDescription("The date on which this payment was made.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> paidDate = new ArrayList<DateType>();
    /**
     * Payment. Paid_ Time. Time
     * <p>
     * The time at which this payment was made.
     * 
     */
    @JsonProperty("PaidTime")
    @JsonPropertyDescription("The time at which this payment was made.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> paidTime = new ArrayList<TimeType>();
    /**
     * Payment. Instruction Identifier. Identifier
     * <p>
     * An identifier for the payment instruction.
     * 
     */
    @JsonProperty("InstructionID")
    @JsonPropertyDescription("An identifier for the payment instruction.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> instructionID = new ArrayList<IdentifierType>();

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

    public Payment withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Payment. Identifier
     * <p>
     * An identifier for this payment.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Payment. Identifier
     * <p>
     * An identifier for this payment.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Payment withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Payment. Paid_ Amount. Amount
     * <p>
     * The amount of this payment.
     * 
     */
    @JsonProperty("PaidAmount")
    public List<AmountType> getPaidAmount() {
        return paidAmount;
    }

    /**
     * Payment. Paid_ Amount. Amount
     * <p>
     * The amount of this payment.
     * 
     */
    @JsonProperty("PaidAmount")
    public void setPaidAmount(List<AmountType> paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Payment withPaidAmount(List<AmountType> paidAmount) {
        this.paidAmount = paidAmount;
        return this;
    }

    /**
     * Payment. Received_ Date. Date
     * <p>
     * The date on which this payment was received.
     * 
     */
    @JsonProperty("ReceivedDate")
    public List<DateType> getReceivedDate() {
        return receivedDate;
    }

    /**
     * Payment. Received_ Date. Date
     * <p>
     * The date on which this payment was received.
     * 
     */
    @JsonProperty("ReceivedDate")
    public void setReceivedDate(List<DateType> receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Payment withReceivedDate(List<DateType> receivedDate) {
        this.receivedDate = receivedDate;
        return this;
    }

    /**
     * Payment. Paid_ Date. Date
     * <p>
     * The date on which this payment was made.
     * 
     */
    @JsonProperty("PaidDate")
    public List<DateType> getPaidDate() {
        return paidDate;
    }

    /**
     * Payment. Paid_ Date. Date
     * <p>
     * The date on which this payment was made.
     * 
     */
    @JsonProperty("PaidDate")
    public void setPaidDate(List<DateType> paidDate) {
        this.paidDate = paidDate;
    }

    public Payment withPaidDate(List<DateType> paidDate) {
        this.paidDate = paidDate;
        return this;
    }

    /**
     * Payment. Paid_ Time. Time
     * <p>
     * The time at which this payment was made.
     * 
     */
    @JsonProperty("PaidTime")
    public List<TimeType> getPaidTime() {
        return paidTime;
    }

    /**
     * Payment. Paid_ Time. Time
     * <p>
     * The time at which this payment was made.
     * 
     */
    @JsonProperty("PaidTime")
    public void setPaidTime(List<TimeType> paidTime) {
        this.paidTime = paidTime;
    }

    public Payment withPaidTime(List<TimeType> paidTime) {
        this.paidTime = paidTime;
        return this;
    }

    /**
     * Payment. Instruction Identifier. Identifier
     * <p>
     * An identifier for the payment instruction.
     * 
     */
    @JsonProperty("InstructionID")
    public List<IdentifierType> getInstructionID() {
        return instructionID;
    }

    /**
     * Payment. Instruction Identifier. Identifier
     * <p>
     * An identifier for the payment instruction.
     * 
     */
    @JsonProperty("InstructionID")
    public void setInstructionID(List<IdentifierType> instructionID) {
        this.instructionID = instructionID;
    }

    public Payment withInstructionID(List<IdentifierType> instructionID) {
        this.instructionID = instructionID;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Payment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("paidAmount");
        sb.append('=');
        sb.append(((this.paidAmount == null)?"<null>":this.paidAmount));
        sb.append(',');
        sb.append("receivedDate");
        sb.append('=');
        sb.append(((this.receivedDate == null)?"<null>":this.receivedDate));
        sb.append(',');
        sb.append("paidDate");
        sb.append('=');
        sb.append(((this.paidDate == null)?"<null>":this.paidDate));
        sb.append(',');
        sb.append("paidTime");
        sb.append('=');
        sb.append(((this.paidTime == null)?"<null>":this.paidTime));
        sb.append(',');
        sb.append("instructionID");
        sb.append('=');
        sb.append(((this.instructionID == null)?"<null>":this.instructionID));
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
        result = ((result* 31)+((this.paidDate == null)? 0 :this.paidDate.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.instructionID == null)? 0 :this.instructionID.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.paidTime == null)? 0 :this.paidTime.hashCode()));
        result = ((result* 31)+((this.paidAmount == null)? 0 :this.paidAmount.hashCode()));
        result = ((result* 31)+((this.receivedDate == null)? 0 :this.receivedDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payment) == false) {
            return false;
        }
        Payment rhs = ((Payment) other);
        return ((((((((this.paidDate == rhs.paidDate)||((this.paidDate!= null)&&this.paidDate.equals(rhs.paidDate)))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.instructionID == rhs.instructionID)||((this.instructionID!= null)&&this.instructionID.equals(rhs.instructionID))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.paidTime == rhs.paidTime)||((this.paidTime!= null)&&this.paidTime.equals(rhs.paidTime))))&&((this.paidAmount == rhs.paidAmount)||((this.paidAmount!= null)&&this.paidAmount.equals(rhs.paidAmount))))&&((this.receivedDate == rhs.receivedDate)||((this.receivedDate!= null)&&this.receivedDate.equals(rhs.receivedDate))));
    }

}
