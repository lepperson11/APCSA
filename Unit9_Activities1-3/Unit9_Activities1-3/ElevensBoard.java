public class ElevensBoard{
	public ElevensBoard(){
		String[] C2 = {"ace", "2"};
		String[] B2 = {"hearts"};
		int[] N2 = {1, 2};
		DeckTester2 DeckT = new DeckTester2();
		Card CA = new Card("2", "hearts", 2);
		Deck DE = new Deck(C2, B2, N2);
		Shuffler Shuff = new Shuffler();
		DeckT.main();
	}
	public static void Print(){
		System.out.println("Luke Epperson, Period 1, 3/23/2018, Computer Number 13");
	}
}