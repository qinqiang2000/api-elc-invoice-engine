
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
 * json-schema-legacy/maindoc/UBL-Invoice-2.1.json
 * <p>
 * 
 *   Library:           OASIS Universal Business Language (UBL) 2.1 OS
 *                      http://docs.oasis-open.org/ubl/os-UBL-2.1/
 *   Release Date:      04 November 2013
 *   Module:            json-schema-legacy/maindoc/UBL-Invoice-2.1.json
 *   Generated on:      2021-12-15 21:55z
 *   Copyright (c) OASIS Open 2016. All Rights Reserved.
 * 
 * 
 *   OASIS takes no position regarding the validity or scope of any 
 *   intellectual property or other rights that might be claimed to pertain 
 *   to the implementation or use of the technology described in this 
 *   document or the extent to which any license under such rights 
 *   might or might not be available; neither does it represent that it has 
 *   made any effort to identify any such rights. Information on OASIS's 
 *   procedures with respect to rights in OASIS specifications can be 
 *   found at the OASIS website. Copies of claims of rights made 
 *   available for publication and any assurances of licenses to be made 
 *   available, or the result of an attempt made to obtain a general 
 *   license or permission for the use of such proprietary rights by 
 *   implementors or users of this specification, can be obtained from 
 *   the OASIS Executive Director.
 * 
 *   OASIS invites any interested party to bring to its attention any 
 *   copyrights, patents or patent applications, or other proprietary 
 *   rights which may cover technology that may be required to 
 *   implement this specification. Please address the information to the 
 *   OASIS Executive Director.
 *   
 *   This document and translations of it may be copied and furnished to 
 *   others, and derivative works that comment on or otherwise explain 
 *   it or assist in its implementation may be prepared, copied, 
 *   published and distributed, in whole or in part, without restriction of 
 *   any kind, provided that the above copyright notice and this 
 *   paragraph are included on all such copies and derivative works. 
 *   However, this document itself may not be modified in any way, 
 *   such as by removing the copyright notice or references to OASIS, 
 *   except as needed for the purpose of developing OASIS 
 *   specifications, in which case the procedures for copyrights defined 
 *   in the OASIS Intellectual Property Rights document must be 
 *   followed, or as required to translate it into languages other than 
 *   English. 
 * 
 *   The limited permissions granted above are perpetual and will not be 
 *   revoked by OASIS or its successors or assigns. 
 * 
 *   This document and the information contained herein is provided on 
 *   an "AS IS" basis and OASIS DISCLAIMS ALL WARRANTIES, 
 *   EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO ANY 
 *   WARRANTY THAT THE USE OF THE INFORMATION HEREIN 
 *   WILL NOT INFRINGE ANY RIGHTS OR ANY IMPLIED 
 *   WARRANTIES OF MERCHANTABILITY OR FITNESS FOR A 
 *   PARTICULAR PURPOSE.    
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_D",
    "_A",
    "_B",
    "_E",
    "Invoice"
})
@Generated("jsonschema2pojo")
public class UBLInvoice21 {

