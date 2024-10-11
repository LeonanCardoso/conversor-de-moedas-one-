package br.com.one.currency.models;

public class Currency {
    private String convertFrom;
    private String convertTo;
    private Double amountToConverter;

    public String getConvertFrom() {
        return convertFrom;
    }

    public void setConvertFrom(String convertFrom) {
        this.convertFrom = convertFrom;
    }

    public String getConvertTo() {
        return convertTo;
    }

    public void setConvertTo(String convertTo) {
        this.convertTo = convertTo;
    }

    public Double getAmountToConverter() {
        return amountToConverter;
    }

    public void setAmountToConverter(Double amountToConverter) {
        this.amountToConverter = amountToConverter;
    }

}
