
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
 * Address. Details
 * <p>
 * A class to define common information related to an address.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "AddressTypeCode",
    "AddressFormatCode",
    "Postbox",
    "Floor",
    "Room",
    "StreetName",
    "AdditionalStreetName",
    "BlockName",
    "BuildingName",
    "BuildingNumber",
    "InhouseMail",
    "Department",
    "MarkAttention",
    "MarkCare",
    "PlotIdentification",
    "CitySubdivisionName",
    "CityName",
    "PostalZone",
    "CountrySubentity",
    "CountrySubentityCode",
    "Region",
    "District",
    "TimezoneOffset",
    "AddressLine",
    "Country",
    "LocationCoordinate"
})
@Generated("jsonschema2pojo")
public class Address {

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
     * Address. Identifier
     * <p>
     * An identifier for this address within an agreed scheme of address identifiers.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this address within an agreed scheme of address identifiers.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Address. Address Type Code. Code
     * <p>
     * A mutually agreed code signifying the type of this address.
     * 
     */
    @JsonProperty("AddressTypeCode")
    @JsonPropertyDescription("A mutually agreed code signifying the type of this address.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> addressTypeCode = new ArrayList<CodeType>();
    /**
     * Address. Address Format Code. Code
     * <p>
     * A mutually agreed code signifying the format of this address.
     * 
     */
    @JsonProperty("AddressFormatCode")
    @JsonPropertyDescription("A mutually agreed code signifying the format of this address.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> addressFormatCode = new ArrayList<CodeType>();
    /**
     * Address. Postbox. Text
     * <p>
     * A post office box number registered for postal delivery by a postal service provider.
     * 
     */
    @JsonProperty("Postbox")
    @JsonPropertyDescription("A post office box number registered for postal delivery by a postal service provider.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> postbox = new ArrayList<TextType>();
    /**
     * Address. Floor. Text
     * <p>
     * An identifiable floor of a building.
     * 
     */
    @JsonProperty("Floor")
    @JsonPropertyDescription("An identifiable floor of a building.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> floor = new ArrayList<TextType>();
    /**
     * Address. Room. Text
     * <p>
     * An identifiable room, suite, or apartment of a building.
     * 
     */
    @JsonProperty("Room")
    @JsonPropertyDescription("An identifiable room, suite, or apartment of a building.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> room = new ArrayList<TextType>();
    /**
     * Address. Street Name. Name
     * <p>
     * The name of the street, road, avenue, way, etc. to which the number of the building is attached.
     * 
     */
    @JsonProperty("StreetName")
    @JsonPropertyDescription("The name of the street, road, avenue, way, etc. to which the number of the building is attached.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> streetName = new ArrayList<TextType>();
    /**
     * Address. Additional_ Street Name. Name
     * <p>
     * An additional street name used to further clarify the address.
     * 
     */
    @JsonProperty("AdditionalStreetName")
    @JsonPropertyDescription("An additional street name used to further clarify the address.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> additionalStreetName = new ArrayList<TextType>();
    /**
     * Address. Block Name. Name
     * <p>
     * The name of the block (an area surrounded by streets and usually containing several buildings) in which this address is located.
     * 
     */
    @JsonProperty("BlockName")
    @JsonPropertyDescription("The name of the block (an area surrounded by streets and usually containing several buildings) in which this address is located.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> blockName = new ArrayList<TextType>();
    /**
     * Address. Building Name. Name
     * <p>
     * The name of a building.
     * 
     */
    @JsonProperty("BuildingName")
    @JsonPropertyDescription("The name of a building.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> buildingName = new ArrayList<TextType>();
    /**
     * Address. Building Number. Text
     * <p>
     * The number of a building within the street.
     * 
     */
    @JsonProperty("BuildingNumber")
    @JsonPropertyDescription("The number of a building within the street.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> buildingNumber = new ArrayList<TextType>();
    /**
     * Address. Inhouse_ Mail. Text
     * <p>
     * The specific identifable location within a building where mail is delivered.
     * 
     */
    @JsonProperty("InhouseMail")
    @JsonPropertyDescription("The specific identifable location within a building where mail is delivered.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> inhouseMail = new ArrayList<TextType>();
    /**
     * Address. Department. Text
     * <p>
     * The department of the addressee.
     * 
     */
    @JsonProperty("Department")
    @JsonPropertyDescription("The department of the addressee.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> department = new ArrayList<TextType>();
    /**
     * Address. Mark Attention. Text
     * <p>
     * The name, expressed as text, of a person or department in an organization to whose attention incoming mail is directed; corresponds to the printed forms "for the attention of", "FAO", and ATTN:".
     * 
     */
    @JsonProperty("MarkAttention")
    @JsonPropertyDescription("The name, expressed as text, of a person or department in an organization to whose attention incoming mail is directed; corresponds to the printed forms \"for the attention of\", \"FAO\", and ATTN:\".")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> markAttention = new ArrayList<TextType>();
    /**
     * Address. Mark Care. Text
     * <p>
     * The name, expressed as text, of a person or organization at this address into whose care incoming mail is entrusted; corresponds to the printed forms "care of" and "c/o".
     * 
     */
    @JsonProperty("MarkCare")
    @JsonPropertyDescription("The name, expressed as text, of a person or organization at this address into whose care incoming mail is entrusted; corresponds to the printed forms \"care of\" and \"c/o\".")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> markCare = new ArrayList<TextType>();
    /**
     * Address. Plot Identification. Text
     * <p>
     * An identifier (e.g., a parcel number) for the piece of land associated with this address.
     * 
     */
    @JsonProperty("PlotIdentification")
    @JsonPropertyDescription("An identifier (e.g., a parcel number) for the piece of land associated with this address.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> plotIdentification = new ArrayList<TextType>();
    /**
     * Address. City Subdivision Name. Name
     * <p>
     * The name of the subdivision of a city, town, or village in which this address is located, such as the name of its district or borough.
     * 
     */
    @JsonProperty("CitySubdivisionName")
    @JsonPropertyDescription("The name of the subdivision of a city, town, or village in which this address is located, such as the name of its district or borough.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> citySubdivisionName = new ArrayList<TextType>();
    /**
     * Address. City Name. Name
     * <p>
     * The name of a city, town, or village.
     * 
     */
    @JsonProperty("CityName")
    @JsonPropertyDescription("The name of a city, town, or village.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> cityName = new ArrayList<TextType>();
    /**
     * Address. Postal_ Zone. Text
     * <p>
     * The postal identifier for this address according to the relevant national postal service, such as a ZIP code or Post Code.
     * 
     */
    @JsonProperty("PostalZone")
    @JsonPropertyDescription("The postal identifier for this address according to the relevant national postal service, such as a ZIP code or Post Code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> postalZone = new ArrayList<TextType>();
    /**
     * Address. Country Subentity. Text
     * <p>
     * The political or administrative division of a country in which this address is located, such as the name of its county, province, or state, expressed as text.
     * 
     */
    @JsonProperty("CountrySubentity")
    @JsonPropertyDescription("The political or administrative division of a country in which this address is located, such as the name of its county, province, or state, expressed as text.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> countrySubentity = new ArrayList<TextType>();
    /**
     * Address. Country Subentity Code. Code
     * <p>
     * The political or administrative division of a country in which this address is located, such as a county, province, or state, expressed as a code (typically nationally agreed).
     * 
     */
    @JsonProperty("CountrySubentityCode")
    @JsonPropertyDescription("The political or administrative division of a country in which this address is located, such as a county, province, or state, expressed as a code (typically nationally agreed).")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> countrySubentityCode = new ArrayList<CodeType>();
    /**
     * Address. Region. Text
     * <p>
     * The recognized geographic or economic region or group of countries in which this address is located.
     * 
     */
    @JsonProperty("Region")
    @JsonPropertyDescription("The recognized geographic or economic region or group of countries in which this address is located.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> region = new ArrayList<TextType>();
    /**
     * Address. District. Text
     * <p>
     * The district or geographical division of a country or region in which this address is located.
     * 
     */
    @JsonProperty("District")
    @JsonPropertyDescription("The district or geographical division of a country or region in which this address is located.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> district = new ArrayList<TextType>();
    /**
     * Address. Timezone Offset. Text
     * <p>
     * The time zone in which this address is located (as an offset from Universal Coordinated Time (UTC)) at the time of exchange.
     * 
     */
    @JsonProperty("TimezoneOffset")
    @JsonPropertyDescription("The time zone in which this address is located (as an offset from Universal Coordinated Time (UTC)) at the time of exchange.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> timezoneOffset = new ArrayList<TextType>();
    /**
     * Address. Address Line
     * <p>
     * An unstructured address line.
     * 
     */
    @JsonProperty("AddressLine")
    @JsonPropertyDescription("An unstructured address line.")
    @Size(min = 1)
    @Valid
    private List<AddressLine> addressLine = new ArrayList<AddressLine>();
    /**
     * Address. Country
     * <p>
     * The country in which this address is situated.
     * 
     */
    @JsonProperty("Country")
    @JsonPropertyDescription("The country in which this address is situated.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Country> country = new ArrayList<Country>();
    /**
     * Address. Location Coordinate
     * <p>
     * The geographical coordinates of this address.
     * 
     */
    @JsonProperty("LocationCoordinate")
    @JsonPropertyDescription("The geographical coordinates of this address.")
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

    public Address withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Address. Identifier
     * <p>
     * An identifier for this address within an agreed scheme of address identifiers.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Address. Identifier
     * <p>
     * An identifier for this address within an agreed scheme of address identifiers.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Address withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Address. Address Type Code. Code
     * <p>
     * A mutually agreed code signifying the type of this address.
     * 
     */
    @JsonProperty("AddressTypeCode")
    public List<CodeType> getAddressTypeCode() {
        return addressTypeCode;
    }

    /**
     * Address. Address Type Code. Code
     * <p>
     * A mutually agreed code signifying the type of this address.
     * 
     */
    @JsonProperty("AddressTypeCode")
    public void setAddressTypeCode(List<CodeType> addressTypeCode) {
        this.addressTypeCode = addressTypeCode;
    }

    public Address withAddressTypeCode(List<CodeType> addressTypeCode) {
        this.addressTypeCode = addressTypeCode;
        return this;
    }

    /**
     * Address. Address Format Code. Code
     * <p>
     * A mutually agreed code signifying the format of this address.
     * 
     */
    @JsonProperty("AddressFormatCode")
    public List<CodeType> getAddressFormatCode() {
        return addressFormatCode;
    }

    /**
     * Address. Address Format Code. Code
     * <p>
     * A mutually agreed code signifying the format of this address.
     * 
     */
    @JsonProperty("AddressFormatCode")
    public void setAddressFormatCode(List<CodeType> addressFormatCode) {
        this.addressFormatCode = addressFormatCode;
    }

    public Address withAddressFormatCode(List<CodeType> addressFormatCode) {
        this.addressFormatCode = addressFormatCode;
        return this;
    }

    /**
     * Address. Postbox. Text
     * <p>
     * A post office box number registered for postal delivery by a postal service provider.
     * 
     */
    @JsonProperty("Postbox")
    public List<TextType> getPostbox() {
        return postbox;
    }

    /**
     * Address. Postbox. Text
     * <p>
     * A post office box number registered for postal delivery by a postal service provider.
     * 
     */
    @JsonProperty("Postbox")
    public void setPostbox(List<TextType> postbox) {
        this.postbox = postbox;
    }

    public Address withPostbox(List<TextType> postbox) {
        this.postbox = postbox;
        return this;
    }

    /**
     * Address. Floor. Text
     * <p>
     * An identifiable floor of a building.
     * 
     */
    @JsonProperty("Floor")
    public List<TextType> getFloor() {
        return floor;
    }

    /**
     * Address. Floor. Text
     * <p>
     * An identifiable floor of a building.
     * 
     */
    @JsonProperty("Floor")
    public void setFloor(List<TextType> floor) {
        this.floor = floor;
    }

    public Address withFloor(List<TextType> floor) {
        this.floor = floor;
        return this;
    }

    /**
     * Address. Room. Text
     * <p>
     * An identifiable room, suite, or apartment of a building.
     * 
     */
    @JsonProperty("Room")
    public List<TextType> getRoom() {
        return room;
    }

    /**
     * Address. Room. Text
     * <p>
     * An identifiable room, suite, or apartment of a building.
     * 
     */
    @JsonProperty("Room")
    public void setRoom(List<TextType> room) {
        this.room = room;
    }

    public Address withRoom(List<TextType> room) {
        this.room = room;
        return this;
    }

    /**
     * Address. Street Name. Name
     * <p>
     * The name of the street, road, avenue, way, etc. to which the number of the building is attached.
     * 
     */
    @JsonProperty("StreetName")
    public List<TextType> getStreetName() {
        return streetName;
    }

    /**
     * Address. Street Name. Name
     * <p>
     * The name of the street, road, avenue, way, etc. to which the number of the building is attached.
     * 
     */
    @JsonProperty("StreetName")
    public void setStreetName(List<TextType> streetName) {
        this.streetName = streetName;
    }

    public Address withStreetName(List<TextType> streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     * Address. Additional_ Street Name. Name
     * <p>
     * An additional street name used to further clarify the address.
     * 
     */
    @JsonProperty("AdditionalStreetName")
    public List<TextType> getAdditionalStreetName() {
        return additionalStreetName;
    }

    /**
     * Address. Additional_ Street Name. Name
     * <p>
     * An additional street name used to further clarify the address.
     * 
     */
    @JsonProperty("AdditionalStreetName")
    public void setAdditionalStreetName(List<TextType> additionalStreetName) {
        this.additionalStreetName = additionalStreetName;
    }

    public Address withAdditionalStreetName(List<TextType> additionalStreetName) {
        this.additionalStreetName = additionalStreetName;
        return this;
    }

    /**
     * Address. Block Name. Name
     * <p>
     * The name of the block (an area surrounded by streets and usually containing several buildings) in which this address is located.
     * 
     */
    @JsonProperty("BlockName")
    public List<TextType> getBlockName() {
        return blockName;
    }

    /**
     * Address. Block Name. Name
     * <p>
     * The name of the block (an area surrounded by streets and usually containing several buildings) in which this address is located.
     * 
     */
    @JsonProperty("BlockName")
    public void setBlockName(List<TextType> blockName) {
        this.blockName = blockName;
    }

    public Address withBlockName(List<TextType> blockName) {
        this.blockName = blockName;
        return this;
    }

    /**
     * Address. Building Name. Name
     * <p>
     * The name of a building.
     * 
     */
    @JsonProperty("BuildingName")
    public List<TextType> getBuildingName() {
        return buildingName;
    }

    /**
     * Address. Building Name. Name
     * <p>
     * The name of a building.
     * 
     */
    @JsonProperty("BuildingName")
    public void setBuildingName(List<TextType> buildingName) {
        this.buildingName = buildingName;
    }

    public Address withBuildingName(List<TextType> buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    /**
     * Address. Building Number. Text
     * <p>
     * The number of a building within the street.
     * 
     */
    @JsonProperty("BuildingNumber")
    public List<TextType> getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Address. Building Number. Text
     * <p>
     * The number of a building within the street.
     * 
     */
    @JsonProperty("BuildingNumber")
    public void setBuildingNumber(List<TextType> buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public Address withBuildingNumber(List<TextType> buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }

    /**
     * Address. Inhouse_ Mail. Text
     * <p>
     * The specific identifable location within a building where mail is delivered.
     * 
     */
    @JsonProperty("InhouseMail")
    public List<TextType> getInhouseMail() {
        return inhouseMail;
    }

    /**
     * Address. Inhouse_ Mail. Text
     * <p>
     * The specific identifable location within a building where mail is delivered.
     * 
     */
    @JsonProperty("InhouseMail")
    public void setInhouseMail(List<TextType> inhouseMail) {
        this.inhouseMail = inhouseMail;
    }

    public Address withInhouseMail(List<TextType> inhouseMail) {
        this.inhouseMail = inhouseMail;
        return this;
    }

    /**
     * Address. Department. Text
     * <p>
     * The department of the addressee.
     * 
     */
    @JsonProperty("Department")
    public List<TextType> getDepartment() {
        return department;
    }

    /**
     * Address. Department. Text
     * <p>
     * The department of the addressee.
     * 
     */
    @JsonProperty("Department")
    public void setDepartment(List<TextType> department) {
        this.department = department;
    }

    public Address withDepartment(List<TextType> department) {
        this.department = department;
        return this;
    }

    /**
     * Address. Mark Attention. Text
     * <p>
     * The name, expressed as text, of a person or department in an organization to whose attention incoming mail is directed; corresponds to the printed forms "for the attention of", "FAO", and ATTN:".
     * 
     */
    @JsonProperty("MarkAttention")
    public List<TextType> getMarkAttention() {
        return markAttention;
    }

    /**
     * Address. Mark Attention. Text
     * <p>
     * The name, expressed as text, of a person or department in an organization to whose attention incoming mail is directed; corresponds to the printed forms "for the attention of", "FAO", and ATTN:".
     * 
     */
    @JsonProperty("MarkAttention")
    public void setMarkAttention(List<TextType> markAttention) {
        this.markAttention = markAttention;
    }

    public Address withMarkAttention(List<TextType> markAttention) {
        this.markAttention = markAttention;
        return this;
    }

    /**
     * Address. Mark Care. Text
     * <p>
     * The name, expressed as text, of a person or organization at this address into whose care incoming mail is entrusted; corresponds to the printed forms "care of" and "c/o".
     * 
     */
    @JsonProperty("MarkCare")
    public List<TextType> getMarkCare() {
        return markCare;
    }

    /**
     * Address. Mark Care. Text
     * <p>
     * The name, expressed as text, of a person or organization at this address into whose care incoming mail is entrusted; corresponds to the printed forms "care of" and "c/o".
     * 
     */
    @JsonProperty("MarkCare")
    public void setMarkCare(List<TextType> markCare) {
        this.markCare = markCare;
    }

    public Address withMarkCare(List<TextType> markCare) {
        this.markCare = markCare;
        return this;
    }

    /**
     * Address. Plot Identification. Text
     * <p>
     * An identifier (e.g., a parcel number) for the piece of land associated with this address.
     * 
     */
    @JsonProperty("PlotIdentification")
    public List<TextType> getPlotIdentification() {
        return plotIdentification;
    }

    /**
     * Address. Plot Identification. Text
     * <p>
     * An identifier (e.g., a parcel number) for the piece of land associated with this address.
     * 
     */
    @JsonProperty("PlotIdentification")
    public void setPlotIdentification(List<TextType> plotIdentification) {
        this.plotIdentification = plotIdentification;
    }

    public Address withPlotIdentification(List<TextType> plotIdentification) {
        this.plotIdentification = plotIdentification;
        return this;
    }

    /**
     * Address. City Subdivision Name. Name
     * <p>
     * The name of the subdivision of a city, town, or village in which this address is located, such as the name of its district or borough.
     * 
     */
    @JsonProperty("CitySubdivisionName")
    public List<TextType> getCitySubdivisionName() {
        return citySubdivisionName;
    }

    /**
     * Address. City Subdivision Name. Name
     * <p>
     * The name of the subdivision of a city, town, or village in which this address is located, such as the name of its district or borough.
     * 
     */
    @JsonProperty("CitySubdivisionName")
    public void setCitySubdivisionName(List<TextType> citySubdivisionName) {
        this.citySubdivisionName = citySubdivisionName;
    }

    public Address withCitySubdivisionName(List<TextType> citySubdivisionName) {
        this.citySubdivisionName = citySubdivisionName;
        return this;
    }

    /**
     * Address. City Name. Name
     * <p>
     * The name of a city, town, or village.
     * 
     */
    @JsonProperty("CityName")
    public List<TextType> getCityName() {
        return cityName;
    }

    /**
     * Address. City Name. Name
     * <p>
     * The name of a city, town, or village.
     * 
     */
    @JsonProperty("CityName")
    public void setCityName(List<TextType> cityName) {
        this.cityName = cityName;
    }

    public Address withCityName(List<TextType> cityName) {
        this.cityName = cityName;
        return this;
    }

    /**
     * Address. Postal_ Zone. Text
     * <p>
     * The postal identifier for this address according to the relevant national postal service, such as a ZIP code or Post Code.
     * 
     */
    @JsonProperty("PostalZone")
    public List<TextType> getPostalZone() {
        return postalZone;
    }

    /**
     * Address. Postal_ Zone. Text
     * <p>
     * The postal identifier for this address according to the relevant national postal service, such as a ZIP code or Post Code.
     * 
     */
    @JsonProperty("PostalZone")
    public void setPostalZone(List<TextType> postalZone) {
        this.postalZone = postalZone;
    }

    public Address withPostalZone(List<TextType> postalZone) {
        this.postalZone = postalZone;
        return this;
    }

    /**
     * Address. Country Subentity. Text
     * <p>
     * The political or administrative division of a country in which this address is located, such as the name of its county, province, or state, expressed as text.
     * 
     */
    @JsonProperty("CountrySubentity")
    public List<TextType> getCountrySubentity() {
        return countrySubentity;
    }

    /**
     * Address. Country Subentity. Text
     * <p>
     * The political or administrative division of a country in which this address is located, such as the name of its county, province, or state, expressed as text.
     * 
     */
    @JsonProperty("CountrySubentity")
    public void setCountrySubentity(List<TextType> countrySubentity) {
        this.countrySubentity = countrySubentity;
    }

    public Address withCountrySubentity(List<TextType> countrySubentity) {
        this.countrySubentity = countrySubentity;
        return this;
    }

    /**
     * Address. Country Subentity Code. Code
     * <p>
     * The political or administrative division of a country in which this address is located, such as a county, province, or state, expressed as a code (typically nationally agreed).
     * 
     */
    @JsonProperty("CountrySubentityCode")
    public List<CodeType> getCountrySubentityCode() {
        return countrySubentityCode;
    }

    /**
     * Address. Country Subentity Code. Code
     * <p>
     * The political or administrative division of a country in which this address is located, such as a county, province, or state, expressed as a code (typically nationally agreed).
     * 
     */
    @JsonProperty("CountrySubentityCode")
    public void setCountrySubentityCode(List<CodeType> countrySubentityCode) {
        this.countrySubentityCode = countrySubentityCode;
    }

    public Address withCountrySubentityCode(List<CodeType> countrySubentityCode) {
        this.countrySubentityCode = countrySubentityCode;
        return this;
    }

    /**
     * Address. Region. Text
     * <p>
     * The recognized geographic or economic region or group of countries in which this address is located.
     * 
     */
    @JsonProperty("Region")
    public List<TextType> getRegion() {
        return region;
    }

    /**
     * Address. Region. Text
     * <p>
     * The recognized geographic or economic region or group of countries in which this address is located.
     * 
     */
    @JsonProperty("Region")
    public void setRegion(List<TextType> region) {
        this.region = region;
    }

    public Address withRegion(List<TextType> region) {
        this.region = region;
        return this;
    }

    /**
     * Address. District. Text
     * <p>
     * The district or geographical division of a country or region in which this address is located.
     * 
     */
    @JsonProperty("District")
    public List<TextType> getDistrict() {
        return district;
    }

    /**
     * Address. District. Text
     * <p>
     * The district or geographical division of a country or region in which this address is located.
     * 
     */
    @JsonProperty("District")
    public void setDistrict(List<TextType> district) {
        this.district = district;
    }

    public Address withDistrict(List<TextType> district) {
        this.district = district;
        return this;
    }

    /**
     * Address. Timezone Offset. Text
     * <p>
     * The time zone in which this address is located (as an offset from Universal Coordinated Time (UTC)) at the time of exchange.
     * 
     */
    @JsonProperty("TimezoneOffset")
    public List<TextType> getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * Address. Timezone Offset. Text
     * <p>
     * The time zone in which this address is located (as an offset from Universal Coordinated Time (UTC)) at the time of exchange.
     * 
     */
    @JsonProperty("TimezoneOffset")
    public void setTimezoneOffset(List<TextType> timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public Address withTimezoneOffset(List<TextType> timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    /**
     * Address. Address Line
     * <p>
     * An unstructured address line.
     * 
     */
    @JsonProperty("AddressLine")
    public List<AddressLine> getAddressLine() {
        return addressLine;
    }

    /**
     * Address. Address Line
     * <p>
     * An unstructured address line.
     * 
     */
    @JsonProperty("AddressLine")
    public void setAddressLine(List<AddressLine> addressLine) {
        this.addressLine = addressLine;
    }

    public Address withAddressLine(List<AddressLine> addressLine) {
        this.addressLine = addressLine;
        return this;
    }

    /**
     * Address. Country
     * <p>
     * The country in which this address is situated.
     * 
     */
    @JsonProperty("Country")
    public List<Country> getCountry() {
        return country;
    }

    /**
     * Address. Country
     * <p>
     * The country in which this address is situated.
     * 
     */
    @JsonProperty("Country")
    public void setCountry(List<Country> country) {
        this.country = country;
    }

    public Address withCountry(List<Country> country) {
        this.country = country;
        return this;
    }

    /**
     * Address. Location Coordinate
     * <p>
     * The geographical coordinates of this address.
     * 
     */
    @JsonProperty("LocationCoordinate")
    public List<LocationCoordinate> getLocationCoordinate() {
        return locationCoordinate;
    }

    /**
     * Address. Location Coordinate
     * <p>
     * The geographical coordinates of this address.
     * 
     */
    @JsonProperty("LocationCoordinate")
    public void setLocationCoordinate(List<LocationCoordinate> locationCoordinate) {
        this.locationCoordinate = locationCoordinate;
    }

    public Address withLocationCoordinate(List<LocationCoordinate> locationCoordinate) {
        this.locationCoordinate = locationCoordinate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("addressTypeCode");
        sb.append('=');
        sb.append(((this.addressTypeCode == null)?"<null>":this.addressTypeCode));
        sb.append(',');
        sb.append("addressFormatCode");
        sb.append('=');
        sb.append(((this.addressFormatCode == null)?"<null>":this.addressFormatCode));
        sb.append(',');
        sb.append("postbox");
        sb.append('=');
        sb.append(((this.postbox == null)?"<null>":this.postbox));
        sb.append(',');
        sb.append("floor");
        sb.append('=');
        sb.append(((this.floor == null)?"<null>":this.floor));
        sb.append(',');
        sb.append("room");
        sb.append('=');
        sb.append(((this.room == null)?"<null>":this.room));
        sb.append(',');
        sb.append("streetName");
        sb.append('=');
        sb.append(((this.streetName == null)?"<null>":this.streetName));
        sb.append(',');
        sb.append("additionalStreetName");
        sb.append('=');
        sb.append(((this.additionalStreetName == null)?"<null>":this.additionalStreetName));
        sb.append(',');
        sb.append("blockName");
        sb.append('=');
        sb.append(((this.blockName == null)?"<null>":this.blockName));
        sb.append(',');
        sb.append("buildingName");
        sb.append('=');
        sb.append(((this.buildingName == null)?"<null>":this.buildingName));
        sb.append(',');
        sb.append("buildingNumber");
        sb.append('=');
        sb.append(((this.buildingNumber == null)?"<null>":this.buildingNumber));
        sb.append(',');
        sb.append("inhouseMail");
        sb.append('=');
        sb.append(((this.inhouseMail == null)?"<null>":this.inhouseMail));
        sb.append(',');
        sb.append("department");
        sb.append('=');
        sb.append(((this.department == null)?"<null>":this.department));
        sb.append(',');
        sb.append("markAttention");
        sb.append('=');
        sb.append(((this.markAttention == null)?"<null>":this.markAttention));
        sb.append(',');
        sb.append("markCare");
        sb.append('=');
        sb.append(((this.markCare == null)?"<null>":this.markCare));
        sb.append(',');
        sb.append("plotIdentification");
        sb.append('=');
        sb.append(((this.plotIdentification == null)?"<null>":this.plotIdentification));
        sb.append(',');
        sb.append("citySubdivisionName");
        sb.append('=');
        sb.append(((this.citySubdivisionName == null)?"<null>":this.citySubdivisionName));
        sb.append(',');
        sb.append("cityName");
        sb.append('=');
        sb.append(((this.cityName == null)?"<null>":this.cityName));
        sb.append(',');
        sb.append("postalZone");
        sb.append('=');
        sb.append(((this.postalZone == null)?"<null>":this.postalZone));
        sb.append(',');
        sb.append("countrySubentity");
        sb.append('=');
        sb.append(((this.countrySubentity == null)?"<null>":this.countrySubentity));
        sb.append(',');
        sb.append("countrySubentityCode");
        sb.append('=');
        sb.append(((this.countrySubentityCode == null)?"<null>":this.countrySubentityCode));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("district");
        sb.append('=');
        sb.append(((this.district == null)?"<null>":this.district));
        sb.append(',');
        sb.append("timezoneOffset");
        sb.append('=');
        sb.append(((this.timezoneOffset == null)?"<null>":this.timezoneOffset));
        sb.append(',');
        sb.append("addressLine");
        sb.append('=');
        sb.append(((this.addressLine == null)?"<null>":this.addressLine));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.plotIdentification == null)? 0 :this.plotIdentification.hashCode()));
        result = ((result* 31)+((this.postbox == null)? 0 :this.postbox.hashCode()));
        result = ((result* 31)+((this.additionalStreetName == null)? 0 :this.additionalStreetName.hashCode()));
        result = ((result* 31)+((this.blockName == null)? 0 :this.blockName.hashCode()));
        result = ((result* 31)+((this.inhouseMail == null)? 0 :this.inhouseMail.hashCode()));
        result = ((result* 31)+((this.addressTypeCode == null)? 0 :this.addressTypeCode.hashCode()));
        result = ((result* 31)+((this.streetName == null)? 0 :this.streetName.hashCode()));
        result = ((result* 31)+((this.cityName == null)? 0 :this.cityName.hashCode()));
        result = ((result* 31)+((this.timezoneOffset == null)? 0 :this.timezoneOffset.hashCode()));
        result = ((result* 31)+((this.markCare == null)? 0 :this.markCare.hashCode()));
        result = ((result* 31)+((this.buildingNumber == null)? 0 :this.buildingNumber.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.floor == null)? 0 :this.floor.hashCode()));
        result = ((result* 31)+((this.department == null)? 0 :this.department.hashCode()));
        result = ((result* 31)+((this.addressLine == null)? 0 :this.addressLine.hashCode()));
        result = ((result* 31)+((this.markAttention == null)? 0 :this.markAttention.hashCode()));
        result = ((result* 31)+((this.room == null)? 0 :this.room.hashCode()));
        result = ((result* 31)+((this.citySubdivisionName == null)? 0 :this.citySubdivisionName.hashCode()));
        result = ((result* 31)+((this.buildingName == null)? 0 :this.buildingName.hashCode()));
        result = ((result* 31)+((this.countrySubentity == null)? 0 :this.countrySubentity.hashCode()));
        result = ((result* 31)+((this.countrySubentityCode == null)? 0 :this.countrySubentityCode.hashCode()));
        result = ((result* 31)+((this.district == null)? 0 :this.district.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.locationCoordinate == null)? 0 :this.locationCoordinate.hashCode()));
        result = ((result* 31)+((this.addressFormatCode == null)? 0 :this.addressFormatCode.hashCode()));
        result = ((result* 31)+((this.region == null)? 0 :this.region.hashCode()));
        result = ((result* 31)+((this.postalZone == null)? 0 :this.postalZone.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return (((((((((((((((((((((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.plotIdentification == rhs.plotIdentification)||((this.plotIdentification!= null)&&this.plotIdentification.equals(rhs.plotIdentification))))&&((this.postbox == rhs.postbox)||((this.postbox!= null)&&this.postbox.equals(rhs.postbox))))&&((this.additionalStreetName == rhs.additionalStreetName)||((this.additionalStreetName!= null)&&this.additionalStreetName.equals(rhs.additionalStreetName))))&&((this.blockName == rhs.blockName)||((this.blockName!= null)&&this.blockName.equals(rhs.blockName))))&&((this.inhouseMail == rhs.inhouseMail)||((this.inhouseMail!= null)&&this.inhouseMail.equals(rhs.inhouseMail))))&&((this.addressTypeCode == rhs.addressTypeCode)||((this.addressTypeCode!= null)&&this.addressTypeCode.equals(rhs.addressTypeCode))))&&((this.streetName == rhs.streetName)||((this.streetName!= null)&&this.streetName.equals(rhs.streetName))))&&((this.cityName == rhs.cityName)||((this.cityName!= null)&&this.cityName.equals(rhs.cityName))))&&((this.timezoneOffset == rhs.timezoneOffset)||((this.timezoneOffset!= null)&&this.timezoneOffset.equals(rhs.timezoneOffset))))&&((this.markCare == rhs.markCare)||((this.markCare!= null)&&this.markCare.equals(rhs.markCare))))&&((this.buildingNumber == rhs.buildingNumber)||((this.buildingNumber!= null)&&this.buildingNumber.equals(rhs.buildingNumber))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.floor == rhs.floor)||((this.floor!= null)&&this.floor.equals(rhs.floor))))&&((this.department == rhs.department)||((this.department!= null)&&this.department.equals(rhs.department))))&&((this.addressLine == rhs.addressLine)||((this.addressLine!= null)&&this.addressLine.equals(rhs.addressLine))))&&((this.markAttention == rhs.markAttention)||((this.markAttention!= null)&&this.markAttention.equals(rhs.markAttention))))&&((this.room == rhs.room)||((this.room!= null)&&this.room.equals(rhs.room))))&&((this.citySubdivisionName == rhs.citySubdivisionName)||((this.citySubdivisionName!= null)&&this.citySubdivisionName.equals(rhs.citySubdivisionName))))&&((this.buildingName == rhs.buildingName)||((this.buildingName!= null)&&this.buildingName.equals(rhs.buildingName))))&&((this.countrySubentity == rhs.countrySubentity)||((this.countrySubentity!= null)&&this.countrySubentity.equals(rhs.countrySubentity))))&&((this.countrySubentityCode == rhs.countrySubentityCode)||((this.countrySubentityCode!= null)&&this.countrySubentityCode.equals(rhs.countrySubentityCode))))&&((this.district == rhs.district)||((this.district!= null)&&this.district.equals(rhs.district))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.locationCoordinate == rhs.locationCoordinate)||((this.locationCoordinate!= null)&&this.locationCoordinate.equals(rhs.locationCoordinate))))&&((this.addressFormatCode == rhs.addressFormatCode)||((this.addressFormatCode!= null)&&this.addressFormatCode.equals(rhs.addressFormatCode))))&&((this.region == rhs.region)||((this.region!= null)&&this.region.equals(rhs.region))))&&((this.postalZone == rhs.postalZone)||((this.postalZone!= null)&&this.postalZone.equals(rhs.postalZone))));
    }

}
