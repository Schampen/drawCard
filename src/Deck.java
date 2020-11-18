import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList();
        for (Card.Suits s : Card.Suits.values()) {
            for (int i = 1; i < 14; i++) {
                cards.add(new Card(s, i));
            }
        }
        shuffle();
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < cards.size() ; i++) {
            result += cards.get(i) + (i==cards.size()-1?"":", ");
        }
        return result;
    }

    public Card dealCard() {
        return cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void sort() {
        Collections.sort(cards);
    }

    public boolean deckHasCards() {
        if (cards.size() > 0) {
            return true;
        }
        return false;
    }
}
