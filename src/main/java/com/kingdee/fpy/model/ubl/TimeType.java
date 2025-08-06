
package com.kingdee.fpy.model.ubl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * Time. Type
 * <p>
 * An instance of time that occurs every day.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_"
})
@Generated("jsonschema2pojo")
public class TimeType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_")
    @NotNull
    private String __;

    @JsonProperty("_")
    public String get__() {
        return __;
    }

    @JsonProperty("_")
    public void set__(String __) {
        this.__ = __;
    }

    public TimeType with__(String __) {
        this.__ = __;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TimeType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof TimeType) == false) {
            return false;
        }
        TimeType rhs = ((TimeType) other);
        return ((this.__ == rhs.__)||((this.__!= null)&&this.__.equals(rhs.__)));
    }

}
