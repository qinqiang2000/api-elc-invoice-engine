
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
 * Service Frequency. Details
 * <p>
 * A class to specify which day of the week a transport service is operational.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "WeekDayCode"
})
@Generated("jsonschema2pojo")
public class ServiceFrequency {

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
     * Service Frequency. Week Day. Code
     * <p>
     * A day of the week, expressed as code.
     * (Required)
     * 
     */
    @JsonProperty("WeekDayCode")
    @JsonPropertyDescription("A day of the week, expressed as code.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<CodeType> weekDayCode = new ArrayList<CodeType>();

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

    public ServiceFrequency withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Service Frequency. Week Day. Code
     * <p>
     * A day of the week, expressed as code.
     * (Required)
     * 
     */
    @JsonProperty("WeekDayCode")
    public List<CodeType> getWeekDayCode() {
        return weekDayCode;
    }

    /**
     * Service Frequency. Week Day. Code
     * <p>
     * A day of the week, expressed as code.
     * (Required)
     * 
     */
    @JsonProperty("WeekDayCode")
    public void setWeekDayCode(List<CodeType> weekDayCode) {
        this.weekDayCode = weekDayCode;
    }

    public ServiceFrequency withWeekDayCode(List<CodeType> weekDayCode) {
        this.weekDayCode = weekDayCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceFrequency.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("weekDayCode");
        sb.append('=');
        sb.append(((this.weekDayCode == null)?"<null>":this.weekDayCode));
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
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.weekDayCode == null)? 0 :this.weekDayCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceFrequency) == false) {
            return false;
        }
        ServiceFrequency rhs = ((ServiceFrequency) other);
        return (((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.weekDayCode == rhs.weekDayCode)||((this.weekDayCode!= null)&&this.weekDayCode.equals(rhs.weekDayCode))));
    }

}
