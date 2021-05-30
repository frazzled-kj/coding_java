public class Person {
	private String fullName;
	private int age;

	public Person(String name, int a) {
		fullName = name;
		age = a;
	}
	public String getName() {
		return fullName;
	}
	public int getAge() {
		return age;
	}
}