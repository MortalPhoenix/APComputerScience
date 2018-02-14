package Chapter_2.Labs;

import java.util.Scanner;

public class LabGrade {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declare constants
        System.out.print("Enter the weight for in-class: ");
        double IN_WEIGHT = scan.nextDouble();  // in-class weight is 60%
        System.out.print("Enter the weight for out-of-class: ");
        double OUT_WEIGHT = scan.nextDouble(); // out-of-class weight is 40%

        if (IN_WEIGHT > 1) {
            IN_WEIGHT /= 100;
        }

        if (OUT_WEIGHT > 1) {
            OUT_WEIGHT /= 100;
        }

        // Declare variables
        int preLabPts;
        int preLabMax;
        int labPts;
        int labMax;
        int postLabPts;
        int postLabMax;

        double outClassAvg;
        double inClassAvg;
        double labGrade;

        System.out.println("\nWelcome to the Lab Grade Calculator\n");
        System.out.print("Enter the number of points you earned on the pre-lab: ");
        preLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points you could have earned? ");
        preLabMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the lab: ");
        labPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the lab? ");
        labMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the post-lab: ");
        postLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the post-lab? ");
        postLabMax = scan.nextInt();
        System.out.println();

        // Calculate the average for the out of class work
        outClassAvg = ((double) (preLabPts + postLabPts) / (double) (preLabMax + postLabMax)) * 100;
        // Calculate the average for the in-class work
        inClassAvg = ((double) labPts / (double) labMax) * 100;
        // Calculate the weighted average taking 40% of the out-of-class average
        // plus 60% of the in-class
        labGrade = (OUT_WEIGHT * outClassAvg) + (IN_WEIGHT * inClassAvg);
        // Print the results
        System.out.println("Your average on out-of-class work is " + outClassAvg + "%");
        System.out.println("Your average on in-class work is " + inClassAvg + "%");
        System.out.println("Your lab grade is " + labGrade + "%");
        System.out.println();
    }
}