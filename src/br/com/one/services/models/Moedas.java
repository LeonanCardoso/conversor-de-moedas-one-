package br.com.one.services.models;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Moedas {
    @SerializedName("base_code")
    private String nomeMoeda;
    @SerializedName("conversion_rates")
    Map<String,Double> conversion = new HashMap<>();

    public Moedas(String nomeMoeda, Map<String, Double> conversion) {
        this.nomeMoeda = nomeMoeda;
        this.conversion = conversion;
    }

    public String getNomeMoeda() {
        return nomeMoeda;
    }

    public void setNomeMoeda(String nomeMoeda) {
        this.nomeMoeda = nomeMoeda;
    }


    @Override
    public String toString() {
        return "Moedas{" +
                "Moeda='" + nomeMoeda + '\''+
                ", conversion=" + conversion +
                '}';
    }
}
