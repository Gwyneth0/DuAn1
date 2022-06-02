/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author thaip
 */
public class Handle {

    public static Double formatString(String strNumber){
        String[] words = strNumber.split("\\,");
        String str = "";
        for (int i = 0; i < words.length; i++) {
            str = str + words[i];
        }
        return Double.valueOf(str);
    }
    public static String formatDouble(Double number){
        String number_double = String.format("%,.2f", number);
        return number_double.split("\\.")[0];
    }
}
