public class Player extends Person {
	private String position;
	public Player(String pos) {
		super(name, age);
		position = pos;
	}
	public void changePosition(String pos) {
		position = pos;
	}
}