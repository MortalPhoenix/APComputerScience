package Chapter_2.Labs;

// ************************************************************
//  Circle.java
//
//  Print the area of a circle with two different radii
// ************************************************************

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.println("Enter a radius for a circle: ");

        int radius = input.nextInt();
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.println("The area of a circle with radius " + radius + " is " + area);
        System.out.println("The circumference of the circle is " + circumference);

        System.out.println("Enter a radius for a circle: ");

        int radius2 = input.nextInt();
        double area2 = PI * radius * radius;
        double circumference2 = 2 * PI * radius;
        System.out.println("The area of a circle with radius " + radius2 + " is " + area2);
        System.out.println("The circumference of the circle is " + circumference2);

        System.out.println("The ratio for area is " + (area2 / area));
        System.out.println("The ratio for circumference is " + (circumference2 / circumference));
    }
}