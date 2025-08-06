
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
 * Work Phase Reference. Details
 * <p>
 * A class that refers to a phase of work. Used for instance to specify what part of the contract the billing is referring to.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "WorkPhaseCode",
    "WorkPhase",
    "ProgressPercent",
    "StartDate",
    "EndDate",
    "WorkOrderDocumentReference"
})
@Generated("jsonschema2pojo")
public class WorkPhaseReference {

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
     * Work Phase Reference. Identifier
     * <p>
     * An identifier for this phase of work.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this phase of work.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Work Phase Reference. Work Phase Code. Code
     * <p>
     * A code signifying this phase of work.
     * 
     */
    @JsonProperty("WorkPhaseCode")
    @JsonPropertyDescription("A code signifying this phase of work.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> workPhaseCode = new ArrayList<CodeType>();
    /**
     * Work Phase Reference. Work Phase. Text
     * <p>
     * Text describing this phase of work.
     * 
     */
    @JsonProperty("WorkPhase")
    @JsonPropertyDescription("Text describing this phase of work.")
    @Size(min = 1)
    @Valid
    private List<TextType> workPhase = new ArrayList<TextType>();
    /**
     * Work Phase Reference. Progress Percent. Percent
     * <p>
     * The progress percentage of the work phase.
     * 
     */
    @JsonProperty("ProgressPercent")
    @JsonPropertyDescription("The progress percentage of the work phase.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> progressPercent = new ArrayList<NumericType>();
    /**
     * Work Phase Reference. Start Date. Date
     * <p>
     * The date on which this phase of work begins.
     * 
     */
    @JsonProperty("StartDate")
    @JsonPropertyDescription("The date on which this phase of work begins.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> startDate = new ArrayList<DateType>();
    /**
     * Work Phase Reference. End Date. Date
     * <p>
     * The date on which this phase of work ends.
     * 
     */
    @JsonProperty("EndDate")
    @JsonPropertyDescription("The date on which this phase of work ends.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> endDate = new ArrayList<DateType>();
    /**
     * Work Phase Reference. Work Order_ Document Reference. Document Reference
     * <p>
     * A reference to a document regarding the work order for the project in which this phase of work takes place.
     * 
     */
    @JsonProperty("WorkOrderDocumentReference")
    @JsonPropertyDescription("A reference to a document regarding the work order for the project in which this phase of work takes place.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> workOrderDocumentReference = new ArrayList<DocumentReference>();

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

    public WorkPhaseReference withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Work Phase Reference. Identifier
     * <p>
     * An identifier for this phase of work.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Work Phase Reference. Identifier
     * <p>
     * An identifier for this phase of work.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public WorkPhaseReference withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Work Phase Reference. Work Phase Code. Code
     * <p>
     * A code signifying this phase of work.
     * 
     */
    @JsonProperty("WorkPhaseCode")
    public List<CodeType> getWorkPhaseCode() {
        return workPhaseCode;
    }

    /**
     * Work Phase Reference. Work Phase Code. Code
     * <p>
     * A code signifying this phase of work.
     * 
     */
    @JsonProperty("WorkPhaseCode")
    public void setWorkPhaseCode(List<CodeType> workPhaseCode) {
        this.workPhaseCode = workPhaseCode;
    }

    public WorkPhaseReference withWorkPhaseCode(List<CodeType> workPhaseCode) {
        this.workPhaseCode = workPhaseCode;
        return this;
    }

    /**
     * Work Phase Reference. Work Phase. Text
     * <p>
     * Text describing this phase of work.
     * 
     */
    @JsonProperty("WorkPhase")
    public List<TextType> getWorkPhase() {
        return workPhase;
    }

    /**
     * Work Phase Reference. Work Phase. Text
     * <p>
     * Text describing this phase of work.
     * 
     */
    @JsonProperty("WorkPhase")
    public void setWorkPhase(List<TextType> workPhase) {
        this.workPhase = workPhase;
    }

    public WorkPhaseReference withWorkPhase(List<TextType> workPhase) {
        this.workPhase = workPhase;
        return this;
    }

    /**
     * Work Phase Reference. Progress Percent. Percent
     * <p>
     * The progress percentage of the work phase.
     * 
     */
    @JsonProperty("ProgressPercent")
    public List<NumericType> getProgressPercent() {
        return progressPercent;
    }

    /**
     * Work Phase Reference. Progress Percent. Percent
     * <p>
     * The progress percentage of the work phase.
     * 
     */
    @JsonProperty("ProgressPercent")
    public void setProgressPercent(List<NumericType> progressPercent) {
        this.progressPercent = progressPercent;
    }

    public WorkPhaseReference withProgressPercent(List<NumericType> progressPercent) {
        this.progressPercent = progressPercent;
        return this;
    }

    /**
     * Work Phase Reference. Start Date. Date
     * <p>
     * The date on which this phase of work begins.
     * 
     */
    @JsonProperty("StartDate")
    public List<DateType> getStartDate() {
        return startDate;
    }

    /**
     * Work Phase Reference. Start Date. Date
     * <p>
     * The date on which this phase of work begins.
     * 
     */
    @JsonProperty("StartDate")
    public void setStartDate(List<DateType> startDate) {
        this.startDate = startDate;
    }

    public WorkPhaseReference withStartDate(List<DateType> startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Work Phase Reference. End Date. Date
     * <p>
     * The date on which this phase of work ends.
     * 
     */
    @JsonProperty("EndDate")
    public List<DateType> getEndDate() {
        return endDate;
    }

    /**
     * Work Phase Reference. End Date. Date
     * <p>
     * The date on which this phase of work ends.
     * 
     */
    @JsonProperty("EndDate")
    public void setEndDate(List<DateType> endDate) {
        this.endDate = endDate;
    }

    public WorkPhaseReference withEndDate(List<DateType> endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Work Phase Reference. Work Order_ Document Reference. Document Reference
     * <p>
     * A reference to a document regarding the work order for the project in which this phase of work takes place.
     * 
     */
    @JsonProperty("WorkOrderDocumentReference")
    public List<DocumentReference> getWorkOrderDocumentReference() {
        return workOrderDocumentReference;
    }

    /**
     * Work Phase Reference. Work Order_ Document Reference. Document Reference
     * <p>
     * A reference to a document regarding the work order for the project in which this phase of work takes place.
     * 
     */
    @JsonProperty("WorkOrderDocumentReference")
    public void setWorkOrderDocumentReference(List<DocumentReference> workOrderDocumentReference) {
        this.workOrderDocumentReference = workOrderDocumentReference;
    }

    public WorkPhaseReference withWorkOrderDocumentReference(List<DocumentReference> workOrderDocumentReference) {
        this.workOrderDocumentReference = workOrderDocumentReference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WorkPhaseReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("workPhaseCode");
        sb.append('=');
        sb.append(((this.workPhaseCode == null)?"<null>":this.workPhaseCode));
        sb.append(',');
        sb.append("workPhase");
        sb.append('=');
        sb.append(((this.workPhase == null)?"<null>":this.workPhase));
        sb.append(',');
        sb.append("progressPercent");
        sb.append('=');
        sb.append(((this.progressPercent == null)?"<null>":this.progressPercent));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("workOrderDocumentReference");
        sb.append('=');
        sb.append(((this.workOrderDocumentReference == null)?"<null>":this.workOrderDocumentReference));
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
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.workOrderDocumentReference == null)? 0 :this.workOrderDocumentReference.hashCode()));
        result = ((result* 31)+((this.workPhaseCode == null)? 0 :this.workPhaseCode.hashCode()));
        result = ((result* 31)+((this.progressPercent == null)? 0 :this.progressPercent.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.workPhase == null)? 0 :this.workPhase.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkPhaseReference) == false) {
            return false;
        }
        WorkPhaseReference rhs = ((WorkPhaseReference) other);
        return (((((((((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate)))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.workOrderDocumentReference == rhs.workOrderDocumentReference)||((this.workOrderDocumentReference!= null)&&this.workOrderDocumentReference.equals(rhs.workOrderDocumentReference))))&&((this.workPhaseCode == rhs.workPhaseCode)||((this.workPhaseCode!= null)&&this.workPhaseCode.equals(rhs.workPhaseCode))))&&((this.progressPercent == rhs.progressPercent)||((this.progressPercent!= null)&&this.progressPercent.equals(rhs.progressPercent))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.workPhase == rhs.workPhase)||((this.workPhase!= null)&&this.workPhase.equals(rhs.workPhase))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
