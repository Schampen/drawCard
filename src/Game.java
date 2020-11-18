import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game
{
    public static void main(String[] args) {
        Deck d = new Deck();
        Player player = new Player("Player1");
        Player opponent = new Player("Player2");
        for (int i = 0; i < 5; i++) {
            player.addCardToHand(d.dealCard());
            opponent.addCardToHand(d.dealCard());
        }
        while (d.deckHasCards()) {

            System.out.println(player.toString());

            System.out.println("Choose a card (1-5)");
            Scanner tgb = new Scanner(System.in);
            int cardChosen = tgb.nextInt();

            Card card1 = player.playCardFromHand(cardChosen);
            int randomNum = ThreadLocalRandom.current().nextInt(1, 5 + 1);
            Card card2 = opponent.playCardFromHand(randomNum);

            if (card1.compareTo(card2) > 0) {
                System.out.println("player wins");
            } else {
                System.out.println("opponent wins");
            }
            player.addCardToHand(d.dealCard());
            opponent.addCardToHand(d.dealCard());
        }
        System.out.println("No more cards in the deck");
    }
}
