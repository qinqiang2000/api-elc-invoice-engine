
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
 * Party Legal Entity. Details
 * <p>
 * A class to describe a party as a legal entity.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "RegistrationName",
    "CompanyID",
    "RegistrationDate",
    "RegistrationExpirationDate",
    "CompanyLegalFormCode",
    "CompanyLegalForm",
    "SoleProprietorshipIndicator",
    "CompanyLiquidationStatusCode",
    "CorporateStockAmount",
    "FullyPaidSharesIndicator",
    "RegistrationAddress",
    "CorporateRegistrationScheme",
    "HeadOfficeParty",
    "ShareholderParty"
})
@Generated("jsonschema2pojo")
public class PartyLegalEntity {

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
     * Party Legal Entity. Registration_ Name. Name
     * <p>
     * The name of the party as registered with the relevant legal authority.
     * 
     */
    @JsonProperty("RegistrationName")
    @JsonPropertyDescription("The name of the party as registered with the relevant legal authority.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> registrationName = new ArrayList<TextType>();
    /**
     * Party Legal Entity. Company Identifier. Identifier
     * <p>
     * An identifier for the party as registered within a company registration scheme.
     * 
     */
    @JsonProperty("CompanyID")
    @JsonPropertyDescription("An identifier for the party as registered within a company registration scheme.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> companyID = new ArrayList<IdentifierType>();
    /**
     * Party Legal Entity. Registration_ Date. Date
     * <p>
     * The registration date of the CompanyID.
     * 
     */
    @JsonProperty("RegistrationDate")
    @JsonPropertyDescription("The registration date of the CompanyID.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> registrationDate = new ArrayList<DateType>();
    /**
     * Party Legal Entity. Registration Expiration_ Date. Date
     * <p>
     * The date upon which a registration expires (e.g., registration for an import/export license).
     * 
     */
    @JsonProperty("RegistrationExpirationDate")
    @JsonPropertyDescription("The date upon which a registration expires (e.g., registration for an import/export license).")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> registrationExpirationDate = new ArrayList<DateType>();
    /**
     * Party Legal Entity. Company Legal Form Code. Code
     * <p>
     * A code signifying the party's legal status.
     * 
     */
    @JsonProperty("CompanyLegalFormCode")
    @JsonPropertyDescription("A code signifying the party's legal status.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> companyLegalFormCode = new ArrayList<CodeType>();
    /**
     * Party Legal Entity. Company Legal Form. Text
     * <p>
     * The company legal status, expressed as a text.
     * 
     */
    @JsonProperty("CompanyLegalForm")
    @JsonPropertyDescription("The company legal status, expressed as a text.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> companyLegalForm = new ArrayList<TextType>();
    /**
     * Party Legal Entity. Sole Proprietorship Indicator. Indicator
     * <p>
     * An indicator that the company is owned and controlled by one person (true) or not (false).
     * 
     */
    @JsonProperty("SoleProprietorshipIndicator")
    @JsonPropertyDescription("An indicator that the company is owned and controlled by one person (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> soleProprietorshipIndicator = new ArrayList<IndicatorType>();
    /**
     * Party Legal Entity. Company Liquidation Status Code. Code
     * <p>
     * A code signifying the party's liquidation status.
     * 
     */
    @JsonProperty("CompanyLiquidationStatusCode")
    @JsonPropertyDescription("A code signifying the party's liquidation status.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> companyLiquidationStatusCode = new ArrayList<CodeType>();
    /**
     * Party Legal Entity. Corporate Stock_ Amount. Amount
     * <p>
     * The number of shares in the capital stock of a corporation.
     * 
     */
    @JsonProperty("CorporateStockAmount")
    @JsonPropertyDescription("The number of shares in the capital stock of a corporation.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> corporateStockAmount = new ArrayList<AmountType>();
    /**
     * Party Legal Entity. Fully Paid Shares Indicator. Indicator
     * <p>
     * An indicator that all shares of corporate stock have been paid by shareholders (true) or not (false).
     * 
     */
    @JsonProperty("FullyPaidSharesIndicator")
    @JsonPropertyDescription("An indicator that all shares of corporate stock have been paid by shareholders (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> fullyPaidSharesIndicator = new ArrayList<IndicatorType>();
    /**
     * Party Legal Entity. Registration_ Address. Address
     * <p>
     * The registered address of the party within a corporate registration scheme.
     * 
     */
    @JsonProperty("RegistrationAddress")
    @JsonPropertyDescription("The registered address of the party within a corporate registration scheme.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Address> registrationAddress = new ArrayList<Address>();
    /**
     * Party Legal Entity. Corporate Registration Scheme
     * <p>
     * The corporate registration scheme used to register the party.
     * 
     */
    @JsonProperty("CorporateRegistrationScheme")
    @JsonPropertyDescription("The corporate registration scheme used to register the party.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CorporateRegistrationScheme> corporateRegistrationScheme = new ArrayList<CorporateRegistrationScheme>();
    /**
     * Party Legal Entity. Head Office_ Party. Party
     * <p>
     * The head office of the legal entity
     * 
     */
    @JsonProperty("HeadOfficeParty")
    @JsonPropertyDescription("The head office of the legal entity")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> headOfficeParty = new ArrayList<Party>();
    /**
     * Party Legal Entity. Shareholder Party
     * <p>
     * A party owning shares in this legal entity.
     * 
     */
    @JsonProperty("ShareholderParty")
    @JsonPropertyDescription("A party owning shares in this legal entity.")
    @Size(min = 1)
    @Valid
    private List<ShareholderParty> shareholderParty = new ArrayList<ShareholderParty>();

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

    public PartyLegalEntity withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Party Legal Entity. Registration_ Name. Name
     * <p>
     * The name of the party as registered with the relevant legal authority.
     * 
     */
    @JsonProperty("RegistrationName")
    public List<TextType> getRegistrationName() {
        return registrationName;
    }

    /**
     * Party Legal Entity. Registration_ Name. Name
     * <p>
     * The name of the party as registered with the relevant legal authority.
     * 
     */
    @JsonProperty("RegistrationName")
    public void setRegistrationName(List<TextType> registrationName) {
        this.registrationName = registrationName;
    }

    public PartyLegalEntity withRegistrationName(List<TextType> registrationName) {
        this.registrationName = registrationName;
        return this;
    }

    /**
     * Party Legal Entity. Company Identifier. Identifier
     * <p>
     * An identifier for the party as registered within a company registration scheme.
     * 
     */
    @JsonProperty("CompanyID")
    public List<IdentifierType> getCompanyID() {
        return companyID;
    }

    /**
     * Party Legal Entity. Company Identifier. Identifier
     * <p>
     * An identifier for the party as registered within a company registration scheme.
     * 
     */
    @JsonProperty("CompanyID")
    public void setCompanyID(List<IdentifierType> companyID) {
        this.companyID = companyID;
    }

    public PartyLegalEntity withCompanyID(List<IdentifierType> companyID) {
        this.companyID = companyID;
        return this;
    }

    /**
     * Party Legal Entity. Registration_ Date. Date
     * <p>
     * The registration date of the CompanyID.
     * 
     */
    @JsonProperty("RegistrationDate")
    public List<DateType> getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Party Legal Entity. Registration_ Date. Date
     * <p>
     * The registration date of the CompanyID.
     * 
     */
    @JsonProperty("RegistrationDate")
    public void setRegistrationDate(List<DateType> registrationDate) {
        this.registrationDate = registrationDate;
    }

    public PartyLegalEntity withRegistrationDate(List<DateType> registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    /**
     * Party Legal Entity. Registration Expiration_ Date. Date
     * <p>
     * The date upon which a registration expires (e.g., registration for an import/export license).
     * 
     */
    @JsonProperty("RegistrationExpirationDate")
    public List<DateType> getRegistrationExpirationDate() {
        return registrationExpirationDate;
    }

    /**
     * Party Legal Entity. Registration Expiration_ Date. Date
     * <p>
     * The date upon which a registration expires (e.g., registration for an import/export license).
     * 
     */
    @JsonProperty("RegistrationExpirationDate")
    public void setRegistrationExpirationDate(List<DateType> registrationExpirationDate) {
        this.registrationExpirationDate = registrationExpirationDate;
    }

    public PartyLegalEntity withRegistrationExpirationDate(List<DateType> registrationExpirationDate) {
        this.registrationExpirationDate = registrationExpirationDate;
        return this;
    }

    /**
     * Party Legal Entity. Company Legal Form Code. Code
     * <p>
     * A code signifying the party's legal status.
     * 
     */
    @JsonProperty("CompanyLegalFormCode")
    public List<CodeType> getCompanyLegalFormCode() {
        return companyLegalFormCode;
    }

    /**
     * Party Legal Entity. Company Legal Form Code. Code
     * <p>
     * A code signifying the party's legal status.
     * 
     */
    @JsonProperty("CompanyLegalFormCode")
    public void setCompanyLegalFormCode(List<CodeType> companyLegalFormCode) {
        this.companyLegalFormCode = companyLegalFormCode;
    }

    public PartyLegalEntity withCompanyLegalFormCode(List<CodeType> companyLegalFormCode) {
        this.companyLegalFormCode = companyLegalFormCode;
        return this;
    }

    /**
     * Party Legal Entity. Company Legal Form. Text
     * <p>
     * The company legal status, expressed as a text.
     * 
     */
    @JsonProperty("CompanyLegalForm")
    public List<TextType> getCompanyLegalForm() {
        return companyLegalForm;
    }

    /**
     * Party Legal Entity. Company Legal Form. Text
     * <p>
     * The company legal status, expressed as a text.
     * 
     */
    @JsonProperty("CompanyLegalForm")
    public void setCompanyLegalForm(List<TextType> companyLegalForm) {
        this.companyLegalForm = companyLegalForm;
    }

    public PartyLegalEntity withCompanyLegalForm(List<TextType> companyLegalForm) {
        this.companyLegalForm = companyLegalForm;
        return this;
    }

    /**
     * Party Legal Entity. Sole Proprietorship Indicator. Indicator
     * <p>
     * An indicator that the company is owned and controlled by one person (true) or not (false).
     * 
     */
    @JsonProperty("SoleProprietorshipIndicator")
    public List<IndicatorType> getSoleProprietorshipIndicator() {
        return soleProprietorshipIndicator;
    }

    /**
     * Party Legal Entity. Sole Proprietorship Indicator. Indicator
     * <p>
     * An indicator that the company is owned and controlled by one person (true) or not (false).
     * 
     */
    @JsonProperty("SoleProprietorshipIndicator")
    public void setSoleProprietorshipIndicator(List<IndicatorType> soleProprietorshipIndicator) {
        this.soleProprietorshipIndicator = soleProprietorshipIndicator;
    }

    public PartyLegalEntity withSoleProprietorshipIndicator(List<IndicatorType> soleProprietorshipIndicator) {
        this.soleProprietorshipIndicator = soleProprietorshipIndicator;
        return this;
    }

    /**
     * Party Legal Entity. Company Liquidation Status Code. Code
     * <p>
     * A code signifying the party's liquidation status.
     * 
     */
    @JsonProperty("CompanyLiquidationStatusCode")
    public List<CodeType> getCompanyLiquidationStatusCode() {
        return companyLiquidationStatusCode;
    }

    /**
     * Party Legal Entity. Company Liquidation Status Code. Code
     * <p>
     * A code signifying the party's liquidation status.
     * 
     */
    @JsonProperty("CompanyLiquidationStatusCode")
    public void setCompanyLiquidationStatusCode(List<CodeType> companyLiquidationStatusCode) {
        this.companyLiquidationStatusCode = companyLiquidationStatusCode;
    }

    public PartyLegalEntity withCompanyLiquidationStatusCode(List<CodeType> companyLiquidationStatusCode) {
        this.companyLiquidationStatusCode = companyLiquidationStatusCode;
        return this;
    }

    /**
     * Party Legal Entity. Corporate Stock_ Amount. Amount
     * <p>
     * The number of shares in the capital stock of a corporation.
     * 
     */
    @JsonProperty("CorporateStockAmount")
    public List<AmountType> getCorporateStockAmount() {
        return corporateStockAmount;
    }

    /**
     * Party Legal Entity. Corporate Stock_ Amount. Amount
     * <p>
     * The number of shares in the capital stock of a corporation.
     * 
     */
    @JsonProperty("CorporateStockAmount")
    public void setCorporateStockAmount(List<AmountType> corporateStockAmount) {
        this.corporateStockAmount = corporateStockAmount;
    }

    public PartyLegalEntity withCorporateStockAmount(List<AmountType> corporateStockAmount) {
        this.corporateStockAmount = corporateStockAmount;
        return this;
    }

    /**
     * Party Legal Entity. Fully Paid Shares Indicator. Indicator
     * <p>
     * An indicator that all shares of corporate stock have been paid by shareholders (true) or not (false).
     * 
     */
    @JsonProperty("FullyPaidSharesIndicator")
    public List<IndicatorType> getFullyPaidSharesIndicator() {
        return fullyPaidSharesIndicator;
    }

    /**
     * Party Legal Entity. Fully Paid Shares Indicator. Indicator
     * <p>
     * An indicator that all shares of corporate stock have been paid by shareholders (true) or not (false).
     * 
     */
    @JsonProperty("FullyPaidSharesIndicator")
    public void setFullyPaidSharesIndicator(List<IndicatorType> fullyPaidSharesIndicator) {
        this.fullyPaidSharesIndicator = fullyPaidSharesIndicator;
    }

    public PartyLegalEntity withFullyPaidSharesIndicator(List<IndicatorType> fullyPaidSharesIndicator) {
        this.fullyPaidSharesIndicator = fullyPaidSharesIndicator;
        return this;
    }

    /**
     * Party Legal Entity. Registration_ Address. Address
     * <p>
     * The registered address of the party within a corporate registration scheme.
     * 
     */
    @JsonProperty("RegistrationAddress")
    public List<Address> getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * Party Legal Entity. Registration_ Address. Address
     * <p>
     * The registered address of the party within a corporate registration scheme.
     * 
     */
    @JsonProperty("RegistrationAddress")
    public void setRegistrationAddress(List<Address> registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public PartyLegalEntity withRegistrationAddress(List<Address> registrationAddress) {
        this.registrationAddress = registrationAddress;
        return this;
    }

    /**
     * Party Legal Entity. Corporate Registration Scheme
     * <p>
     * The corporate registration scheme used to register the party.
     * 
     */
    @JsonProperty("CorporateRegistrationScheme")
    public List<CorporateRegistrationScheme> getCorporateRegistrationScheme() {
        return corporateRegistrationScheme;
    }

    /**
     * Party Legal Entity. Corporate Registration Scheme
     * <p>
     * The corporate registration scheme used to register the party.
     * 
     */
    @JsonProperty("CorporateRegistrationScheme")
    public void setCorporateRegistrationScheme(List<CorporateRegistrationScheme> corporateRegistrationScheme) {
        this.corporateRegistrationScheme = corporateRegistrationScheme;
    }

    public PartyLegalEntity withCorporateRegistrationScheme(List<CorporateRegistrationScheme> corporateRegistrationScheme) {
        this.corporateRegistrationScheme = corporateRegistrationScheme;
        return this;
    }

    /**
     * Party Legal Entity. Head Office_ Party. Party
     * <p>
     * The head office of the legal entity
     * 
     */
    @JsonProperty("HeadOfficeParty")
    public List<Party> getHeadOfficeParty() {
        return headOfficeParty;
    }

    /**
     * Party Legal Entity. Head Office_ Party. Party
     * <p>
     * The head office of the legal entity
     * 
     */
    @JsonProperty("HeadOfficeParty")
    public void setHeadOfficeParty(List<Party> headOfficeParty) {
        this.headOfficeParty = headOfficeParty;
    }

    public PartyLegalEntity withHeadOfficeParty(List<Party> headOfficeParty) {
        this.headOfficeParty = headOfficeParty;
        return this;
    }

    /**
     * Party Legal Entity. Shareholder Party
     * <p>
     * A party owning shares in this legal entity.
     * 
     */
    @JsonProperty("ShareholderParty")
    public List<ShareholderParty> getShareholderParty() {
        return shareholderParty;
    }

    /**
     * Party Legal Entity. Shareholder Party
     * <p>
     * A party owning shares in this legal entity.
     * 
     */
    @JsonProperty("ShareholderParty")
    public void setShareholderParty(List<ShareholderParty> shareholderParty) {
        this.shareholderParty = shareholderParty;
    }

    public PartyLegalEntity withShareholderParty(List<ShareholderParty> shareholderParty) {
        this.shareholderParty = shareholderParty;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PartyLegalEntity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("registrationName");
        sb.append('=');
        sb.append(((this.registrationName == null)?"<null>":this.registrationName));
        sb.append(',');
        sb.append("companyID");
        sb.append('=');
        sb.append(((this.companyID == null)?"<null>":this.companyID));
        sb.append(',');
        sb.append("registrationDate");
        sb.append('=');
        sb.append(((this.registrationDate == null)?"<null>":this.registrationDate));
        sb.append(',');
        sb.append("registrationExpirationDate");
        sb.append('=');
        sb.append(((this.registrationExpirationDate == null)?"<null>":this.registrationExpirationDate));
        sb.append(',');
        sb.append("companyLegalFormCode");
        sb.append('=');
        sb.append(((this.companyLegalFormCode == null)?"<null>":this.companyLegalFormCode));
        sb.append(',');
        sb.append("companyLegalForm");
        sb.append('=');
        sb.append(((this.companyLegalForm == null)?"<null>":this.companyLegalForm));
        sb.append(',');
        sb.append("soleProprietorshipIndicator");
        sb.append('=');
        sb.append(((this.soleProprietorshipIndicator == null)?"<null>":this.soleProprietorshipIndicator));
        sb.append(',');
        sb.append("companyLiquidationStatusCode");
        sb.append('=');
        sb.append(((this.companyLiquidationStatusCode == null)?"<null>":this.companyLiquidationStatusCode));
        sb.append(',');
        sb.append("corporateStockAmount");
        sb.append('=');
        sb.append(((this.corporateStockAmount == null)?"<null>":this.corporateStockAmount));
        sb.append(',');
        sb.append("fullyPaidSharesIndicator");
        sb.append('=');
        sb.append(((this.fullyPaidSharesIndicator == null)?"<null>":this.fullyPaidSharesIndicator));
        sb.append(',');
        sb.append("registrationAddress");
        sb.append('=');
        sb.append(((this.registrationAddress == null)?"<null>":this.registrationAddress));
        sb.append(',');
        sb.append("corporateRegistrationScheme");
        sb.append('=');
        sb.append(((this.corporateRegistrationScheme == null)?"<null>":this.corporateRegistrationScheme));
        sb.append(',');
        sb.append("headOfficeParty");
        sb.append('=');
        sb.append(((this.headOfficeParty == null)?"<null>":this.headOfficeParty));
        sb.append(',');
        sb.append("shareholderParty");
        sb.append('=');
        sb.append(((this.shareholderParty == null)?"<null>":this.shareholderParty));
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
        result = ((result* 31)+((this.registrationName == null)? 0 :this.registrationName.hashCode()));
        result = ((result* 31)+((this.companyLiquidationStatusCode == null)? 0 :this.companyLiquidationStatusCode.hashCode()));
        result = ((result* 31)+((this.companyLegalFormCode == null)? 0 :this.companyLegalFormCode.hashCode()));
        result = ((result* 31)+((this.registrationAddress == null)? 0 :this.registrationAddress.hashCode()));
        result = ((result* 31)+((this.registrationExpirationDate == null)? 0 :this.registrationExpirationDate.hashCode()));
        result = ((result* 31)+((this.corporateStockAmount == null)? 0 :this.corporateStockAmount.hashCode()));
        result = ((result* 31)+((this.headOfficeParty == null)? 0 :this.headOfficeParty.hashCode()));
        result = ((result* 31)+((this.shareholderParty == null)? 0 :this.shareholderParty.hashCode()));
        result = ((result* 31)+((this.companyID == null)? 0 :this.companyID.hashCode()));
        result = ((result* 31)+((this.soleProprietorshipIndicator == null)? 0 :this.soleProprietorshipIndicator.hashCode()));
        result = ((result* 31)+((this.corporateRegistrationScheme == null)? 0 :this.corporateRegistrationScheme.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.registrationDate == null)? 0 :this.registrationDate.hashCode()));
        result = ((result* 31)+((this.fullyPaidSharesIndicator == null)? 0 :this.fullyPaidSharesIndicator.hashCode()));
        result = ((result* 31)+((this.companyLegalForm == null)? 0 :this.companyLegalForm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PartyLegalEntity) == false) {
            return false;
        }
        PartyLegalEntity rhs = ((PartyLegalEntity) other);
        return ((((((((((((((((this.registrationName == rhs.registrationName)||((this.registrationName!= null)&&this.registrationName.equals(rhs.registrationName)))&&((this.companyLiquidationStatusCode == rhs.companyLiquidationStatusCode)||((this.companyLiquidationStatusCode!= null)&&this.companyLiquidationStatusCode.equals(rhs.companyLiquidationStatusCode))))&&((this.companyLegalFormCode == rhs.companyLegalFormCode)||((this.companyLegalFormCode!= null)&&this.companyLegalFormCode.equals(rhs.companyLegalFormCode))))&&((this.registrationAddress == rhs.registrationAddress)||((this.registrationAddress!= null)&&this.registrationAddress.equals(rhs.registrationAddress))))&&((this.registrationExpirationDate == rhs.registrationExpirationDate)||((this.registrationExpirationDate!= null)&&this.registrationExpirationDate.equals(rhs.registrationExpirationDate))))&&((this.corporateStockAmount == rhs.corporateStockAmount)||((this.corporateStockAmount!= null)&&this.corporateStockAmount.equals(rhs.corporateStockAmount))))&&((this.headOfficeParty == rhs.headOfficeParty)||((this.headOfficeParty!= null)&&this.headOfficeParty.equals(rhs.headOfficeParty))))&&((this.shareholderParty == rhs.shareholderParty)||((this.shareholderParty!= null)&&this.shareholderParty.equals(rhs.shareholderParty))))&&((this.companyID == rhs.companyID)||((this.companyID!= null)&&this.companyID.equals(rhs.companyID))))&&((this.soleProprietorshipIndicator == rhs.soleProprietorshipIndicator)||((this.soleProprietorshipIndicator!= null)&&this.soleProprietorshipIndicator.equals(rhs.soleProprietorshipIndicator))))&&((this.corporateRegistrationScheme == rhs.corporateRegistrationScheme)||((this.corporateRegistrationScheme!= null)&&this.corporateRegistrationScheme.equals(rhs.corporateRegistrationScheme))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.registrationDate == rhs.registrationDate)||((this.registrationDate!= null)&&this.registrationDate.equals(rhs.registrationDate))))&&((this.fullyPaidSharesIndicator == rhs.fullyPaidSharesIndicator)||((this.fullyPaidSharesIndicator!= null)&&this.fullyPaidSharesIndicator.equals(rhs.fullyPaidSharesIndicator))))&&((this.companyLegalForm == rhs.companyLegalForm)||((this.companyLegalForm!= null)&&this.companyLegalForm.equals(rhs.companyLegalForm))));
    }

}
