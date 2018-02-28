package Unit9;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks1 = {"Four", "Nine", "King"};
		String[] suits1 = {"Clubs", "Hearts", "Clubs"};
		int[] values1 = {4, 9, 10};
		String[] ranks2 = {"Queen", "Ace", "Eight"};
		String[] suits2 = {"Diamonds", "Spades", "Spades"};
		int[] values2 = {10, 1, 8};
		String[] ranks3 = {"Two", "Jack", "Ten"};
		String[] suits3 = {"Clubs", "Diamonds", "Hearts"};
		int[] values3 = {2, 10, 10};
		
		Deck deck1 = new Deck(ranks1, suits1, values1);
		Deck deck2 = new Deck(ranks2, suits2, values2);
		Deck deck3 = new Deck(ranks3, suits3, values3);
		
		System.out.println(deck1.deal());
	}
}
