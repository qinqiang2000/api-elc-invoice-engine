
package com.kingdee.fpy.model.ubl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * Numeric. Type
 * <p>
 * Numeric information that is assigned or is determined by calculation, counting, or sequencing. It does not require a unit of quantity or unit of measure.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_",
    "format"
})
@Generated("jsonschema2pojo")
public class NumericType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_")
    @NotNull
    private Double __;
    @JsonProperty("format")
    private String format;

    @JsonProperty("_")
    public Double get__() {
        return __;
    }

    @JsonProperty("_")
    public void set__(Double __) {
        this.__ = __;
    }

    public NumericType with__(Double __) {
        this.__ = __;
        return this;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    public NumericType withFormat(String format) {
        this.format = format;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NumericType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("__");
        sb.append('=');
        sb.append(((this.__ == null)?"<null>":this.__));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
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
        result = ((result* 31)+((this.__ == null)? 0 :this.__.hashCode()));
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NumericType) == false) {
            return false;
        }
        NumericType rhs = ((NumericType) other);
        return (((this.__ == rhs.__)||((this.__!= null)&&this.__.equals(rhs.__)))&&((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format))));
    }

}
