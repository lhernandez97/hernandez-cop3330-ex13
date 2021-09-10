/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Luis Hernandez
*/

import java.util.Scanner;
//import the Math class to use the pow() function
import java.lang.Math;

public class Exercise13 {
    public static void main(String[] args) {
        //create Scanner
        Scanner in = new Scanner(System.in);
        //prompt the user for the principal amount
        System.out.print("What is the principal amount? ");
        int principal = in.nextInt();
        //prompt the user for the rate of interest
        System.out.print("What is the rate? ");
        double rate = in.nextDouble();
        //prompt the user for the number of years
        System.out.print("What is the number of years? ");
        int years = in.nextInt();
        //prompt the user for the amount of times the interest is compounded per year
        System.out.print("What is the number of times the interest is compounded per year? ");
        int comp = in.nextInt();
        //turn the rate into a percentage
        double rate_per = rate / 100;
        //now calculate the investment amount
        double inv_amount = principal * Math.pow((1 + rate_per / comp), (comp * years));
        //now tell the user the information
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.", principal, rate, years, comp, inv_amount);
    }
}
