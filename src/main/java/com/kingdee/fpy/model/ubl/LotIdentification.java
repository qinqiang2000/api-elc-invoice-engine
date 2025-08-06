
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
 * Lot Identification. Details
 * <p>
 * A class for defining a lot identifier (the identifier of a set of item instances that would be used in case of a recall of that item).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "LotNumberID",
    "ExpiryDate",
    "AdditionalItemProperty"
})
@Generated("jsonschema2pojo")
public class LotIdentification {

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
     * Lot Identification. Lot Number. Identifier
     * <p>
     * An identifier for the lot.
     * 
     */
    @JsonProperty("LotNumberID")
    @JsonPropertyDescription("An identifier for the lot.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> lotNumberID = new ArrayList<IdentifierType>();
    /**
     * Lot Identification. Expiry Date. Date
     * <p>
     * The expiry date of the lot.
     * 
     */
    @JsonProperty("ExpiryDate")
    @JsonPropertyDescription("The expiry date of the lot.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> expiryDate = new ArrayList<DateType>();
    /**
     * Lot Identification. Additional_ Item Property. Item Property
     * <p>
     * An additional property of the lot.
     * 
     */
    @JsonProperty("AdditionalItemProperty")
    @JsonPropertyDescription("An additional property of the lot.")
    @Size(min = 1)
    @Valid
    private List<ItemProperty> additionalItemProperty = new ArrayList<ItemProperty>();

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

    public LotIdentification withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Lot Identification. Lot Number. Identifier
     * <p>
     * An identifier for the lot.
     * 
     */
    @JsonProperty("LotNumberID")
    public List<IdentifierType> getLotNumberID() {
        return lotNumberID;
    }

    /**
     * Lot Identification. Lot Number. Identifier
     * <p>
     * An identifier for the lot.
     * 
     */
    @JsonProperty("LotNumberID")
    public void setLotNumberID(List<IdentifierType> lotNumberID) {
        this.lotNumberID = lotNumberID;
    }

    public LotIdentification withLotNumberID(List<IdentifierType> lotNumberID) {
        this.lotNumberID = lotNumberID;
        return this;
    }

    /**
     * Lot Identification. Expiry Date. Date
     * <p>
     * The expiry date of the lot.
     * 
     */
    @JsonProperty("ExpiryDate")
    public List<DateType> getExpiryDate() {
        return expiryDate;
    }

    /**
     * Lot Identification. Expiry Date. Date
     * <p>
     * The expiry date of the lot.
     * 
     */
    @JsonProperty("ExpiryDate")
    public void setExpiryDate(List<DateType> expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LotIdentification withExpiryDate(List<DateType> expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Lot Identification. Additional_ Item Property. Item Property
     * <p>
     * An additional property of the lot.
     * 
     */
    @JsonProperty("AdditionalItemProperty")
    public List<ItemProperty> getAdditionalItemProperty() {
        return additionalItemProperty;
    }

    /**
     * Lot Identification. Additional_ Item Property. Item Property
     * <p>
     * An additional property of the lot.
     * 
     */
    @JsonProperty("AdditionalItemProperty")
    public void setAdditionalItemProperty(List<ItemProperty> additionalItemProperty) {
        this.additionalItemProperty = additionalItemProperty;
    }

    public LotIdentification withAdditionalItemProperty(List<ItemProperty> additionalItemProperty) {
        this.additionalItemProperty = additionalItemProperty;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LotIdentification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("lotNumberID");
        sb.append('=');
        sb.append(((this.lotNumberID == null)?"<null>":this.lotNumberID));
        sb.append(',');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
        sb.append(',');
        sb.append("additionalItemProperty");
        sb.append('=');
        sb.append(((this.additionalItemProperty == null)?"<null>":this.additionalItemProperty));
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
        result = ((result* 31)+((this.expiryDate == null)? 0 :this.expiryDate.hashCode()));
        result = ((result* 31)+((this.lotNumberID == null)? 0 :this.lotNumberID.hashCode()));
        result = ((result* 31)+((this.additionalItemProperty == null)? 0 :this.additionalItemProperty.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LotIdentification) == false) {
            return false;
        }
        LotIdentification rhs = ((LotIdentification) other);
        return (((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.expiryDate == rhs.expiryDate)||((this.expiryDate!= null)&&this.expiryDate.equals(rhs.expiryDate))))&&((this.lotNumberID == rhs.lotNumberID)||((this.lotNumberID!= null)&&this.lotNumberID.equals(rhs.lotNumberID))))&&((this.additionalItemProperty == rhs.additionalItemProperty)||((this.additionalItemProperty!= null)&&this.additionalItemProperty.equals(rhs.additionalItemProperty))));
    }

}
