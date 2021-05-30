public class CalorieCount {
	private double dailyCalLimit;
	private double dailyCalIntake;
	private double gramsOfProtien;
	private double gramsOfCarbs;
	private double gramsOfFats;

	public CalorieCount(int calLimit) {
		dailyCalLimit = calLimit;
		dailyCalIntake = 0;
		gramsOfFats = 0;
		gramsOfCarbs = 0;
		gramsOfProtien = 0;
	}

	public void addMeal(int addCal, int addProtein, int addCarbs, int addFat) {
		dailyCalIntake += addCal;
		gramsOfProtien += addProtein;
		gramsOfCarbs += addCarbs;
		gramsOfFats += addFat;
	}

	public double getProteinPercentage() {
		return (double) (4 * (gramsOfProtien / dailyCalIntake)); 
	}
	public boolean onTrack() {
		return (dailyCalIntake <= dailyCalLimit);
	}

	public static void main(String[] args) {
		CalorieCount person = new CalorieCount(1500);
		person.addMeal(700, 350, 280, 100);
		System.out.println(person.getProteinPercentage());
		System.out.println(person.onTrack());
	}
}