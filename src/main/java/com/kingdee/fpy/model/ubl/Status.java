
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
 * Status. Details
 * <p>
 * A class to describe the condition or position of an object.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ConditionCode",
    "ReferenceDate",
    "ReferenceTime",
    "Description",
    "StatusReasonCode",
    "StatusReason",
    "SequenceID",
    "Text",
    "IndicationIndicator",
    "Percent",
    "ReliabilityPercent",
    "Condition"
})
@Generated("jsonschema2pojo")
public class Status {

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
     * Status. Condition Code. Code
     * <p>
     * Specifies the status condition of the related object.
     * 
     */
    @JsonProperty("ConditionCode")
    @JsonPropertyDescription("Specifies the status condition of the related object.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> conditionCode = new ArrayList<CodeType>();
    /**
     * Status. Reference Date. Date
     * <p>
     * The reference date for this status.
     * 
     */
    @JsonProperty("ReferenceDate")
    @JsonPropertyDescription("The reference date for this status.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> referenceDate = new ArrayList<DateType>();
    /**
     * Status. Reference Time. Time
     * <p>
     * The reference time for this status.
     * 
     */
    @JsonProperty("ReferenceTime")
    @JsonPropertyDescription("The reference time for this status.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> referenceTime = new ArrayList<TimeType>();
    /**
     * Status. Description. Text
     * <p>
     * Text describing this status.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("Text describing this status.")
    @Size(min = 1)
    @Valid
    private List<TextType> description = new ArrayList<TextType>();
    /**
     * Status. Status Reason Code. Code
     * <p>
     * The reason for this status condition or position, expressed as a code.
     * 
     */
    @JsonProperty("StatusReasonCode")
    @JsonPropertyDescription("The reason for this status condition or position, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> statusReasonCode = new ArrayList<CodeType>();
    /**
     * Status. Status_ Reason. Text
     * <p>
     * The reason for this status condition or position, expressed as text.
     * 
     */
    @JsonProperty("StatusReason")
    @JsonPropertyDescription("The reason for this status condition or position, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> statusReason = new ArrayList<TextType>();
    /**
     * Status. Sequence Identifier. Identifier
     * <p>
     * A sequence identifier for this status.
     * 
     */
    @JsonProperty("SequenceID")
    @JsonPropertyDescription("A sequence identifier for this status.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> sequenceID = new ArrayList<IdentifierType>();
    /**
     * Status. Text
     * <p>
     * Provides any textual information related to this status.
     * 
     */
    @JsonProperty("Text")
    @JsonPropertyDescription("Provides any textual information related to this status.")
    @Size(min = 1)
    @Valid
    private List<TextType> text = new ArrayList<TextType>();
    /**
     * Status. Indication_ Indicator. Indicator
     * <p>
     * Specifies an indicator relevant to a specific status.
     * 
     */
    @JsonProperty("IndicationIndicator")
    @JsonPropertyDescription("Specifies an indicator relevant to a specific status.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> indicationIndicator = new ArrayList<IndicatorType>();
    /**
     * Status. Percent
     * <p>
     * A percentage meaningful in the context of this status.
     * 
     */
    @JsonProperty("Percent")
    @JsonPropertyDescription("A percentage meaningful in the context of this status.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> percent = new ArrayList<NumericType>();
    /**
     * Status. Reliability Percent. Percent
     * <p>
     * The reliability of this status, expressed as a percentage.
     * 
     */
    @JsonProperty("ReliabilityPercent")
    @JsonPropertyDescription("The reliability of this status, expressed as a percentage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> reliabilityPercent = new ArrayList<NumericType>();
    /**
     * Status. Condition
     * <p>
     * Measurements that quantify the condition of the objects covered by the status.
     * 
     */
    @JsonProperty("Condition")
    @JsonPropertyDescription("Measurements that quantify the condition of the objects covered by the status.")
    @Size(min = 1)
    @Valid
    private List<Condition> condition = new ArrayList<Condition>();

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

    public Status withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Status. Condition Code. Code
     * <p>
     * Specifies the status condition of the related object.
     * 
     */
    @JsonProperty("ConditionCode")
    public List<CodeType> getConditionCode() {
        return conditionCode;
    }

    /**
     * Status. Condition Code. Code
     * <p>
     * Specifies the status condition of the related object.
     * 
     */
    @JsonProperty("ConditionCode")
    public void setConditionCode(List<CodeType> conditionCode) {
        this.conditionCode = conditionCode;
    }

    public Status withConditionCode(List<CodeType> conditionCode) {
        this.conditionCode = conditionCode;
        return this;
    }

    /**
     * Status. Reference Date. Date
     * <p>
     * The reference date for this status.
     * 
     */
    @JsonProperty("ReferenceDate")
    public List<DateType> getReferenceDate() {
        return referenceDate;
    }

    /**
     * Status. Reference Date. Date
     * <p>
     * The reference date for this status.
     * 
     */
    @JsonProperty("ReferenceDate")
    public void setReferenceDate(List<DateType> referenceDate) {
        this.referenceDate = referenceDate;
    }

    public Status withReferenceDate(List<DateType> referenceDate) {
        this.referenceDate = referenceDate;
        return this;
    }

    /**
     * Status. Reference Time. Time
     * <p>
     * The reference time for this status.
     * 
     */
    @JsonProperty("ReferenceTime")
    public List<TimeType> getReferenceTime() {
        return referenceTime;
    }

    /**
     * Status. Reference Time. Time
     * <p>
     * The reference time for this status.
     * 
     */
    @JsonProperty("ReferenceTime")
    public void setReferenceTime(List<TimeType> referenceTime) {
        this.referenceTime = referenceTime;
    }

    public Status withReferenceTime(List<TimeType> referenceTime) {
        this.referenceTime = referenceTime;
        return this;
    }

    /**
     * Status. Description. Text
     * <p>
     * Text describing this status.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * Status. Description. Text
     * <p>
     * Text describing this status.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public Status withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    /**
     * Status. Status Reason Code. Code
     * <p>
     * The reason for this status condition or position, expressed as a code.
     * 
     */
    @JsonProperty("StatusReasonCode")
    public List<CodeType> getStatusReasonCode() {
        return statusReasonCode;
    }

    /**
     * Status. Status Reason Code. Code
     * <p>
     * The reason for this status condition or position, expressed as a code.
     * 
     */
    @JsonProperty("StatusReasonCode")
    public void setStatusReasonCode(List<CodeType> statusReasonCode) {
        this.statusReasonCode = statusReasonCode;
    }

    public Status withStatusReasonCode(List<CodeType> statusReasonCode) {
        this.statusReasonCode = statusReasonCode;
        return this;
    }

    /**
     * Status. Status_ Reason. Text
     * <p>
     * The reason for this status condition or position, expressed as text.
     * 
     */
    @JsonProperty("StatusReason")
    public List<TextType> getStatusReason() {
        return statusReason;
    }

    /**
     * Status. Status_ Reason. Text
     * <p>
     * The reason for this status condition or position, expressed as text.
     * 
     */
    @JsonProperty("StatusReason")
    public void setStatusReason(List<TextType> statusReason) {
        this.statusReason = statusReason;
    }

    public Status withStatusReason(List<TextType> statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * Status. Sequence Identifier. Identifier
     * <p>
     * A sequence identifier for this status.
     * 
     */
    @JsonProperty("SequenceID")
    public List<IdentifierType> getSequenceID() {
        return sequenceID;
    }

    /**
     * Status. Sequence Identifier. Identifier
     * <p>
     * A sequence identifier for this status.
     * 
     */
    @JsonProperty("SequenceID")
    public void setSequenceID(List<IdentifierType> sequenceID) {
        this.sequenceID = sequenceID;
    }

    public Status withSequenceID(List<IdentifierType> sequenceID) {
        this.sequenceID = sequenceID;
        return this;
    }

    /**
     * Status. Text
     * <p>
     * Provides any textual information related to this status.
     * 
     */
    @JsonProperty("Text")
    public List<TextType> getText() {
        return text;
    }

    /**
     * Status. Text
     * <p>
     * Provides any textual information related to this status.
     * 
     */
    @JsonProperty("Text")
    public void setText(List<TextType> text) {
        this.text = text;
    }

    public Status withText(List<TextType> text) {
        this.text = text;
        return this;
    }

    /**
     * Status. Indication_ Indicator. Indicator
     * <p>
     * Specifies an indicator relevant to a specific status.
     * 
     */
    @JsonProperty("IndicationIndicator")
    public List<IndicatorType> getIndicationIndicator() {
        return indicationIndicator;
    }

    /**
     * Status. Indication_ Indicator. Indicator
     * <p>
     * Specifies an indicator relevant to a specific status.
     * 
     */
    @JsonProperty("IndicationIndicator")
    public void setIndicationIndicator(List<IndicatorType> indicationIndicator) {
        this.indicationIndicator = indicationIndicator;
    }

    public Status withIndicationIndicator(List<IndicatorType> indicationIndicator) {
        this.indicationIndicator = indicationIndicator;
        return this;
    }

    /**
     * Status. Percent
     * <p>
     * A percentage meaningful in the context of this status.
     * 
     */
    @JsonProperty("Percent")
    public List<NumericType> getPercent() {
        return percent;
    }

    /**
     * Status. Percent
     * <p>
     * A percentage meaningful in the context of this status.
     * 
     */
    @JsonProperty("Percent")
    public void setPercent(List<NumericType> percent) {
        this.percent = percent;
    }

    public Status withPercent(List<NumericType> percent) {
        this.percent = percent;
        return this;
    }

    /**
     * Status. Reliability Percent. Percent
     * <p>
     * The reliability of this status, expressed as a percentage.
     * 
     */
    @JsonProperty("ReliabilityPercent")
    public List<NumericType> getReliabilityPercent() {
        return reliabilityPercent;
    }

    /**
     * Status. Reliability Percent. Percent
     * <p>
     * The reliability of this status, expressed as a percentage.
     * 
     */
    @JsonProperty("ReliabilityPercent")
    public void setReliabilityPercent(List<NumericType> reliabilityPercent) {
        this.reliabilityPercent = reliabilityPercent;
    }

    public Status withReliabilityPercent(List<NumericType> reliabilityPercent) {
        this.reliabilityPercent = reliabilityPercent;
        return this;
    }

    /**
     * Status. Condition
     * <p>
     * Measurements that quantify the condition of the objects covered by the status.
     * 
     */
    @JsonProperty("Condition")
    public List<Condition> getCondition() {
        return condition;
    }

    /**
     * Status. Condition
     * <p>
     * Measurements that quantify the condition of the objects covered by the status.
     * 
     */
    @JsonProperty("Condition")
    public void setCondition(List<Condition> condition) {
        this.condition = condition;
    }

    public Status withCondition(List<Condition> condition) {
        this.condition = condition;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Status.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("conditionCode");
        sb.append('=');
        sb.append(((this.conditionCode == null)?"<null>":this.conditionCode));
        sb.append(',');
        sb.append("referenceDate");
        sb.append('=');
        sb.append(((this.referenceDate == null)?"<null>":this.referenceDate));
        sb.append(',');
        sb.append("referenceTime");
        sb.append('=');
        sb.append(((this.referenceTime == null)?"<null>":this.referenceTime));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("statusReasonCode");
        sb.append('=');
        sb.append(((this.statusReasonCode == null)?"<null>":this.statusReasonCode));
        sb.append(',');
        sb.append("statusReason");
        sb.append('=');
        sb.append(((this.statusReason == null)?"<null>":this.statusReason));
        sb.append(',');
        sb.append("sequenceID");
        sb.append('=');
        sb.append(((this.sequenceID == null)?"<null>":this.sequenceID));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("indicationIndicator");
        sb.append('=');
        sb.append(((this.indicationIndicator == null)?"<null>":this.indicationIndicator));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("reliabilityPercent");
        sb.append('=');
        sb.append(((this.reliabilityPercent == null)?"<null>":this.reliabilityPercent));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
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
        result = ((result* 31)+((this.statusReasonCode == null)? 0 :this.statusReasonCode.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.indicationIndicator == null)? 0 :this.indicationIndicator.hashCode()));
        result = ((result* 31)+((this.sequenceID == null)? 0 :this.sequenceID.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.conditionCode == null)? 0 :this.conditionCode.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.statusReason == null)? 0 :this.statusReason.hashCode()));
        result = ((result* 31)+((this.referenceTime == null)? 0 :this.referenceTime.hashCode()));
        result = ((result* 31)+((this.reliabilityPercent == null)? 0 :this.reliabilityPercent.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.referenceDate == null)? 0 :this.referenceDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Status) == false) {
            return false;
        }
        Status rhs = ((Status) other);
        return ((((((((((((((this.statusReasonCode == rhs.statusReasonCode)||((this.statusReasonCode!= null)&&this.statusReasonCode.equals(rhs.statusReasonCode)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.indicationIndicator == rhs.indicationIndicator)||((this.indicationIndicator!= null)&&this.indicationIndicator.equals(rhs.indicationIndicator))))&&((this.sequenceID == rhs.sequenceID)||((this.sequenceID!= null)&&this.sequenceID.equals(rhs.sequenceID))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.conditionCode == rhs.conditionCode)||((this.conditionCode!= null)&&this.conditionCode.equals(rhs.conditionCode))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.statusReason == rhs.statusReason)||((this.statusReason!= null)&&this.statusReason.equals(rhs.statusReason))))&&((this.referenceTime == rhs.referenceTime)||((this.referenceTime!= null)&&this.referenceTime.equals(rhs.referenceTime))))&&((this.reliabilityPercent == rhs.reliabilityPercent)||((this.reliabilityPercent!= null)&&this.reliabilityPercent.equals(rhs.reliabilityPercent))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.referenceDate == rhs.referenceDate)||((this.referenceDate!= null)&&this.referenceDate.equals(rhs.referenceDate))));
    }

}
