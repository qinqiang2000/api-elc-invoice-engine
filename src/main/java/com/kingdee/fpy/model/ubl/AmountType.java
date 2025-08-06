
package com.kingdee.fpy.model.ubl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * Amount. Type
 * <p>
 * A number of monetary units specified using a given unit of currency.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_",
    "currencyCodeListVersionID",
    "currencyID"
})
@Generated("jsonschema2pojo")
public class AmountType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_")
    @NotNull
    private Double __;
    @JsonProperty("currencyCodeListVersionID")
    private String currencyCodeListVersionID;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currencyID")
    @NotNull
    private String currencyID;

    @JsonProperty("_")
    public Double get__() {
        return __;
    }

    @JsonProperty("_")
    public void set__(Double __) {
        this.__ = __;
    }

    public AmountType with__(Double __) {
        this.__ = __;
        return this;
    }

    @JsonProperty("currencyCodeListVersionID")
    public String getCurrencyCodeListVersionID() {
        return currencyCodeListVersionID;
    }

    @JsonProperty("currencyCodeListVersionID")
    public void setCurrencyCodeListVersionID(String currencyCodeListVersionID) {
        this.currencyCodeListVersionID = currencyCodeListVersionID;
    }

    public AmountType withCurrencyCodeListVersionID(String currencyCodeListVersionID) {
        this.currencyCodeListVersionID = currencyCodeListVersionID;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currencyID")
    public String getCurrencyID() {
        return currencyID;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currencyID")
    public void setCurrencyID(String currencyID) {
        this.currencyID = currencyID;
    }

    public AmountType withCurrencyID(String currencyID) {
        this.currencyID = currencyID;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AmountType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("__");
        sb.append('=');
        sb.append(((this.__ == null)?"<null>":this.__));
        sb.append(',');
        sb.append("currencyCodeListVersionID");
        sb.append('=');
        sb.append(((this.currencyCodeListVersionID == null)?"<null>":this.currencyCodeListVersionID));
        sb.append(',');
        sb.append("currencyID");
        sb.append('=');
        sb.append(((this.currencyID == null)?"<null>":this.currencyID));
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
        result = ((result* 31)+((this.currencyCodeListVersionID == null)? 0 :this.currencyCodeListVersionID.hashCode()));
        result = ((result* 31)+((this.currencyID == null)? 0 :this.currencyID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AmountType) == false) {
            return false;
        }
        AmountType rhs = ((AmountType) other);
        return ((((this.__ == rhs.__)||((this.__!= null)&&this.__.equals(rhs.__)))&&((this.currencyCodeListVersionID == rhs.currencyCodeListVersionID)||((this.currencyCodeListVersionID!= null)&&this.currencyCodeListVersionID.equals(rhs.currencyCodeListVersionID))))&&((this.currencyID == rhs.currencyID)||((this.currencyID!= null)&&this.currencyID.equals(rhs.currencyID))));
    }

}
