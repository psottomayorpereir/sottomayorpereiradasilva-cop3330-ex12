package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String principal, rate, years;
        double princ, rat, year;
        double total;

        System.out.print("Enter the principal: ");
        principal=sc.nextLine();
        System.out.print("Enter the rate of interest: ");
        rate=sc.nextLine();
        System.out.print("Enter the number of years: ");
        years=sc.nextLine();

        princ=Double.parseDouble(principal);
        rat=Double.parseDouble(rate);
        year=Double.parseDouble(years);

        total=princ*(1+(year*rat/100));

        System.out.printf("After %.1f years at %.2f%%, the investment will be worth $%.2f.", year, rat, total);

    }
}