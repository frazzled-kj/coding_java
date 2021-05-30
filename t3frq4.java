public class Parabola {
	private int a;
	private int b;
	private int c;
	public Parabola(int aa, int bb, int cc) {
		a = aa;
		b  = bb;
		c = cc;
	}

	public double getAxis() {
		return (double) ((-1 * b) / (2 * a));
	}

	public boolean isOnGraph(int x, int y) {
		return (y == a * x  * x  + b * x  + c);
	}
}