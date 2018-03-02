package Chapter_4.Projects.Dice;

public class RollingDice2 {

    public static void main(String[] args) {
        PairOfDice pair = new PairOfDice();

        pair.roll();

        System.out.println(pair.getSum());
    }
}
