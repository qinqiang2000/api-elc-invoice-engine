
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
 * Item Location Quantity. Details
 * <p>
 * A class for information about pricing structure, lead time, and location associated with an item.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "LeadTimeMeasure",
    "MinimumQuantity",
    "MaximumQuantity",
    "HazardousRiskIndicator",
    "TradingRestrictions",
    "ApplicableTerritoryAddress",
    "Price",
    "DeliveryUnit",
    "ApplicableTaxCategory",
    "Package",
    "AllowanceCharge",
    "DependentPriceReference"
})
@Generated("jsonschema2pojo")
public class ItemLocationQuantity {

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
     * Item Location Quantity. Lead Time. Measure
     * <p>
     * The lead time, i.e., the time taken from the time at which an item is ordered to the time of its delivery.
     * 
     */
    @JsonProperty("LeadTimeMeasure")
    @JsonPropertyDescription("The lead time, i.e., the time taken from the time at which an item is ordered to the time of its delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> leadTimeMeasure = new ArrayList<MeasureType>();
    /**
     * Item Location Quantity. Minimum_ Quantity. Quantity
     * <p>
     * The minimum quantity that can be ordered to qualify for a specific price.
     * 
     */
    @JsonProperty("MinimumQuantity")
    @JsonPropertyDescription("The minimum quantity that can be ordered to qualify for a specific price.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> minimumQuantity = new ArrayList<QuantityType>();
    /**
     * Item Location Quantity. Maximum_ Quantity. Quantity
     * <p>
     * The maximum quantity that can be ordered to qualify for a specific price.
     * 
     */
    @JsonProperty("MaximumQuantity")
    @JsonPropertyDescription("The maximum quantity that can be ordered to qualify for a specific price.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> maximumQuantity = new ArrayList<QuantityType>();
    /**
     * Item Location Quantity. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported item, as delivered, in the stated quantity to the stated location, is subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    @JsonPropertyDescription("An indication that the transported item, as delivered, in the stated quantity to the stated location, is subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> hazardousRiskIndicator = new ArrayList<IndicatorType>();
    /**
     * Item Location Quantity. Trading Restrictions. Text
     * <p>
     * Text describing trade restrictions on the quantity of this item or on the item itself.
     * 
     */
    @JsonProperty("TradingRestrictions")
    @JsonPropertyDescription("Text describing trade restrictions on the quantity of this item or on the item itself.")
    @Size(min = 1)
    @Valid
    private List<TextType> tradingRestrictions = new ArrayList<TextType>();
    /**
     * Item Location Quantity. Applicable Territory_ Address. Address
     * <p>
     * The applicable sales territory.
     * 
     */
    @JsonProperty("ApplicableTerritoryAddress")
    @JsonPropertyDescription("The applicable sales territory.")
    @Size(min = 1)
    @Valid
    private List<Address> applicableTerritoryAddress = new ArrayList<Address>();
    /**
     * Item Location Quantity. Price
     * <p>
     * The price associated with the given location.
     * 
     */
    @JsonProperty("Price")
    @JsonPropertyDescription("The price associated with the given location.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Price> price = new ArrayList<Price>();
    /**
     * Item Location Quantity. Delivery Unit
     * <p>
     * A delivery unit in which the item is located.
     * 
     */
    @JsonProperty("DeliveryUnit")
    @JsonPropertyDescription("A delivery unit in which the item is located.")
    @Size(min = 1)
    @Valid
    private List<DeliveryUnit> deliveryUnit = new ArrayList<DeliveryUnit>();
    /**
     * Item Location Quantity. Applicable_ Tax Category. Tax Category
     * <p>
     * A tax category applicable to this item location quantity.
     * 
     */
    @JsonProperty("ApplicableTaxCategory")
    @JsonPropertyDescription("A tax category applicable to this item location quantity.")
    @Size(min = 1)
    @Valid
    private List<TaxCategory> applicableTaxCategory = new ArrayList<TaxCategory>();
    /**
     * Item Location Quantity. Package
     * <p>
     * The package to which this price applies.
     * 
     */
    @JsonProperty("Package")
    @JsonPropertyDescription("The package to which this price applies.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Package> _package = new ArrayList<Package>();
    /**
     * Item Location Quantity. Allowance Charge
     * <p>
     * An allowance or charge associated with this item location quantity.
     * 
     */
    @JsonProperty("AllowanceCharge")
    @JsonPropertyDescription("An allowance or charge associated with this item location quantity.")
    @Size(min = 1)
    @Valid
    private List<AllowanceCharge> allowanceCharge = new ArrayList<AllowanceCharge>();
    /**
     * Item Location Quantity. Dependent Price Reference
     * <p>
     * The price of the item as a percentage of the price of some other item.
     * 
     */
    @JsonProperty("DependentPriceReference")
    @JsonPropertyDescription("The price of the item as a percentage of the price of some other item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DependentPriceReference> dependentPriceReference = new ArrayList<DependentPriceReference>();

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

    public ItemLocationQuantity withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Item Location Quantity. Lead Time. Measure
     * <p>
     * The lead time, i.e., the time taken from the time at which an item is ordered to the time of its delivery.
     * 
     */
    @JsonProperty("LeadTimeMeasure")
    public List<MeasureType> getLeadTimeMeasure() {
        return leadTimeMeasure;
    }

    /**
     * Item Location Quantity. Lead Time. Measure
     * <p>
     * The lead time, i.e., the time taken from the time at which an item is ordered to the time of its delivery.
     * 
     */
    @JsonProperty("LeadTimeMeasure")
    public void setLeadTimeMeasure(List<MeasureType> leadTimeMeasure) {
        this.leadTimeMeasure = leadTimeMeasure;
    }

    public ItemLocationQuantity withLeadTimeMeasure(List<MeasureType> leadTimeMeasure) {
        this.leadTimeMeasure = leadTimeMeasure;
        return this;
    }

    /**
     * Item Location Quantity. Minimum_ Quantity. Quantity
     * <p>
     * The minimum quantity that can be ordered to qualify for a specific price.
     * 
     */
    @JsonProperty("MinimumQuantity")
    public List<QuantityType> getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Item Location Quantity. Minimum_ Quantity. Quantity
     * <p>
     * The minimum quantity that can be ordered to qualify for a specific price.
     * 
     */
    @JsonProperty("MinimumQuantity")
    public void setMinimumQuantity(List<QuantityType> minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public ItemLocationQuantity withMinimumQuantity(List<QuantityType> minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
        return this;
    }

    /**
     * Item Location Quantity. Maximum_ Quantity. Quantity
     * <p>
     * The maximum quantity that can be ordered to qualify for a specific price.
     * 
     */
    @JsonProperty("MaximumQuantity")
    public List<QuantityType> getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Item Location Quantity. Maximum_ Quantity. Quantity
     * <p>
     * The maximum quantity that can be ordered to qualify for a specific price.
     * 
     */
    @JsonProperty("MaximumQuantity")
    public void setMaximumQuantity(List<QuantityType> maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public ItemLocationQuantity withMaximumQuantity(List<QuantityType> maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
        return this;
    }

    /**
     * Item Location Quantity. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported item, as delivered, in the stated quantity to the stated location, is subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    public List<IndicatorType> getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Item Location Quantity. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported item, as delivered, in the stated quantity to the stated location, is subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    public void setHazardousRiskIndicator(List<IndicatorType> hazardousRiskIndicator) {
        this.hazardousRiskIndicator = hazardousRiskIndicator;
    }

    public ItemLocationQuantity withHazardousRiskIndicator(List<IndicatorType> hazardousRiskIndicator) {
        this.hazardousRiskIndicator = hazardousRiskIndicator;
        return this;
    }

    /**
     * Item Location Quantity. Trading Restrictions. Text
     * <p>
     * Text describing trade restrictions on the quantity of this item or on the item itself.
     * 
     */
    @JsonProperty("TradingRestrictions")
    public List<TextType> getTradingRestrictions() {
        return tradingRestrictions;
    }

    /**
     * Item Location Quantity. Trading Restrictions. Text
     * <p>
     * Text describing trade restrictions on the quantity of this item or on the item itself.
     * 
     */
    @JsonProperty("TradingRestrictions")
    public void setTradingRestrictions(List<TextType> tradingRestrictions) {
        this.tradingRestrictions = tradingRestrictions;
    }

    public ItemLocationQuantity withTradingRestrictions(List<TextType> tradingRestrictions) {
        this.tradingRestrictions = tradingRestrictions;
        return this;
    }

    /**
     * Item Location Quantity. Applicable Territory_ Address. Address
     * <p>
     * The applicable sales territory.
     * 
     */
    @JsonProperty("ApplicableTerritoryAddress")
    public List<Address> getApplicableTerritoryAddress() {
        return applicableTerritoryAddress;
    }

    /**
     * Item Location Quantity. Applicable Territory_ Address. Address
     * <p>
     * The applicable sales territory.
     * 
     */
    @JsonProperty("ApplicableTerritoryAddress")
    public void setApplicableTerritoryAddress(List<Address> applicableTerritoryAddress) {
        this.applicableTerritoryAddress = applicableTerritoryAddress;
    }

    public ItemLocationQuantity withApplicableTerritoryAddress(List<Address> applicableTerritoryAddress) {
        this.applicableTerritoryAddress = applicableTerritoryAddress;
        return this;
    }

    /**
     * Item Location Quantity. Price
     * <p>
     * The price associated with the given location.
     * 
     */
    @JsonProperty("Price")
    public List<Price> getPrice() {
        return price;
    }

    /**
     * Item Location Quantity. Price
     * <p>
     * The price associated with the given location.
     * 
     */
    @JsonProperty("Price")
    public void setPrice(List<Price> price) {
        this.price = price;
    }

    public ItemLocationQuantity withPrice(List<Price> price) {
        this.price = price;
        return this;
    }

    /**
     * Item Location Quantity. Delivery Unit
     * <p>
     * A delivery unit in which the item is located.
     * 
     */
    @JsonProperty("DeliveryUnit")
    public List<DeliveryUnit> getDeliveryUnit() {
        return deliveryUnit;
    }

    /**
     * Item Location Quantity. Delivery Unit
     * <p>
     * A delivery unit in which the item is located.
     * 
     */
    @JsonProperty("DeliveryUnit")
    public void setDeliveryUnit(List<DeliveryUnit> deliveryUnit) {
        this.deliveryUnit = deliveryUnit;
    }

    public ItemLocationQuantity withDeliveryUnit(List<DeliveryUnit> deliveryUnit) {
        this.deliveryUnit = deliveryUnit;
        return this;
    }

    /**
     * Item Location Quantity. Applicable_ Tax Category. Tax Category
     * <p>
     * A tax category applicable to this item location quantity.
     * 
     */
    @JsonProperty("ApplicableTaxCategory")
    public List<TaxCategory> getApplicableTaxCategory() {
        return applicableTaxCategory;
    }

    /**
     * Item Location Quantity. Applicable_ Tax Category. Tax Category
     * <p>
     * A tax category applicable to this item location quantity.
     * 
     */
    @JsonProperty("ApplicableTaxCategory")
    public void setApplicableTaxCategory(List<TaxCategory> applicableTaxCategory) {
        this.applicableTaxCategory = applicableTaxCategory;
    }

    public ItemLocationQuantity withApplicableTaxCategory(List<TaxCategory> applicableTaxCategory) {
        this.applicableTaxCategory = applicableTaxCategory;
        return this;
    }

    /**
     * Item Location Quantity. Package
     * <p>
     * The package to which this price applies.
     * 
     */
    @JsonProperty("Package")
    public List<Package> getPackage() {
        return _package;
    }

    /**
     * Item Location Quantity. Package
     * <p>
     * The package to which this price applies.
     * 
     */
    @JsonProperty("Package")
    public void setPackage(List<Package> _package) {
        this._package = _package;
    }

    public ItemLocationQuantity withPackage(List<Package> _package) {
        this._package = _package;
        return this;
    }

    /**
     * Item Location Quantity. Allowance Charge
     * <p>
     * An allowance or charge associated with this item location quantity.
     * 
     */
    @JsonProperty("AllowanceCharge")
    public List<AllowanceCharge> getAllowanceCharge() {
        return allowanceCharge;
    }

    /**
     * Item Location Quantity. Allowance Charge
     * <p>
     * An allowance or charge associated with this item location quantity.
     * 
     */
    @JsonProperty("AllowanceCharge")
    public void setAllowanceCharge(List<AllowanceCharge> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
    }

    public ItemLocationQuantity withAllowanceCharge(List<AllowanceCharge> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
        return this;
    }

    /**
     * Item Location Quantity. Dependent Price Reference
     * <p>
     * The price of the item as a percentage of the price of some other item.
     * 
     */
    @JsonProperty("DependentPriceReference")
    public List<DependentPriceReference> getDependentPriceReference() {
        return dependentPriceReference;
    }

    /**
     * Item Location Quantity. Dependent Price Reference
     * <p>
     * The price of the item as a percentage of the price of some other item.
     * 
     */
    @JsonProperty("DependentPriceReference")
    public void setDependentPriceReference(List<DependentPriceReference> dependentPriceReference) {
        this.dependentPriceReference = dependentPriceReference;
    }

    public ItemLocationQuantity withDependentPriceReference(List<DependentPriceReference> dependentPriceReference) {
        this.dependentPriceReference = dependentPriceReference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ItemLocationQuantity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("leadTimeMeasure");
        sb.append('=');
        sb.append(((this.leadTimeMeasure == null)?"<null>":this.leadTimeMeasure));
        sb.append(',');
        sb.append("minimumQuantity");
        sb.append('=');
        sb.append(((this.minimumQuantity == null)?"<null>":this.minimumQuantity));
        sb.append(',');
        sb.append("maximumQuantity");
        sb.append('=');
        sb.append(((this.maximumQuantity == null)?"<null>":this.maximumQuantity));
        sb.append(',');
        sb.append("hazardousRiskIndicator");
        sb.append('=');
        sb.append(((this.hazardousRiskIndicator == null)?"<null>":this.hazardousRiskIndicator));
        sb.append(',');
        sb.append("tradingRestrictions");
        sb.append('=');
        sb.append(((this.tradingRestrictions == null)?"<null>":this.tradingRestrictions));
        sb.append(',');
        sb.append("applicableTerritoryAddress");
        sb.append('=');
        sb.append(((this.applicableTerritoryAddress == null)?"<null>":this.applicableTerritoryAddress));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("deliveryUnit");
        sb.append('=');
        sb.append(((this.deliveryUnit == null)?"<null>":this.deliveryUnit));
        sb.append(',');
        sb.append("applicableTaxCategory");
        sb.append('=');
        sb.append(((this.applicableTaxCategory == null)?"<null>":this.applicableTaxCategory));
        sb.append(',');
        sb.append("_package");
        sb.append('=');
        sb.append(((this._package == null)?"<null>":this._package));
        sb.append(',');
        sb.append("allowanceCharge");
        sb.append('=');
        sb.append(((this.allowanceCharge == null)?"<null>":this.allowanceCharge));
        sb.append(',');
        sb.append("dependentPriceReference");
        sb.append('=');
        sb.append(((this.dependentPriceReference == null)?"<null>":this.dependentPriceReference));
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
        result = ((result* 31)+((this.applicableTaxCategory == null)? 0 :this.applicableTaxCategory.hashCode()));
        result = ((result* 31)+((this.leadTimeMeasure == null)? 0 :this.leadTimeMeasure.hashCode()));
        result = ((result* 31)+((this.applicableTerritoryAddress == null)? 0 :this.applicableTerritoryAddress.hashCode()));
        result = ((result* 31)+((this.hazardousRiskIndicator == null)? 0 :this.hazardousRiskIndicator.hashCode()));
        result = ((result* 31)+((this._package == null)? 0 :this._package.hashCode()));
        result = ((result* 31)+((this.dependentPriceReference == null)? 0 :this.dependentPriceReference.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.tradingRestrictions == null)? 0 :this.tradingRestrictions.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.minimumQuantity == null)? 0 :this.minimumQuantity.hashCode()));
        result = ((result* 31)+((this.deliveryUnit == null)? 0 :this.deliveryUnit.hashCode()));
        result = ((result* 31)+((this.allowanceCharge == null)? 0 :this.allowanceCharge.hashCode()));
        result = ((result* 31)+((this.maximumQuantity == null)? 0 :this.maximumQuantity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ItemLocationQuantity) == false) {
            return false;
        }
        ItemLocationQuantity rhs = ((ItemLocationQuantity) other);
        return ((((((((((((((this.applicableTaxCategory == rhs.applicableTaxCategory)||((this.applicableTaxCategory!= null)&&this.applicableTaxCategory.equals(rhs.applicableTaxCategory)))&&((this.leadTimeMeasure == rhs.leadTimeMeasure)||((this.leadTimeMeasure!= null)&&this.leadTimeMeasure.equals(rhs.leadTimeMeasure))))&&((this.applicableTerritoryAddress == rhs.applicableTerritoryAddress)||((this.applicableTerritoryAddress!= null)&&this.applicableTerritoryAddress.equals(rhs.applicableTerritoryAddress))))&&((this.hazardousRiskIndicator == rhs.hazardousRiskIndicator)||((this.hazardousRiskIndicator!= null)&&this.hazardousRiskIndicator.equals(rhs.hazardousRiskIndicator))))&&((this._package == rhs._package)||((this._package!= null)&&this._package.equals(rhs._package))))&&((this.dependentPriceReference == rhs.dependentPriceReference)||((this.dependentPriceReference!= null)&&this.dependentPriceReference.equals(rhs.dependentPriceReference))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.tradingRestrictions == rhs.tradingRestrictions)||((this.tradingRestrictions!= null)&&this.tradingRestrictions.equals(rhs.tradingRestrictions))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.minimumQuantity == rhs.minimumQuantity)||((this.minimumQuantity!= null)&&this.minimumQuantity.equals(rhs.minimumQuantity))))&&((this.deliveryUnit == rhs.deliveryUnit)||((this.deliveryUnit!= null)&&this.deliveryUnit.equals(rhs.deliveryUnit))))&&((this.allowanceCharge == rhs.allowanceCharge)||((this.allowanceCharge!= null)&&this.allowanceCharge.equals(rhs.allowanceCharge))))&&((this.maximumQuantity == rhs.maximumQuantity)||((this.maximumQuantity!= null)&&this.maximumQuantity.equals(rhs.maximumQuantity))));
    }

}
