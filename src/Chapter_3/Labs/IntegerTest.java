package Chapter_3.Labs;

import java.util.Scanner;

public class IntegerTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an int: ");
        int num = input.nextInt();

        Integer numObject = num;

        System.out.println(numObject.byteValue());
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));

        System.out.println("The highest int is: " + Integer.MAX_VALUE);
        System.out.println("The lowest int is: " + Integer.MIN_VALUE);

        System.out.println("Enter two numbers: ");
        String string1 = input.next();
        String string2 = input.next();

        int num1 = Integer.parseInt(string1);
        int num2 = Integer.parseInt(string2);

        System.out.println(num1 + num2);
    }
}