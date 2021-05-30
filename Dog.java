public class Dog{
	String dogName;
	String dogBreed;
	int dogAge;
	String dogColor;
	
	public Dog(String name, String breed, int age, String color) {
		dogName = name;
		dogBreed = breed;
		dogAge = age;
		dogColor = color;
	}
	public String bark() {
		return "bow bow";
	}
	public String sleep() {
		return "zzz";
	}
	public String eat() {
		return "yum";
	}
	public static void main(String args[]) {
	Dog twixy = new Dog("Twixy", "beagle", 3, "brown");
	System.out.println(twixy.bark());
	System.out.println(twixy.sleep());
	System.out.println(twixy.eat());
	}
	
}