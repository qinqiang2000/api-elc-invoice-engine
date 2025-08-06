
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
 * Price Extension. Details
 * <p>
 * A class to describe a price extension, calculated by multiplying the price per unit by the quantity of items.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "Amount",
    "TaxTotal"
})
@Generated("jsonschema2pojo")
public class PriceExtension {

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
     * Price Extension. Amount
     * <p>
     * The amount of this price extension.
     * (Required)
     * 
     */
    @JsonProperty("Amount")
    @JsonPropertyDescription("The amount of this price extension.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<AmountType> amount = new ArrayList<AmountType>();
    /**
     * Price Extension. Tax Total
     * <p>
     * A total amount of taxes of a particular kind applicable to this price extension.
     * 
     */
    @JsonProperty("TaxTotal")
    @JsonPropertyDescription("A total amount of taxes of a particular kind applicable to this price extension.")
    @Size(min = 1)
    @Valid
    private List<TaxTotal> taxTotal = new ArrayList<TaxTotal>();

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

    public PriceExtension withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Price Extension. Amount
     * <p>
     * The amount of this price extension.
     * (Required)
     * 
     */
    @JsonProperty("Amount")
    public List<AmountType> getAmount() {
        return amount;
    }

    /**
     * Price Extension. Amount
     * <p>
     * The amount of this price extension.
     * (Required)
     * 
     */
    @JsonProperty("Amount")
    public void setAmount(List<AmountType> amount) {
        this.amount = amount;
    }

    public PriceExtension withAmount(List<AmountType> amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Price Extension. Tax Total
     * <p>
     * A total amount of taxes of a particular kind applicable to this price extension.
     * 
     */
    @JsonProperty("TaxTotal")
    public List<TaxTotal> getTaxTotal() {
        return taxTotal;
    }

    /**
     * Price Extension. Tax Total
     * <p>
     * A total amount of taxes of a particular kind applicable to this price extension.
     * 
     */
    @JsonProperty("TaxTotal")
    public void setTaxTotal(List<TaxTotal> taxTotal) {
        this.taxTotal = taxTotal;
    }

    public PriceExtension withTaxTotal(List<TaxTotal> taxTotal) {
        this.taxTotal = taxTotal;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PriceExtension.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("taxTotal");
        sb.append('=');
        sb.append(((this.taxTotal == null)?"<null>":this.taxTotal));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.taxTotal == null)? 0 :this.taxTotal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PriceExtension) == false) {
            return false;
        }
        PriceExtension rhs = ((PriceExtension) other);
        return ((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.taxTotal == rhs.taxTotal)||((this.taxTotal!= null)&&this.taxTotal.equals(rhs.taxTotal))));
    }

}
