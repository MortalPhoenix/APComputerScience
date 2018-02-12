package Chapter_2.Projects;

import java.util.Scanner;

public class SecondsToTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Seconds:");
        int totalSeconds = input.nextInt();

        int hours = 0;
        int minutes = 0;
        int seconds;

        while (totalSeconds - 3600 > 0) {
            totalSeconds -= 3600;
            hours++;
        }

        while (totalSeconds - 60 > 0) {
            totalSeconds -= 60;
            minutes++;
        }

        seconds = totalSeconds;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

    }
}
