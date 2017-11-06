import java.util.Random;

public class Card{
  Suit suit;
  int value;

  public static void main(String args[]){
    Card c = new Card();
    Card c2 = new Card(Suit.CLUBS, 12);
  }
  /**
  *   Creates a random card
  **/
  public Card(){
    Random r = new Random();
    //set the cards value
    setValue(r.nextInt(13) + 1);
    //set the cards suit 
    int suitIndex = r.nextInt(4) + 1;
    switch(suitIndex){
      case 1:
        setSuit(Suit.CLUBS);
        break;
      case 2:
        setSuit(Suit.SPADES);
        break;
      case 3:
        setSuit(Suit.DIAMONDS);
        break;
      case 4:
        setSuit(Suit.HEARTS);
        break;
    }
  }
  /**
  *   Creates a specific card
  *   @param Suit suit -> the cards suit
  *   @param int value -> the cards value 1-13
  **/
  public Card(Suit suit, int value){
    setSuit(suit);
    setValue(value);
  }

  public Suit getSuit(){
    return suit;
  }
  public int getValue(){
    return value;
  }
  //setter set-metoder som private fordi verdiene på et kort ikke skal endres
  private void setSuit(Suit suit){
    this.suit = suit;
  }
  private void setValue(int value){
    this.value = value;
  }
}
