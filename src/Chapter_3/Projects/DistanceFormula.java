package Chapter_3.Projects;

import java.util.Scanner;

public class DistanceFormula {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = input.nextInt();
        System.out.print("Enter y1: ");
        int y1 = input.nextInt();
        System.out.print("Enter x2: ");
        int x2 = input.nextInt();
        System.out.print("Enter y2: ");
        int y2 = input.nextInt();

        double inside = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);

        double distance = Math.sqrt(inside);

        System.out.println("The distance is " + distance);
    }
}
