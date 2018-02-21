package Chapter_3.Projects;

import java.util.Random;

public class Cylinder {

    public static void main(String[] args) {
        Random rand = new Random();

        int radius = rand.nextInt(20) + 1;
        int height = rand.nextInt(20) + 1;

        double volume = Math.PI * Math.pow(radius, 2) * height;
        double surfaceArea = Math.PI * 2 * radius * height;

        System.out.println("The volume is: " + volume + " and the surface area is: " + surfaceArea);
    }
}
