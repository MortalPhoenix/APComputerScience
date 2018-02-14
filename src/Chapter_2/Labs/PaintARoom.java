package Chapter_2.Labs;

//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls //of a room given its length, width, and height
// ***************************************************************
import java.util.Scanner;

public class PaintARoom {

    public static void main(String[] args) {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        int length, width, height;
        double totalSqFt, paintNeeded;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the room: ");
        length = input.nextInt();

        System.out.println("Enter the width of the room: ");
        width = input.nextInt();

        System.out.println("Enter the height of the room: ");
        height = input.nextInt();

        totalSqFt = 2 * (length * height) + 2 * (width * height);

        System.out.println("Enter the number of doors in the room: ");
        int numDoors = input.nextInt();

        System.out.println("Enter the number of windows in the room: ");
        int numWindows = input.nextInt();

        totalSqFt -= (numDoors * 20) + (numWindows * 15);

        paintNeeded = totalSqFt / (double) COVERAGE;

        System.out.println("You need " + paintNeeded + " gallons of paint");
    }
}
