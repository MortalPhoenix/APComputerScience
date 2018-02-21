package Chapter_3.Projects;

import java.util.Random;

public class TrigFunctions {

    public static void main(String[] args) {
        Random rand = new Random();

        int number = rand.nextInt(20) + 20;

        double sine = Math.sin(number);
        double cosine = Math.cos(number);
        double tangent = Math.tan(number);

        System.out.println("The number is: " + number);
        System.out.println("Sin: " + sine);
        System.out.println("Cos: " + cosine);
        System.out.println("Tan: " + tangent);
    }
}
