package Unit9;
import java.util.Random;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[values.length];
		int k = 0;
		for (int i = 0; i < (shuffled.length/2) - 1; i++) {
			shuffled[k] = values[i];
			k += 2;
		}
		k = 1;
		for (int i = shuffled.length/2; i < shuffled.length - 1; i++) {
			shuffled[k] = values[i];
			k += 2;
		}
		values = shuffled;
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		Random r = new Random();
		int place = 0;
		int holder = 0;
		for (int i = values.length - 1; i > 1; i--) {
			place = r.nextInt(i + 1);
			holder = values[i];
			values[i] = values[place];
			values[place] = holder;
		}
		
	}
	
	public static String coinFlip(){
		Random r = new Random();
		if((r.nextInt(3) + 1) > 1){
			return "heads";
		}
		return "tails";
	}
	
	public static boolean arePermutations(int[] values, int[] values2){
		for (int i = 0; i < values.length; i++) {
			if(values[i] == values2[i]){
				return false;
			}
		}
		return true;
	}
	
	
}
