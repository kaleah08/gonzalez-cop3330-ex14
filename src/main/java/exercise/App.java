package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String firstString = input.next();
        double subTotal = Double.parseDouble(firstString);

        System.out.print("What is the state? ");
        String secondString = input.next();

        if( secondString.equals("WI")  )
        {
            double conversion = 5.5 / 100;
            double tax = conversion * subTotal;
            double total = tax + subTotal;
            total = (double)Math.round(total * 100d) / 100d;

            System.out.println("The subtotal is $" + String.format("%.2f",subTotal) + ".\n"  + "The tax is $" + tax + ".\n" + "The total is $" + String.format("%.2f",total) + ".");
        }

        if( !secondString.equals("WI") )
        {
            System.out.println("The total is $" + String.format("%.2f", subTotal));
        }

    }
}
