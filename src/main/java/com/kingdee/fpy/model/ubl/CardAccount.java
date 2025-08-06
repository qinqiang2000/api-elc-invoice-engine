
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
 * Card Account. Details
 * <p>
 * A class to define a credit card, debit card, or charge card account.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "PrimaryAccountNumberID",
    "NetworkID",
    "CardTypeCode",
    "ValidityStartDate",
    "ExpiryDate",
    "IssuerID",
    "IssueNumberID",
    "CV2ID",
    "CardChipCode",
    "ChipApplicationID",
    "HolderName"
})
@Generated("jsonschema2pojo")
public class CardAccount {

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
     * Card Account. Primary_ Account Number. Identifier
     * <p>
     * An identifier of the card (e.g., the Primary Account Number (PAN)).
     * (Required)
     * 
     */
    @JsonProperty("PrimaryAccountNumberID")
    @JsonPropertyDescription("An identifier of the card (e.g., the Primary Account Number (PAN)).")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> primaryAccountNumberID = new ArrayList<IdentifierType>();
    /**
     * Card Account. Network. Identifier
     * <p>
     * An identifier for the financial service network provider of the card.
     * (Required)
     * 
     */
    @JsonProperty("NetworkID")
    @JsonPropertyDescription("An identifier for the financial service network provider of the card.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> networkID = new ArrayList<IdentifierType>();
    /**
     * Card Account. Card Type Code. Code
     * <p>
     * A mutually agreed code signifying the type of card. Examples of types are "debit", "credit" and "purchasing"
     * 
     */
    @JsonProperty("CardTypeCode")
    @JsonPropertyDescription("A mutually agreed code signifying the type of card. Examples of types are \"debit\", \"credit\" and \"purchasing\"")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> cardTypeCode = new ArrayList<CodeType>();
    /**
     * Card Account. Validity Start Date. Date
     * <p>
     * The date from which the card is valid.
     * 
     */
    @JsonProperty("ValidityStartDate")
    @JsonPropertyDescription("The date from which the card is valid.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> validityStartDate = new ArrayList<DateType>();
    /**
     * Card Account. Expiry Date. Date
     * <p>
     * The date on which the card expires.
     * 
     */
    @JsonProperty("ExpiryDate")
    @JsonPropertyDescription("The date on which the card expires.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> expiryDate = new ArrayList<DateType>();
    /**
     * Card Account. Issuer. Identifier
     * <p>
     * An identifier for the institution issuing the card.
     * 
     */
    @JsonProperty("IssuerID")
    @JsonPropertyDescription("An identifier for the institution issuing the card.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> issuerID = new ArrayList<IdentifierType>();
    /**
     * Card Account. Issue Number. Identifier
     * <p>
     * An identifier for the card, specified by the issuer.
     * 
     */
    @JsonProperty("IssueNumberID")
    @JsonPropertyDescription("An identifier for the card, specified by the issuer.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> issueNumberID = new ArrayList<IdentifierType>();
    /**
     * Card Account. CV2. Identifier
     * <p>
     * An identifier for the Card Verification Value (often found on the reverse of the card itself).
     * 
     */
    @JsonProperty("CV2ID")
    @JsonPropertyDescription("An identifier for the Card Verification Value (often found on the reverse of the card itself).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> cv2id = new ArrayList<IdentifierType>();
    /**
     * Card Account. Card Chip Code. Code
     * <p>
     * A mutually agreed code to distinguish between CHIP and MAG STRIPE cards.
     * 
     */
    @JsonProperty("CardChipCode")
    @JsonPropertyDescription("A mutually agreed code to distinguish between CHIP and MAG STRIPE cards.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> cardChipCode = new ArrayList<CodeType>();
    /**
     * Card Account. Chip_ Application. Identifier
     * <p>
     * An identifier on the chip card for the application that provides the quoted information; an AID (application ID).
     * 
     */
    @JsonProperty("ChipApplicationID")
    @JsonPropertyDescription("An identifier on the chip card for the application that provides the quoted information; an AID (application ID).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> chipApplicationID = new ArrayList<IdentifierType>();
    /**
     * Card Account. Holder. Name
     * <p>
     * The name of the cardholder.
     * 
     */
    @JsonProperty("HolderName")
    @JsonPropertyDescription("The name of the cardholder.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> holderName = new ArrayList<TextType>();

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

    public CardAccount withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Card Account. Primary_ Account Number. Identifier
     * <p>
     * An identifier of the card (e.g., the Primary Account Number (PAN)).
     * (Required)
     * 
     */
    @JsonProperty("PrimaryAccountNumberID")
    public List<IdentifierType> getPrimaryAccountNumberID() {
        return primaryAccountNumberID;
    }

    /**
     * Card Account. Primary_ Account Number. Identifier
     * <p>
     * An identifier of the card (e.g., the Primary Account Number (PAN)).
     * (Required)
     * 
     */
    @JsonProperty("PrimaryAccountNumberID")
    public void setPrimaryAccountNumberID(List<IdentifierType> primaryAccountNumberID) {
        this.primaryAccountNumberID = primaryAccountNumberID;
    }

    public CardAccount withPrimaryAccountNumberID(List<IdentifierType> primaryAccountNumberID) {
        this.primaryAccountNumberID = primaryAccountNumberID;
        return this;
    }

    /**
     * Card Account. Network. Identifier
     * <p>
     * An identifier for the financial service network provider of the card.
     * (Required)
     * 
     */
    @JsonProperty("NetworkID")
    public List<IdentifierType> getNetworkID() {
        return networkID;
    }

    /**
     * Card Account. Network. Identifier
     * <p>
     * An identifier for the financial service network provider of the card.
     * (Required)
     * 
     */
    @JsonProperty("NetworkID")
    public void setNetworkID(List<IdentifierType> networkID) {
        this.networkID = networkID;
    }

    public CardAccount withNetworkID(List<IdentifierType> networkID) {
        this.networkID = networkID;
        return this;
    }

    /**
     * Card Account. Card Type Code. Code
     * <p>
     * A mutually agreed code signifying the type of card. Examples of types are "debit", "credit" and "purchasing"
     * 
     */
    @JsonProperty("CardTypeCode")
    public List<CodeType> getCardTypeCode() {
        return cardTypeCode;
    }

    /**
     * Card Account. Card Type Code. Code
     * <p>
     * A mutually agreed code signifying the type of card. Examples of types are "debit", "credit" and "purchasing"
     * 
     */
    @JsonProperty("CardTypeCode")
    public void setCardTypeCode(List<CodeType> cardTypeCode) {
        this.cardTypeCode = cardTypeCode;
    }

    public CardAccount withCardTypeCode(List<CodeType> cardTypeCode) {
        this.cardTypeCode = cardTypeCode;
        return this;
    }

    /**
     * Card Account. Validity Start Date. Date
     * <p>
     * The date from which the card is valid.
     * 
     */
    @JsonProperty("ValidityStartDate")
    public List<DateType> getValidityStartDate() {
        return validityStartDate;
    }

    /**
     * Card Account. Validity Start Date. Date
     * <p>
     * The date from which the card is valid.
     * 
     */
    @JsonProperty("ValidityStartDate")
    public void setValidityStartDate(List<DateType> validityStartDate) {
        this.validityStartDate = validityStartDate;
    }

    public CardAccount withValidityStartDate(List<DateType> validityStartDate) {
        this.validityStartDate = validityStartDate;
        return this;
    }

    /**
     * Card Account. Expiry Date. Date
     * <p>
     * The date on which the card expires.
     * 
     */
    @JsonProperty("ExpiryDate")
    public List<DateType> getExpiryDate() {
        return expiryDate;
    }

    /**
     * Card Account. Expiry Date. Date
     * <p>
     * The date on which the card expires.
     * 
     */
    @JsonProperty("ExpiryDate")
    public void setExpiryDate(List<DateType> expiryDate) {
        this.expiryDate = expiryDate;
    }

    public CardAccount withExpiryDate(List<DateType> expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Card Account. Issuer. Identifier
     * <p>
     * An identifier for the institution issuing the card.
     * 
     */
    @JsonProperty("IssuerID")
    public List<IdentifierType> getIssuerID() {
        return issuerID;
    }

    /**
     * Card Account. Issuer. Identifier
     * <p>
     * An identifier for the institution issuing the card.
     * 
     */
    @JsonProperty("IssuerID")
    public void setIssuerID(List<IdentifierType> issuerID) {
        this.issuerID = issuerID;
    }

    public CardAccount withIssuerID(List<IdentifierType> issuerID) {
        this.issuerID = issuerID;
        return this;
    }

    /**
     * Card Account. Issue Number. Identifier
     * <p>
     * An identifier for the card, specified by the issuer.
     * 
     */
    @JsonProperty("IssueNumberID")
    public List<IdentifierType> getIssueNumberID() {
        return issueNumberID;
    }

    /**
     * Card Account. Issue Number. Identifier
     * <p>
     * An identifier for the card, specified by the issuer.
     * 
     */
    @JsonProperty("IssueNumberID")
    public void setIssueNumberID(List<IdentifierType> issueNumberID) {
        this.issueNumberID = issueNumberID;
    }

    public CardAccount withIssueNumberID(List<IdentifierType> issueNumberID) {
        this.issueNumberID = issueNumberID;
        return this;
    }

    /**
     * Card Account. CV2. Identifier
     * <p>
     * An identifier for the Card Verification Value (often found on the reverse of the card itself).
     * 
     */
    @JsonProperty("CV2ID")
    public List<IdentifierType> getCv2id() {
        return cv2id;
    }

    /**
     * Card Account. CV2. Identifier
     * <p>
     * An identifier for the Card Verification Value (often found on the reverse of the card itself).
     * 
     */
    @JsonProperty("CV2ID")
    public void setCv2id(List<IdentifierType> cv2id) {
        this.cv2id = cv2id;
    }

    public CardAccount withCv2id(List<IdentifierType> cv2id) {
        this.cv2id = cv2id;
        return this;
    }

    /**
     * Card Account. Card Chip Code. Code
     * <p>
     * A mutually agreed code to distinguish between CHIP and MAG STRIPE cards.
     * 
     */
    @JsonProperty("CardChipCode")
    public List<CodeType> getCardChipCode() {
        return cardChipCode;
    }

    /**
     * Card Account. Card Chip Code. Code
     * <p>
     * A mutually agreed code to distinguish between CHIP and MAG STRIPE cards.
     * 
     */
    @JsonProperty("CardChipCode")
    public void setCardChipCode(List<CodeType> cardChipCode) {
        this.cardChipCode = cardChipCode;
    }

    public CardAccount withCardChipCode(List<CodeType> cardChipCode) {
        this.cardChipCode = cardChipCode;
        return this;
    }

    /**
     * Card Account. Chip_ Application. Identifier
     * <p>
     * An identifier on the chip card for the application that provides the quoted information; an AID (application ID).
     * 
     */
    @JsonProperty("ChipApplicationID")
    public List<IdentifierType> getChipApplicationID() {
        return chipApplicationID;
    }

    /**
     * Card Account. Chip_ Application. Identifier
     * <p>
     * An identifier on the chip card for the application that provides the quoted information; an AID (application ID).
     * 
     */
    @JsonProperty("ChipApplicationID")
    public void setChipApplicationID(List<IdentifierType> chipApplicationID) {
        this.chipApplicationID = chipApplicationID;
    }

    public CardAccount withChipApplicationID(List<IdentifierType> chipApplicationID) {
        this.chipApplicationID = chipApplicationID;
        return this;
    }

    /**
     * Card Account. Holder. Name
     * <p>
     * The name of the cardholder.
     * 
     */
    @JsonProperty("HolderName")
    public List<TextType> getHolderName() {
        return holderName;
    }

    /**
     * Card Account. Holder. Name
     * <p>
     * The name of the cardholder.
     * 
     */
    @JsonProperty("HolderName")
    public void setHolderName(List<TextType> holderName) {
        this.holderName = holderName;
    }

    public CardAccount withHolderName(List<TextType> holderName) {
        this.holderName = holderName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CardAccount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("primaryAccountNumberID");
        sb.append('=');
        sb.append(((this.primaryAccountNumberID == null)?"<null>":this.primaryAccountNumberID));
        sb.append(',');
        sb.append("networkID");
        sb.append('=');
        sb.append(((this.networkID == null)?"<null>":this.networkID));
        sb.append(',');
        sb.append("cardTypeCode");
        sb.append('=');
        sb.append(((this.cardTypeCode == null)?"<null>":this.cardTypeCode));
        sb.append(',');
        sb.append("validityStartDate");
        sb.append('=');
        sb.append(((this.validityStartDate == null)?"<null>":this.validityStartDate));
        sb.append(',');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
        sb.append(',');
        sb.append("issuerID");
        sb.append('=');
        sb.append(((this.issuerID == null)?"<null>":this.issuerID));
        sb.append(',');
        sb.append("issueNumberID");
        sb.append('=');
        sb.append(((this.issueNumberID == null)?"<null>":this.issueNumberID));
        sb.append(',');
        sb.append("cv2id");
        sb.append('=');
        sb.append(((this.cv2id == null)?"<null>":this.cv2id));
        sb.append(',');
        sb.append("cardChipCode");
        sb.append('=');
        sb.append(((this.cardChipCode == null)?"<null>":this.cardChipCode));
        sb.append(',');
        sb.append("chipApplicationID");
        sb.append('=');
        sb.append(((this.chipApplicationID == null)?"<null>":this.chipApplicationID));
        sb.append(',');
        sb.append("holderName");
        sb.append('=');
        sb.append(((this.holderName == null)?"<null>":this.holderName));
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
        result = ((result* 31)+((this.holderName == null)? 0 :this.holderName.hashCode()));
        result = ((result* 31)+((this.validityStartDate == null)? 0 :this.validityStartDate.hashCode()));
        result = ((result* 31)+((this.chipApplicationID == null)? 0 :this.chipApplicationID.hashCode()));
        result = ((result* 31)+((this.expiryDate == null)? 0 :this.expiryDate.hashCode()));
        result = ((result* 31)+((this.issuerID == null)? 0 :this.issuerID.hashCode()));
        result = ((result* 31)+((this.cardChipCode == null)? 0 :this.cardChipCode.hashCode()));
        result = ((result* 31)+((this.cv2id == null)? 0 :this.cv2id.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.primaryAccountNumberID == null)? 0 :this.primaryAccountNumberID.hashCode()));
        result = ((result* 31)+((this.networkID == null)? 0 :this.networkID.hashCode()));
        result = ((result* 31)+((this.cardTypeCode == null)? 0 :this.cardTypeCode.hashCode()));
        result = ((result* 31)+((this.issueNumberID == null)? 0 :this.issueNumberID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CardAccount) == false) {
            return false;
        }
        CardAccount rhs = ((CardAccount) other);
        return (((((((((((((this.holderName == rhs.holderName)||((this.holderName!= null)&&this.holderName.equals(rhs.holderName)))&&((this.validityStartDate == rhs.validityStartDate)||((this.validityStartDate!= null)&&this.validityStartDate.equals(rhs.validityStartDate))))&&((this.chipApplicationID == rhs.chipApplicationID)||((this.chipApplicationID!= null)&&this.chipApplicationID.equals(rhs.chipApplicationID))))&&((this.expiryDate == rhs.expiryDate)||((this.expiryDate!= null)&&this.expiryDate.equals(rhs.expiryDate))))&&((this.issuerID == rhs.issuerID)||((this.issuerID!= null)&&this.issuerID.equals(rhs.issuerID))))&&((this.cardChipCode == rhs.cardChipCode)||((this.cardChipCode!= null)&&this.cardChipCode.equals(rhs.cardChipCode))))&&((this.cv2id == rhs.cv2id)||((this.cv2id!= null)&&this.cv2id.equals(rhs.cv2id))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.primaryAccountNumberID == rhs.primaryAccountNumberID)||((this.primaryAccountNumberID!= null)&&this.primaryAccountNumberID.equals(rhs.primaryAccountNumberID))))&&((this.networkID == rhs.networkID)||((this.networkID!= null)&&this.networkID.equals(rhs.networkID))))&&((this.cardTypeCode == rhs.cardTypeCode)||((this.cardTypeCode!= null)&&this.cardTypeCode.equals(rhs.cardTypeCode))))&&((this.issueNumberID == rhs.issueNumberID)||((this.issueNumberID!= null)&&this.issueNumberID.equals(rhs.issueNumberID))));
    }

}
