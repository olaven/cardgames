import java.util.ArrayList;
import java.util.Random;

public class CardDeck{
  //amount of cards in total
  private int cardCount;

  //ArrayList of all the cards in the deck
  ArrayList<Card> cards;
  //Random generator
  Random random;

  public CardDeck(){
    cardCount = 52;

    cards = new ArrayList<Card>();
    random = new Random();
    //fill deck with cards
    for(Suit s: Suit.values()){
      int counter = 1;
      while(counter <= (cardCount / Suit.values().length)){
        cards.add(new Card(s, counter));
        counter++;
      }
    }
  }

  public Card draw(){
    if(cardCount > 0){
      int index = random.nextInt(cards.size());
      Card returnCard = cards.get(index);
      removeCard(index);
      return returnCard;
    }
    return null;
  }
  public ArrayList<Card> draw(int amount){
    ArrayList<Card> drawResult = new ArrayList<Card>();

    if(cardCount > 0){
      for(int i = 0; i < amount; i++){
        int index = random.nextInt(cardCount);
        drawResult.add(cards.get(index));
        removeCard(index);
      }
    }
    return drawResult;
  }
  /**
  *   removes a card based on the index in cards-al
  * @param int index of the card to be removed
  **/
  public void removeCard(int index){
    cards.remove(index);
    setCardCount(cards.size());
  }
  //get-methods
  public Card getCard(Suit suit, int value){
    //get a specific card
    return null;
  }
  public ArrayList<Card> getCards(){
    return cards;
  }
  public int getCardCount(){
    return cardCount;
  }

  //set-methods
  public void setCardCount(int cardCount){
    this.cardCount = cardCount;
  }
}
