public class Card implements Comparable<Card>{
    private Suits suit;
    private int value;

    public Card(Suits s, int v) {
        suit = s;
        value = v;
    }

    public Suits getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        String result = "";
        char s = '\u2660';
        s +=  getSuit().ordinal();
        result = switch (value) {
            case 1 -> "A";
            case 11 -> "Kn";
            case 12 -> "Q";
            case 13 -> "K";
            default -> "" + getValue();
        };
        return result + s;
    }

    @Override
    public int compareTo(Card card) {
        int diff = (getValue()==1?14:getValue()) - (card.getValue()==1?14:card.getValue());
        if (diff != 0) {
            return diff;
        } else  {
            diff = card.getSuit().ordinal()-getSuit().ordinal();
            return diff;
        }
    }

    enum Suits {SPADE,HEART,DIAMOND,CLUB};
}