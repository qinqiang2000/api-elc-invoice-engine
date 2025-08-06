
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
 * Location. Details
 * <p>
 * A class to describe a location.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Description",
    "Conditions",
    "CountrySubentity",
    "CountrySubentityCode",
    "LocationTypeCode",
    "InformationURI",
    "Name",
    "ValidityPeriod",
    "Address",
    "SubsidiaryLocation",
    "LocationCoordinate"
})
@Generated("jsonschema2pojo")
public class Location {

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
     * Location. Identifier
     * <p>
     * An identifier for this location, e.g., the EAN Location Number, GLN.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this location, e.g., the EAN Location Number, GLN.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Location. Description. Text
     * <p>
     * Text describing this location.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("Text describing this location.")
    @Size(min = 1)
    @Valid
    private List<TextType> description = new ArrayList<TextType>();
    /**
     * Location. Conditions. Text
     * <p>
     * Free-form text describing the physical conditions of the location.
     * 
     */
    @JsonProperty("Conditions")
    @JsonPropertyDescription("Free-form text describing the physical conditions of the location.")
    @Size(min = 1)
    @Valid
    private List<TextType> conditions = new ArrayList<TextType>();
    /**
     * Location. Country Subentity. Text
     * <p>
     * A territorial division of a country, such as a county or state, expressed as text.
     * 
     */
    @JsonProperty("CountrySubentity")
    @JsonPropertyDescription("A territorial division of a country, such as a county or state, expressed as text.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> countrySubentity = new ArrayList<TextType>();
    /**
     * Location. Country Subentity Code. Code
     * <p>
     * A territorial division of a country, such as a county or state, expressed as a code.
     * 
     */
    @JsonProperty("CountrySubentityCode")
    @JsonPropertyDescription("A territorial division of a country, such as a county or state, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> countrySubentityCode = new ArrayList<CodeType>();
    /**
     * Location. Location Type Code. Code
     * <p>
     * A code signifying the type of location.
     * 
     */
    @JsonProperty("LocationTypeCode")
    @JsonPropertyDescription("A code signifying the type of location.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> locationTypeCode = new ArrayList<CodeType>();
    /**
     * Location. Information_ URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) of a document providing information about this location.
     * 
     */
    @JsonProperty("InformationURI")
    @JsonPropertyDescription("The Uniform Resource Identifier (URI) of a document providing information about this location.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> informationURI = new ArrayList<IdentifierType>();
    /**
     * Location. Name
     * <p>
     * The name of this location.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("The name of this location.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> name = new ArrayList<TextType>();
    /**
     * Location. Validity_ Period. Period
     * <p>
     * A period during which this location can be used (e.g., for delivery).
     * 
     */
    @JsonProperty("ValidityPeriod")
    @JsonPropertyDescription("A period during which this location can be used (e.g., for delivery).")
    @Size(min = 1)
    @Valid
    private List<Period> validityPeriod = new ArrayList<Period>();
    /**
     * Location. Address
     * <p>
     * The address of this location.
     * 
     */
    @JsonProperty("Address")
    @JsonPropertyDescription("The address of this location.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Address> address = new ArrayList<Address>();
    /**
     * Location. Subsidiary_ Location. Location
     * <p>
     * A location subsidiary to this location.
     * 
     */
    @JsonProperty("SubsidiaryLocation")
    @JsonPropertyDescription("A location subsidiary to this location.")
    @Size(min = 1)
    @Valid
    private List<Location> subsidiaryLocation = new ArrayList<Location>();
    /**
     * Location. Location Coordinate
     * <p>
     * The geographical coordinates of this location.
     * 
     */
    @JsonProperty("LocationCoordinate")
    @JsonPropertyDescription("The geographical coordinates of this location.")
    @Size(min = 1)
    @Valid
    private List<LocationCoordinate> locationCoordinate = new ArrayList<LocationCoordinate>();

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

    public Location withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Location. Identifier
     * <p>
     * An identifier for this location, e.g., the EAN Location Number, GLN.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Location. Identifier
     * <p>
     * An identifier for this location, e.g., the EAN Location Number, GLN.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Location withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Location. Description. Text
     * <p>
     * Text describing this location.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * Location. Description. Text
     * <p>
     * Text describing this location.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public Location withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    /**
     * Location. Conditions. Text
     * <p>
     * Free-form text describing the physical conditions of the location.
     * 
     */
    @JsonProperty("Conditions")
    public List<TextType> getConditions() {
        return conditions;
    }

    /**
     * Location. Conditions. Text
     * <p>
     * Free-form text describing the physical conditions of the location.
     * 
     */
    @JsonProperty("Conditions")
    public void setConditions(List<TextType> conditions) {
        this.conditions = conditions;
    }

    public Location withConditions(List<TextType> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Location. Country Subentity. Text
     * <p>
     * A territorial division of a country, such as a county or state, expressed as text.
     * 
     */
    @JsonProperty("CountrySubentity")
    public List<TextType> getCountrySubentity() {
        return countrySubentity;
    }

    /**
     * Location. Country Subentity. Text
     * <p>
     * A territorial division of a country, such as a county or state, expressed as text.
     * 
     */
    @JsonProperty("CountrySubentity")
    public void setCountrySubentity(List<TextType> countrySubentity) {
        this.countrySubentity = countrySubentity;
    }

    public Location withCountrySubentity(List<TextType> countrySubentity) {
        this.countrySubentity = countrySubentity;
        return this;
    }

    /**
     * Location. Country Subentity Code. Code
     * <p>
     * A territorial division of a country, such as a county or state, expressed as a code.
     * 
     */
    @JsonProperty("CountrySubentityCode")
    public List<CodeType> getCountrySubentityCode() {
        return countrySubentityCode;
    }

    /**
     * Location. Country Subentity Code. Code
     * <p>
     * A territorial division of a country, such as a county or state, expressed as a code.
     * 
     */
    @JsonProperty("CountrySubentityCode")
    public void setCountrySubentityCode(List<CodeType> countrySubentityCode) {
        this.countrySubentityCode = countrySubentityCode;
    }

    public Location withCountrySubentityCode(List<CodeType> countrySubentityCode) {
        this.countrySubentityCode = countrySubentityCode;
        return this;
    }

    /**
     * Location. Location Type Code. Code
     * <p>
     * A code signifying the type of location.
     * 
     */
    @JsonProperty("LocationTypeCode")
    public List<CodeType> getLocationTypeCode() {
        return locationTypeCode;
    }

    /**
     * Location. Location Type Code. Code
     * <p>
     * A code signifying the type of location.
     * 
     */
    @JsonProperty("LocationTypeCode")
    public void setLocationTypeCode(List<CodeType> locationTypeCode) {
        this.locationTypeCode = locationTypeCode;
    }

    public Location withLocationTypeCode(List<CodeType> locationTypeCode) {
        this.locationTypeCode = locationTypeCode;
        return this;
    }

    /**
     * Location. Information_ URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) of a document providing information about this location.
     * 
     */
    @JsonProperty("InformationURI")
    public List<IdentifierType> getInformationURI() {
        return informationURI;
    }

    /**
     * Location. Information_ URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) of a document providing information about this location.
     * 
     */
    @JsonProperty("InformationURI")
    public void setInformationURI(List<IdentifierType> informationURI) {
        this.informationURI = informationURI;
    }

    public Location withInformationURI(List<IdentifierType> informationURI) {
        this.informationURI = informationURI;
        return this;
    }

    /**
     * Location. Name
     * <p>
     * The name of this location.
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * Location. Name
     * <p>
     * The name of this location.
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public Location withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    /**
     * Location. Validity_ Period. Period
     * <p>
     * A period during which this location can be used (e.g., for delivery).
     * 
     */
    @JsonProperty("ValidityPeriod")
    public List<Period> getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Location. Validity_ Period. Period
     * <p>
     * A period during which this location can be used (e.g., for delivery).
     * 
     */
    @JsonProperty("ValidityPeriod")
    public void setValidityPeriod(List<Period> validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public Location withValidityPeriod(List<Period> validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Location. Address
     * <p>
     * The address of this location.
     * 
     */
    @JsonProperty("Address")
    public List<Address> getAddress() {
        return address;
    }

    /**
     * Location. Address
     * <p>
     * The address of this location.
     * 
     */
    @JsonProperty("Address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Location withAddress(List<Address> address) {
        this.address = address;
        return this;
    }

    /**
     * Location. Subsidiary_ Location. Location
     * <p>
     * A location subsidiary to this location.
     * 
     */
    @JsonProperty("SubsidiaryLocation")
    public List<Location> getSubsidiaryLocation() {
        return subsidiaryLocation;
    }

    /**
     * Location. Subsidiary_ Location. Location
     * <p>
     * A location subsidiary to this location.
     * 
     */
    @JsonProperty("SubsidiaryLocation")
    public void setSubsidiaryLocation(List<Location> subsidiaryLocation) {
        this.subsidiaryLocation = subsidiaryLocation;
    }

    public Location withSubsidiaryLocation(List<Location> subsidiaryLocation) {
        this.subsidiaryLocation = subsidiaryLocation;
        return this;
    }

    /**
     * Location. Location Coordinate
     * <p>
     * The geographical coordinates of this location.
     * 
     */
    @JsonProperty("LocationCoordinate")
    public List<LocationCoordinate> getLocationCoordinate() {
        return locationCoordinate;
    }

    /**
     * Location. Location Coordinate
     * <p>
     * The geographical coordinates of this location.
     * 
     */
    @JsonProperty("LocationCoordinate")
    public void setLocationCoordinate(List<LocationCoordinate> locationCoordinate) {
        this.locationCoordinate = locationCoordinate;
    }

    public Location withLocationCoordinate(List<LocationCoordinate> locationCoordinate) {
        this.locationCoordinate = locationCoordinate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Location.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("conditions");
        sb.append('=');
        sb.append(((this.conditions == null)?"<null>":this.conditions));
        sb.append(',');
        sb.append("countrySubentity");
        sb.append('=');
        sb.append(((this.countrySubentity == null)?"<null>":this.countrySubentity));
        sb.append(',');
        sb.append("countrySubentityCode");
        sb.append('=');
        sb.append(((this.countrySubentityCode == null)?"<null>":this.countrySubentityCode));
        sb.append(',');
        sb.append("locationTypeCode");
        sb.append('=');
        sb.append(((this.locationTypeCode == null)?"<null>":this.locationTypeCode));
        sb.append(',');
        sb.append("informationURI");
        sb.append('=');
        sb.append(((this.informationURI == null)?"<null>":this.informationURI));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("validityPeriod");
        sb.append('=');
        sb.append(((this.validityPeriod == null)?"<null>":this.validityPeriod));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("subsidiaryLocation");
        sb.append('=');
        sb.append(((this.subsidiaryLocation == null)?"<null>":this.subsidiaryLocation));
        sb.append(',');
        sb.append("locationCoordinate");
        sb.append('=');
        sb.append(((this.locationCoordinate == null)?"<null>":this.locationCoordinate));
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
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.informationURI == null)? 0 :this.informationURI.hashCode()));
        result = ((result* 31)+((this.validityPeriod == null)? 0 :this.validityPeriod.hashCode()));
        result = ((result* 31)+((this.countrySubentity == null)? 0 :this.countrySubentity.hashCode()));
        result = ((result* 31)+((this.subsidiaryLocation == null)? 0 :this.subsidiaryLocation.hashCode()));
        result = ((result* 31)+((this.countrySubentityCode == null)? 0 :this.countrySubentityCode.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.locationCoordinate == null)? 0 :this.locationCoordinate.hashCode()));
        result = ((result* 31)+((this.locationTypeCode == null)? 0 :this.locationTypeCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.conditions == null)? 0 :this.conditions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return ((((((((((((((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.informationURI == rhs.informationURI)||((this.informationURI!= null)&&this.informationURI.equals(rhs.informationURI))))&&((this.validityPeriod == rhs.validityPeriod)||((this.validityPeriod!= null)&&this.validityPeriod.equals(rhs.validityPeriod))))&&((this.countrySubentity == rhs.countrySubentity)||((this.countrySubentity!= null)&&this.countrySubentity.equals(rhs.countrySubentity))))&&((this.subsidiaryLocation == rhs.subsidiaryLocation)||((this.subsidiaryLocation!= null)&&this.subsidiaryLocation.equals(rhs.subsidiaryLocation))))&&((this.countrySubentityCode == rhs.countrySubentityCode)||((this.countrySubentityCode!= null)&&this.countrySubentityCode.equals(rhs.countrySubentityCode))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.locationCoordinate == rhs.locationCoordinate)||((this.locationCoordinate!= null)&&this.locationCoordinate.equals(rhs.locationCoordinate))))&&((this.locationTypeCode == rhs.locationTypeCode)||((this.locationTypeCode!= null)&&this.locationTypeCode.equals(rhs.locationTypeCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.conditions == rhs.conditions)||((this.conditions!= null)&&this.conditions.equals(rhs.conditions))));
    }

}
