package Chapter_3.Projects;

import java.util.Scanner;

public class SumOfCubes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();

        int sum = (int) (Math.pow(one, 3) + Math.pow(two, 3) + Math.pow(three, 3));

        System.out.println("The Sum of the cubes of these numbers is " + sum);
    }
}
