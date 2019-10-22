import java.util.*;

enum CardSuit{
    DIAMOND, HEART, CLUB, SPADE;
}

enum CardFigure{
    C2, C3, C4, C5, C6, C7, C8, C9, C10, J, Q, K, A;
}

class Card{

    private final CardSuit suit;
    private final CardFigure figure;

    public Card(CardSuit suit, CardFigure figure) {
        this.suit = suit;
        this.figure = figure;
    }

    @Override
    public String toString() {
        return "Suit: " + suit + ", figure: " + figure;
    }

}


public class CardsDeal {

    private List<Card> deckOfCards;

    public CardsDeal(List<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    // deck of cards - 52 cards
    private void setDeckOfCards(){
        for(CardSuit k : CardSuit.values()){
            for(CardFigure f : CardFigure.values()){
                Card card = new Card(k, f);
                deckOfCards.add(card);
            }
        }
    }

    public List<Card> getDeckOfCards(){
        return deckOfCards;
    }

    // shuffle deck of cards
    public void shuffleDeckOfCards(){
        Collections.shuffle(deckOfCards);
    }

    public static void main(String[] args) {

        List<Card> deckOfCards = new ArrayList<>();

        CardsDeal newGame = new CardsDeal(deckOfCards);
        newGame.setDeckOfCards();
        newGame.shuffleDeckOfCards();

        deckOfCards.forEach(System.out::println);

    }
}
