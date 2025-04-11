/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.minutesconversion.minutesconversion;

/**
 *
 * @author thakh
 */
import java.util.Scanner;
public class MinutesConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Prompt user for input
        System.out.print("Enter the number of minutes: ");
        double minutes = input.nextDouble();
        
        //Convert minutes to hours and days
        double hours = minutes / 60;
        double days = hours / 24;
        
        //Display results
        System.out.println(minutes + " minutes equals " + hours + " hours ");
        System.out.println(minutes + " minutes equals " + days + " days ");
    }
}
