package br.com.one.services.models;

import br.com.one.services.ApiService;

import java.util.Scanner;

public class UI {
    Scanner sc = new Scanner(System.in);
    Currency currency = new Currency();
    ApiService apiService = new ApiService();

    public void UIStart() {
        System.out.println("""
                        
                        Selecione a primeira Moeda:
                        
                ARS - Peso argentino (Digite 1 para selecionar "ARS")
                                        
                BOB - Boliviano boliviano (Digite 2 para selecionar "BOB")
                                        
                BRL - Real brasileiro (Digite 3 para selecionar "BRL")
                                        
                CLP - Peso chileno (Digite 4 para selecionar "CLP")
                                        
                COP - Peso colombiano (Digite 5 para selecionar "COP")
                                        
                USD - Dólar americano (Digite 6 para selecionar "USD")
                        """);
        int option1 = sc.nextInt();
        switch (option1) {
            case 1:
                currency.setConvertFrom("ARS");
                break;
            case 2:
                currency.setConvertFrom("BOB");
                break;
            case 3:
                currency.setConvertFrom("BRL");
                break;
            case 4:
                currency.setConvertFrom("CLP");
                break;
            case 5:
                currency.setConvertFrom("COP");
                break;
            case 6:
                currency.setConvertFrom("USD");
                break;
            default:
                System.out.println("Digite um numero valido entre 1 a 6");
        }
        System.out.println(currency.getConvertFrom());

        System.out.println("""
                        
                        Selecione a segunda Moeda:
                        
                ARS - Peso argentino (Digite 1 para selecionar "ARS")
                                        
                BOB - Boliviano boliviano (Digite 2 para selecionar "BOB")
                                        
                BRL - Real brasileiro (Digite 3 para selecionar "BRL")
                                        
                CLP - Peso chileno (Digite 4 para selecionar "CLP")
                                        
                COP - Peso colombiano (Digite 5 para selecionar "COP")
                                        
                USD - Dólar americano (Digite 6 para selecionar "USD")
                        """);

        int option2 = sc.nextInt();
        switch (option2) {
            case 1:
                currency.setConvertTo("ARS");
                break;
            case 2:
                currency.setConvertTo("BOB");
                break;
            case 3:
                currency.setConvertTo("BRL");
                break;
            case 4:
                currency.setConvertTo("CLP");
                break;
            case 5:
                currency.setConvertTo("COP");
                break;
            case 6:
                currency.setConvertTo("USD");
                break;
            default:
                System.out.println("Digite um numero valido entre 1 a 6");
        }
        System.out.println(currency.getConvertTo());


        System.out.println("Digite a quantidade que deseja converter: ");
        currency.setAmountToConverter(sc.nextDouble());

        System.out.println(currency.getAmountToConverter());

        apiService.Moeda(currency);

    }


}
