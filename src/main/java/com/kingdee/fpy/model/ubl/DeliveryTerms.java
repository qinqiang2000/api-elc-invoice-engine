
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
 * Delivery Terms. Details
 * <p>
 * A class for describing the terms and conditions applying to the delivery of goods.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "SpecialTerms",
    "LossRiskResponsibilityCode",
    "LossRisk",
    "Amount",
    "DeliveryLocation",
    "AllowanceCharge"
})
@Generated("jsonschema2pojo")
public class DeliveryTerms {

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
     * Delivery Terms. Identifier
     * <p>
     * An identifier for this description of delivery terms.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this description of delivery terms.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Delivery Terms. Special_ Terms. Text
     * <p>
     * A description of any terms or conditions relating to the delivery items.
     * 
     */
    @JsonProperty("SpecialTerms")
    @JsonPropertyDescription("A description of any terms or conditions relating to the delivery items.")
    @Size(min = 1)
    @Valid
    private List<TextType> specialTerms = new ArrayList<TextType>();
    /**
     * Delivery Terms. Loss Risk Responsibility Code. Code
     * <p>
     * A code that identifies one of various responsibilities for loss risk in the execution of the delivery.
     * 
     */
    @JsonProperty("LossRiskResponsibilityCode")
    @JsonPropertyDescription("A code that identifies one of various responsibilities for loss risk in the execution of the delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> lossRiskResponsibilityCode = new ArrayList<CodeType>();
    /**
     * Delivery Terms. Loss Risk. Text
     * <p>
     * A description of responsibility for risk of loss in execution of the delivery, expressed as text.
     * 
     */
    @JsonProperty("LossRisk")
    @JsonPropertyDescription("A description of responsibility for risk of loss in execution of the delivery, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> lossRisk = new ArrayList<TextType>();
    /**
     * Delivery Terms. Amount
     * <p>
     * The monetary amount covered by these delivery terms.
     * 
     */
    @JsonProperty("Amount")
    @JsonPropertyDescription("The monetary amount covered by these delivery terms.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> amount = new ArrayList<AmountType>();
    /**
     * Delivery Terms. Delivery_ Location. Location
     * <p>
     * The location for the contracted delivery.
     * 
     */
    @JsonProperty("DeliveryLocation")
    @JsonPropertyDescription("The location for the contracted delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> deliveryLocation = new ArrayList<Location>();
    /**
     * Delivery Terms. Allowance Charge
     * <p>
     * An allowance or charge covered by these delivery terms.
     * 
     */
    @JsonProperty("AllowanceCharge")
    @JsonPropertyDescription("An allowance or charge covered by these delivery terms.")
    @Size(min = 1, max = 1)
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

    public DeliveryTerms withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Delivery Terms. Identifier
     * <p>
     * An identifier for this description of delivery terms.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Delivery Terms. Identifier
     * <p>
     * An identifier for this description of delivery terms.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public DeliveryTerms withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Delivery Terms. Special_ Terms. Text
     * <p>
     * A description of any terms or conditions relating to the delivery items.
     * 
     */
    @JsonProperty("SpecialTerms")
    public List<TextType> getSpecialTerms() {
        return specialTerms;
    }

    /**
     * Delivery Terms. Special_ Terms. Text
     * <p>
     * A description of any terms or conditions relating to the delivery items.
     * 
     */
    @JsonProperty("SpecialTerms")
    public void setSpecialTerms(List<TextType> specialTerms) {
        this.specialTerms = specialTerms;
    }

    public DeliveryTerms withSpecialTerms(List<TextType> specialTerms) {
        this.specialTerms = specialTerms;
        return this;
    }

    /**
     * Delivery Terms. Loss Risk Responsibility Code. Code
     * <p>
     * A code that identifies one of various responsibilities for loss risk in the execution of the delivery.
     * 
     */
    @JsonProperty("LossRiskResponsibilityCode")
    public List<CodeType> getLossRiskResponsibilityCode() {
        return lossRiskResponsibilityCode;
    }

    /**
     * Delivery Terms. Loss Risk Responsibility Code. Code
     * <p>
     * A code that identifies one of various responsibilities for loss risk in the execution of the delivery.
     * 
     */
    @JsonProperty("LossRiskResponsibilityCode")
    public void setLossRiskResponsibilityCode(List<CodeType> lossRiskResponsibilityCode) {
        this.lossRiskResponsibilityCode = lossRiskResponsibilityCode;
    }

    public DeliveryTerms withLossRiskResponsibilityCode(List<CodeType> lossRiskResponsibilityCode) {
        this.lossRiskResponsibilityCode = lossRiskResponsibilityCode;
        return this;
    }

    /**
     * Delivery Terms. Loss Risk. Text
     * <p>
     * A description of responsibility for risk of loss in execution of the delivery, expressed as text.
     * 
     */
    @JsonProperty("LossRisk")
    public List<TextType> getLossRisk() {
        return lossRisk;
    }

    /**
     * Delivery Terms. Loss Risk. Text
     * <p>
     * A description of responsibility for risk of loss in execution of the delivery, expressed as text.
     * 
     */
    @JsonProperty("LossRisk")
    public void setLossRisk(List<TextType> lossRisk) {
        this.lossRisk = lossRisk;
    }

    public DeliveryTerms withLossRisk(List<TextType> lossRisk) {
        this.lossRisk = lossRisk;
        return this;
    }

    /**
     * Delivery Terms. Amount
     * <p>
     * The monetary amount covered by these delivery terms.
     * 
     */
    @JsonProperty("Amount")
    public List<AmountType> getAmount() {
        return amount;
    }

    /**
     * Delivery Terms. Amount
     * <p>
     * The monetary amount covered by these delivery terms.
     * 
     */
    @JsonProperty("Amount")
    public void setAmount(List<AmountType> amount) {
        this.amount = amount;
    }

    public DeliveryTerms withAmount(List<AmountType> amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Delivery Terms. Delivery_ Location. Location
     * <p>
     * The location for the contracted delivery.
     * 
     */
    @JsonProperty("DeliveryLocation")
    public List<Location> getDeliveryLocation() {
        return deliveryLocation;
    }

    /**
     * Delivery Terms. Delivery_ Location. Location
     * <p>
     * The location for the contracted delivery.
     * 
     */
    @JsonProperty("DeliveryLocation")
    public void setDeliveryLocation(List<Location> deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public DeliveryTerms withDeliveryLocation(List<Location> deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
        return this;
    }

    /**
     * Delivery Terms. Allowance Charge
     * <p>
     * An allowance or charge covered by these delivery terms.
     * 
     */
    @JsonProperty("AllowanceCharge")
    public List<AllowanceCharge> getAllowanceCharge() {
        return allowanceCharge;
    }

    /**
     * Delivery Terms. Allowance Charge
     * <p>
     * An allowance or charge covered by these delivery terms.
     * 
     */
    @JsonProperty("AllowanceCharge")
    public void setAllowanceCharge(List<AllowanceCharge> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
    }

    public DeliveryTerms withAllowanceCharge(List<AllowanceCharge> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeliveryTerms.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("specialTerms");
        sb.append('=');
        sb.append(((this.specialTerms == null)?"<null>":this.specialTerms));
        sb.append(',');
        sb.append("lossRiskResponsibilityCode");
        sb.append('=');
        sb.append(((this.lossRiskResponsibilityCode == null)?"<null>":this.lossRiskResponsibilityCode));
        sb.append(',');
        sb.append("lossRisk");
        sb.append('=');
        sb.append(((this.lossRisk == null)?"<null>":this.lossRisk));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("deliveryLocation");
        sb.append('=');
        sb.append(((this.deliveryLocation == null)?"<null>":this.deliveryLocation));
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
        result = ((result* 31)+((this.specialTerms == null)? 0 :this.specialTerms.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.deliveryLocation == null)? 0 :this.deliveryLocation.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.lossRiskResponsibilityCode == null)? 0 :this.lossRiskResponsibilityCode.hashCode()));
        result = ((result* 31)+((this.lossRisk == null)? 0 :this.lossRisk.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.allowanceCharge == null)? 0 :this.allowanceCharge.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryTerms) == false) {
            return false;
        }
        DeliveryTerms rhs = ((DeliveryTerms) other);
        return (((((((((this.specialTerms == rhs.specialTerms)||((this.specialTerms!= null)&&this.specialTerms.equals(rhs.specialTerms)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.deliveryLocation == rhs.deliveryLocation)||((this.deliveryLocation!= null)&&this.deliveryLocation.equals(rhs.deliveryLocation))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.lossRiskResponsibilityCode == rhs.lossRiskResponsibilityCode)||((this.lossRiskResponsibilityCode!= null)&&this.lossRiskResponsibilityCode.equals(rhs.lossRiskResponsibilityCode))))&&((this.lossRisk == rhs.lossRisk)||((this.lossRisk!= null)&&this.lossRisk.equals(rhs.lossRisk))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.allowanceCharge == rhs.allowanceCharge)||((this.allowanceCharge!= null)&&this.allowanceCharge.equals(rhs.allowanceCharge))));
    }

}
