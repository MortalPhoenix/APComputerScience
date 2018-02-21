package Chapter_3.Projects;

import java.util.Random;
import java.util.Scanner;

public class FirstLastRandomNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter your first name: ");
        String first = input.next();

        System.out.print("Enter your last name: ");
        String last = input.next();

        System.out.println(first.charAt(0) + last.substring(0, 5) + (rand.nextInt(90) + 10));
    }
}
