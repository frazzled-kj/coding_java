public int getTotalMarbles() {
	int marbles = 0;
	for (int i : sets) {
		marbles += sets.get(k).getNumber();
	}
	return marbles;
}

public int removeColor(String marbleCol) {
	int num = 0;
	for (int i : sets) {
		if (sets.get(k).gteColor().equals(marbleCol)) {
			num += sets.get(k).getNumber();
			sets.remove(k);
		}
	}
	return num;
}