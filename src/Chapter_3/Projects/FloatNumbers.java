package Chapter_3.Projects;

import java.util.Scanner;

public class FloatNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = (int) input.nextDouble();

        System.out.println(num + " is lower and " + (num + 1) + " is higher than your decimal");
    }
}
