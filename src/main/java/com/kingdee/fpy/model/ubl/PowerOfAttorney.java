
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
 * Power Of Attorney. Details
 * <p>
 * A class to describe a power of attorney.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "IssueDate",
    "IssueTime",
    "Description",
    "NotaryParty",
    "AgentParty",
    "WitnessParty",
    "MandateDocumentReference"
})
@Generated("jsonschema2pojo")
public class PowerOfAttorney {

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
     * Power Of Attorney. Identifier
     * <p>
     * An identifier for this power of attorney.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this power of attorney.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Power Of Attorney. Issue Date. Date
     * <p>
     * The date on which this power of attorney was issued.
     * 
     */
    @JsonProperty("IssueDate")
    @JsonPropertyDescription("The date on which this power of attorney was issued.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> issueDate = new ArrayList<DateType>();
    /**
     * Power Of Attorney. Issue Time. Time
     * <p>
     * The time at which this power of attorney was issued.
     * 
     */
    @JsonProperty("IssueTime")
    @JsonPropertyDescription("The time at which this power of attorney was issued.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> issueTime = new ArrayList<TimeType>();
    /**
     * Power Of Attorney. Description. Text
     * <p>
     * Text describing this power of attorney.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("Text describing this power of attorney.")
    @Size(min = 1)
    @Valid
    private List<TextType> description = new ArrayList<TextType>();
    /**
     * Power Of Attorney. Notary_ Party. Party
     * <p>
     * The party notarizing this power of attorney.
     * 
     */
    @JsonProperty("NotaryParty")
    @JsonPropertyDescription("The party notarizing this power of attorney.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> notaryParty = new ArrayList<Party>();
    /**
     * Power Of Attorney. Agent_ Party. Party
     * <p>
     * The party who acts as an agent or fiduciary for the principal and who holds this power of attorney on behalf of the principal.
     * (Required)
     * 
     */
    @JsonProperty("AgentParty")
    @JsonPropertyDescription("The party who acts as an agent or fiduciary for the principal and who holds this power of attorney on behalf of the principal.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<Party> agentParty = new ArrayList<Party>();
    /**
     * Power Of Attorney. Witness_ Party. Party
     * <p>
     * An association to a WitnessParty.
     * 
     */
    @JsonProperty("WitnessParty")
    @JsonPropertyDescription("An association to a WitnessParty.")
    @Size(min = 1)
    @Valid
    private List<Party> witnessParty = new ArrayList<Party>();
    /**
     * Power Of Attorney. Mandate_ Document Reference. Document Reference
     * <p>
     * A reference to a mandate associated with this power of attorney.
     * 
     */
    @JsonProperty("MandateDocumentReference")
    @JsonPropertyDescription("A reference to a mandate associated with this power of attorney.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> mandateDocumentReference = new ArrayList<DocumentReference>();

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

    public PowerOfAttorney withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Power Of Attorney. Identifier
     * <p>
     * An identifier for this power of attorney.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Power Of Attorney. Identifier
     * <p>
     * An identifier for this power of attorney.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public PowerOfAttorney withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Power Of Attorney. Issue Date. Date
     * <p>
     * The date on which this power of attorney was issued.
     * 
     */
    @JsonProperty("IssueDate")
    public List<DateType> getIssueDate() {
        return issueDate;
    }

    /**
     * Power Of Attorney. Issue Date. Date
     * <p>
     * The date on which this power of attorney was issued.
     * 
     */
    @JsonProperty("IssueDate")
    public void setIssueDate(List<DateType> issueDate) {
        this.issueDate = issueDate;
    }

    public PowerOfAttorney withIssueDate(List<DateType> issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * Power Of Attorney. Issue Time. Time
     * <p>
     * The time at which this power of attorney was issued.
     * 
     */
    @JsonProperty("IssueTime")
    public List<TimeType> getIssueTime() {
        return issueTime;
    }

    /**
     * Power Of Attorney. Issue Time. Time
     * <p>
     * The time at which this power of attorney was issued.
     * 
     */
    @JsonProperty("IssueTime")
    public void setIssueTime(List<TimeType> issueTime) {
        this.issueTime = issueTime;
    }

    public PowerOfAttorney withIssueTime(List<TimeType> issueTime) {
        this.issueTime = issueTime;
        return this;
    }

    /**
     * Power Of Attorney. Description. Text
     * <p>
     * Text describing this power of attorney.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * Power Of Attorney. Description. Text
     * <p>
     * Text describing this power of attorney.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public PowerOfAttorney withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    /**
     * Power Of Attorney. Notary_ Party. Party
     * <p>
     * The party notarizing this power of attorney.
     * 
     */
    @JsonProperty("NotaryParty")
    public List<Party> getNotaryParty() {
        return notaryParty;
    }

    /**
     * Power Of Attorney. Notary_ Party. Party
     * <p>
     * The party notarizing this power of attorney.
     * 
     */
    @JsonProperty("NotaryParty")
    public void setNotaryParty(List<Party> notaryParty) {
        this.notaryParty = notaryParty;
    }

    public PowerOfAttorney withNotaryParty(List<Party> notaryParty) {
        this.notaryParty = notaryParty;
        return this;
    }

    /**
     * Power Of Attorney. Agent_ Party. Party
     * <p>
     * The party who acts as an agent or fiduciary for the principal and who holds this power of attorney on behalf of the principal.
     * (Required)
     * 
     */
    @JsonProperty("AgentParty")
    public List<Party> getAgentParty() {
        return agentParty;
    }

    /**
     * Power Of Attorney. Agent_ Party. Party
     * <p>
     * The party who acts as an agent or fiduciary for the principal and who holds this power of attorney on behalf of the principal.
     * (Required)
     * 
     */
    @JsonProperty("AgentParty")
    public void setAgentParty(List<Party> agentParty) {
        this.agentParty = agentParty;
    }

    public PowerOfAttorney withAgentParty(List<Party> agentParty) {
        this.agentParty = agentParty;
        return this;
    }

    /**
     * Power Of Attorney. Witness_ Party. Party
     * <p>
     * An association to a WitnessParty.
     * 
     */
    @JsonProperty("WitnessParty")
    public List<Party> getWitnessParty() {
        return witnessParty;
    }

    /**
     * Power Of Attorney. Witness_ Party. Party
     * <p>
     * An association to a WitnessParty.
     * 
     */
    @JsonProperty("WitnessParty")
    public void setWitnessParty(List<Party> witnessParty) {
        this.witnessParty = witnessParty;
    }

    public PowerOfAttorney withWitnessParty(List<Party> witnessParty) {
        this.witnessParty = witnessParty;
        return this;
    }

    /**
     * Power Of Attorney. Mandate_ Document Reference. Document Reference
     * <p>
     * A reference to a mandate associated with this power of attorney.
     * 
     */
    @JsonProperty("MandateDocumentReference")
    public List<DocumentReference> getMandateDocumentReference() {
        return mandateDocumentReference;
    }

    /**
     * Power Of Attorney. Mandate_ Document Reference. Document Reference
     * <p>
     * A reference to a mandate associated with this power of attorney.
     * 
     */
    @JsonProperty("MandateDocumentReference")
    public void setMandateDocumentReference(List<DocumentReference> mandateDocumentReference) {
        this.mandateDocumentReference = mandateDocumentReference;
    }

    public PowerOfAttorney withMandateDocumentReference(List<DocumentReference> mandateDocumentReference) {
        this.mandateDocumentReference = mandateDocumentReference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PowerOfAttorney.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("issueDate");
        sb.append('=');
        sb.append(((this.issueDate == null)?"<null>":this.issueDate));
        sb.append(',');
        sb.append("issueTime");
        sb.append('=');
        sb.append(((this.issueTime == null)?"<null>":this.issueTime));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("notaryParty");
        sb.append('=');
        sb.append(((this.notaryParty == null)?"<null>":this.notaryParty));
        sb.append(',');
        sb.append("agentParty");
        sb.append('=');
        sb.append(((this.agentParty == null)?"<null>":this.agentParty));
        sb.append(',');
        sb.append("witnessParty");
        sb.append('=');
        sb.append(((this.witnessParty == null)?"<null>":this.witnessParty));
        sb.append(',');
        sb.append("mandateDocumentReference");
        sb.append('=');
        sb.append(((this.mandateDocumentReference == null)?"<null>":this.mandateDocumentReference));
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
        result = ((result* 31)+((this.issueTime == null)? 0 :this.issueTime.hashCode()));
        result = ((result* 31)+((this.notaryParty == null)? 0 :this.notaryParty.hashCode()));
        result = ((result* 31)+((this.mandateDocumentReference == null)? 0 :this.mandateDocumentReference.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.witnessParty == null)? 0 :this.witnessParty.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.agentParty == null)? 0 :this.agentParty.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.issueDate == null)? 0 :this.issueDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PowerOfAttorney) == false) {
            return false;
        }
        PowerOfAttorney rhs = ((PowerOfAttorney) other);
        return ((((((((((this.issueTime == rhs.issueTime)||((this.issueTime!= null)&&this.issueTime.equals(rhs.issueTime)))&&((this.notaryParty == rhs.notaryParty)||((this.notaryParty!= null)&&this.notaryParty.equals(rhs.notaryParty))))&&((this.mandateDocumentReference == rhs.mandateDocumentReference)||((this.mandateDocumentReference!= null)&&this.mandateDocumentReference.equals(rhs.mandateDocumentReference))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.witnessParty == rhs.witnessParty)||((this.witnessParty!= null)&&this.witnessParty.equals(rhs.witnessParty))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.agentParty == rhs.agentParty)||((this.agentParty!= null)&&this.agentParty.equals(rhs.agentParty))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.issueDate == rhs.issueDate)||((this.issueDate!= null)&&this.issueDate.equals(rhs.issueDate))));
    }

}
