public class DiceSimulation {
	private int numSampleSizes;
	private int numFaces;

	public DiceSimulation(int numSamples, int faces) {
		numSampleSizes = numSamples;
		numFaces = faces;
	}
	public int roll(){
		return (int)(Math.random() * numFaces +1);
	}
	public int runSimulation(){
		int die1 = 0;
		int die2 = 0;
		double numDoubles = 0.0;
		for (int i = 0; i < numSampleSizes; i++) {
			die1 = roll();
			die2 = roll();
			System.out.println(die1);
			System.out.println(die2);
			System.out.println("*********");
			if (die1 == die2) {
				numDoubles += 1.0;
				System.out.println("numDoubles = " + numDoubles);
			}
		}
		return (int) ((numDoubles/numSampleSizes) * 100);
	}
	public static void main(String[] args) {
		DiceSimulation dice = new DiceSimulation(4, 6);
		System.out.println(dice.runSimulation());

	}
}