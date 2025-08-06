
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
 * Person. Details
 * <p>
 * A class to describe a person.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "FirstName",
    "FamilyName",
    "Title",
    "MiddleName",
    "OtherName",
    "NameSuffix",
    "JobTitle",
    "NationalityID",
    "GenderCode",
    "BirthDate",
    "BirthplaceName",
    "OrganizationDepartment",
    "Contact",
    "FinancialAccount",
    "IdentityDocumentReference",
    "ResidenceAddress"
})
@Generated("jsonschema2pojo")
public class Person {

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
     * Person. Identifier
     * <p>
     * An identifier for this person.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this person.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Person. First_ Name. Name
     * <p>
     * This person's given name.
     * 
     */
    @JsonProperty("FirstName")
    @JsonPropertyDescription("This person's given name.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> firstName = new ArrayList<TextType>();
    /**
     * Person. Family_ Name. Name
     * <p>
     * This person's family name.
     * 
     */
    @JsonProperty("FamilyName")
    @JsonPropertyDescription("This person's family name.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> familyName = new ArrayList<TextType>();
    /**
     * Person. Title. Text
     * <p>
     * This person's title of address (e.g., Mr, Ms, Dr, Sir).
     * 
     */
    @JsonProperty("Title")
    @JsonPropertyDescription("This person's title of address (e.g., Mr, Ms, Dr, Sir).")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> title = new ArrayList<TextType>();
    /**
     * Person. Middle_ Name. Name
     * <p>
     * This person's middle name(s) or initials.
     * 
     */
    @JsonProperty("MiddleName")
    @JsonPropertyDescription("This person's middle name(s) or initials.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> middleName = new ArrayList<TextType>();
    /**
     * Person. Other_ Name. Name
     * <p>
     * This person's second family name.
     * 
     */
    @JsonProperty("OtherName")
    @JsonPropertyDescription("This person's second family name.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> otherName = new ArrayList<TextType>();
    /**
     * Person. Name Suffix. Text
     * <p>
     * A suffix to this person's name (e.g., PhD, OBE, Jr).
     * 
     */
    @JsonProperty("NameSuffix")
    @JsonPropertyDescription("A suffix to this person's name (e.g., PhD, OBE, Jr).")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> nameSuffix = new ArrayList<TextType>();
    /**
     * Person. Job Title. Text
     * <p>
     * This person's job title (for a particular role) within an organization.
     * 
     */
    @JsonProperty("JobTitle")
    @JsonPropertyDescription("This person's job title (for a particular role) within an organization.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> jobTitle = new ArrayList<TextType>();
    /**
     * Person. Nationality. Identifier
     * <p>
     * An identifier for this person's nationality.
     * 
     */
    @JsonProperty("NationalityID")
    @JsonPropertyDescription("An identifier for this person's nationality.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> nationalityID = new ArrayList<IdentifierType>();
    /**
     * Person. Gender Code. Code
     * <p>
     * A code (e.g., ISO 5218) signifying the gender of this person.
     * 
     */
    @JsonProperty("GenderCode")
    @JsonPropertyDescription("A code (e.g., ISO 5218) signifying the gender of this person.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> genderCode = new ArrayList<CodeType>();
    /**
     * Person. Birth Date. Date
     * <p>
     * This person's date of birth.
     * 
     */
    @JsonProperty("BirthDate")
    @JsonPropertyDescription("This person's date of birth.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> birthDate = new ArrayList<DateType>();
    /**
     * Person. Birthplace Name. Text
     * <p>
     * The name of the place where this person was born, expressed as text.
     * 
     */
    @JsonProperty("BirthplaceName")
    @JsonPropertyDescription("The name of the place where this person was born, expressed as text.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> birthplaceName = new ArrayList<TextType>();
    /**
     * Person. Organization_ Department. Text
     * <p>
     * The department or subdivision of an organization that this person belongs to (in a particular role).
     * 
     */
    @JsonProperty("OrganizationDepartment")
    @JsonPropertyDescription("The department or subdivision of an organization that this person belongs to (in a particular role).")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> organizationDepartment = new ArrayList<TextType>();
    /**
     * Person. Contact
     * <p>
     * Contact information for this person.
     * 
     */
    @JsonProperty("Contact")
    @JsonPropertyDescription("Contact information for this person.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Contact> contact = new ArrayList<Contact>();
    /**
     * Person. Financial Account
     * <p>
     * The financial account associated with this person.
     * 
     */
    @JsonProperty("FinancialAccount")
    @JsonPropertyDescription("The financial account associated with this person.")
    @Size(min = 1, max = 1)
    @Valid
    private List<FinancialAccount> financialAccount = new ArrayList<FinancialAccount>();
    /**
     * Person. Identity_ Document Reference. Document Reference
     * <p>
     * A reference to a document that can precisely identify this person (e.g., a driver's license).
     * 
     */
    @JsonProperty("IdentityDocumentReference")
    @JsonPropertyDescription("A reference to a document that can precisely identify this person (e.g., a driver's license).")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> identityDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Person. Residence_ Address. Address
     * <p>
     * This person's address of residence.
     * 
     */
    @JsonProperty("ResidenceAddress")
    @JsonPropertyDescription("This person's address of residence.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Address> residenceAddress = new ArrayList<Address>();

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

    public Person withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Person. Identifier
     * <p>
     * An identifier for this person.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Person. Identifier
     * <p>
     * An identifier for this person.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Person withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Person. First_ Name. Name
     * <p>
     * This person's given name.
     * 
     */
    @JsonProperty("FirstName")
    public List<TextType> getFirstName() {
        return firstName;
    }

    /**
     * Person. First_ Name. Name
     * <p>
     * This person's given name.
     * 
     */
    @JsonProperty("FirstName")
    public void setFirstName(List<TextType> firstName) {
        this.firstName = firstName;
    }

    public Person withFirstName(List<TextType> firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Person. Family_ Name. Name
     * <p>
     * This person's family name.
     * 
     */
    @JsonProperty("FamilyName")
    public List<TextType> getFamilyName() {
        return familyName;
    }

    /**
     * Person. Family_ Name. Name
     * <p>
     * This person's family name.
     * 
     */
    @JsonProperty("FamilyName")
    public void setFamilyName(List<TextType> familyName) {
        this.familyName = familyName;
    }

    public Person withFamilyName(List<TextType> familyName) {
        this.familyName = familyName;
        return this;
    }

    /**
     * Person. Title. Text
     * <p>
     * This person's title of address (e.g., Mr, Ms, Dr, Sir).
     * 
     */
    @JsonProperty("Title")
    public List<TextType> getTitle() {
        return title;
    }

    /**
     * Person. Title. Text
     * <p>
     * This person's title of address (e.g., Mr, Ms, Dr, Sir).
     * 
     */
    @JsonProperty("Title")
    public void setTitle(List<TextType> title) {
        this.title = title;
    }

    public Person withTitle(List<TextType> title) {
        this.title = title;
        return this;
    }

    /**
     * Person. Middle_ Name. Name
     * <p>
     * This person's middle name(s) or initials.
     * 
     */
    @JsonProperty("MiddleName")
    public List<TextType> getMiddleName() {
        return middleName;
    }

    /**
     * Person. Middle_ Name. Name
     * <p>
     * This person's middle name(s) or initials.
     * 
     */
    @JsonProperty("MiddleName")
    public void setMiddleName(List<TextType> middleName) {
        this.middleName = middleName;
    }

    public Person withMiddleName(List<TextType> middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Person. Other_ Name. Name
     * <p>
     * This person's second family name.
     * 
     */
    @JsonProperty("OtherName")
    public List<TextType> getOtherName() {
        return otherName;
    }

    /**
     * Person. Other_ Name. Name
     * <p>
     * This person's second family name.
     * 
     */
    @JsonProperty("OtherName")
    public void setOtherName(List<TextType> otherName) {
        this.otherName = otherName;
    }

    public Person withOtherName(List<TextType> otherName) {
        this.otherName = otherName;
        return this;
    }

    /**
     * Person. Name Suffix. Text
     * <p>
     * A suffix to this person's name (e.g., PhD, OBE, Jr).
     * 
     */
    @JsonProperty("NameSuffix")
    public List<TextType> getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Person. Name Suffix. Text
     * <p>
     * A suffix to this person's name (e.g., PhD, OBE, Jr).
     * 
     */
    @JsonProperty("NameSuffix")
    public void setNameSuffix(List<TextType> nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public Person withNameSuffix(List<TextType> nameSuffix) {
        this.nameSuffix = nameSuffix;
        return this;
    }

    /**
     * Person. Job Title. Text
     * <p>
     * This person's job title (for a particular role) within an organization.
     * 
     */
    @JsonProperty("JobTitle")
    public List<TextType> getJobTitle() {
        return jobTitle;
    }

    /**
     * Person. Job Title. Text
     * <p>
     * This person's job title (for a particular role) within an organization.
     * 
     */
    @JsonProperty("JobTitle")
    public void setJobTitle(List<TextType> jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Person withJobTitle(List<TextType> jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Person. Nationality. Identifier
     * <p>
     * An identifier for this person's nationality.
     * 
     */
    @JsonProperty("NationalityID")
    public List<IdentifierType> getNationalityID() {
        return nationalityID;
    }

    /**
     * Person. Nationality. Identifier
     * <p>
     * An identifier for this person's nationality.
     * 
     */
    @JsonProperty("NationalityID")
    public void setNationalityID(List<IdentifierType> nationalityID) {
        this.nationalityID = nationalityID;
    }

    public Person withNationalityID(List<IdentifierType> nationalityID) {
        this.nationalityID = nationalityID;
        return this;
    }

    /**
     * Person. Gender Code. Code
     * <p>
     * A code (e.g., ISO 5218) signifying the gender of this person.
     * 
     */
    @JsonProperty("GenderCode")
    public List<CodeType> getGenderCode() {
        return genderCode;
    }

    /**
     * Person. Gender Code. Code
     * <p>
     * A code (e.g., ISO 5218) signifying the gender of this person.
     * 
     */
    @JsonProperty("GenderCode")
    public void setGenderCode(List<CodeType> genderCode) {
        this.genderCode = genderCode;
    }

    public Person withGenderCode(List<CodeType> genderCode) {
        this.genderCode = genderCode;
        return this;
    }

    /**
     * Person. Birth Date. Date
     * <p>
     * This person's date of birth.
     * 
     */
    @JsonProperty("BirthDate")
    public List<DateType> getBirthDate() {
        return birthDate;
    }

    /**
     * Person. Birth Date. Date
     * <p>
     * This person's date of birth.
     * 
     */
    @JsonProperty("BirthDate")
    public void setBirthDate(List<DateType> birthDate) {
        this.birthDate = birthDate;
    }

    public Person withBirthDate(List<DateType> birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * Person. Birthplace Name. Text
     * <p>
     * The name of the place where this person was born, expressed as text.
     * 
     */
    @JsonProperty("BirthplaceName")
    public List<TextType> getBirthplaceName() {
        return birthplaceName;
    }

    /**
     * Person. Birthplace Name. Text
     * <p>
     * The name of the place where this person was born, expressed as text.
     * 
     */
    @JsonProperty("BirthplaceName")
    public void setBirthplaceName(List<TextType> birthplaceName) {
        this.birthplaceName = birthplaceName;
    }

    public Person withBirthplaceName(List<TextType> birthplaceName) {
        this.birthplaceName = birthplaceName;
        return this;
    }

    /**
     * Person. Organization_ Department. Text
     * <p>
     * The department or subdivision of an organization that this person belongs to (in a particular role).
     * 
     */
    @JsonProperty("OrganizationDepartment")
    public List<TextType> getOrganizationDepartment() {
        return organizationDepartment;
    }

    /**
     * Person. Organization_ Department. Text
     * <p>
     * The department or subdivision of an organization that this person belongs to (in a particular role).
     * 
     */
    @JsonProperty("OrganizationDepartment")
    public void setOrganizationDepartment(List<TextType> organizationDepartment) {
        this.organizationDepartment = organizationDepartment;
    }

    public Person withOrganizationDepartment(List<TextType> organizationDepartment) {
        this.organizationDepartment = organizationDepartment;
        return this;
    }

    /**
     * Person. Contact
     * <p>
     * Contact information for this person.
     * 
     */
    @JsonProperty("Contact")
    public List<Contact> getContact() {
        return contact;
    }

    /**
     * Person. Contact
     * <p>
     * Contact information for this person.
     * 
     */
    @JsonProperty("Contact")
    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    public Person withContact(List<Contact> contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Person. Financial Account
     * <p>
     * The financial account associated with this person.
     * 
     */
    @JsonProperty("FinancialAccount")
    public List<FinancialAccount> getFinancialAccount() {
        return financialAccount;
    }

    /**
     * Person. Financial Account
     * <p>
     * The financial account associated with this person.
     * 
     */
    @JsonProperty("FinancialAccount")
    public void setFinancialAccount(List<FinancialAccount> financialAccount) {
        this.financialAccount = financialAccount;
    }

    public Person withFinancialAccount(List<FinancialAccount> financialAccount) {
        this.financialAccount = financialAccount;
        return this;
    }

    /**
     * Person. Identity_ Document Reference. Document Reference
     * <p>
     * A reference to a document that can precisely identify this person (e.g., a driver's license).
     * 
     */
    @JsonProperty("IdentityDocumentReference")
    public List<DocumentReference> getIdentityDocumentReference() {
        return identityDocumentReference;
    }

    /**
     * Person. Identity_ Document Reference. Document Reference
     * <p>
     * A reference to a document that can precisely identify this person (e.g., a driver's license).
     * 
     */
    @JsonProperty("IdentityDocumentReference")
    public void setIdentityDocumentReference(List<DocumentReference> identityDocumentReference) {
        this.identityDocumentReference = identityDocumentReference;
    }

    public Person withIdentityDocumentReference(List<DocumentReference> identityDocumentReference) {
        this.identityDocumentReference = identityDocumentReference;
        return this;
    }

    /**
     * Person. Residence_ Address. Address
     * <p>
     * This person's address of residence.
     * 
     */
    @JsonProperty("ResidenceAddress")
    public List<Address> getResidenceAddress() {
        return residenceAddress;
    }

    /**
     * Person. Residence_ Address. Address
     * <p>
     * This person's address of residence.
     * 
     */
    @JsonProperty("ResidenceAddress")
    public void setResidenceAddress(List<Address> residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public Person withResidenceAddress(List<Address> residenceAddress) {
        this.residenceAddress = residenceAddress;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Person.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("familyName");
        sb.append('=');
        sb.append(((this.familyName == null)?"<null>":this.familyName));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("otherName");
        sb.append('=');
        sb.append(((this.otherName == null)?"<null>":this.otherName));
        sb.append(',');
        sb.append("nameSuffix");
        sb.append('=');
        sb.append(((this.nameSuffix == null)?"<null>":this.nameSuffix));
        sb.append(',');
        sb.append("jobTitle");
        sb.append('=');
        sb.append(((this.jobTitle == null)?"<null>":this.jobTitle));
        sb.append(',');
        sb.append("nationalityID");
        sb.append('=');
        sb.append(((this.nationalityID == null)?"<null>":this.nationalityID));
        sb.append(',');
        sb.append("genderCode");
        sb.append('=');
        sb.append(((this.genderCode == null)?"<null>":this.genderCode));
        sb.append(',');
        sb.append("birthDate");
        sb.append('=');
        sb.append(((this.birthDate == null)?"<null>":this.birthDate));
        sb.append(',');
        sb.append("birthplaceName");
        sb.append('=');
        sb.append(((this.birthplaceName == null)?"<null>":this.birthplaceName));
        sb.append(',');
        sb.append("organizationDepartment");
        sb.append('=');
        sb.append(((this.organizationDepartment == null)?"<null>":this.organizationDepartment));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("financialAccount");
        sb.append('=');
        sb.append(((this.financialAccount == null)?"<null>":this.financialAccount));
        sb.append(',');
        sb.append("identityDocumentReference");
        sb.append('=');
        sb.append(((this.identityDocumentReference == null)?"<null>":this.identityDocumentReference));
        sb.append(',');
        sb.append("residenceAddress");
        sb.append('=');
        sb.append(((this.residenceAddress == null)?"<null>":this.residenceAddress));
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
        result = ((result* 31)+((this.jobTitle == null)? 0 :this.jobTitle.hashCode()));
        result = ((result* 31)+((this.nationalityID == null)? 0 :this.nationalityID.hashCode()));
        result = ((result* 31)+((this.identityDocumentReference == null)? 0 :this.identityDocumentReference.hashCode()));
        result = ((result* 31)+((this.nameSuffix == null)? 0 :this.nameSuffix.hashCode()));
        result = ((result* 31)+((this.financialAccount == null)? 0 :this.financialAccount.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.genderCode == null)? 0 :this.genderCode.hashCode()));
        result = ((result* 31)+((this.birthplaceName == null)? 0 :this.birthplaceName.hashCode()));
        result = ((result* 31)+((this.organizationDepartment == null)? 0 :this.organizationDepartment.hashCode()));
        result = ((result* 31)+((this.familyName == null)? 0 :this.familyName.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.otherName == null)? 0 :this.otherName.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.residenceAddress == null)? 0 :this.residenceAddress.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Person) == false) {
            return false;
        }
        Person rhs = ((Person) other);
        return (((((((((((((((((((this.jobTitle == rhs.jobTitle)||((this.jobTitle!= null)&&this.jobTitle.equals(rhs.jobTitle)))&&((this.nationalityID == rhs.nationalityID)||((this.nationalityID!= null)&&this.nationalityID.equals(rhs.nationalityID))))&&((this.identityDocumentReference == rhs.identityDocumentReference)||((this.identityDocumentReference!= null)&&this.identityDocumentReference.equals(rhs.identityDocumentReference))))&&((this.nameSuffix == rhs.nameSuffix)||((this.nameSuffix!= null)&&this.nameSuffix.equals(rhs.nameSuffix))))&&((this.financialAccount == rhs.financialAccount)||((this.financialAccount!= null)&&this.financialAccount.equals(rhs.financialAccount))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.genderCode == rhs.genderCode)||((this.genderCode!= null)&&this.genderCode.equals(rhs.genderCode))))&&((this.birthplaceName == rhs.birthplaceName)||((this.birthplaceName!= null)&&this.birthplaceName.equals(rhs.birthplaceName))))&&((this.organizationDepartment == rhs.organizationDepartment)||((this.organizationDepartment!= null)&&this.organizationDepartment.equals(rhs.organizationDepartment))))&&((this.familyName == rhs.familyName)||((this.familyName!= null)&&this.familyName.equals(rhs.familyName))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.otherName == rhs.otherName)||((this.otherName!= null)&&this.otherName.equals(rhs.otherName))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.residenceAddress == rhs.residenceAddress)||((this.residenceAddress!= null)&&this.residenceAddress.equals(rhs.residenceAddress))));
    }

}
