package Chapter_2.Projects;

import java.util.Scanner;

public class SumDifferenceProduct {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Two Floats: ");

        float one = input.nextFloat();
        float two = input.nextFloat();

        System.out.println("Sum: " + (one + two));
        System.out.println("Difference: " + (one - two));
        System.out.println("Product: " + (one * two));
    }

}
