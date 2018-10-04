/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("Ace", "Spades", 15);
		Card c2 = new Card("Ace", "Clubs", 15);
		Card c3 = new Card("Two", "Diamonds", 2);
		c1.matches(c2);
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}
}
