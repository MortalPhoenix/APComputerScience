package Chapter_3.Projects;

import java.util.Random;

public class PhoneNumberGenorator {

    public static void main(String[] args) {
        Random rand = new Random();

        int first1 = rand.nextInt(8);
        int first2 = rand.nextInt(10);
        int first3 = rand.nextInt(10);

        int second1 = rand.nextInt(7);
        int second2 = rand.nextInt(6);
        int second3 = rand.nextInt(6);

        int last1 = rand.nextInt(10);
        int last2 = rand.nextInt(10);
        int last3 = rand.nextInt(10);
        int last4 = rand.nextInt(10);

        System.out.println("" + first1 + first2 + first3 + "-" + second1 + second2 + second3 + "-" + last1 + last2 + last3 + last4);
    }
}
