package Chapter_2.Projects;

import java.util.Scanner;

public class Fraction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numerator: ");
        float numerator = input.nextInt();

        System.out.println("Enter the denominator: ");
        float denominator = input.nextInt();

        System.out.println(numerator / denominator);
    }
}
