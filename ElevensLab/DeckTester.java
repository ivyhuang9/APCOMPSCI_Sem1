/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] r1 = {"A", "B", "C"};
        String[] r2 = {"jack", "queen", "king", "ace"};
        String[] r3 = {"X", "Y"};
        String[] s1 = {"Giraffes", "Lions"};
        String[] s2 = {"clubs", "hearts", "diamonds", "spades"};
        String[] s3 = {"clubs", "spades"};
        int[] v1 = {2, 1, 6};
        int[] v2 = {11, 12, 13, 1};
        int[] v3 = {3, 5};
        
        //first deck
        System.out.println("First deck...");
        Deck d1 = new Deck(r1, s1, v1);
        System.out.println("Empty: " + d1.isEmpty());
        System.out.println("Size: " + d1.size());
        System.out.println("Dealt 1 card: " + d1.deal());
        System.out.println(d1);
        
        //second deck
        System.out.println("Second deck...");
        Deck d2 = new Deck(r2, s2, v2);
        System.out.println("Dealing 2 cards...");
        d2.deal();
        d2.deal();
        System.out.println("Empty: " + d2.isEmpty());
        System.out.println("Size: " + d2.size());
        System.out.println(d2);
        
        //third deck
        System.out.println("Third deck...");
        Deck d3 = new Deck(r3, s3, v3);
        System.out.println("Dealing 4 cards...");
        d3.deal();
        d3.deal();
        d3.deal();
        d3.deal();
        System.out.println("Empty: " + d3.isEmpty());
        System.out.println("Size: " + d3.size());
        System.out.println(d3);
		
		//testing shuffle method (Activity 4)
		String[] r = {"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
		String[] s = {"clubs","hearts","spades","diamonds"};
		int[] v = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		System.out.println("Shuffling a standard deck of 52 cards...");
		Deck standard = new Deck(r, s, v);
		standard.shuffle();
		System.out.println(standard);
    }
}
