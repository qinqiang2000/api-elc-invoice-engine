
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
 * Pricing Reference. Details
 * <p>
 * A reference to the basis for pricing. This may be based on a catalogue or a quoted amount from a price list and include some alternative pricing conditions.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "OriginalItemLocationQuantity",
    "AlternativeConditionPrice"
})
@Generated("jsonschema2pojo")
public class PricingReference {

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
     * Pricing Reference. Original_ Item Location Quantity. Item Location Quantity
     * <p>
     * An original set of location-specific properties (e.g., price and quantity) associated with this item.
     * 
     */
    @JsonProperty("OriginalItemLocationQuantity")
    @JsonPropertyDescription("An original set of location-specific properties (e.g., price and quantity) associated with this item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<ItemLocationQuantity> originalItemLocationQuantity = new ArrayList<ItemLocationQuantity>();
    /**
     * Pricing Reference. Alternative Condition_ Price. Price
     * <p>
     * The price expressed in terms other than the actual price, e.g., the list price v. the contracted price, or the price in bags v. the price in kilos, or the list price in bags v. the contracted price in kilos.
     * 
     */
    @JsonProperty("AlternativeConditionPrice")
    @JsonPropertyDescription("The price expressed in terms other than the actual price, e.g., the list price v. the contracted price, or the price in bags v. the price in kilos, or the list price in bags v. the contracted price in kilos.")
    @Size(min = 1)
    @Valid
    private List<Price> alternativeConditionPrice = new ArrayList<Price>();

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

    public PricingReference withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Pricing Reference. Original_ Item Location Quantity. Item Location Quantity
     * <p>
     * An original set of location-specific properties (e.g., price and quantity) associated with this item.
     * 
     */
    @JsonProperty("OriginalItemLocationQuantity")
    public List<ItemLocationQuantity> getOriginalItemLocationQuantity() {
        return originalItemLocationQuantity;
    }

    /**
     * Pricing Reference. Original_ Item Location Quantity. Item Location Quantity
     * <p>
     * An original set of location-specific properties (e.g., price and quantity) associated with this item.
     * 
     */
    @JsonProperty("OriginalItemLocationQuantity")
    public void setOriginalItemLocationQuantity(List<ItemLocationQuantity> originalItemLocationQuantity) {
        this.originalItemLocationQuantity = originalItemLocationQuantity;
    }

    public PricingReference withOriginalItemLocationQuantity(List<ItemLocationQuantity> originalItemLocationQuantity) {
        this.originalItemLocationQuantity = originalItemLocationQuantity;
        return this;
    }

    /**
     * Pricing Reference. Alternative Condition_ Price. Price
     * <p>
     * The price expressed in terms other than the actual price, e.g., the list price v. the contracted price, or the price in bags v. the price in kilos, or the list price in bags v. the contracted price in kilos.
     * 
     */
    @JsonProperty("AlternativeConditionPrice")
    public List<Price> getAlternativeConditionPrice() {
        return alternativeConditionPrice;
    }

    /**
     * Pricing Reference. Alternative Condition_ Price. Price
     * <p>
     * The price expressed in terms other than the actual price, e.g., the list price v. the contracted price, or the price in bags v. the price in kilos, or the list price in bags v. the contracted price in kilos.
     * 
     */
    @JsonProperty("AlternativeConditionPrice")
    public void setAlternativeConditionPrice(List<Price> alternativeConditionPrice) {
        this.alternativeConditionPrice = alternativeConditionPrice;
    }

    public PricingReference withAlternativeConditionPrice(List<Price> alternativeConditionPrice) {
        this.alternativeConditionPrice = alternativeConditionPrice;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PricingReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("originalItemLocationQuantity");
        sb.append('=');
        sb.append(((this.originalItemLocationQuantity == null)?"<null>":this.originalItemLocationQuantity));
        sb.append(',');
        sb.append("alternativeConditionPrice");
        sb.append('=');
        sb.append(((this.alternativeConditionPrice == null)?"<null>":this.alternativeConditionPrice));
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
        result = ((result* 31)+((this.originalItemLocationQuantity == null)? 0 :this.originalItemLocationQuantity.hashCode()));
        result = ((result* 31)+((this.alternativeConditionPrice == null)? 0 :this.alternativeConditionPrice.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PricingReference) == false) {
            return false;
        }
        PricingReference rhs = ((PricingReference) other);
        return ((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.originalItemLocationQuantity == rhs.originalItemLocationQuantity)||((this.originalItemLocationQuantity!= null)&&this.originalItemLocationQuantity.equals(rhs.originalItemLocationQuantity))))&&((this.alternativeConditionPrice == rhs.alternativeConditionPrice)||((this.alternativeConditionPrice!= null)&&this.alternativeConditionPrice.equals(rhs.alternativeConditionPrice))));
    }

}
