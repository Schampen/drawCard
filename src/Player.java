import java.util.ArrayList;

public class Player {
    private String playerName;
    private int playerHealth;
    private ArrayList<Card> playerCards = new ArrayList<>();

    public Player(String name) {
        playerName = name;
        playerHealth = 15;
    }

    public ArrayList<Card> getPlayerCardsInHand() {
        return playerCards;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < playerCards.size() ; i++) {
            result += playerCards.get(i) + (i==playerCards.size()-1?"]":", ");
        }
        return result;
    }

    public int getNumOfCardsInHand() {
        return playerCards.size();
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void updatePlayerHealth() {
        playerHealth--;
    }

    public void addCardToHand(Card card) {
        playerCards.add(card);
    }

    public Card playCardFromHand(int n) {
        return playerCards.remove(n-1);
    }
}