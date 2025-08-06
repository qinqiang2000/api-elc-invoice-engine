
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
 * Trade Financing. Details
 * <p>
 * A class to describe a trade financing instrument.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "FinancingInstrumentCode",
    "ContractDocumentReference",
    "DocumentReference",
    "FinancingParty",
    "FinancingFinancialAccount",
    "Clause"
})
@Generated("jsonschema2pojo")
public class TradeFinancing {

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
     * Trade Financing. Identifier
     * <p>
     * An identifier for this trade financing instrument.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this trade financing instrument.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Trade Financing. Financing Instrument Code. Code
     * <p>
     * A code signifying the type of this financing instrument.
     * 
     */
    @JsonProperty("FinancingInstrumentCode")
    @JsonPropertyDescription("A code signifying the type of this financing instrument.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> financingInstrumentCode = new ArrayList<CodeType>();
    /**
     * Trade Financing. Contract_ Document Reference. Document Reference
     * <p>
     * A reference to a contract document.
     * 
     */
    @JsonProperty("ContractDocumentReference")
    @JsonPropertyDescription("A reference to a contract document.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DocumentReference> contractDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Trade Financing. Document Reference
     * <p>
     * A reference to a document associated with this trade financing instrument.
     * 
     */
    @JsonProperty("DocumentReference")
    @JsonPropertyDescription("A reference to a document associated with this trade financing instrument.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> documentReference = new ArrayList<DocumentReference>();
    /**
     * Trade Financing. Financing_ Party. Party
     * <p>
     * The financing party (bank or other enabled party).
     * (Required)
     * 
     */
    @JsonProperty("FinancingParty")
    @JsonPropertyDescription("The financing party (bank or other enabled party).")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<Party> financingParty = new ArrayList<Party>();
    /**
     * Trade Financing. Financing_ Financial Account. Financial Account
     * <p>
     * An internal bank account used by the bank or its first agent to manage the line of credit granted to the financing requester.
     * 
     */
    @JsonProperty("FinancingFinancialAccount")
    @JsonPropertyDescription("An internal bank account used by the bank or its first agent to manage the line of credit granted to the financing requester.")
    @Size(min = 1, max = 1)
    @Valid
    private List<FinancialAccount> financingFinancialAccount = new ArrayList<FinancialAccount>();
    /**
     * Trade Financing. Clause
     * <p>
     * A clause applicable to this trade financing instrument.
     * 
     */
    @JsonProperty("Clause")
    @JsonPropertyDescription("A clause applicable to this trade financing instrument.")
    @Size(min = 1)
    @Valid
    private List<Clause> clause = new ArrayList<Clause>();

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

    public TradeFinancing withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Trade Financing. Identifier
     * <p>
     * An identifier for this trade financing instrument.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Trade Financing. Identifier
     * <p>
     * An identifier for this trade financing instrument.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public TradeFinancing withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Trade Financing. Financing Instrument Code. Code
     * <p>
     * A code signifying the type of this financing instrument.
     * 
     */
    @JsonProperty("FinancingInstrumentCode")
    public List<CodeType> getFinancingInstrumentCode() {
        return financingInstrumentCode;
    }

    /**
     * Trade Financing. Financing Instrument Code. Code
     * <p>
     * A code signifying the type of this financing instrument.
     * 
     */
    @JsonProperty("FinancingInstrumentCode")
    public void setFinancingInstrumentCode(List<CodeType> financingInstrumentCode) {
        this.financingInstrumentCode = financingInstrumentCode;
    }

    public TradeFinancing withFinancingInstrumentCode(List<CodeType> financingInstrumentCode) {
        this.financingInstrumentCode = financingInstrumentCode;
        return this;
    }

    /**
     * Trade Financing. Contract_ Document Reference. Document Reference
     * <p>
     * A reference to a contract document.
     * 
     */
    @JsonProperty("ContractDocumentReference")
    public List<DocumentReference> getContractDocumentReference() {
        return contractDocumentReference;
    }

    /**
     * Trade Financing. Contract_ Document Reference. Document Reference
     * <p>
     * A reference to a contract document.
     * 
     */
    @JsonProperty("ContractDocumentReference")
    public void setContractDocumentReference(List<DocumentReference> contractDocumentReference) {
        this.contractDocumentReference = contractDocumentReference;
    }

    public TradeFinancing withContractDocumentReference(List<DocumentReference> contractDocumentReference) {
        this.contractDocumentReference = contractDocumentReference;
        return this;
    }

    /**
     * Trade Financing. Document Reference
     * <p>
     * A reference to a document associated with this trade financing instrument.
     * 
     */
    @JsonProperty("DocumentReference")
    public List<DocumentReference> getDocumentReference() {
        return documentReference;
    }

    /**
     * Trade Financing. Document Reference
     * <p>
     * A reference to a document associated with this trade financing instrument.
     * 
     */
    @JsonProperty("DocumentReference")
    public void setDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
    }

    public TradeFinancing withDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
        return this;
    }

    /**
     * Trade Financing. Financing_ Party. Party
     * <p>
     * The financing party (bank or other enabled party).
     * (Required)
     * 
     */
    @JsonProperty("FinancingParty")
    public List<Party> getFinancingParty() {
        return financingParty;
    }

    /**
     * Trade Financing. Financing_ Party. Party
     * <p>
     * The financing party (bank or other enabled party).
     * (Required)
     * 
     */
    @JsonProperty("FinancingParty")
    public void setFinancingParty(List<Party> financingParty) {
        this.financingParty = financingParty;
    }

    public TradeFinancing withFinancingParty(List<Party> financingParty) {
        this.financingParty = financingParty;
        return this;
    }

    /**
     * Trade Financing. Financing_ Financial Account. Financial Account
     * <p>
     * An internal bank account used by the bank or its first agent to manage the line of credit granted to the financing requester.
     * 
     */
    @JsonProperty("FinancingFinancialAccount")
    public List<FinancialAccount> getFinancingFinancialAccount() {
        return financingFinancialAccount;
    }

    /**
     * Trade Financing. Financing_ Financial Account. Financial Account
     * <p>
     * An internal bank account used by the bank or its first agent to manage the line of credit granted to the financing requester.
     * 
     */
    @JsonProperty("FinancingFinancialAccount")
    public void setFinancingFinancialAccount(List<FinancialAccount> financingFinancialAccount) {
        this.financingFinancialAccount = financingFinancialAccount;
    }

    public TradeFinancing withFinancingFinancialAccount(List<FinancialAccount> financingFinancialAccount) {
        this.financingFinancialAccount = financingFinancialAccount;
        return this;
    }

    /**
     * Trade Financing. Clause
     * <p>
     * A clause applicable to this trade financing instrument.
     * 
     */
    @JsonProperty("Clause")
    public List<Clause> getClause() {
        return clause;
    }

    /**
     * Trade Financing. Clause
     * <p>
     * A clause applicable to this trade financing instrument.
     * 
     */
    @JsonProperty("Clause")
    public void setClause(List<Clause> clause) {
        this.clause = clause;
    }

    public TradeFinancing withClause(List<Clause> clause) {
        this.clause = clause;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TradeFinancing.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("financingInstrumentCode");
        sb.append('=');
        sb.append(((this.financingInstrumentCode == null)?"<null>":this.financingInstrumentCode));
        sb.append(',');
        sb.append("contractDocumentReference");
        sb.append('=');
        sb.append(((this.contractDocumentReference == null)?"<null>":this.contractDocumentReference));
        sb.append(',');
        sb.append("documentReference");
        sb.append('=');
        sb.append(((this.documentReference == null)?"<null>":this.documentReference));
        sb.append(',');
        sb.append("financingParty");
        sb.append('=');
        sb.append(((this.financingParty == null)?"<null>":this.financingParty));
        sb.append(',');
        sb.append("financingFinancialAccount");
        sb.append('=');
        sb.append(((this.financingFinancialAccount == null)?"<null>":this.financingFinancialAccount));
        sb.append(',');
        sb.append("clause");
        sb.append('=');
        sb.append(((this.clause == null)?"<null>":this.clause));
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
        result = ((result* 31)+((this.financingInstrumentCode == null)? 0 :this.financingInstrumentCode.hashCode()));
        result = ((result* 31)+((this.financingParty == null)? 0 :this.financingParty.hashCode()));
        result = ((result* 31)+((this.clause == null)? 0 :this.clause.hashCode()));
        result = ((result* 31)+((this.contractDocumentReference == null)? 0 :this.contractDocumentReference.hashCode()));
        result = ((result* 31)+((this.financingFinancialAccount == null)? 0 :this.financingFinancialAccount.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.documentReference == null)? 0 :this.documentReference.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradeFinancing) == false) {
            return false;
        }
        TradeFinancing rhs = ((TradeFinancing) other);
        return (((((((((this.financingInstrumentCode == rhs.financingInstrumentCode)||((this.financingInstrumentCode!= null)&&this.financingInstrumentCode.equals(rhs.financingInstrumentCode)))&&((this.financingParty == rhs.financingParty)||((this.financingParty!= null)&&this.financingParty.equals(rhs.financingParty))))&&((this.clause == rhs.clause)||((this.clause!= null)&&this.clause.equals(rhs.clause))))&&((this.contractDocumentReference == rhs.contractDocumentReference)||((this.contractDocumentReference!= null)&&this.contractDocumentReference.equals(rhs.contractDocumentReference))))&&((this.financingFinancialAccount == rhs.financingFinancialAccount)||((this.financingFinancialAccount!= null)&&this.financingFinancialAccount.equals(rhs.financingFinancialAccount))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.documentReference == rhs.documentReference)||((this.documentReference!= null)&&this.documentReference.equals(rhs.documentReference))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