    /**
     * Document ABIE XML namespace string
     * 
     */
    @JsonProperty("_D")
    @JsonPropertyDescription("Document ABIE XML namespace string")
    private String d;
    /**
     * Library ABIE XML namespace string (for ASBIEs)
     * 
     */
    @JsonProperty("_A")
    @JsonPropertyDescription("Library ABIE XML namespace string (for ASBIEs)")
    private String a;
    /**
     * BBIE XML namespace string
     * 
     */
    @JsonProperty("_B")
    @JsonPropertyDescription("BBIE XML namespace string")
    private String b;
    /**
     * Extension scaffolding XML namespace string
     * 
     */
    @JsonProperty("_E")
    @JsonPropertyDescription("Extension scaffolding XML namespace string")
    private String e;
    /**
     * A document used to request payment.
     * (Required)
     * 
     */
    @JsonProperty("Invoice")
    @JsonPropertyDescription("A document used to request payment.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<Invoice> invoice = new ArrayList<Invoice>();

    /**
     * Document ABIE XML namespace string
     * 
     */
    @JsonProperty("_D")
    public String getD() {
        return d;
    }

    /**
     * Document ABIE XML namespace string
     * 
     */
    @JsonProperty("_D")
    public void setD(String d) {
        this.d = d;
    }

    public UBLInvoice21 withD(String d) {
        this.d = d;
        return this;
    }

    /**
     * Library ABIE XML namespace string (for ASBIEs)
     * 
     */
    @JsonProperty("_A")
    public String getA() {
        return a;
    }

    /**
     * Library ABIE XML namespace string (for ASBIEs)
     * 
     */
    @JsonProperty("_A")
    public void setA(String a) {
        this.a = a;
    }

    public UBLInvoice21 withA(String a) {
        this.a = a;
        return this;
    }

    /**
     * BBIE XML namespace string
     * 
     */
    @JsonProperty("_B")
    public String getB() {
        return b;
    }

    /**
     * BBIE XML namespace string
     * 
     */
    @JsonProperty("_B")
    public void setB(String b) {
        this.b = b;
    }

    public UBLInvoice21 withB(String b) {
        this.b = b;
        return this;
    }

    /**
     * Extension scaffolding XML namespace string
     * 
     */
    @JsonProperty("_E")
    public String getE() {
        return e;
    }

    /**
     * Extension scaffolding XML namespace string
     * 
     */
    @JsonProperty("_E")
    public void setE(String e) {
        this.e = e;
    }

    public UBLInvoice21 withE(String e) {
        this.e = e;
        return this;
    }

    /**
     * A document used to request payment.
     * (Required)
     * 
     */
    @JsonProperty("Invoice")
    public List<Invoice> getInvoice() {
        return invoice;
    }

    /**
     * A document used to request payment.
     * (Required)
     * 
     */
    @JsonProperty("Invoice")
    public void setInvoice(List<Invoice> invoice) {
        this.invoice = invoice;
    }

    public UBLInvoice21 withInvoice(List<Invoice> invoice) {
        this.invoice = invoice;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UBLInvoice21 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("d");
        sb.append('=');
        sb.append(((this.d == null)?"<null>":this.d));
        sb.append(',');
        sb.append("a");
        sb.append('=');
        sb.append(((this.a == null)?"<null>":this.a));
        sb.append(',');
        sb.append("b");
        sb.append('=');
        sb.append(((this.b == null)?"<null>":this.b));
        sb.append(',');
        sb.append("e");
        sb.append('=');
        sb.append(((this.e == null)?"<null>":this.e));
        sb.append(',');
        sb.append("invoice");
        sb.append('=');
        sb.append(((this.invoice == null)?"<null>":this.invoice));
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
        result = ((result* 31)+((this.a == null)? 0 :this.a.hashCode()));
        result = ((result* 31)+((this.b == null)? 0 :this.b.hashCode()));
        result = ((result* 31)+((this.invoice == null)? 0 :this.invoice.hashCode()));
        result = ((result* 31)+((this.d == null)? 0 :this.d.hashCode()));
        result = ((result* 31)+((this.e == null)? 0 :this.e.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UBLInvoice21) == false) {
            return false;
        }
        UBLInvoice21 rhs = ((UBLInvoice21) other);
        return ((((((this.a == rhs.a)||((this.a!= null)&&this.a.equals(rhs.a)))&&((this.b == rhs.b)||((this.b!= null)&&this.b.equals(rhs.b))))&&((this.invoice == rhs.invoice)||((this.invoice!= null)&&this.invoice.equals(rhs.invoice))))&&((this.d == rhs.d)||((this.d!= null)&&this.d.equals(rhs.d))))&&((this.e == rhs.e)||((this.e!= null)&&this.e.equals(rhs.e))));
    }

}
