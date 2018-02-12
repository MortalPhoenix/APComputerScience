package Chapter_2.Projects;

import java.util.Scanner;

public class TimeToSeconds {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Hours:");
        int hours = input.nextInt();

        System.out.println("Enter Minutes:");
        int minutes = input.nextInt();

        System.out.println("Enter Seconds:");
        int seconds = input.nextInt();

        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        System.out.println("That is " + totalSeconds + " seconds");
    }
}
