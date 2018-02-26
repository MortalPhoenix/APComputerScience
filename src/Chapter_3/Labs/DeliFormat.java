package Chapter_3.Labs;

// ************************************************************ // DeliFormat.java
//
// Computes the price of a deli item given the weight
// (in ounces) and price per pound -- prints a label,
// nicely formatted, for the item. //
// ************************************************************

import java.text.DecimalFormat;
import java.util.Scanner;

public class DeliFormat {
    // ---------------------------------------------------
    //  main reads in the price per pound of a deli item
    //  and number of ounces of a deli item then computes
    //  the total price and prints a "label" for the item
    // ---------------------------------------------------

    public static void main (String[] args) {
        final double OUNCES_PER_POUND = 16.0;
        Scanner scan = new Scanner(System.in);
        double pricePerPound;
        double weightOunces;
        double weight;
        double totalPrice;

        System.out.println("Welcome to the CS Deli! ! \n ");

        System.out.print ("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();

        System.out.print("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();

        // Convert ounces to pounds and compute the total price
        weight = weightOunces / OUNCES_PER_POUND;

        totalPrice = pricePerPound * weight;

        DecimalFormat fmt = new DecimalFormat("0.##");

        System.out.println("***** CSDeli *****");
        System.out.println("Unit Price: " + fmt.format(pricePerPound) + " per pound");
        System.out.println("Weight: " + fmt.format(weight) + " pounds");
        System.out.println("TOTAL: $" + fmt.format(totalPrice));
    }
}