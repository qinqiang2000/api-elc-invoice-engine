
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
 * Billing Reference Line. Details
 * <p>
 * A class to define a reference to a transaction line in a billing document.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Amount",
    "AllowanceCharge"
})
@Generated("jsonschema2pojo")
public class BillingReferenceLine {

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
     * Billing Reference Line. Identifier
     * <p>
     * An identifier for this transaction line in a billing document.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this transaction line in a billing document.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Billing Reference Line. Amount
     * <p>
     * The monetary amount of the transaction line, including any allowances and charges but excluding taxes.
     * 
     */
    @JsonProperty("Amount")
    @JsonPropertyDescription("The monetary amount of the transaction line, including any allowances and charges but excluding taxes.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> amount = new ArrayList<AmountType>();
    /**
     * Billing Reference Line. Allowance Charge
     * <p>
     * An allowance or charge applicable to the transaction line.
     * 
     */
    @JsonProperty("AllowanceCharge")
    @JsonPropertyDescription("An allowance or charge applicable to the transaction line.")
    @Size(min = 1)
    @Valid
    private List<AllowanceCharge> allowanceCharge = new ArrayList<AllowanceCharge>();

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

    public BillingReferenceLine withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Billing Reference Line. Identifier
     * <p>
     * An identifier for this transaction line in a billing document.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Billing Reference Line. Identifier
     * <p>
     * An identifier for this transaction line in a billing document.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public BillingReferenceLine withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Billing Reference Line. Amount
     * <p>
     * The monetary amount of the transaction line, including any allowances and charges but excluding taxes.
     * 
     */
    @JsonProperty("Amount")
    public List<AmountType> getAmount() {
        return amount;
    }

    /**
     * Billing Reference Line. Amount
     * <p>
     * The monetary amount of the transaction line, including any allowances and charges but excluding taxes.
     * 
     */
    @JsonProperty("Amount")
    public void setAmount(List<AmountType> amount) {
        this.amount = amount;
    }

    public BillingReferenceLine withAmount(List<AmountType> amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Billing Reference Line. Allowance Charge
     * <p>
     * An allowance or charge applicable to the transaction line.
     * 
     */
    @JsonProperty("AllowanceCharge")
    public List<AllowanceCharge> getAllowanceCharge() {
        return allowanceCharge;
    }

    /**
     * Billing Reference Line. Allowance Charge
     * <p>
     * An allowance or charge applicable to the transaction line.
     * 
     */
    @JsonProperty("AllowanceCharge")
    public void setAllowanceCharge(List<AllowanceCharge> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
    }

    public BillingReferenceLine withAllowanceCharge(List<AllowanceCharge> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BillingReferenceLine.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("allowanceCharge");
        sb.append('=');
        sb.append(((this.allowanceCharge == null)?"<null>":this.allowanceCharge));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.allowanceCharge == null)? 0 :this.allowanceCharge.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BillingReferenceLine) == false) {
            return false;
        }
        BillingReferenceLine rhs = ((BillingReferenceLine) other);
        return (((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.allowanceCharge == rhs.allowanceCharge)||((this.allowanceCharge!= null)&&this.allowanceCharge.equals(rhs.allowanceCharge))));
    }

}
