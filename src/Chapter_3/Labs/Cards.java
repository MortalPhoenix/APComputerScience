package Chapter_3.Labs;

public class Cards {

    enum Rank {
        Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }

    public static void main(String[] args) {
        Rank highCard, faceCard, card1, card2;
        int card1Val, card2Val;

        highCard = Rank.Ace;
        faceCard = Rank.Jack;
        card1 = Rank.Five;
        card2 = Rank.Ten;

        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);

        card1Val = card1.ordinal() + 1;
        card2Val = card2.ordinal() + 1;

        System.out.println("A two card hand: " + card1 + " " + card2);
        System.out.println("Hand Value: " + (card1Val + card2Val));
    }
}
