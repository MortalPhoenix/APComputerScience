package Chapter_2.Projects;

import java.util.Scanner;

public class FtoC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fTemp = input.nextDouble();

        double cTemp = (fTemp - 32.0) * (5.0 / 9.0);

        System.out.println(cTemp + " C");
    }
}
