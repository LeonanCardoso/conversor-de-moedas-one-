package br.com.one.services.models;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Moedas {
    @SerializedName("base_code")
    private String nomeMoeda;
    @SerializedName("conversion_result")
    private Double conversionResult;

    public Moedas(String nomeMoeda, Double conversionResult) {
        this.nomeMoeda = nomeMoeda;
        this.conversionResult = conversionResult;
    }

    @Override
    public String toString() {
        return "Conversão {" +
                "Moeda a ser convertida = '" + nomeMoeda + '\'' +
                ", Resultado da conversão= " + conversionResult +
                '}';
    }
}
