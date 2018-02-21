package Chapter_3.Projects;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sides of the Triangle: ");

        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        double s = (a + b + c) / 2;

        double inside = s * (s - a) * (s - b) * (s - c);

        double area = Math.sqrt(inside);

        System.out.println("The area is " + area);
    }
}
