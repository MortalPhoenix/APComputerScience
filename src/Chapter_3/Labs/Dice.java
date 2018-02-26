package Chapter_3.Labs;

import java.util.Random;

public class Dice {

    public static void main(String[] args) {
        Random rand = new Random();

        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;

        System.out.println("The Result of the fist die is " + dice1);
        System.out.println("The Result of the second die is " + dice2);
        System.out.println("The sum of the dice is " + (dice1 + dice2));
    }
}
