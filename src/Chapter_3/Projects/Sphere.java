package Chapter_3.Projects;

import java.util.Scanner;

public class Sphere {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = input.nextDouble();

        double volume = (4 / 3) * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        System.out.printf("The Volume is %.2f and the Surface Area is %.2f", volume, surfaceArea);
    }
}
