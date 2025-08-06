
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
 * Period. Details
 * <p>
 * A class to describe a period of time.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "StartDate",
    "StartTime",
    "EndDate",
    "EndTime",
    "DurationMeasure",
    "DescriptionCode",
    "Description"
})
@Generated("jsonschema2pojo")
public class Period {

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
     * Period. Start Date. Date
     * <p>
     * The date on which this period begins.
     * 
     */
    @JsonProperty("StartDate")
    @JsonPropertyDescription("The date on which this period begins.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> startDate = new ArrayList<DateType>();
    /**
     * Period. Start Time. Time
     * <p>
     * The time at which this period begins.
     * 
     */
    @JsonProperty("StartTime")
    @JsonPropertyDescription("The time at which this period begins.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> startTime = new ArrayList<TimeType>();
    /**
     * Period. End Date. Date
     * <p>
     * The date on which this period ends.
     * 
     */
    @JsonProperty("EndDate")
    @JsonPropertyDescription("The date on which this period ends.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> endDate = new ArrayList<DateType>();
    /**
     * Period. End Time. Time
     * <p>
     * The time at which this period ends.
     * 
     */
    @JsonProperty("EndTime")
    @JsonPropertyDescription("The time at which this period ends.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> endTime = new ArrayList<TimeType>();
    /**
     * Period. Duration. Measure
     * <p>
     * The duration of this period, expressed as an ISO 8601 code.
     * 
     */
    @JsonProperty("DurationMeasure")
    @JsonPropertyDescription("The duration of this period, expressed as an ISO 8601 code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> durationMeasure = new ArrayList<MeasureType>();
    /**
     * Period. Description Code. Code
     * <p>
     * A description of this period, expressed as a code.
     * 
     */
    @JsonProperty("DescriptionCode")
    @JsonPropertyDescription("A description of this period, expressed as a code.")
    @Size(min = 1)
    @Valid
    private List<CodeType> descriptionCode = new ArrayList<CodeType>();
    /**
     * Period. Description. Text
     * <p>
     * A description of this period, expressed as text.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("A description of this period, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> description = new ArrayList<TextType>();

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

    public Period withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Period. Start Date. Date
     * <p>
     * The date on which this period begins.
     * 
     */
    @JsonProperty("StartDate")
    public List<DateType> getStartDate() {
        return startDate;
    }

    /**
     * Period. Start Date. Date
     * <p>
     * The date on which this period begins.
     * 
     */
    @JsonProperty("StartDate")
    public void setStartDate(List<DateType> startDate) {
        this.startDate = startDate;
    }

    public Period withStartDate(List<DateType> startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Period. Start Time. Time
     * <p>
     * The time at which this period begins.
     * 
     */
    @JsonProperty("StartTime")
    public List<TimeType> getStartTime() {
        return startTime;
    }

    /**
     * Period. Start Time. Time
     * <p>
     * The time at which this period begins.
     * 
     */
    @JsonProperty("StartTime")
    public void setStartTime(List<TimeType> startTime) {
        this.startTime = startTime;
    }

    public Period withStartTime(List<TimeType> startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Period. End Date. Date
     * <p>
     * The date on which this period ends.
     * 
     */
    @JsonProperty("EndDate")
    public List<DateType> getEndDate() {
        return endDate;
    }

    /**
     * Period. End Date. Date
     * <p>
     * The date on which this period ends.
     * 
     */
    @JsonProperty("EndDate")
    public void setEndDate(List<DateType> endDate) {
        this.endDate = endDate;
    }

    public Period withEndDate(List<DateType> endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Period. End Time. Time
     * <p>
     * The time at which this period ends.
     * 
     */
    @JsonProperty("EndTime")
    public List<TimeType> getEndTime() {
        return endTime;
    }

    /**
     * Period. End Time. Time
     * <p>
     * The time at which this period ends.
     * 
     */
    @JsonProperty("EndTime")
    public void setEndTime(List<TimeType> endTime) {
        this.endTime = endTime;
    }

    public Period withEndTime(List<TimeType> endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Period. Duration. Measure
     * <p>
     * The duration of this period, expressed as an ISO 8601 code.
     * 
     */
    @JsonProperty("DurationMeasure")
    public List<MeasureType> getDurationMeasure() {
        return durationMeasure;
    }

    /**
     * Period. Duration. Measure
     * <p>
     * The duration of this period, expressed as an ISO 8601 code.
     * 
     */
    @JsonProperty("DurationMeasure")
    public void setDurationMeasure(List<MeasureType> durationMeasure) {
        this.durationMeasure = durationMeasure;
    }

    public Period withDurationMeasure(List<MeasureType> durationMeasure) {
        this.durationMeasure = durationMeasure;
        return this;
    }

    /**
     * Period. Description Code. Code
     * <p>
     * A description of this period, expressed as a code.
     * 
     */
    @JsonProperty("DescriptionCode")
    public List<CodeType> getDescriptionCode() {
        return descriptionCode;
    }

    /**
     * Period. Description Code. Code
     * <p>
     * A description of this period, expressed as a code.
     * 
     */
    @JsonProperty("DescriptionCode")
    public void setDescriptionCode(List<CodeType> descriptionCode) {
        this.descriptionCode = descriptionCode;
    }

    public Period withDescriptionCode(List<CodeType> descriptionCode) {
        this.descriptionCode = descriptionCode;
        return this;
    }

    /**
     * Period. Description. Text
     * <p>
     * A description of this period, expressed as text.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * Period. Description. Text
     * <p>
     * A description of this period, expressed as text.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public Period withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Period.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("durationMeasure");
        sb.append('=');
        sb.append(((this.durationMeasure == null)?"<null>":this.durationMeasure));
        sb.append(',');
        sb.append("descriptionCode");
        sb.append('=');
        sb.append(((this.descriptionCode == null)?"<null>":this.descriptionCode));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        result = ((result* 31)+((this.descriptionCode == null)? 0 :this.descriptionCode.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.durationMeasure == null)? 0 :this.durationMeasure.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Period) == false) {
            return false;
        }
        Period rhs = ((Period) other);
        return (((((((((this.descriptionCode == rhs.descriptionCode)||((this.descriptionCode!= null)&&this.descriptionCode.equals(rhs.descriptionCode)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.durationMeasure == rhs.durationMeasure)||((this.durationMeasure!= null)&&this.durationMeasure.equals(rhs.durationMeasure))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
