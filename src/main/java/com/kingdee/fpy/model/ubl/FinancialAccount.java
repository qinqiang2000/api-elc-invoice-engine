
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
 * Financial Account. Details
 * <p>
 * A class to describe a financial account.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Name",
    "AliasName",
    "AccountTypeCode",
    "AccountFormatCode",
    "CurrencyCode",
    "PaymentNote",
    "FinancialInstitutionBranch",
    "Country"
})
@Generated("jsonschema2pojo")
public class FinancialAccount {

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
     * Financial Account. Identifier
     * <p>
     * The identifier for this financial account; the bank account number.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("The identifier for this financial account; the bank account number.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Financial Account. Name
     * <p>
     * The name of this financial account.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("The name of this financial account.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> name = new ArrayList<TextType>();
    /**
     * Financial Account. Alias_ Name. Name
     * <p>
     * An alias for the name of this financial account, to be used in place of the actual account name for security reasons.
     * 
     */
    @JsonProperty("AliasName")
    @JsonPropertyDescription("An alias for the name of this financial account, to be used in place of the actual account name for security reasons.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> aliasName = new ArrayList<TextType>();
    /**
     * Financial Account. Account Type Code. Code
     * <p>
     * A code signifying the type of this financial account.
     * 
     */
    @JsonProperty("AccountTypeCode")
    @JsonPropertyDescription("A code signifying the type of this financial account.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> accountTypeCode = new ArrayList<CodeType>();
    /**
     * Financial Account. Account Format Code. Code
     * <p>
     * A code signifying the format of this financial account.
     * 
     */
    @JsonProperty("AccountFormatCode")
    @JsonPropertyDescription("A code signifying the format of this financial account.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> accountFormatCode = new ArrayList<CodeType>();
    /**
     * Financial Account. Currency Code. Code
     * <p>
     * A code signifying the currency in which this financial account is held.
     * 
     */
    @JsonProperty("CurrencyCode")
    @JsonPropertyDescription("A code signifying the currency in which this financial account is held.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> currencyCode = new ArrayList<CodeType>();
    /**
     * Financial Account. Payment_ Note. Text
     * <p>
     * Free-form text applying to the Payment for the owner of this account.
     * 
     */
    @JsonProperty("PaymentNote")
    @JsonPropertyDescription("Free-form text applying to the Payment for the owner of this account.")
    @Size(min = 1)
    @Valid
    private List<TextType> paymentNote = new ArrayList<TextType>();
    /**
     * Financial Account. Financial Institution_ Branch. Branch
     * <p>
     * The branch of the financial institution associated with this financial account.
     * 
     */
    @JsonProperty("FinancialInstitutionBranch")
    @JsonPropertyDescription("The branch of the financial institution associated with this financial account.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Branch> financialInstitutionBranch = new ArrayList<Branch>();
    /**
     * Financial Account. Country
     * <p>
     * The country in which the holder of the financial account is domiciled.
     * 
     */
    @JsonProperty("Country")
    @JsonPropertyDescription("The country in which the holder of the financial account is domiciled.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Country> country = new ArrayList<Country>();

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

    public FinancialAccount withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Financial Account. Identifier
     * <p>
     * The identifier for this financial account; the bank account number.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Financial Account. Identifier
     * <p>
     * The identifier for this financial account; the bank account number.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public FinancialAccount withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Financial Account. Name
     * <p>
     * The name of this financial account.
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * Financial Account. Name
     * <p>
     * The name of this financial account.
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public FinancialAccount withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    /**
     * Financial Account. Alias_ Name. Name
     * <p>
     * An alias for the name of this financial account, to be used in place of the actual account name for security reasons.
     * 
     */
    @JsonProperty("AliasName")
    public List<TextType> getAliasName() {
        return aliasName;
    }

    /**
     * Financial Account. Alias_ Name. Name
     * <p>
     * An alias for the name of this financial account, to be used in place of the actual account name for security reasons.
     * 
     */
    @JsonProperty("AliasName")
    public void setAliasName(List<TextType> aliasName) {
        this.aliasName = aliasName;
    }

    public FinancialAccount withAliasName(List<TextType> aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * Financial Account. Account Type Code. Code
     * <p>
     * A code signifying the type of this financial account.
     * 
     */
    @JsonProperty("AccountTypeCode")
    public List<CodeType> getAccountTypeCode() {
        return accountTypeCode;
    }

    /**
     * Financial Account. Account Type Code. Code
     * <p>
     * A code signifying the type of this financial account.
     * 
     */
    @JsonProperty("AccountTypeCode")
    public void setAccountTypeCode(List<CodeType> accountTypeCode) {
        this.accountTypeCode = accountTypeCode;
    }

    public FinancialAccount withAccountTypeCode(List<CodeType> accountTypeCode) {
        this.accountTypeCode = accountTypeCode;
        return this;
    }

    /**
     * Financial Account. Account Format Code. Code
     * <p>
     * A code signifying the format of this financial account.
     * 
     */
    @JsonProperty("AccountFormatCode")
    public List<CodeType> getAccountFormatCode() {
        return accountFormatCode;
    }

    /**
     * Financial Account. Account Format Code. Code
     * <p>
     * A code signifying the format of this financial account.
     * 
     */
    @JsonProperty("AccountFormatCode")
    public void setAccountFormatCode(List<CodeType> accountFormatCode) {
        this.accountFormatCode = accountFormatCode;
    }

    public FinancialAccount withAccountFormatCode(List<CodeType> accountFormatCode) {
        this.accountFormatCode = accountFormatCode;
        return this;
    }

    /**
     * Financial Account. Currency Code. Code
     * <p>
     * A code signifying the currency in which this financial account is held.
     * 
     */
    @JsonProperty("CurrencyCode")
    public List<CodeType> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Financial Account. Currency Code. Code
     * <p>
     * A code signifying the currency in which this financial account is held.
     * 
     */
    @JsonProperty("CurrencyCode")
    public void setCurrencyCode(List<CodeType> currencyCode) {
        this.currencyCode = currencyCode;
    }

    public FinancialAccount withCurrencyCode(List<CodeType> currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Financial Account. Payment_ Note. Text
     * <p>
     * Free-form text applying to the Payment for the owner of this account.
     * 
     */
    @JsonProperty("PaymentNote")
    public List<TextType> getPaymentNote() {
        return paymentNote;
    }

    /**
     * Financial Account. Payment_ Note. Text
     * <p>
     * Free-form text applying to the Payment for the owner of this account.
     * 
     */
    @JsonProperty("PaymentNote")
    public void setPaymentNote(List<TextType> paymentNote) {
        this.paymentNote = paymentNote;
    }

    public FinancialAccount withPaymentNote(List<TextType> paymentNote) {
        this.paymentNote = paymentNote;
        return this;
    }

    /**
     * Financial Account. Financial Institution_ Branch. Branch
     * <p>
     * The branch of the financial institution associated with this financial account.
     * 
     */
    @JsonProperty("FinancialInstitutionBranch")
    public List<Branch> getFinancialInstitutionBranch() {
        return financialInstitutionBranch;
    }

    /**
     * Financial Account. Financial Institution_ Branch. Branch
     * <p>
     * The branch of the financial institution associated with this financial account.
     * 
     */
    @JsonProperty("FinancialInstitutionBranch")
    public void setFinancialInstitutionBranch(List<Branch> financialInstitutionBranch) {
        this.financialInstitutionBranch = financialInstitutionBranch;
    }

    public FinancialAccount withFinancialInstitutionBranch(List<Branch> financialInstitutionBranch) {
        this.financialInstitutionBranch = financialInstitutionBranch;
        return this;
    }

    /**
     * Financial Account. Country
     * <p>
     * The country in which the holder of the financial account is domiciled.
     * 
     */
    @JsonProperty("Country")
    public List<Country> getCountry() {
        return country;
    }

    /**
     * Financial Account. Country
     * <p>
     * The country in which the holder of the financial account is domiciled.
     * 
     */
    @JsonProperty("Country")
    public void setCountry(List<Country> country) {
        this.country = country;
    }

    public FinancialAccount withCountry(List<Country> country) {
        this.country = country;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialAccount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("aliasName");
        sb.append('=');
        sb.append(((this.aliasName == null)?"<null>":this.aliasName));
        sb.append(',');
        sb.append("accountTypeCode");
        sb.append('=');
        sb.append(((this.accountTypeCode == null)?"<null>":this.accountTypeCode));
        sb.append(',');
        sb.append("accountFormatCode");
        sb.append('=');
        sb.append(((this.accountFormatCode == null)?"<null>":this.accountFormatCode));
        sb.append(',');
        sb.append("currencyCode");
        sb.append('=');
        sb.append(((this.currencyCode == null)?"<null>":this.currencyCode));
        sb.append(',');
        sb.append("paymentNote");
        sb.append('=');
        sb.append(((this.paymentNote == null)?"<null>":this.paymentNote));
        sb.append(',');
        sb.append("financialInstitutionBranch");
        sb.append('=');
        sb.append(((this.financialInstitutionBranch == null)?"<null>":this.financialInstitutionBranch));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
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
        result = ((result* 31)+((this.aliasName == null)? 0 :this.aliasName.hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.financialInstitutionBranch == null)? 0 :this.financialInstitutionBranch.hashCode()));
        result = ((result* 31)+((this.paymentNote == null)? 0 :this.paymentNote.hashCode()));
        result = ((result* 31)+((this.accountTypeCode == null)? 0 :this.accountTypeCode.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.accountFormatCode == null)? 0 :this.accountFormatCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.currencyCode == null)? 0 :this.currencyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialAccount) == false) {
            return false;
        }
        FinancialAccount rhs = ((FinancialAccount) other);
        return (((((((((((this.aliasName == rhs.aliasName)||((this.aliasName!= null)&&this.aliasName.equals(rhs.aliasName)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.financialInstitutionBranch == rhs.financialInstitutionBranch)||((this.financialInstitutionBranch!= null)&&this.financialInstitutionBranch.equals(rhs.financialInstitutionBranch))))&&((this.paymentNote == rhs.paymentNote)||((this.paymentNote!= null)&&this.paymentNote.equals(rhs.paymentNote))))&&((this.accountTypeCode == rhs.accountTypeCode)||((this.accountTypeCode!= null)&&this.accountTypeCode.equals(rhs.accountTypeCode))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.accountFormatCode == rhs.accountFormatCode)||((this.accountFormatCode!= null)&&this.accountFormatCode.equals(rhs.accountFormatCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.currencyCode == rhs.currencyCode)||((this.currencyCode!= null)&&this.currencyCode.equals(rhs.currencyCode))));
    }

}
