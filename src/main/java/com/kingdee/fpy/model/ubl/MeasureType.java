
package com.kingdee.fpy.model.ubl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * Measure. Type
 * <p>
 * A numeric value determined by measuring an object using a specified unit of measure.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_",
    "unitCode",
    "unitCodeListVersionID"
})
@Generated("jsonschema2pojo")
public class MeasureType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_")
    @NotNull
    private Double __;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("unitCode")
    @NotNull
    private String unitCode;
    @JsonProperty("unitCodeListVersionID")
    private String unitCodeListVersionID;

    @JsonProperty("_")
    public Double get__() {
        return __;
    }

    @JsonProperty("_")
    public void set__(Double __) {
        this.__ = __;
    }

    public MeasureType with__(Double __) {
        this.__ = __;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("unitCode")
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("unitCode")
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public MeasureType withUnitCode(String unitCode) {
        this.unitCode = unitCode;
        return this;
    }

    @JsonProperty("unitCodeListVersionID")
    public String getUnitCodeListVersionID() {
        return unitCodeListVersionID;
    }

    @JsonProperty("unitCodeListVersionID")
    public void setUnitCodeListVersionID(String unitCodeListVersionID) {
        this.unitCodeListVersionID = unitCodeListVersionID;
    }

    public MeasureType withUnitCodeListVersionID(String unitCodeListVersionID) {
        this.unitCodeListVersionID = unitCodeListVersionID;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MeasureType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("__");
        sb.append('=');
        sb.append(((this.__ == null)?"<null>":this.__));
        sb.append(',');
        sb.append("unitCode");
        sb.append('=');
        sb.append(((this.unitCode == null)?"<null>":this.unitCode));
        sb.append(',');
        sb.append("unitCodeListVersionID");
        sb.append('=');
        sb.append(((this.unitCodeListVersionID == null)?"<null>":this.unitCodeListVersionID));
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
        result = ((result* 31)+((this.unitCodeListVersionID == null)? 0 :this.unitCodeListVersionID.hashCode()));
        result = ((result* 31)+((this.unitCode == null)? 0 :this.unitCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MeasureType) == false) {
            return false;
        }
        MeasureType rhs = ((MeasureType) other);
        return ((((this.__ == rhs.__)||((this.__!= null)&&this.__.equals(rhs.__)))&&((this.unitCodeListVersionID == rhs.unitCodeListVersionID)||((this.unitCodeListVersionID!= null)&&this.unitCodeListVersionID.equals(rhs.unitCodeListVersionID))))&&((this.unitCode == rhs.unitCode)||((this.unitCode!= null)&&this.unitCode.equals(rhs.unitCode))));
    }

}
