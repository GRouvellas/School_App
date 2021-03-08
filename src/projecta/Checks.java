/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecta;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Geo
 */
public class Checks {

    static Scanner sc = new Scanner(System.in);

    public static boolean integerNum(String x) {
        //checks if a String x can be converted to an Integer Number. If it can the method returns true else it returns false
        try {
            int y = Integer.parseInt(x);
        } catch (NumberFormatException a) {
            return false;
        }
        return true;
    }

    public static String integerCheck(String x) {
        //checks integerNum. Everytime it returns false it asks the user to insert a number
        do {
            if (integerNum(x) == false) {
                System.out.println("Incorrect Input. Please insert an integer number");
                x = sc.nextLine();
            }
        } while (integerNum(x) == false);
        return x;
    }
    
    public static boolean floatNum(String x) {
        //checks if a String x can be converted to a Float Number. If it can the method returns true else it returns false
        try {
            float y = Float.parseFloat(x);
        } catch (NumberFormatException a) {
            return false;
        }
        return true;
    }

    public static String floatCheck(String x) {
        //checks floatNum. Everytime it returns false it asks the user to insert a number
        do {
            if (floatNum(x) == false) {
                System.out.println("Incorrect Input. Please insert a number (use . for decimals)");
                x = sc.nextLine();
            }
        } while (floatNum(x) == false);
        return x;
    }
    
     public static boolean isLocalDate(String x) {
        //checks if a String x can be converted to LocalDate Number. If it can the method returns true else it returns false
        try {
            LocalDate y = LocalDate.parse(x, DateTimeFormatter.ISO_DATE);
        } catch (DateTimeParseException a){
            return false;
        }return true;
    }
    
    public static String dateCheck (String x){
        //checks isLocalDate. Everytime it returns false it asks the user to insert a number
        do{
            if(isLocalDate(x)==false){
                System.out.println("Incorrect Input. Please insert a date (use the format YYYY-MM-DD)");
                x = sc.nextLine();
            }
        }while (isLocalDate(x)==false); 
        return x;
    }
    
    
}