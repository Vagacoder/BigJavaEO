package ch19;

import java.util.Currency;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * E19.6 The static getAvailableCurrencies method of the java.util.Currency class 
 * yields a set of Currency objects. Turn it into a stream and transform it into 
 * a stream of the currency display names.Print them in sorted order.
 * 
*/

public class E19_6{

    public static void main(String[] args){
        
        Set<Currency> currencies = Currency.getAvailableCurrencies();

        List<String> list = currencies.stream().map(c -> c.getCurrencyCode()).sorted().collect(Collectors.toList());

        System.out.println(list);
    }
}