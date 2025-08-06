
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
 * Price. Details
 * <p>
 * A class to describe a price, expressed in a data structure containing multiple properties (compare with UnstructuredPrice).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "PriceAmount",
    "BaseQuantity",
    "PriceChangeReason",
    "PriceTypeCode",
    "PriceType",
    "OrderableUnitFactorRate",
    "ValidityPeriod",
    "PriceList",
    "AllowanceCharge",
    "PricingExchangeRate"
})
@Generated("jsonschema2pojo")
public class Price {

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
     * Price. Price Amount. Amount
     * <p>
     * The amount of the price.
     * (Required)
     * 
     */
    @JsonProperty("PriceAmount")
    @JsonPropertyDescription("The amount of the price.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<AmountType> priceAmount = new ArrayList<AmountType>();
    /**
     * Price. Base_ Quantity. Quantity
     * <p>
     * The quantity at which this price applies.
     * 
     */
    @JsonProperty("BaseQuantity")
    @JsonPropertyDescription("The quantity at which this price applies.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> baseQuantity = new ArrayList<QuantityType>();
    /**
     * Price. Price Change_ Reason. Text
     * <p>
     * A reason for a price change.
     * 
     */
    @JsonProperty("PriceChangeReason")
    @JsonPropertyDescription("A reason for a price change.")
    @Size(min = 1)
    @Valid
    private List<TextType> priceChangeReason = new ArrayList<TextType>();
    /**
     * Price. Price Type Code. Code
     * <p>
     * The type of price, expressed as a code.
     * 
     */
    @JsonProperty("PriceTypeCode")
    @JsonPropertyDescription("The type of price, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> priceTypeCode = new ArrayList<CodeType>();
    /**
     * Price. Price Type. Text
     * <p>
     * The type of price, expressed as text.
     * 
     */
    @JsonProperty("PriceType")
    @JsonPropertyDescription("The type of price, expressed as text.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> priceType = new ArrayList<TextType>();
    /**
     * Price. Orderable Unit Factor. Rate
     * <p>
     * The factor by which the base price unit can be converted to the orderable unit.
     * 
     */
    @JsonProperty("OrderableUnitFactorRate")
    @JsonPropertyDescription("The factor by which the base price unit can be converted to the orderable unit.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> orderableUnitFactorRate = new ArrayList<NumericType>();
    /**
     * Price. Validity_ Period. Period
     * <p>
     * A period during which this price is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    @JsonPropertyDescription("A period during which this price is valid.")
    @Size(min = 1)
    @Valid
    private List<Period> validityPeriod = new ArrayList<Period>();
    /**
     * Price. Price List
     * <p>
     * Information about a price list applicable to this price.
     * 
     */
    @JsonProperty("PriceList")
    @JsonPropertyDescription("Information about a price list applicable to this price.")
    @Size(min = 1, max = 1)
    @Valid
    private List<PriceList> priceList = new ArrayList<PriceList>();
    /**
     * Price. Allowance Charge
     * <p>
     * An allowance or charge associated with this price.
     * 
     */
    @JsonProperty("AllowanceCharge")
    @JsonPropertyDescription("An allowance or charge associated with this price.")
    @Size(min = 1)
    @Valid
    private List<AllowanceCharge> allowanceCharge = new ArrayList<AllowanceCharge>();
    /**
     * Price. Pricing_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate applicable to this price, if it differs from the exchange rate applicable to the document as a whole.
     * 
     */
    @JsonProperty("PricingExchangeRate")
    @JsonPropertyDescription("The exchange rate applicable to this price, if it differs from the exchange rate applicable to the document as a whole.")
    @Size(min = 1, max = 1)
    @Valid
    private List<ExchangeRate> pricingExchangeRate = new ArrayList<ExchangeRate>();

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

    public Price withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Price. Price Amount. Amount
     * <p>
     * The amount of the price.
     * (Required)
     * 
     */
    @JsonProperty("PriceAmount")
    public List<AmountType> getPriceAmount() {
        return priceAmount;
    }

    /**
     * Price. Price Amount. Amount
     * <p>
     * The amount of the price.
     * (Required)
     * 
     */
    @JsonProperty("PriceAmount")
    public void setPriceAmount(List<AmountType> priceAmount) {
        this.priceAmount = priceAmount;
    }

    public Price withPriceAmount(List<AmountType> priceAmount) {
        this.priceAmount = priceAmount;
        return this;
    }

    /**
     * Price. Base_ Quantity. Quantity
     * <p>
     * The quantity at which this price applies.
     * 
     */
    @JsonProperty("BaseQuantity")
    public List<QuantityType> getBaseQuantity() {
        return baseQuantity;
    }

    /**
     * Price. Base_ Quantity. Quantity
     * <p>
     * The quantity at which this price applies.
     * 
     */
    @JsonProperty("BaseQuantity")
    public void setBaseQuantity(List<QuantityType> baseQuantity) {
        this.baseQuantity = baseQuantity;
    }

    public Price withBaseQuantity(List<QuantityType> baseQuantity) {
        this.baseQuantity = baseQuantity;
        return this;
    }

    /**
     * Price. Price Change_ Reason. Text
     * <p>
     * A reason for a price change.
     * 
     */
    @JsonProperty("PriceChangeReason")
    public List<TextType> getPriceChangeReason() {
        return priceChangeReason;
    }

    /**
     * Price. Price Change_ Reason. Text
     * <p>
     * A reason for a price change.
     * 
     */
    @JsonProperty("PriceChangeReason")
    public void setPriceChangeReason(List<TextType> priceChangeReason) {
        this.priceChangeReason = priceChangeReason;
    }

    public Price withPriceChangeReason(List<TextType> priceChangeReason) {
        this.priceChangeReason = priceChangeReason;
        return this;
    }

    /**
     * Price. Price Type Code. Code
     * <p>
     * The type of price, expressed as a code.
     * 
     */
    @JsonProperty("PriceTypeCode")
    public List<CodeType> getPriceTypeCode() {
        return priceTypeCode;
    }

    /**
     * Price. Price Type Code. Code
     * <p>
     * The type of price, expressed as a code.
     * 
     */
    @JsonProperty("PriceTypeCode")
    public void setPriceTypeCode(List<CodeType> priceTypeCode) {
        this.priceTypeCode = priceTypeCode;
    }

    public Price withPriceTypeCode(List<CodeType> priceTypeCode) {
        this.priceTypeCode = priceTypeCode;
        return this;
    }

    /**
     * Price. Price Type. Text
     * <p>
     * The type of price, expressed as text.
     * 
     */
    @JsonProperty("PriceType")
    public List<TextType> getPriceType() {
        return priceType;
    }

    /**
     * Price. Price Type. Text
     * <p>
     * The type of price, expressed as text.
     * 
     */
    @JsonProperty("PriceType")
    public void setPriceType(List<TextType> priceType) {
        this.priceType = priceType;
    }

    public Price withPriceType(List<TextType> priceType) {
        this.priceType = priceType;
        return this;
    }

    /**
     * Price. Orderable Unit Factor. Rate
     * <p>
     * The factor by which the base price unit can be converted to the orderable unit.
     * 
     */
    @JsonProperty("OrderableUnitFactorRate")
    public List<NumericType> getOrderableUnitFactorRate() {
        return orderableUnitFactorRate;
    }

    /**
     * Price. Orderable Unit Factor. Rate
     * <p>
     * The factor by which the base price unit can be converted to the orderable unit.
     * 
     */
    @JsonProperty("OrderableUnitFactorRate")
    public void setOrderableUnitFactorRate(List<NumericType> orderableUnitFactorRate) {
        this.orderableUnitFactorRate = orderableUnitFactorRate;
    }

    public Price withOrderableUnitFactorRate(List<NumericType> orderableUnitFactorRate) {
        this.orderableUnitFactorRate = orderableUnitFactorRate;
        return this;
    }

    /**
     * Price. Validity_ Period. Period
     * <p>
     * A period during which this price is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    public List<Period> getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Price. Validity_ Period. Period
     * <p>
     * A period during which this price is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    public void setValidityPeriod(List<Period> validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public Price withValidityPeriod(List<Period> validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Price. Price List
     * <p>
     * Information about a price list applicable to this price.
     * 
     */
    @JsonProperty("PriceList")
    public List<PriceList> getPriceList() {
        return priceList;
    }

    /**
     * Price. Price List
     * <p>
     * Information about a price list applicable to this price.
     * 
     */
    @JsonProperty("PriceList")
    public void setPriceList(List<PriceList> priceList) {
        this.priceList = priceList;
    }

    public Price withPriceList(List<PriceList> priceList) {
        this.priceList = priceList;
        return this;
    }

    /**
     * Price. Allowance Charge
     * <p>
     * An allowance or charge associated with this price.
     * 
     */
    @JsonProperty("AllowanceCharge")
    public List<AllowanceCharge> getAllowanceCharge() {
        return allowanceCharge;
    }

    /**
     * Price. Allowance Charge
     * <p>
     * An allowance or charge associated with this price.
     * 
     */
    @JsonProperty("AllowanceCharge")
    public void setAllowanceCharge(List<AllowanceCharge> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
    }

    public Price withAllowanceCharge(List<AllowanceCharge> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
        return this;
    }

    /**
     * Price. Pricing_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate applicable to this price, if it differs from the exchange rate applicable to the document as a whole.
     * 
     */
    @JsonProperty("PricingExchangeRate")
    public List<ExchangeRate> getPricingExchangeRate() {
        return pricingExchangeRate;
    }

    /**
     * Price. Pricing_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate applicable to this price, if it differs from the exchange rate applicable to the document as a whole.
     * 
     */
    @JsonProperty("PricingExchangeRate")
    public void setPricingExchangeRate(List<ExchangeRate> pricingExchangeRate) {
        this.pricingExchangeRate = pricingExchangeRate;
    }

    public Price withPricingExchangeRate(List<ExchangeRate> pricingExchangeRate) {
        this.pricingExchangeRate = pricingExchangeRate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Price.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("priceAmount");
        sb.append('=');
        sb.append(((this.priceAmount == null)?"<null>":this.priceAmount));
        sb.append(',');
        sb.append("baseQuantity");
        sb.append('=');
        sb.append(((this.baseQuantity == null)?"<null>":this.baseQuantity));
        sb.append(',');
        sb.append("priceChangeReason");
        sb.append('=');
        sb.append(((this.priceChangeReason == null)?"<null>":this.priceChangeReason));
        sb.append(',');
        sb.append("priceTypeCode");
        sb.append('=');
        sb.append(((this.priceTypeCode == null)?"<null>":this.priceTypeCode));
        sb.append(',');
        sb.append("priceType");
        sb.append('=');
        sb.append(((this.priceType == null)?"<null>":this.priceType));
        sb.append(',');
        sb.append("orderableUnitFactorRate");
        sb.append('=');
        sb.append(((this.orderableUnitFactorRate == null)?"<null>":this.orderableUnitFactorRate));
        sb.append(',');
        sb.append("validityPeriod");
        sb.append('=');
        sb.append(((this.validityPeriod == null)?"<null>":this.validityPeriod));
        sb.append(',');
        sb.append("priceList");
        sb.append('=');
        sb.append(((this.priceList == null)?"<null>":this.priceList));
        sb.append(',');
        sb.append("allowanceCharge");
        sb.append('=');
        sb.append(((this.allowanceCharge == null)?"<null>":this.allowanceCharge));
        sb.append(',');
        sb.append("pricingExchangeRate");
        sb.append('=');
        sb.append(((this.pricingExchangeRate == null)?"<null>":this.pricingExchangeRate));
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
        result = ((result* 31)+((this.validityPeriod == null)? 0 :this.validityPeriod.hashCode()));
        result = ((result* 31)+((this.pricingExchangeRate == null)? 0 :this.pricingExchangeRate.hashCode()));
        result = ((result* 31)+((this.orderableUnitFactorRate == null)? 0 :this.orderableUnitFactorRate.hashCode()));
        result = ((result* 31)+((this.baseQuantity == null)? 0 :this.baseQuantity.hashCode()));
        result = ((result* 31)+((this.priceTypeCode == null)? 0 :this.priceTypeCode.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.priceType == null)? 0 :this.priceType.hashCode()));
        result = ((result* 31)+((this.priceChangeReason == null)? 0 :this.priceChangeReason.hashCode()));
        result = ((result* 31)+((this.priceAmount == null)? 0 :this.priceAmount.hashCode()));
        result = ((result* 31)+((this.allowanceCharge == null)? 0 :this.allowanceCharge.hashCode()));
        result = ((result* 31)+((this.priceList == null)? 0 :this.priceList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Price) == false) {
            return false;
        }
        Price rhs = ((Price) other);
        return ((((((((((((this.validityPeriod == rhs.validityPeriod)||((this.validityPeriod!= null)&&this.validityPeriod.equals(rhs.validityPeriod)))&&((this.pricingExchangeRate == rhs.pricingExchangeRate)||((this.pricingExchangeRate!= null)&&this.pricingExchangeRate.equals(rhs.pricingExchangeRate))))&&((this.orderableUnitFactorRate == rhs.orderableUnitFactorRate)||((this.orderableUnitFactorRate!= null)&&this.orderableUnitFactorRate.equals(rhs.orderableUnitFactorRate))))&&((this.baseQuantity == rhs.baseQuantity)||((this.baseQuantity!= null)&&this.baseQuantity.equals(rhs.baseQuantity))))&&((this.priceTypeCode == rhs.priceTypeCode)||((this.priceTypeCode!= null)&&this.priceTypeCode.equals(rhs.priceTypeCode))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.priceType == rhs.priceType)||((this.priceType!= null)&&this.priceType.equals(rhs.priceType))))&&((this.priceChangeReason == rhs.priceChangeReason)||((this.priceChangeReason!= null)&&this.priceChangeReason.equals(rhs.priceChangeReason))))&&((this.priceAmount == rhs.priceAmount)||((this.priceAmount!= null)&&this.priceAmount.equals(rhs.priceAmount))))&&((this.allowanceCharge == rhs.allowanceCharge)||((this.allowanceCharge!= null)&&this.allowanceCharge.equals(rhs.allowanceCharge))))&&((this.priceList == rhs.priceList)||((this.priceList!= null)&&this.priceList.equals(rhs.priceList))));
    }

}
