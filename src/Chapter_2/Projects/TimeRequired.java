package Chapter_2.Projects;

import java.util.Scanner;

public class TimeRequired {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Speed in MPH:");
        double speed = input.nextDouble();

        System.out.println("Enter the Distance you traveled:");
        double distance = input.nextDouble();

        double time = distance / speed;

        System.out.println("It took you " + time + " hours.");
    }
}
