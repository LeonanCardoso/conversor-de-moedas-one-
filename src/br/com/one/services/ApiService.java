package br.com.one.services;

import br.com.one.services.models.Currency;
import br.com.one.services.models.Moedas;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {

    public void Moeda (Currency currency){
        String api = "b5dfc700d140236031c54df0";
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        try{

            URI uri = URI.create("https://v6.exchangerate-api.com/v6/"+ api +"/pair/" + currency.getConvertFrom()+ "/" + currency.getConvertTo() + "/" + currency.getAmountToConverter());
            System.out.println(uri);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println("json" +json);
            Moedas moedas = gson.fromJson(json, Moedas.class);
            System.out.println(moedas);

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }






}
