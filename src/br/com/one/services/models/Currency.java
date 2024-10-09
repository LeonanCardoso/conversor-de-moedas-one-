package br.com.one.services.models;

public class Currency {
    private String convertFrom;
    private String convertTo;
    private String amountToConverter;

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

    public String getAmountToConverter() {
        return amountToConverter;
    }

    public void setAmountToConverter(Double amountToConverter) {
        this.amountToConverter = String.valueOf(amountToConverter);
    }

}
