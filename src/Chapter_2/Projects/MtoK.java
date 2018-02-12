package Chapter_2.Projects;

import java.util.Scanner;

public class MtoK {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double miles = input.nextDouble();

        double kilometers = miles * 1.60935;

        System.out.println(kilometers + " Kilometers");
    }
}
