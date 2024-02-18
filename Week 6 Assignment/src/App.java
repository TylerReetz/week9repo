
public class App {

	public static void main(String[] args) {
        Deck deck = new Deck();
        	deck.shuffle();
        	Player player1 = new Player("Player 1");
            Player player2 = new Player("Player 2");
            for (int i = 0; i < 52; i++) {
                if (i % 2 == 0)
                    player1.draw(deck);
                else
                    player2.draw(deck);
            }       
            for (int i = 0; i < 26; i++) {
                Card card1 = player1.flip();
                Card card2 = player2.flip();
                card1.describe();
                card2.describe();
                if (card1.getValue() > card2.getValue()) {
                    player1.incrementScore();
                    System.out.println("Player 1 receives a point.");
                } else if (card1.getValue() < card2.getValue()) {
                    player2.incrementScore();
                    System.out.println("Player 2 receives a point.");
                } else {
                    System.out.println("It's a tie! No point awarded.");
                }
            }
            int score1 = player1.getScore();
            int score2 = player2.getScore();
          
            System.out.println("Player 1 score: " + score1);
            System.out.println("Player 2 score: " + score2);
            if (score1 > score2)
                System.out.println("Player 1 wins!");
            else if (score1 < score2)
                System.out.println("Player 2 wins!");
            else
                System.out.println("It's a draw!");
            

}
}
