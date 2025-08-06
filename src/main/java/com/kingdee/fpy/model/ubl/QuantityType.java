
package com.kingdee.fpy.model.ubl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * Quantity. Type
 * <p>
 * A counted number of non-monetary units possibly including fractions.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_",
    "unitCode",
    "unitCodeListID",
    "unitCodeListAgencyID",
    "unitCodeListAgencyName"
})
@Generated("jsonschema2pojo")
public class QuantityType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_")
    @NotNull
    private Double __;
    @JsonProperty("unitCode")
    private String unitCode;
    @JsonProperty("unitCodeListID")
    private String unitCodeListID;
    @JsonProperty("unitCodeListAgencyID")
    private String unitCodeListAgencyID;
    @JsonProperty("unitCodeListAgencyName")
    private String unitCodeListAgencyName;

    @JsonProperty("_")
    public Double get__() {
        return __;
    }

    @JsonProperty("_")
    public void set__(Double __) {
        this.__ = __;
    }

    public QuantityType with__(Double __) {
        this.__ = __;
        return this;
    }

    @JsonProperty("unitCode")
    public String getUnitCode() {
        return unitCode;
    }

    @JsonProperty("unitCode")
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public QuantityType withUnitCode(String unitCode) {
        this.unitCode = unitCode;
        return this;
    }

    @JsonProperty("unitCodeListID")
    public String getUnitCodeListID() {
        return unitCodeListID;
    }

    @JsonProperty("unitCodeListID")
    public void setUnitCodeListID(String unitCodeListID) {
        this.unitCodeListID = unitCodeListID;
    }

    public QuantityType withUnitCodeListID(String unitCodeListID) {
        this.unitCodeListID = unitCodeListID;
        return this;
    }

    @JsonProperty("unitCodeListAgencyID")
    public String getUnitCodeListAgencyID() {
        return unitCodeListAgencyID;
    }

    @JsonProperty("unitCodeListAgencyID")
    public void setUnitCodeListAgencyID(String unitCodeListAgencyID) {
        this.unitCodeListAgencyID = unitCodeListAgencyID;
    }

    public QuantityType withUnitCodeListAgencyID(String unitCodeListAgencyID) {
        this.unitCodeListAgencyID = unitCodeListAgencyID;
        return this;
    }

    @JsonProperty("unitCodeListAgencyName")
    public String getUnitCodeListAgencyName() {
        return unitCodeListAgencyName;
    }

    @JsonProperty("unitCodeListAgencyName")
    public void setUnitCodeListAgencyName(String unitCodeListAgencyName) {
        this.unitCodeListAgencyName = unitCodeListAgencyName;
    }

    public QuantityType withUnitCodeListAgencyName(String unitCodeListAgencyName) {
        this.unitCodeListAgencyName = unitCodeListAgencyName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QuantityType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("__");
        sb.append('=');
        sb.append(((this.__ == null)?"<null>":this.__));
        sb.append(',');
        sb.append("unitCode");
        sb.append('=');
        sb.append(((this.unitCode == null)?"<null>":this.unitCode));
        sb.append(',');
        sb.append("unitCodeListID");
        sb.append('=');
        sb.append(((this.unitCodeListID == null)?"<null>":this.unitCodeListID));
        sb.append(',');
        sb.append("unitCodeListAgencyID");
        sb.append('=');
        sb.append(((this.unitCodeListAgencyID == null)?"<null>":this.unitCodeListAgencyID));
        sb.append(',');
        sb.append("unitCodeListAgencyName");
        sb.append('=');
        sb.append(((this.unitCodeListAgencyName == null)?"<null>":this.unitCodeListAgencyName));
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
        result = ((result* 31)+((this.unitCodeListAgencyID == null)? 0 :this.unitCodeListAgencyID.hashCode()));
        result = ((result* 31)+((this.unitCodeListAgencyName == null)? 0 :this.unitCodeListAgencyName.hashCode()));
        result = ((result* 31)+((this.unitCode == null)? 0 :this.unitCode.hashCode()));
        result = ((result* 31)+((this.unitCodeListID == null)? 0 :this.unitCodeListID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuantityType) == false) {
            return false;
        }
        QuantityType rhs = ((QuantityType) other);
        return ((((((this.__ == rhs.__)||((this.__!= null)&&this.__.equals(rhs.__)))&&((this.unitCodeListAgencyID == rhs.unitCodeListAgencyID)||((this.unitCodeListAgencyID!= null)&&this.unitCodeListAgencyID.equals(rhs.unitCodeListAgencyID))))&&((this.unitCodeListAgencyName == rhs.unitCodeListAgencyName)||((this.unitCodeListAgencyName!= null)&&this.unitCodeListAgencyName.equals(rhs.unitCodeListAgencyName))))&&((this.unitCode == rhs.unitCode)||((this.unitCode!= null)&&this.unitCode.equals(rhs.unitCode))))&&((this.unitCodeListID == rhs.unitCodeListID)||((this.unitCodeListID!= null)&&this.unitCodeListID.equals(rhs.unitCodeListID))));
    }

}
