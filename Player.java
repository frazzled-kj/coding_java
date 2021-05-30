public class Player extends Person {
	private String position;
	public Player(String fullName, int age, String pos) {
		super(fullName, age);
		position = pos;
	}
	public void changePosition(String newPos) {
		position = newPos;
	}

	public static void main(String[] args) {
		Player p = new Player("Manik juneja", 46, "outfielder");
		p.changePosition("right fielder");
	}
}