public class PassByValueCheck {
	static Integer s = 3;
	static Integer t = 4;

	public static void mystery(Integer a, Integer b) {
		a = a + b;
		b = b + a;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		mystery(s, t);
	}
}