package Chapter_2.Projects;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        int side = input.nextInt();

        System.out.println("Area: " + (side * side));
        System.out.println("Perimeter: " + (side * 4));
    }
}
