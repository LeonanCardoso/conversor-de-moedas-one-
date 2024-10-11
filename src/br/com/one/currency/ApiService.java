package br.com.one.currency;

import br.com.one.currency.models.Currency;
import br.com.one.currency.models.ExchangeRate;
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
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            ExchangeRate exchangeRate = gson.fromJson(json, ExchangeRate.class);
            System.out.println(exchangeRate);

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }






}
