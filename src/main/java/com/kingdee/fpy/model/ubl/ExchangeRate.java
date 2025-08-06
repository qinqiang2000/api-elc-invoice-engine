
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
 * Exchange Rate. Details
 * <p>
 * A class to define an exchange rate.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "SourceCurrencyCode",
    "SourceCurrencyBaseRate",
    "TargetCurrencyCode",
    "TargetCurrencyBaseRate",
    "ExchangeMarketID",
    "CalculationRate",
    "MathematicOperatorCode",
    "Date",
    "ForeignExchangeContract"
})
@Generated("jsonschema2pojo")
public class ExchangeRate {

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
     * Exchange Rate. Source_ Currency Code. Code
     * <p>
     * The reference currency for this exchange rate; the currency from which the exchange is being made.
     * (Required)
     * 
     */
    @JsonProperty("SourceCurrencyCode")
    @JsonPropertyDescription("The reference currency for this exchange rate; the currency from which the exchange is being made.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<CodeType> sourceCurrencyCode = new ArrayList<CodeType>();
    /**
     * Exchange Rate. Source_ Currency Base Rate. Rate
     * <p>
     * In the case of a source currency with denominations of small value, the unit base.
     * 
     */
    @JsonProperty("SourceCurrencyBaseRate")
    @JsonPropertyDescription("In the case of a source currency with denominations of small value, the unit base.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> sourceCurrencyBaseRate = new ArrayList<NumericType>();
    /**
     * Exchange Rate. Target_ Currency Code. Code
     * <p>
     * The target currency for this exchange rate; the currency to which the exchange is being made.
     * (Required)
     * 
     */
    @JsonProperty("TargetCurrencyCode")
    @JsonPropertyDescription("The target currency for this exchange rate; the currency to which the exchange is being made.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<CodeType> targetCurrencyCode = new ArrayList<CodeType>();
    /**
     * Exchange Rate. Target_ Currency Base Rate. Rate
     * <p>
     * In the case of a target currency with denominations of small value, the unit base.
     * 
     */
    @JsonProperty("TargetCurrencyBaseRate")
    @JsonPropertyDescription("In the case of a target currency with denominations of small value, the unit base.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> targetCurrencyBaseRate = new ArrayList<NumericType>();
    /**
     * Exchange Rate. Exchange Market Identifier. Identifier
     * <p>
     * An identifier for the currency exchange market used as the source of this exchange rate.
     * 
     */
    @JsonProperty("ExchangeMarketID")
    @JsonPropertyDescription("An identifier for the currency exchange market used as the source of this exchange rate.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> exchangeMarketID = new ArrayList<IdentifierType>();
    /**
     * Exchange Rate. Calculation Rate. Rate
     * <p>
     * The factor applied to the source currency to calculate the target currency.
     * 
     */
    @JsonProperty("CalculationRate")
    @JsonPropertyDescription("The factor applied to the source currency to calculate the target currency.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> calculationRate = new ArrayList<NumericType>();
    /**
     * Exchange Rate. Mathematic Operator Code. Code
     * <p>
     * A code signifying whether the calculation rate is a multiplier or a divisor.
     * 
     */
    @JsonProperty("MathematicOperatorCode")
    @JsonPropertyDescription("A code signifying whether the calculation rate is a multiplier or a divisor.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> mathematicOperatorCode = new ArrayList<CodeType>();
    /**
     * Exchange Rate. Date
     * <p>
     * The date on which the exchange rate was established.
     * 
     */
    @JsonProperty("Date")
    @JsonPropertyDescription("The date on which the exchange rate was established.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> date = new ArrayList<DateType>();
    /**
     * Exchange Rate. Foreign Exchange_ Contract. Contract
     * <p>
     * A contract for foreign exchange.
     * 
     */
    @JsonProperty("ForeignExchangeContract")
    @JsonPropertyDescription("A contract for foreign exchange.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Contract> foreignExchangeContract = new ArrayList<Contract>();

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

    public ExchangeRate withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Exchange Rate. Source_ Currency Code. Code
     * <p>
     * The reference currency for this exchange rate; the currency from which the exchange is being made.
     * (Required)
     * 
     */
    @JsonProperty("SourceCurrencyCode")
    public List<CodeType> getSourceCurrencyCode() {
        return sourceCurrencyCode;
    }

    /**
     * Exchange Rate. Source_ Currency Code. Code
     * <p>
     * The reference currency for this exchange rate; the currency from which the exchange is being made.
     * (Required)
     * 
     */
    @JsonProperty("SourceCurrencyCode")
    public void setSourceCurrencyCode(List<CodeType> sourceCurrencyCode) {
        this.sourceCurrencyCode = sourceCurrencyCode;
    }

    public ExchangeRate withSourceCurrencyCode(List<CodeType> sourceCurrencyCode) {
        this.sourceCurrencyCode = sourceCurrencyCode;
        return this;
    }

    /**
     * Exchange Rate. Source_ Currency Base Rate. Rate
     * <p>
     * In the case of a source currency with denominations of small value, the unit base.
     * 
     */
    @JsonProperty("SourceCurrencyBaseRate")
    public List<NumericType> getSourceCurrencyBaseRate() {
        return sourceCurrencyBaseRate;
    }

    /**
     * Exchange Rate. Source_ Currency Base Rate. Rate
     * <p>
     * In the case of a source currency with denominations of small value, the unit base.
     * 
     */
    @JsonProperty("SourceCurrencyBaseRate")
    public void setSourceCurrencyBaseRate(List<NumericType> sourceCurrencyBaseRate) {
        this.sourceCurrencyBaseRate = sourceCurrencyBaseRate;
    }

    public ExchangeRate withSourceCurrencyBaseRate(List<NumericType> sourceCurrencyBaseRate) {
        this.sourceCurrencyBaseRate = sourceCurrencyBaseRate;
        return this;
    }

    /**
     * Exchange Rate. Target_ Currency Code. Code
     * <p>
     * The target currency for this exchange rate; the currency to which the exchange is being made.
     * (Required)
     * 
     */
    @JsonProperty("TargetCurrencyCode")
    public List<CodeType> getTargetCurrencyCode() {
        return targetCurrencyCode;
    }

    /**
     * Exchange Rate. Target_ Currency Code. Code
     * <p>
     * The target currency for this exchange rate; the currency to which the exchange is being made.
     * (Required)
     * 
     */
    @JsonProperty("TargetCurrencyCode")
    public void setTargetCurrencyCode(List<CodeType> targetCurrencyCode) {
        this.targetCurrencyCode = targetCurrencyCode;
    }

    public ExchangeRate withTargetCurrencyCode(List<CodeType> targetCurrencyCode) {
        this.targetCurrencyCode = targetCurrencyCode;
        return this;
    }

    /**
     * Exchange Rate. Target_ Currency Base Rate. Rate
     * <p>
     * In the case of a target currency with denominations of small value, the unit base.
     * 
     */
    @JsonProperty("TargetCurrencyBaseRate")
    public List<NumericType> getTargetCurrencyBaseRate() {
        return targetCurrencyBaseRate;
    }

    /**
     * Exchange Rate. Target_ Currency Base Rate. Rate
     * <p>
     * In the case of a target currency with denominations of small value, the unit base.
     * 
     */
    @JsonProperty("TargetCurrencyBaseRate")
    public void setTargetCurrencyBaseRate(List<NumericType> targetCurrencyBaseRate) {
        this.targetCurrencyBaseRate = targetCurrencyBaseRate;
    }

    public ExchangeRate withTargetCurrencyBaseRate(List<NumericType> targetCurrencyBaseRate) {
        this.targetCurrencyBaseRate = targetCurrencyBaseRate;
        return this;
    }

    /**
     * Exchange Rate. Exchange Market Identifier. Identifier
     * <p>
     * An identifier for the currency exchange market used as the source of this exchange rate.
     * 
     */
    @JsonProperty("ExchangeMarketID")
    public List<IdentifierType> getExchangeMarketID() {
        return exchangeMarketID;
    }

    /**
     * Exchange Rate. Exchange Market Identifier. Identifier
     * <p>
     * An identifier for the currency exchange market used as the source of this exchange rate.
     * 
     */
    @JsonProperty("ExchangeMarketID")
    public void setExchangeMarketID(List<IdentifierType> exchangeMarketID) {
        this.exchangeMarketID = exchangeMarketID;
    }

    public ExchangeRate withExchangeMarketID(List<IdentifierType> exchangeMarketID) {
        this.exchangeMarketID = exchangeMarketID;
        return this;
    }

    /**
     * Exchange Rate. Calculation Rate. Rate
     * <p>
     * The factor applied to the source currency to calculate the target currency.
     * 
     */
    @JsonProperty("CalculationRate")
    public List<NumericType> getCalculationRate() {
        return calculationRate;
    }

    /**
     * Exchange Rate. Calculation Rate. Rate
     * <p>
     * The factor applied to the source currency to calculate the target currency.
     * 
     */
    @JsonProperty("CalculationRate")
    public void setCalculationRate(List<NumericType> calculationRate) {
        this.calculationRate = calculationRate;
    }

    public ExchangeRate withCalculationRate(List<NumericType> calculationRate) {
        this.calculationRate = calculationRate;
        return this;
    }

    /**
     * Exchange Rate. Mathematic Operator Code. Code
     * <p>
     * A code signifying whether the calculation rate is a multiplier or a divisor.
     * 
     */
    @JsonProperty("MathematicOperatorCode")
    public List<CodeType> getMathematicOperatorCode() {
        return mathematicOperatorCode;
    }

    /**
     * Exchange Rate. Mathematic Operator Code. Code
     * <p>
     * A code signifying whether the calculation rate is a multiplier or a divisor.
     * 
     */
    @JsonProperty("MathematicOperatorCode")
    public void setMathematicOperatorCode(List<CodeType> mathematicOperatorCode) {
        this.mathematicOperatorCode = mathematicOperatorCode;
    }

    public ExchangeRate withMathematicOperatorCode(List<CodeType> mathematicOperatorCode) {
        this.mathematicOperatorCode = mathematicOperatorCode;
        return this;
    }

    /**
     * Exchange Rate. Date
     * <p>
     * The date on which the exchange rate was established.
     * 
     */
    @JsonProperty("Date")
    public List<DateType> getDate() {
        return date;
    }

    /**
     * Exchange Rate. Date
     * <p>
     * The date on which the exchange rate was established.
     * 
     */
    @JsonProperty("Date")
    public void setDate(List<DateType> date) {
        this.date = date;
    }

    public ExchangeRate withDate(List<DateType> date) {
        this.date = date;
        return this;
    }

    /**
     * Exchange Rate. Foreign Exchange_ Contract. Contract
     * <p>
     * A contract for foreign exchange.
     * 
     */
    @JsonProperty("ForeignExchangeContract")
    public List<Contract> getForeignExchangeContract() {
        return foreignExchangeContract;
    }

    /**
     * Exchange Rate. Foreign Exchange_ Contract. Contract
     * <p>
     * A contract for foreign exchange.
     * 
     */
    @JsonProperty("ForeignExchangeContract")
    public void setForeignExchangeContract(List<Contract> foreignExchangeContract) {
        this.foreignExchangeContract = foreignExchangeContract;
    }

    public ExchangeRate withForeignExchangeContract(List<Contract> foreignExchangeContract) {
        this.foreignExchangeContract = foreignExchangeContract;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExchangeRate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("sourceCurrencyCode");
        sb.append('=');
        sb.append(((this.sourceCurrencyCode == null)?"<null>":this.sourceCurrencyCode));
        sb.append(',');
        sb.append("sourceCurrencyBaseRate");
        sb.append('=');
        sb.append(((this.sourceCurrencyBaseRate == null)?"<null>":this.sourceCurrencyBaseRate));
        sb.append(',');
        sb.append("targetCurrencyCode");
        sb.append('=');
        sb.append(((this.targetCurrencyCode == null)?"<null>":this.targetCurrencyCode));
        sb.append(',');
        sb.append("targetCurrencyBaseRate");
        sb.append('=');
        sb.append(((this.targetCurrencyBaseRate == null)?"<null>":this.targetCurrencyBaseRate));
        sb.append(',');
        sb.append("exchangeMarketID");
        sb.append('=');
        sb.append(((this.exchangeMarketID == null)?"<null>":this.exchangeMarketID));
        sb.append(',');
        sb.append("calculationRate");
        sb.append('=');
        sb.append(((this.calculationRate == null)?"<null>":this.calculationRate));
        sb.append(',');
        sb.append("mathematicOperatorCode");
        sb.append('=');
        sb.append(((this.mathematicOperatorCode == null)?"<null>":this.mathematicOperatorCode));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("foreignExchangeContract");
        sb.append('=');
        sb.append(((this.foreignExchangeContract == null)?"<null>":this.foreignExchangeContract));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.exchangeMarketID == null)? 0 :this.exchangeMarketID.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.foreignExchangeContract == null)? 0 :this.foreignExchangeContract.hashCode()));
        result = ((result* 31)+((this.calculationRate == null)? 0 :this.calculationRate.hashCode()));
        result = ((result* 31)+((this.sourceCurrencyCode == null)? 0 :this.sourceCurrencyCode.hashCode()));
        result = ((result* 31)+((this.targetCurrencyCode == null)? 0 :this.targetCurrencyCode.hashCode()));
        result = ((result* 31)+((this.sourceCurrencyBaseRate == null)? 0 :this.sourceCurrencyBaseRate.hashCode()));
        result = ((result* 31)+((this.targetCurrencyBaseRate == null)? 0 :this.targetCurrencyBaseRate.hashCode()));
        result = ((result* 31)+((this.mathematicOperatorCode == null)? 0 :this.mathematicOperatorCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExchangeRate) == false) {
            return false;
        }
        ExchangeRate rhs = ((ExchangeRate) other);
        return (((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.exchangeMarketID == rhs.exchangeMarketID)||((this.exchangeMarketID!= null)&&this.exchangeMarketID.equals(rhs.exchangeMarketID))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.foreignExchangeContract == rhs.foreignExchangeContract)||((this.foreignExchangeContract!= null)&&this.foreignExchangeContract.equals(rhs.foreignExchangeContract))))&&((this.calculationRate == rhs.calculationRate)||((this.calculationRate!= null)&&this.calculationRate.equals(rhs.calculationRate))))&&((this.sourceCurrencyCode == rhs.sourceCurrencyCode)||((this.sourceCurrencyCode!= null)&&this.sourceCurrencyCode.equals(rhs.sourceCurrencyCode))))&&((this.targetCurrencyCode == rhs.targetCurrencyCode)||((this.targetCurrencyCode!= null)&&this.targetCurrencyCode.equals(rhs.targetCurrencyCode))))&&((this.sourceCurrencyBaseRate == rhs.sourceCurrencyBaseRate)||((this.sourceCurrencyBaseRate!= null)&&this.sourceCurrencyBaseRate.equals(rhs.sourceCurrencyBaseRate))))&&((this.targetCurrencyBaseRate == rhs.targetCurrencyBaseRate)||((this.targetCurrencyBaseRate!= null)&&this.targetCurrencyBaseRate.equals(rhs.targetCurrencyBaseRate))))&&((this.mathematicOperatorCode == rhs.mathematicOperatorCode)||((this.mathematicOperatorCode!= null)&&this.mathematicOperatorCode.equals(rhs.mathematicOperatorCode))));
    }

}
