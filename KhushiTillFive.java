public class KhushiTillFive{
	private static int tempY;
	public static void printXTillY(String x, int y) {
		while (true) {
			System.out.println(x);
			tempY = (int) (Math.random() * y + 1);
			//System.out.println(tempY);
			if (tempY == y) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		printXTillY("Khushi", 5);
	}
}
