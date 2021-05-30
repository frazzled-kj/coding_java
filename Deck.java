public class Deck {
	private int[] cards;
	public Deck(int[] numCards) {
		cards = numCards;
	}
	public boolean inOrder() {
		int check = 0;
		for (int  k = 0; k < cards.length; k++) {
			if (cards[k] == k) {
				check += 1;
			}
		}
		if (check == (cards.length - 1)) {
			return true;
		} else {
			return false;
		}
	}

	public  void shuffle() {
		int[] newCards = new int[cards.length];
		for (int k = 0; k < cards.length; k++) {
			if (k % 2 == 0) {
				newCards[k] = cards[k/2];
			} else if  (k % 2 != 0) {
				newCards[k] = cards[cards.length/2+k/2];
			}
		}
		cards = newCards;
	}

	public int reorderCount() {
		int count;
		for (count = 0; !inOrder(); count++) {
			shuffle();
		}
		return count;
	}
	public static void main(String[] args) {
		int[] coolCards = new int[] {0, 1, 2, 3, 4, 5, 6};
		Deck coolDeck = new Deck(coolCards);
		coolDeck.shuffle();
		System.out.println(coolDeck.inOrder());
		coolDeck.shuffle();
		System.out.println(coolDeck.reorderCount());
	}
}