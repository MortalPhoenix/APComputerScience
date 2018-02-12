package Chapter_2.Projects;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Three Numbers:");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        double average = (double) (first + second + third) / 3;

        System.out.println("The Average is: " + average);

        input.close();
    }
}
