package br.com.one.currency.models.ui;

import br.com.one.currency.ApiService;
import br.com.one.currency.models.Currency;

import java.util.Scanner;

public class CurrencyConverterUI {
    Scanner sc = new Scanner(System.in);
    Currency currency = new Currency();
    ApiService apiService = new ApiService();

    public void showCurrencyOptions(){
        System.out.println("""
                ***********************************************************************        
                
                                Selecione a Moeda:
                        
                (1) - ARS - Peso argentino (Digite 1 para selecionar "ARS")
                                        
                (2) - BOB - Boliviano boliviano (Digite 2 para selecionar "BOB")
                                        
                (3) - BRL - Real brasileiro (Digite 3 para selecionar "BRL")
                                        
                (4) - CLP - Peso chileno (Digite 4 para selecionar "CLP")
                                        
                (5) - COP - Peso colombiano (Digite 5 para selecionar "COP")
                                        
                (6) - USD - Dólar americano (Digite 6 para selecionar "USD")
                
                                Escolha entre 1 a 6 !
                                
                *********************************************************************** 
                       
                                
                        """);
        System.out.print("Digite um numero valido entre 1 a 6: ");
    }

    public void UIStart() {
        showCurrencyOptions();
        boolean validInput = false ;
        while (!validInput){
            int option1 = sc.nextInt();
            if (option1 >= 1 && option1 <=6){
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
                        break;
                }
                validInput = true;
            } else {
                System.out.println("Digite um numero valido entre 1 a 6");
            }
        }
        System.out.println("Você escolheu " + currency.getConvertFrom());

        showCurrencyOptions();
        validInput = false;
        while (!validInput) {
            int option2 = sc.nextInt();
            if (option2 >= 1 && option2 <= 6) {
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
                        break;
                }
                validInput = true;
            } else {
                System.out.println("Digite um numero valido entre 1 a 6");
            }
        }
        System.out.println("Você escolheu " + currency.getConvertFrom() + " e " + currency.getConvertTo());


        System.out.println("Digite a quantidade de "+currency.getConvertFrom() +" que deseja converter para "+currency.getConvertTo());
        boolean validNumber = false;
        while (!validNumber){
            try{
                String input = sc.next().replace(',', '.');
                currency.setAmountToConverter(Double.parseDouble(input));
                validNumber = true;

            } catch (NumberFormatException e){
                System.out.println("Digite um número valido. ");
                System.out.println("Exemplo: 7.0 ou 7,0");
                System.out.println("Digite a quantidade de "+currency.getConvertFrom() +" que deseja converter para "+currency.getConvertTo());

                validNumber = false;
            }
        }


        apiService.Moeda(currency);

    }





}
