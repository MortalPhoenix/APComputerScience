package Chapter_2.Labs;

import java.util.Scanner;

public class IdealWeight {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the feet part of your height: ");
        int feet = input.nextInt();

        System.out.println("Enter the inches part of your height: ");
        int inches = input.nextInt();

        System.out.println("Are you male or female: ");
        String gender = input.next();

        int inchesOver5 = 12 * (feet - 5) + inches;

        int idealWeight = 0;

        switch (gender.toLowerCase()) {
            case "male":
                idealWeight = 106 + (6 * inchesOver5);
                break;
            case "female":
                idealWeight = 100 + (5 * inchesOver5);
                break;
            default:
                System.out.println("That is not a valid gender");
                break;
        }

        double lowerWeight = idealWeight - (idealWeight * 0.15);
        double upperWeight = idealWeight + (idealWeight * 0.15);

        System.out.println("Your ideal weight range is " + lowerWeight + " to " + upperWeight);

    }
}
