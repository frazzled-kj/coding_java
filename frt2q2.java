public boolean inOrder() {
	for (int  k = 0; k < cards.length; k++) {
		if (cards[k] == k) {
			return true;
		}
	}
	return false;
}

public  void shuffle() {
	int[] newCards = new int[cards.length];
	for (int k : cards) {
		if (k % 2 == 0) {
			newCards[k] = cards[k/2];
		} else if  (k % 2  != 0) {
			newCards[k] =cards[cards.length/2 + k/2];
		}
	}
}

public int reorderCount() {
	for (int count = 0; !inOrder; count++) {
		shuffle();
	}
	return count;
}