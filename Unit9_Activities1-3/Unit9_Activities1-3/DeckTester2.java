public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency
	 * using assert statements.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		test1CardDeck();
		test2CardDeck();
		System.out.println("All tests passed!");
	}


	/**
	 * Create a 1-card Deck and test the Deck methods with it.
	 */
	private static void test1CardDeck() {
		String[] r1 = {"ace"};
		String[] s1 = {"spades"};
		int[] v1 = {1};
		Deck d = new Deck(r1, s1, v1);
		testOneCard(d, new Card("ace", "spades", 1));
		testEmpty(d);

		d.shuffle();
		testOneCard(d, new Card("ace", "spades", 1));
		testEmpty(d);
	}

	/**
	 * Create a 2-card Deck and test the Deck methods with it.
	 */
	private static void test2CardDeck() {
		String[] C2 = {"ace", "2"};
		String[] B2 = {"hearts"};
		int[] N2 = {1, 2};
		Deck d = new Deck(C2, B2, N2);
		assert d.size() == 2 : "Initial size is " + d.size() + ". It should be 2.";
		assert !d.isEmpty() : "Initial deck is empty.";
		boolean aceIsFirst, twoIsFirst;
		Card c = d.deal();
		assert c != null : "1st card dealt is null.";
		aceIsFirst = c.matches(new Card("ace", "hearts", 1));
		twoIsFirst = c.matches(new Card("2", "hearts", 2));
		assert (aceIsFirst || twoIsFirst) : "1st card dealt is " + c + ".  It is not the one of the two correct cards.";
		assert d.size() == 1 : "Size after one deal is " + d.size() + ". It should be 1.";
		assert !d.isEmpty() : "Deck is empty after one deal.";
		c = d.deal();
		assert c != null : "2nd card dealt is null.";
		if (aceIsFirst) {
			assert c.matches(new Card("2", "hearts", 2))	: "2nd card dealt is " + c + ". It is not one of the two correct cards.";
		} else {
			assert c.matches(new Card("ace", "hearts", 1)) : "2nd card dealt is " + c + ". It is not one of the two correct cards.";
		}
		testEmpty(d);

		d.shuffle();
		c = d.deal();
		assert c != null : "1st card dealt after shuffle is null.";
		aceIsFirst = c.matches(new Card("ace", "hearts", 1));
		twoIsFirst = c.matches(new Card("2", "hearts", 2));
		assert (aceIsFirst || twoIsFirst) : "1st card dealt after shuffle is " + c + ".  It is not the one of the two correct cards.";
		assert d.size() == 1 : "Size is " + d.size() + "after shuffle and one deal. It should be 1.";
		assert !d.isEmpty() : "Deck is empty after shuffle and one deal.";
		c = d.deal();
		assert c != null : "2nd card dealt after shuffle is null.";
		if (aceIsFirst) {
			assert c.matches(new Card("2", "hearts", 2)) : "2nd card dealt after shuffle is " + c + ". It is not the one of the two correct cards.";
		} else {
			assert c.matches(new Card("ace", "hearts", 1)) : "2nd card dealt after shuffle is " + c + ". It is not the one of the two correct cards.";
		}
		testEmpty(d);
	}

	/**
	 * Check that the given deck is empty.
	 * @param d is a deck that should be empty.
	 */
	private static void testEmpty(Deck d) {
		assert d.size() == 0 :  "Size for an empty deck is " + d.size() + ". It should be 0.";
		assert d.isEmpty() : "isEmpty is false for an empty deck.";
		Card c = d.deal();
		assert c == null : "Dealt card is " + c + ". It should be null for an empty deck.";
	}

	/**
	 * Check that the given deck contains the given card and nothing else.
	 * @param d is a deck that should contain a single card.
	 * @param intended is the card that the one-card deck should contain.
	 */
	private static void testOneCard(Deck d, Card intended) {
		assert d.size() == 1 : "Size is " + d.size() + ". It should be 1 for a 1-card deck.";
		assert !d.isEmpty() : "isEmpty true for a 1-card deck.";
		Card c = d.deal();
		assert c != null : "1st dealt card is null for a 1-card deck.";
		assert c.matches(intended) : "1st card dealt for a 1-card deck is " + c + ". It should be " + intended + ".";
	}
}