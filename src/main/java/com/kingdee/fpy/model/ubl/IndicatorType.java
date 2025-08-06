
package com.kingdee.fpy.model.ubl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * Indicator. Type
 * <p>
 * A list of two mutually exclusive Boolean values that express the only possible states of a property.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_"
})
@Generated("jsonschema2pojo")
public class IndicatorType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_")
    @NotNull
    private Boolean __;

    @JsonProperty("_")
    public Boolean get__() {
        return __;
    }

    @JsonProperty("_")
    public void set__(Boolean __) {
        this.__ = __;
    }

    public IndicatorType with__(Boolean __) {
        this.__ = __;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IndicatorType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("__");
        sb.append('=');
        sb.append(((this.__ == null)?"<null>":this.__));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IndicatorType) == false) {
            return false;
        }
        IndicatorType rhs = ((IndicatorType) other);
        return ((this.__ == rhs.__)||((this.__!= null)&&this.__.equals(rhs.__)));
    }

}
