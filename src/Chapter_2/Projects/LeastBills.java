package Chapter_2.Projects;

import java.util.Scanner;

public class LeastBills {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much money?");
        double totalMoney = input.nextDouble();

        int hundreds = 0;
        int fifties = 0;
        int tens = 0;
        int fives = 0;
        int ones = 0;
        int quarters = 0;
        int dimes = 0;
        int nickles = 0;
        int pennies = 0;

        while (totalMoney - 100 > 0) {
            totalMoney -= 100;
            hundreds++;
        }

        while (totalMoney - 50 > 0) {
            totalMoney -= 50;
            fifties++;
        }

        while (totalMoney - 10 > 0) {
            totalMoney -= 10;
            tens++;
        }

        while (totalMoney - 5 > 0) {
            totalMoney -= 5;
            fives++;
        }

        while (totalMoney - 1 > 0) {
            totalMoney -= 1;
            ones++;
        }

        while (totalMoney - 0.25 > 0) {
            totalMoney -= 0.25;
            quarters++;
        }

        while (totalMoney - 0.10 > 0) {
            totalMoney -= 0.10;
            dimes++;
        }

        while (totalMoney - 0.05 > 0) {
            totalMoney -= 0.05;
            nickles++;
        }

        while (totalMoney - 0.01 > 0) {
            totalMoney -= 0.01;
            pennies++;
        }

        if (hundreds > 0) {
            System.out.println("Hundreds: " + hundreds);
        }

        if (fifties > 0) {
            System.out.println("Fifties: " + fifties);
        }

        if (tens > 0) {
            System.out.println("Tens: " + tens);
        }

        if (fives > 0) {
            System.out.println("Fives: " + fives);
        }

        if (ones > 0) {
            System.out.println("Ones: " + ones);
        }

        if (quarters > 0) {
            System.out.println("Quarters: " + quarters);
        }

        if (dimes > 0) {
            System.out.println("Dimes: " + dimes);
        }

        if (nickles > 0) {
            System.out.println("Nickles: " + nickles);
        }

        if (pennies > 0) {
            System.out.println("Pennies: " + pennies);
        }
    }
}
