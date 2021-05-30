public class BinaryInt {
	private  ArrayList<int> digits;
	public BinaryInt() {
		//implementation not shown
	}

	public BinaryInt(int decimalValue) {
		digits = new ArrayList<int>();
		while (decimalValue > 0) {
			digits.add(0, new Integer(decimalValue % 2));
			decimalValue /= 2;
		}
	}

	public BinaryInt add(BinaryInt other) {
		//implementation not shown
	}

	public String toString() {
		//implementation not shown
	}

	public int compareTo(BinaryInt other) {
		//implementation not shown
	}

	public static void Test() {
		BinaryInt a1 = new BinaryInt(2314279623);
		BinaryInt a2 = new BinaryInt(3236550123);
		BinaryInt aSum = a1 + a2;
		BinaryInt b1 = new BinaryInt(3412579010);
		BinaryInt b2 = new BinaryInt(2128250735);
		BinaryInt bSum = b1 + b2;
		if (aSum != bSum) {
			System.out.println(aSum);
		} else {
			System.out.println(bSum);
		}
	}
}