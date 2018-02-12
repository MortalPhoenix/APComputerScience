package Chapter_2.Projects;

import java.util.Scanner;

public class MoneyCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number of quarters:");
        int numQuarters = input.nextInt();

        System.out.println("Enter the Number of dimes:");
        int numDimes = input.nextInt();

        System.out.println("Enter the Number of nickles:");
        int numNickles = input.nextInt();

        System.out.println("Enter the Number of pennies:");
        int numPennies = input.nextInt();

        double moneys = (numQuarters * 0.25) + (numDimes * 0.1) + (numNickles * 0.05) + (numPennies * 0.01);

        System.out.println("That is $" + moneys);
    }
}
