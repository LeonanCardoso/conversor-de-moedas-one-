package br.com.one.currency.models;
import com.google.gson.annotations.SerializedName;

public class ExchangeRate {
    @SerializedName("base_code")
    private String nomeMoeda;
    @SerializedName("conversion_result")
    private Double conversionResult;
    @SerializedName("target_code")
    private String targetCode;
    @SerializedName("conversion_rate")
    private Double rate;

    public Double getConversionResult() {
        return conversionResult;
    }

    public Double getRate() {
        return rate;
    }

    public Double originalValue(){
        return conversionResult / rate;
    }


    public ExchangeRate(String nomeMoeda, Double conversionResult) {
        this.nomeMoeda = nomeMoeda;
        this.conversionResult = conversionResult;
    }

    @Override
    public String toString() {
        return "Foi convertido " + String.format("%.2f", originalValue()) + " " + nomeMoeda +
                " para " + String.format("%.2f", conversionResult) + " " + targetCode + ".";
    }
}
