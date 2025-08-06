
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
 * Item. Details
 * <p>
 * A class to describe an item of trade. It includes a generic description applicable to all examples of the item together with optional subsidiary descriptions of any number of actual instances of the type.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "Description",
    "PackQuantity",
    "PackSizeNumeric",
    "CatalogueIndicator",
    "Name",
    "HazardousRiskIndicator",
    "AdditionalInformation",
    "Keyword",
    "BrandName",
    "ModelName",
    "BuyersItemIdentification",
    "SellersItemIdentification",
    "ManufacturersItemIdentification",
    "StandardItemIdentification",
    "CatalogueItemIdentification",
    "AdditionalItemIdentification",
    "CatalogueDocumentReference",
    "ItemSpecificationDocumentReference",
    "OriginCountry",
    "CommodityClassification",
    "TransactionConditions",
    "HazardousItem",
    "ClassifiedTaxCategory",
    "AdditionalItemProperty",
    "ManufacturerParty",
    "InformationContentProviderParty",
    "OriginAddress",
    "ItemInstance",
    "Certificate",
    "Dimension"
})
@Generated("jsonschema2pojo")
public class Item {

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
     * Item. Description. Text
     * <p>
     * Text describing this item.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("Text describing this item.")
    @Size(min = 1)
    @Valid
    private List<TextType> description = new ArrayList<TextType>();
    /**
     * Item. Pack Quantity. Quantity
     * <p>
     * The unit packaging quantity; the number of subunits making up this item.
     * 
     */
    @JsonProperty("PackQuantity")
    @JsonPropertyDescription("The unit packaging quantity; the number of subunits making up this item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> packQuantity = new ArrayList<QuantityType>();
    /**
     * Item. Pack Size. Numeric
     * <p>
     * The number of items in a pack of this item.
     * 
     */
    @JsonProperty("PackSizeNumeric")
    @JsonPropertyDescription("The number of items in a pack of this item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> packSizeNumeric = new ArrayList<NumericType>();
    /**
     * Item. Catalogue_ Indicator. Indicator
     * <p>
     * An indicator that this item was ordered from a catalogue (true) or not (false).
     * 
     */
    @JsonProperty("CatalogueIndicator")
    @JsonPropertyDescription("An indicator that this item was ordered from a catalogue (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> catalogueIndicator = new ArrayList<IndicatorType>();
    /**
     * Item. Name
     * <p>
     * A short name optionally given to this item, such as a name from a catalogue, as distinct from a description.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("A short name optionally given to this item, such as a name from a catalogue, as distinct from a description.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> name = new ArrayList<TextType>();
    /**
     * Item. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported item, as delivered, is subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    @JsonPropertyDescription("An indication that the transported item, as delivered, is subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> hazardousRiskIndicator = new ArrayList<IndicatorType>();
    /**
     * Item. Additional_ Information. Text
     * <p>
     * Further details regarding this item (e.g., the URL of a relevant web page).
     * 
     */
    @JsonProperty("AdditionalInformation")
    @JsonPropertyDescription("Further details regarding this item (e.g., the URL of a relevant web page).")
    @Size(min = 1)
    @Valid
    private List<TextType> additionalInformation = new ArrayList<TextType>();
    /**
     * Item. Keyword. Text
     * <p>
     * A keyword (search string) for this item, assigned by the seller party. Can also be a synonym for the name of the item.
     * 
     */
    @JsonProperty("Keyword")
    @JsonPropertyDescription("A keyword (search string) for this item, assigned by the seller party. Can also be a synonym for the name of the item.")
    @Size(min = 1)
    @Valid
    private List<TextType> keyword = new ArrayList<TextType>();
    /**
     * Item. Brand Name. Name
     * <p>
     * A brand name of this item.
     * 
     */
    @JsonProperty("BrandName")
    @JsonPropertyDescription("A brand name of this item.")
    @Size(min = 1)
    @Valid
    private List<TextType> brandName = new ArrayList<TextType>();
    /**
     * Item. Model Name. Name
     * <p>
     * A model name of this item.
     * 
     */
    @JsonProperty("ModelName")
    @JsonPropertyDescription("A model name of this item.")
    @Size(min = 1)
    @Valid
    private List<TextType> modelName = new ArrayList<TextType>();
    /**
     * Item. Buyers_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned by the buyer.
     * 
     */
    @JsonProperty("BuyersItemIdentification")
    @JsonPropertyDescription("Identifying information for this item, assigned by the buyer.")
    @Size(min = 1, max = 1)
    @Valid
    private List<ItemIdentification> buyersItemIdentification = new ArrayList<ItemIdentification>();
    /**
     * Item. Sellers_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned by the seller.
     * 
     */
    @JsonProperty("SellersItemIdentification")
    @JsonPropertyDescription("Identifying information for this item, assigned by the seller.")
    @Size(min = 1, max = 1)
    @Valid
    private List<ItemIdentification> sellersItemIdentification = new ArrayList<ItemIdentification>();
    /**
     * Item. Manufacturers_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned by the manufacturer.
     * 
     */
    @JsonProperty("ManufacturersItemIdentification")
    @JsonPropertyDescription("Identifying information for this item, assigned by the manufacturer.")
    @Size(min = 1)
    @Valid
    private List<ItemIdentification> manufacturersItemIdentification = new ArrayList<ItemIdentification>();
    /**
     * Item. Standard_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned according to a standard system.
     * 
     */
    @JsonProperty("StandardItemIdentification")
    @JsonPropertyDescription("Identifying information for this item, assigned according to a standard system.")
    @Size(min = 1, max = 1)
    @Valid
    private List<ItemIdentification> standardItemIdentification = new ArrayList<ItemIdentification>();
    /**
     * Item. Catalogue_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned according to a cataloguing system.
     * 
     */
    @JsonProperty("CatalogueItemIdentification")
    @JsonPropertyDescription("Identifying information for this item, assigned according to a cataloguing system.")
    @Size(min = 1, max = 1)
    @Valid
    private List<ItemIdentification> catalogueItemIdentification = new ArrayList<ItemIdentification>();
    /**
     * Item. Additional_ Item Identification. Item Identification
     * <p>
     * An additional identifier for this item.
     * 
     */
    @JsonProperty("AdditionalItemIdentification")
    @JsonPropertyDescription("An additional identifier for this item.")
    @Size(min = 1)
    @Valid
    private List<ItemIdentification> additionalItemIdentification = new ArrayList<ItemIdentification>();
    /**
     * Item. Catalogue_ Document Reference. Document Reference
     * <p>
     * A reference to the catalogue in which this item appears.
     * 
     */
    @JsonProperty("CatalogueDocumentReference")
    @JsonPropertyDescription("A reference to the catalogue in which this item appears.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DocumentReference> catalogueDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Item. Item Specification_ Document Reference. Document Reference
     * <p>
     * A reference to a specification document for this item.
     * 
     */
    @JsonProperty("ItemSpecificationDocumentReference")
    @JsonPropertyDescription("A reference to a specification document for this item.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> itemSpecificationDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Item. Origin_ Country. Country
     * <p>
     * The country of origin of this item.
     * 
     */
    @JsonProperty("OriginCountry")
    @JsonPropertyDescription("The country of origin of this item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Country> originCountry = new ArrayList<Country>();
    /**
     * Item. Commodity Classification
     * <p>
     * A classification of this item according to a specific system for classifying commodities.
     * 
     */
    @JsonProperty("CommodityClassification")
    @JsonPropertyDescription("A classification of this item according to a specific system for classifying commodities.")
    @Size(min = 1)
    @Valid
    private List<CommodityClassification> commodityClassification = new ArrayList<CommodityClassification>();
    /**
     * Item. Transaction Conditions
     * <p>
     * A set of sales conditions applying to this item.
     * 
     */
    @JsonProperty("TransactionConditions")
    @JsonPropertyDescription("A set of sales conditions applying to this item.")
    @Size(min = 1)
    @Valid
    private List<TransactionConditions> transactionConditions = new ArrayList<TransactionConditions>();
    /**
     * Item. Hazardous Item
     * <p>
     * Information pertaining to this item as a hazardous item.
     * 
     */
    @JsonProperty("HazardousItem")
    @JsonPropertyDescription("Information pertaining to this item as a hazardous item.")
    @Size(min = 1)
    @Valid
    private List<HazardousItem> hazardousItem = new ArrayList<HazardousItem>();
    /**
     * Item. Classified_ Tax Category. Tax Category
     * <p>
     * A tax category applicable to this item.
     * 
     */
    @JsonProperty("ClassifiedTaxCategory")
    @JsonPropertyDescription("A tax category applicable to this item.")
    @Size(min = 1)
    @Valid
    private List<TaxCategory> classifiedTaxCategory = new ArrayList<TaxCategory>();
    /**
     * Item. Additional_ Item Property. Item Property
     * <p>
     * An additional property of this item.
     * 
     */
    @JsonProperty("AdditionalItemProperty")
    @JsonPropertyDescription("An additional property of this item.")
    @Size(min = 1)
    @Valid
    private List<ItemProperty> additionalItemProperty = new ArrayList<ItemProperty>();
    /**
     * Item. Manufacturer_ Party. Party
     * <p>
     * The manufacturer of this item.
     * 
     */
    @JsonProperty("ManufacturerParty")
    @JsonPropertyDescription("The manufacturer of this item.")
    @Size(min = 1)
    @Valid
    private List<Party> manufacturerParty = new ArrayList<Party>();
    /**
     * Item. Information Content Provider_ Party. Party
     * <p>
     * The party responsible for specification of this item.
     * 
     */
    @JsonProperty("InformationContentProviderParty")
    @JsonPropertyDescription("The party responsible for specification of this item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> informationContentProviderParty = new ArrayList<Party>();
    /**
     * Item. Origin_ Address. Address
     * <p>
     * A region (not country) of origin of this item.
     * 
     */
    @JsonProperty("OriginAddress")
    @JsonPropertyDescription("A region (not country) of origin of this item.")
    @Size(min = 1)
    @Valid
    private List<Address> originAddress = new ArrayList<Address>();
    /**
     * Item. Item Instance
     * <p>
     * A trackable, unique instantiation of this item.
     * 
     */
    @JsonProperty("ItemInstance")
    @JsonPropertyDescription("A trackable, unique instantiation of this item.")
    @Size(min = 1)
    @Valid
    private List<ItemInstance> itemInstance = new ArrayList<ItemInstance>();
    /**
     * Item. Certificate
     * <p>
     * A certificate associated with this item.
     * 
     */
    @JsonProperty("Certificate")
    @JsonPropertyDescription("A certificate associated with this item.")
    @Size(min = 1)
    @Valid
    private List<Certificate> certificate = new ArrayList<Certificate>();
    /**
     * Item. Dimension
     * <p>
     * One of the measurable dimensions (length, mass, weight, or volume) of this item.
     * 
     */
    @JsonProperty("Dimension")
    @JsonPropertyDescription("One of the measurable dimensions (length, mass, weight, or volume) of this item.")
    @Size(min = 1)
    @Valid
    private List<Dimension> dimension = new ArrayList<Dimension>();

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

    public Item withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Item. Description. Text
     * <p>
     * Text describing this item.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * Item. Description. Text
     * <p>
     * Text describing this item.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public Item withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    /**
     * Item. Pack Quantity. Quantity
     * <p>
     * The unit packaging quantity; the number of subunits making up this item.
     * 
     */
    @JsonProperty("PackQuantity")
    public List<QuantityType> getPackQuantity() {
        return packQuantity;
    }

    /**
     * Item. Pack Quantity. Quantity
     * <p>
     * The unit packaging quantity; the number of subunits making up this item.
     * 
     */
    @JsonProperty("PackQuantity")
    public void setPackQuantity(List<QuantityType> packQuantity) {
        this.packQuantity = packQuantity;
    }

    public Item withPackQuantity(List<QuantityType> packQuantity) {
        this.packQuantity = packQuantity;
        return this;
    }

    /**
     * Item. Pack Size. Numeric
     * <p>
     * The number of items in a pack of this item.
     * 
     */
    @JsonProperty("PackSizeNumeric")
    public List<NumericType> getPackSizeNumeric() {
        return packSizeNumeric;
    }

    /**
     * Item. Pack Size. Numeric
     * <p>
     * The number of items in a pack of this item.
     * 
     */
    @JsonProperty("PackSizeNumeric")
    public void setPackSizeNumeric(List<NumericType> packSizeNumeric) {
        this.packSizeNumeric = packSizeNumeric;
    }

    public Item withPackSizeNumeric(List<NumericType> packSizeNumeric) {
        this.packSizeNumeric = packSizeNumeric;
        return this;
    }

    /**
     * Item. Catalogue_ Indicator. Indicator
     * <p>
     * An indicator that this item was ordered from a catalogue (true) or not (false).
     * 
     */
    @JsonProperty("CatalogueIndicator")
    public List<IndicatorType> getCatalogueIndicator() {
        return catalogueIndicator;
    }

    /**
     * Item. Catalogue_ Indicator. Indicator
     * <p>
     * An indicator that this item was ordered from a catalogue (true) or not (false).
     * 
     */
    @JsonProperty("CatalogueIndicator")
    public void setCatalogueIndicator(List<IndicatorType> catalogueIndicator) {
        this.catalogueIndicator = catalogueIndicator;
    }

    public Item withCatalogueIndicator(List<IndicatorType> catalogueIndicator) {
        this.catalogueIndicator = catalogueIndicator;
        return this;
    }

    /**
     * Item. Name
     * <p>
     * A short name optionally given to this item, such as a name from a catalogue, as distinct from a description.
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * Item. Name
     * <p>
     * A short name optionally given to this item, such as a name from a catalogue, as distinct from a description.
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public Item withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    /**
     * Item. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported item, as delivered, is subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    public List<IndicatorType> getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Item. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported item, as delivered, is subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    public void setHazardousRiskIndicator(List<IndicatorType> hazardousRiskIndicator) {
        this.hazardousRiskIndicator = hazardousRiskIndicator;
    }

    public Item withHazardousRiskIndicator(List<IndicatorType> hazardousRiskIndicator) {
        this.hazardousRiskIndicator = hazardousRiskIndicator;
        return this;
    }

    /**
     * Item. Additional_ Information. Text
     * <p>
     * Further details regarding this item (e.g., the URL of a relevant web page).
     * 
     */
    @JsonProperty("AdditionalInformation")
    public List<TextType> getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Item. Additional_ Information. Text
     * <p>
     * Further details regarding this item (e.g., the URL of a relevant web page).
     * 
     */
    @JsonProperty("AdditionalInformation")
    public void setAdditionalInformation(List<TextType> additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public Item withAdditionalInformation(List<TextType> additionalInformation) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    /**
     * Item. Keyword. Text
     * <p>
     * A keyword (search string) for this item, assigned by the seller party. Can also be a synonym for the name of the item.
     * 
     */
    @JsonProperty("Keyword")
    public List<TextType> getKeyword() {
        return keyword;
    }

    /**
     * Item. Keyword. Text
     * <p>
     * A keyword (search string) for this item, assigned by the seller party. Can also be a synonym for the name of the item.
     * 
     */
    @JsonProperty("Keyword")
    public void setKeyword(List<TextType> keyword) {
        this.keyword = keyword;
    }

    public Item withKeyword(List<TextType> keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * Item. Brand Name. Name
     * <p>
     * A brand name of this item.
     * 
     */
    @JsonProperty("BrandName")
    public List<TextType> getBrandName() {
        return brandName;
    }

    /**
     * Item. Brand Name. Name
     * <p>
     * A brand name of this item.
     * 
     */
    @JsonProperty("BrandName")
    public void setBrandName(List<TextType> brandName) {
        this.brandName = brandName;
    }

    public Item withBrandName(List<TextType> brandName) {
        this.brandName = brandName;
        return this;
    }

    /**
     * Item. Model Name. Name
     * <p>
     * A model name of this item.
     * 
     */
    @JsonProperty("ModelName")
    public List<TextType> getModelName() {
        return modelName;
    }

    /**
     * Item. Model Name. Name
     * <p>
     * A model name of this item.
     * 
     */
    @JsonProperty("ModelName")
    public void setModelName(List<TextType> modelName) {
        this.modelName = modelName;
    }

    public Item withModelName(List<TextType> modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * Item. Buyers_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned by the buyer.
     * 
     */
    @JsonProperty("BuyersItemIdentification")
    public List<ItemIdentification> getBuyersItemIdentification() {
        return buyersItemIdentification;
    }

    /**
     * Item. Buyers_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned by the buyer.
     * 
     */
    @JsonProperty("BuyersItemIdentification")
    public void setBuyersItemIdentification(List<ItemIdentification> buyersItemIdentification) {
        this.buyersItemIdentification = buyersItemIdentification;
    }

    public Item withBuyersItemIdentification(List<ItemIdentification> buyersItemIdentification) {
        this.buyersItemIdentification = buyersItemIdentification;
        return this;
    }

    /**
     * Item. Sellers_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned by the seller.
     * 
     */
    @JsonProperty("SellersItemIdentification")
    public List<ItemIdentification> getSellersItemIdentification() {
        return sellersItemIdentification;
    }

    /**
     * Item. Sellers_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned by the seller.
     * 
     */
    @JsonProperty("SellersItemIdentification")
    public void setSellersItemIdentification(List<ItemIdentification> sellersItemIdentification) {
        this.sellersItemIdentification = sellersItemIdentification;
    }

    public Item withSellersItemIdentification(List<ItemIdentification> sellersItemIdentification) {
        this.sellersItemIdentification = sellersItemIdentification;
        return this;
    }

    /**
     * Item. Manufacturers_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned by the manufacturer.
     * 
     */
    @JsonProperty("ManufacturersItemIdentification")
    public List<ItemIdentification> getManufacturersItemIdentification() {
        return manufacturersItemIdentification;
    }

    /**
     * Item. Manufacturers_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned by the manufacturer.
     * 
     */
    @JsonProperty("ManufacturersItemIdentification")
    public void setManufacturersItemIdentification(List<ItemIdentification> manufacturersItemIdentification) {
        this.manufacturersItemIdentification = manufacturersItemIdentification;
    }

    public Item withManufacturersItemIdentification(List<ItemIdentification> manufacturersItemIdentification) {
        this.manufacturersItemIdentification = manufacturersItemIdentification;
        return this;
    }

    /**
     * Item. Standard_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned according to a standard system.
     * 
     */
    @JsonProperty("StandardItemIdentification")
    public List<ItemIdentification> getStandardItemIdentification() {
        return standardItemIdentification;
    }

    /**
     * Item. Standard_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned according to a standard system.
     * 
     */
    @JsonProperty("StandardItemIdentification")
    public void setStandardItemIdentification(List<ItemIdentification> standardItemIdentification) {
        this.standardItemIdentification = standardItemIdentification;
    }

    public Item withStandardItemIdentification(List<ItemIdentification> standardItemIdentification) {
        this.standardItemIdentification = standardItemIdentification;
        return this;
    }

    /**
     * Item. Catalogue_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned according to a cataloguing system.
     * 
     */
    @JsonProperty("CatalogueItemIdentification")
    public List<ItemIdentification> getCatalogueItemIdentification() {
        return catalogueItemIdentification;
    }

    /**
     * Item. Catalogue_ Item Identification. Item Identification
     * <p>
     * Identifying information for this item, assigned according to a cataloguing system.
     * 
     */
    @JsonProperty("CatalogueItemIdentification")
    public void setCatalogueItemIdentification(List<ItemIdentification> catalogueItemIdentification) {
        this.catalogueItemIdentification = catalogueItemIdentification;
    }

    public Item withCatalogueItemIdentification(List<ItemIdentification> catalogueItemIdentification) {
        this.catalogueItemIdentification = catalogueItemIdentification;
        return this;
    }

    /**
     * Item. Additional_ Item Identification. Item Identification
     * <p>
     * An additional identifier for this item.
     * 
     */
    @JsonProperty("AdditionalItemIdentification")
    public List<ItemIdentification> getAdditionalItemIdentification() {
        return additionalItemIdentification;
    }

    /**
     * Item. Additional_ Item Identification. Item Identification
     * <p>
     * An additional identifier for this item.
     * 
     */
    @JsonProperty("AdditionalItemIdentification")
    public void setAdditionalItemIdentification(List<ItemIdentification> additionalItemIdentification) {
        this.additionalItemIdentification = additionalItemIdentification;
    }

    public Item withAdditionalItemIdentification(List<ItemIdentification> additionalItemIdentification) {
        this.additionalItemIdentification = additionalItemIdentification;
        return this;
    }

    /**
     * Item. Catalogue_ Document Reference. Document Reference
     * <p>
     * A reference to the catalogue in which this item appears.
     * 
     */
    @JsonProperty("CatalogueDocumentReference")
    public List<DocumentReference> getCatalogueDocumentReference() {
        return catalogueDocumentReference;
    }

    /**
     * Item. Catalogue_ Document Reference. Document Reference
     * <p>
     * A reference to the catalogue in which this item appears.
     * 
     */
    @JsonProperty("CatalogueDocumentReference")
    public void setCatalogueDocumentReference(List<DocumentReference> catalogueDocumentReference) {
        this.catalogueDocumentReference = catalogueDocumentReference;
    }

    public Item withCatalogueDocumentReference(List<DocumentReference> catalogueDocumentReference) {
        this.catalogueDocumentReference = catalogueDocumentReference;
        return this;
    }

    /**
     * Item. Item Specification_ Document Reference. Document Reference
     * <p>
     * A reference to a specification document for this item.
     * 
     */
    @JsonProperty("ItemSpecificationDocumentReference")
    public List<DocumentReference> getItemSpecificationDocumentReference() {
        return itemSpecificationDocumentReference;
    }

    /**
     * Item. Item Specification_ Document Reference. Document Reference
     * <p>
     * A reference to a specification document for this item.
     * 
     */
    @JsonProperty("ItemSpecificationDocumentReference")
    public void setItemSpecificationDocumentReference(List<DocumentReference> itemSpecificationDocumentReference) {
        this.itemSpecificationDocumentReference = itemSpecificationDocumentReference;
    }

    public Item withItemSpecificationDocumentReference(List<DocumentReference> itemSpecificationDocumentReference) {
        this.itemSpecificationDocumentReference = itemSpecificationDocumentReference;
        return this;
    }

    /**
     * Item. Origin_ Country. Country
     * <p>
     * The country of origin of this item.
     * 
     */
    @JsonProperty("OriginCountry")
    public List<Country> getOriginCountry() {
        return originCountry;
    }

    /**
     * Item. Origin_ Country. Country
     * <p>
     * The country of origin of this item.
     * 
     */
    @JsonProperty("OriginCountry")
    public void setOriginCountry(List<Country> originCountry) {
        this.originCountry = originCountry;
    }

    public Item withOriginCountry(List<Country> originCountry) {
        this.originCountry = originCountry;
        return this;
    }

    /**
     * Item. Commodity Classification
     * <p>
     * A classification of this item according to a specific system for classifying commodities.
     * 
     */
    @JsonProperty("CommodityClassification")
    public List<CommodityClassification> getCommodityClassification() {
        return commodityClassification;
    }

    /**
     * Item. Commodity Classification
     * <p>
     * A classification of this item according to a specific system for classifying commodities.
     * 
     */
    @JsonProperty("CommodityClassification")
    public void setCommodityClassification(List<CommodityClassification> commodityClassification) {
        this.commodityClassification = commodityClassification;
    }

    public Item withCommodityClassification(List<CommodityClassification> commodityClassification) {
        this.commodityClassification = commodityClassification;
        return this;
    }

    /**
     * Item. Transaction Conditions
     * <p>
     * A set of sales conditions applying to this item.
     * 
     */
    @JsonProperty("TransactionConditions")
    public List<TransactionConditions> getTransactionConditions() {
        return transactionConditions;
    }

    /**
     * Item. Transaction Conditions
     * <p>
     * A set of sales conditions applying to this item.
     * 
     */
    @JsonProperty("TransactionConditions")
    public void setTransactionConditions(List<TransactionConditions> transactionConditions) {
        this.transactionConditions = transactionConditions;
    }

    public Item withTransactionConditions(List<TransactionConditions> transactionConditions) {
        this.transactionConditions = transactionConditions;
        return this;
    }

    /**
     * Item. Hazardous Item
     * <p>
     * Information pertaining to this item as a hazardous item.
     * 
     */
    @JsonProperty("HazardousItem")
    public List<HazardousItem> getHazardousItem() {
        return hazardousItem;
    }

    /**
     * Item. Hazardous Item
     * <p>
     * Information pertaining to this item as a hazardous item.
     * 
     */
    @JsonProperty("HazardousItem")
    public void setHazardousItem(List<HazardousItem> hazardousItem) {
        this.hazardousItem = hazardousItem;
    }

    public Item withHazardousItem(List<HazardousItem> hazardousItem) {
        this.hazardousItem = hazardousItem;
        return this;
    }

    /**
     * Item. Classified_ Tax Category. Tax Category
     * <p>
     * A tax category applicable to this item.
     * 
     */
    @JsonProperty("ClassifiedTaxCategory")
    public List<TaxCategory> getClassifiedTaxCategory() {
        return classifiedTaxCategory;
    }

    /**
     * Item. Classified_ Tax Category. Tax Category
     * <p>
     * A tax category applicable to this item.
     * 
     */
    @JsonProperty("ClassifiedTaxCategory")
    public void setClassifiedTaxCategory(List<TaxCategory> classifiedTaxCategory) {
        this.classifiedTaxCategory = classifiedTaxCategory;
    }

    public Item withClassifiedTaxCategory(List<TaxCategory> classifiedTaxCategory) {
        this.classifiedTaxCategory = classifiedTaxCategory;
        return this;
    }

    /**
     * Item. Additional_ Item Property. Item Property
     * <p>
     * An additional property of this item.
     * 
     */
    @JsonProperty("AdditionalItemProperty")
    public List<ItemProperty> getAdditionalItemProperty() {
        return additionalItemProperty;
    }

    /**
     * Item. Additional_ Item Property. Item Property
     * <p>
     * An additional property of this item.
     * 
     */
    @JsonProperty("AdditionalItemProperty")
    public void setAdditionalItemProperty(List<ItemProperty> additionalItemProperty) {
        this.additionalItemProperty = additionalItemProperty;
    }

    public Item withAdditionalItemProperty(List<ItemProperty> additionalItemProperty) {
        this.additionalItemProperty = additionalItemProperty;
        return this;
    }

    /**
     * Item. Manufacturer_ Party. Party
     * <p>
     * The manufacturer of this item.
     * 
     */
    @JsonProperty("ManufacturerParty")
    public List<Party> getManufacturerParty() {
        return manufacturerParty;
    }

    /**
     * Item. Manufacturer_ Party. Party
     * <p>
     * The manufacturer of this item.
     * 
     */
    @JsonProperty("ManufacturerParty")
    public void setManufacturerParty(List<Party> manufacturerParty) {
        this.manufacturerParty = manufacturerParty;
    }

    public Item withManufacturerParty(List<Party> manufacturerParty) {
        this.manufacturerParty = manufacturerParty;
        return this;
    }

    /**
     * Item. Information Content Provider_ Party. Party
     * <p>
     * The party responsible for specification of this item.
     * 
     */
    @JsonProperty("InformationContentProviderParty")
    public List<Party> getInformationContentProviderParty() {
        return informationContentProviderParty;
    }

    /**
     * Item. Information Content Provider_ Party. Party
     * <p>
     * The party responsible for specification of this item.
     * 
     */
    @JsonProperty("InformationContentProviderParty")
    public void setInformationContentProviderParty(List<Party> informationContentProviderParty) {
        this.informationContentProviderParty = informationContentProviderParty;
    }

    public Item withInformationContentProviderParty(List<Party> informationContentProviderParty) {
        this.informationContentProviderParty = informationContentProviderParty;
        return this;
    }

    /**
     * Item. Origin_ Address. Address
     * <p>
     * A region (not country) of origin of this item.
     * 
     */
    @JsonProperty("OriginAddress")
    public List<Address> getOriginAddress() {
        return originAddress;
    }

    /**
     * Item. Origin_ Address. Address
     * <p>
     * A region (not country) of origin of this item.
     * 
     */
    @JsonProperty("OriginAddress")
    public void setOriginAddress(List<Address> originAddress) {
        this.originAddress = originAddress;
    }

    public Item withOriginAddress(List<Address> originAddress) {
        this.originAddress = originAddress;
        return this;
    }

    /**
     * Item. Item Instance
     * <p>
     * A trackable, unique instantiation of this item.
     * 
     */
    @JsonProperty("ItemInstance")
    public List<ItemInstance> getItemInstance() {
        return itemInstance;
    }

    /**
     * Item. Item Instance
     * <p>
     * A trackable, unique instantiation of this item.
     * 
     */
    @JsonProperty("ItemInstance")
    public void setItemInstance(List<ItemInstance> itemInstance) {
        this.itemInstance = itemInstance;
    }

    public Item withItemInstance(List<ItemInstance> itemInstance) {
        this.itemInstance = itemInstance;
        return this;
    }

    /**
     * Item. Certificate
     * <p>
     * A certificate associated with this item.
     * 
     */
    @JsonProperty("Certificate")
    public List<Certificate> getCertificate() {
        return certificate;
    }

    /**
     * Item. Certificate
     * <p>
     * A certificate associated with this item.
     * 
     */
    @JsonProperty("Certificate")
    public void setCertificate(List<Certificate> certificate) {
        this.certificate = certificate;
    }

    public Item withCertificate(List<Certificate> certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Item. Dimension
     * <p>
     * One of the measurable dimensions (length, mass, weight, or volume) of this item.
     * 
     */
    @JsonProperty("Dimension")
    public List<Dimension> getDimension() {
        return dimension;
    }

    /**
     * Item. Dimension
     * <p>
     * One of the measurable dimensions (length, mass, weight, or volume) of this item.
     * 
     */
    @JsonProperty("Dimension")
    public void setDimension(List<Dimension> dimension) {
        this.dimension = dimension;
    }

    public Item withDimension(List<Dimension> dimension) {
        this.dimension = dimension;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("packQuantity");
        sb.append('=');
        sb.append(((this.packQuantity == null)?"<null>":this.packQuantity));
        sb.append(',');
        sb.append("packSizeNumeric");
        sb.append('=');
        sb.append(((this.packSizeNumeric == null)?"<null>":this.packSizeNumeric));
        sb.append(',');
        sb.append("catalogueIndicator");
        sb.append('=');
        sb.append(((this.catalogueIndicator == null)?"<null>":this.catalogueIndicator));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("hazardousRiskIndicator");
        sb.append('=');
        sb.append(((this.hazardousRiskIndicator == null)?"<null>":this.hazardousRiskIndicator));
        sb.append(',');
        sb.append("additionalInformation");
        sb.append('=');
        sb.append(((this.additionalInformation == null)?"<null>":this.additionalInformation));
        sb.append(',');
        sb.append("keyword");
        sb.append('=');
        sb.append(((this.keyword == null)?"<null>":this.keyword));
        sb.append(',');
        sb.append("brandName");
        sb.append('=');
        sb.append(((this.brandName == null)?"<null>":this.brandName));
        sb.append(',');
        sb.append("modelName");
        sb.append('=');
        sb.append(((this.modelName == null)?"<null>":this.modelName));
        sb.append(',');
        sb.append("buyersItemIdentification");
        sb.append('=');
        sb.append(((this.buyersItemIdentification == null)?"<null>":this.buyersItemIdentification));
        sb.append(',');
        sb.append("sellersItemIdentification");
        sb.append('=');
        sb.append(((this.sellersItemIdentification == null)?"<null>":this.sellersItemIdentification));
        sb.append(',');
        sb.append("manufacturersItemIdentification");
        sb.append('=');
        sb.append(((this.manufacturersItemIdentification == null)?"<null>":this.manufacturersItemIdentification));
        sb.append(',');
        sb.append("standardItemIdentification");
        sb.append('=');
        sb.append(((this.standardItemIdentification == null)?"<null>":this.standardItemIdentification));
        sb.append(',');
        sb.append("catalogueItemIdentification");
        sb.append('=');
        sb.append(((this.catalogueItemIdentification == null)?"<null>":this.catalogueItemIdentification));
        sb.append(',');
        sb.append("additionalItemIdentification");
        sb.append('=');
        sb.append(((this.additionalItemIdentification == null)?"<null>":this.additionalItemIdentification));
        sb.append(',');
        sb.append("catalogueDocumentReference");
        sb.append('=');
        sb.append(((this.catalogueDocumentReference == null)?"<null>":this.catalogueDocumentReference));
        sb.append(',');
        sb.append("itemSpecificationDocumentReference");
        sb.append('=');
        sb.append(((this.itemSpecificationDocumentReference == null)?"<null>":this.itemSpecificationDocumentReference));
        sb.append(',');
        sb.append("originCountry");
        sb.append('=');
        sb.append(((this.originCountry == null)?"<null>":this.originCountry));
        sb.append(',');
        sb.append("commodityClassification");
        sb.append('=');
        sb.append(((this.commodityClassification == null)?"<null>":this.commodityClassification));
        sb.append(',');
        sb.append("transactionConditions");
        sb.append('=');
        sb.append(((this.transactionConditions == null)?"<null>":this.transactionConditions));
        sb.append(',');
        sb.append("hazardousItem");
        sb.append('=');
        sb.append(((this.hazardousItem == null)?"<null>":this.hazardousItem));
        sb.append(',');
        sb.append("classifiedTaxCategory");
        sb.append('=');
        sb.append(((this.classifiedTaxCategory == null)?"<null>":this.classifiedTaxCategory));
        sb.append(',');
        sb.append("additionalItemProperty");
        sb.append('=');
        sb.append(((this.additionalItemProperty == null)?"<null>":this.additionalItemProperty));
        sb.append(',');
        sb.append("manufacturerParty");
        sb.append('=');
        sb.append(((this.manufacturerParty == null)?"<null>":this.manufacturerParty));
        sb.append(',');
        sb.append("informationContentProviderParty");
        sb.append('=');
        sb.append(((this.informationContentProviderParty == null)?"<null>":this.informationContentProviderParty));
        sb.append(',');
        sb.append("originAddress");
        sb.append('=');
        sb.append(((this.originAddress == null)?"<null>":this.originAddress));
        sb.append(',');
        sb.append("itemInstance");
        sb.append('=');
        sb.append(((this.itemInstance == null)?"<null>":this.itemInstance));
        sb.append(',');
        sb.append("certificate");
        sb.append('=');
        sb.append(((this.certificate == null)?"<null>":this.certificate));
        sb.append(',');
        sb.append("dimension");
        sb.append('=');
        sb.append(((this.dimension == null)?"<null>":this.dimension));
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
        result = ((result* 31)+((this.itemInstance == null)? 0 :this.itemInstance.hashCode()));
        result = ((result* 31)+((this.originAddress == null)? 0 :this.originAddress.hashCode()));
        result = ((result* 31)+((this.classifiedTaxCategory == null)? 0 :this.classifiedTaxCategory.hashCode()));
        result = ((result* 31)+((this.certificate == null)? 0 :this.certificate.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.hazardousItem == null)? 0 :this.hazardousItem.hashCode()));
        result = ((result* 31)+((this.packSizeNumeric == null)? 0 :this.packSizeNumeric.hashCode()));
        result = ((result* 31)+((this.keyword == null)? 0 :this.keyword.hashCode()));
        result = ((result* 31)+((this.buyersItemIdentification == null)? 0 :this.buyersItemIdentification.hashCode()));
        result = ((result* 31)+((this.transactionConditions == null)? 0 :this.transactionConditions.hashCode()));
        result = ((result* 31)+((this.dimension == null)? 0 :this.dimension.hashCode()));
        result = ((result* 31)+((this.informationContentProviderParty == null)? 0 :this.informationContentProviderParty.hashCode()));
        result = ((result* 31)+((this.packQuantity == null)? 0 :this.packQuantity.hashCode()));
        result = ((result* 31)+((this.additionalInformation == null)? 0 :this.additionalInformation.hashCode()));
        result = ((result* 31)+((this.brandName == null)? 0 :this.brandName.hashCode()));
        result = ((result* 31)+((this.catalogueDocumentReference == null)? 0 :this.catalogueDocumentReference.hashCode()));
        result = ((result* 31)+((this.commodityClassification == null)? 0 :this.commodityClassification.hashCode()));
        result = ((result* 31)+((this.manufacturersItemIdentification == null)? 0 :this.manufacturersItemIdentification.hashCode()));
        result = ((result* 31)+((this.manufacturerParty == null)? 0 :this.manufacturerParty.hashCode()));
        result = ((result* 31)+((this.modelName == null)? 0 :this.modelName.hashCode()));
        result = ((result* 31)+((this.hazardousRiskIndicator == null)? 0 :this.hazardousRiskIndicator.hashCode()));
        result = ((result* 31)+((this.standardItemIdentification == null)? 0 :this.standardItemIdentification.hashCode()));
        result = ((result* 31)+((this.catalogueItemIdentification == null)? 0 :this.catalogueItemIdentification.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.catalogueIndicator == null)? 0 :this.catalogueIndicator.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.originCountry == null)? 0 :this.originCountry.hashCode()));
        result = ((result* 31)+((this.additionalItemIdentification == null)? 0 :this.additionalItemIdentification.hashCode()));
        result = ((result* 31)+((this.itemSpecificationDocumentReference == null)? 0 :this.itemSpecificationDocumentReference.hashCode()));
        result = ((result* 31)+((this.additionalItemProperty == null)? 0 :this.additionalItemProperty.hashCode()));
        result = ((result* 31)+((this.sellersItemIdentification == null)? 0 :this.sellersItemIdentification.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return ((((((((((((((((((((((((((((((((this.itemInstance == rhs.itemInstance)||((this.itemInstance!= null)&&this.itemInstance.equals(rhs.itemInstance)))&&((this.originAddress == rhs.originAddress)||((this.originAddress!= null)&&this.originAddress.equals(rhs.originAddress))))&&((this.classifiedTaxCategory == rhs.classifiedTaxCategory)||((this.classifiedTaxCategory!= null)&&this.classifiedTaxCategory.equals(rhs.classifiedTaxCategory))))&&((this.certificate == rhs.certificate)||((this.certificate!= null)&&this.certificate.equals(rhs.certificate))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.hazardousItem == rhs.hazardousItem)||((this.hazardousItem!= null)&&this.hazardousItem.equals(rhs.hazardousItem))))&&((this.packSizeNumeric == rhs.packSizeNumeric)||((this.packSizeNumeric!= null)&&this.packSizeNumeric.equals(rhs.packSizeNumeric))))&&((this.keyword == rhs.keyword)||((this.keyword!= null)&&this.keyword.equals(rhs.keyword))))&&((this.buyersItemIdentification == rhs.buyersItemIdentification)||((this.buyersItemIdentification!= null)&&this.buyersItemIdentification.equals(rhs.buyersItemIdentification))))&&((this.transactionConditions == rhs.transactionConditions)||((this.transactionConditions!= null)&&this.transactionConditions.equals(rhs.transactionConditions))))&&((this.dimension == rhs.dimension)||((this.dimension!= null)&&this.dimension.equals(rhs.dimension))))&&((this.informationContentProviderParty == rhs.informationContentProviderParty)||((this.informationContentProviderParty!= null)&&this.informationContentProviderParty.equals(rhs.informationContentProviderParty))))&&((this.packQuantity == rhs.packQuantity)||((this.packQuantity!= null)&&this.packQuantity.equals(rhs.packQuantity))))&&((this.additionalInformation == rhs.additionalInformation)||((this.additionalInformation!= null)&&this.additionalInformation.equals(rhs.additionalInformation))))&&((this.brandName == rhs.brandName)||((this.brandName!= null)&&this.brandName.equals(rhs.brandName))))&&((this.catalogueDocumentReference == rhs.catalogueDocumentReference)||((this.catalogueDocumentReference!= null)&&this.catalogueDocumentReference.equals(rhs.catalogueDocumentReference))))&&((this.commodityClassification == rhs.commodityClassification)||((this.commodityClassification!= null)&&this.commodityClassification.equals(rhs.commodityClassification))))&&((this.manufacturersItemIdentification == rhs.manufacturersItemIdentification)||((this.manufacturersItemIdentification!= null)&&this.manufacturersItemIdentification.equals(rhs.manufacturersItemIdentification))))&&((this.manufacturerParty == rhs.manufacturerParty)||((this.manufacturerParty!= null)&&this.manufacturerParty.equals(rhs.manufacturerParty))))&&((this.modelName == rhs.modelName)||((this.modelName!= null)&&this.modelName.equals(rhs.modelName))))&&((this.hazardousRiskIndicator == rhs.hazardousRiskIndicator)||((this.hazardousRiskIndicator!= null)&&this.hazardousRiskIndicator.equals(rhs.hazardousRiskIndicator))))&&((this.standardItemIdentification == rhs.standardItemIdentification)||((this.standardItemIdentification!= null)&&this.standardItemIdentification.equals(rhs.standardItemIdentification))))&&((this.catalogueItemIdentification == rhs.catalogueItemIdentification)||((this.catalogueItemIdentification!= null)&&this.catalogueItemIdentification.equals(rhs.catalogueItemIdentification))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.catalogueIndicator == rhs.catalogueIndicator)||((this.catalogueIndicator!= null)&&this.catalogueIndicator.equals(rhs.catalogueIndicator))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.originCountry == rhs.originCountry)||((this.originCountry!= null)&&this.originCountry.equals(rhs.originCountry))))&&((this.additionalItemIdentification == rhs.additionalItemIdentification)||((this.additionalItemIdentification!= null)&&this.additionalItemIdentification.equals(rhs.additionalItemIdentification))))&&((this.itemSpecificationDocumentReference == rhs.itemSpecificationDocumentReference)||((this.itemSpecificationDocumentReference!= null)&&this.itemSpecificationDocumentReference.equals(rhs.itemSpecificationDocumentReference))))&&((this.additionalItemProperty == rhs.additionalItemProperty)||((this.additionalItemProperty!= null)&&this.additionalItemProperty.equals(rhs.additionalItemProperty))))&&((this.sellersItemIdentification == rhs.sellersItemIdentification)||((this.sellersItemIdentification!= null)&&this.sellersItemIdentification.equals(rhs.sellersItemIdentification))));
    }

}
