import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck 
{ 
    List<Card> cards = new ArrayList<Card>();
    public Deck ()
    {
    	
    	String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    	for (String suit : suits) 
    	    {
    		
    		for (int value = 2; value <= 14; value++) 
    	        { 
    	            cards.add(new Card(value, suit));
    	        }
    	    }
    	System.out.println(cards.get(0).name);
    }
    public void shuffle() 
    {
        Collections.shuffle(cards);
    }
    public void describe() 
    {
        for (Card card : this.cards) 
        {
            card.describe();
        }
    }
    public Card draw() 
    {
        Card card = cards.remove(0);
        return card;
    }
    
}