
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
 * Dependent Price Reference. Details
 * <p>
 * A class to define the price of an item as a percentage of the price of a different item.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "Percent",
    "LocationAddress",
    "DependentLineReference"
})
@Generated("jsonschema2pojo")
public class DependentPriceReference {

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
     * Dependent Price Reference. Percent
     * <p>
     * The percentage by which the price of the different item is multiplied to calculate the price of the item.
     * 
     */
    @JsonProperty("Percent")
    @JsonPropertyDescription("The percentage by which the price of the different item is multiplied to calculate the price of the item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> percent = new ArrayList<NumericType>();
    /**
     * Dependent Price Reference. Location_ Address. Address
     * <p>
     * The reference location for this dependent price reference.
     * 
     */
    @JsonProperty("LocationAddress")
    @JsonPropertyDescription("The reference location for this dependent price reference.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Address> locationAddress = new ArrayList<Address>();
    /**
     * Dependent Price Reference. Dependent_ Line Reference. Line Reference
     * <p>
     * A reference to a line that the price is depended of.
     * 
     */
    @JsonProperty("DependentLineReference")
    @JsonPropertyDescription("A reference to a line that the price is depended of.")
    @Size(min = 1, max = 1)
    @Valid
    private List<LineReference> dependentLineReference = new ArrayList<LineReference>();

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

    public DependentPriceReference withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Dependent Price Reference. Percent
     * <p>
     * The percentage by which the price of the different item is multiplied to calculate the price of the item.
     * 
     */
    @JsonProperty("Percent")
    public List<NumericType> getPercent() {
        return percent;
    }

    /**
     * Dependent Price Reference. Percent
     * <p>
     * The percentage by which the price of the different item is multiplied to calculate the price of the item.
     * 
     */
    @JsonProperty("Percent")
    public void setPercent(List<NumericType> percent) {
        this.percent = percent;
    }

    public DependentPriceReference withPercent(List<NumericType> percent) {
        this.percent = percent;
        return this;
    }

    /**
     * Dependent Price Reference. Location_ Address. Address
     * <p>
     * The reference location for this dependent price reference.
     * 
     */
    @JsonProperty("LocationAddress")
    public List<Address> getLocationAddress() {
        return locationAddress;
    }

    /**
     * Dependent Price Reference. Location_ Address. Address
     * <p>
     * The reference location for this dependent price reference.
     * 
     */
    @JsonProperty("LocationAddress")
    public void setLocationAddress(List<Address> locationAddress) {
        this.locationAddress = locationAddress;
    }

    public DependentPriceReference withLocationAddress(List<Address> locationAddress) {
        this.locationAddress = locationAddress;
        return this;
    }

    /**
     * Dependent Price Reference. Dependent_ Line Reference. Line Reference
     * <p>
     * A reference to a line that the price is depended of.
     * 
     */
    @JsonProperty("DependentLineReference")
    public List<LineReference> getDependentLineReference() {
        return dependentLineReference;
    }

    /**
     * Dependent Price Reference. Dependent_ Line Reference. Line Reference
     * <p>
     * A reference to a line that the price is depended of.
     * 
     */
    @JsonProperty("DependentLineReference")
    public void setDependentLineReference(List<LineReference> dependentLineReference) {
        this.dependentLineReference = dependentLineReference;
    }

    public DependentPriceReference withDependentLineReference(List<LineReference> dependentLineReference) {
        this.dependentLineReference = dependentLineReference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DependentPriceReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("locationAddress");
        sb.append('=');
        sb.append(((this.locationAddress == null)?"<null>":this.locationAddress));
        sb.append(',');
        sb.append("dependentLineReference");
        sb.append('=');
        sb.append(((this.dependentLineReference == null)?"<null>":this.dependentLineReference));
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
        result = ((result* 31)+((this.dependentLineReference == null)? 0 :this.dependentLineReference.hashCode()));
        result = ((result* 31)+((this.locationAddress == null)? 0 :this.locationAddress.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DependentPriceReference) == false) {
            return false;
        }
        DependentPriceReference rhs = ((DependentPriceReference) other);
        return (((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.dependentLineReference == rhs.dependentLineReference)||((this.dependentLineReference!= null)&&this.dependentLineReference.equals(rhs.dependentLineReference))))&&((this.locationAddress == rhs.locationAddress)||((this.locationAddress!= null)&&this.locationAddress.equals(rhs.locationAddress))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))));
    }

}
