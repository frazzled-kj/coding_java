public class SeatingChart{
	private String [][] chart;
	SeatingChart (Name[] names, int rows, int cols) {
		chart = new String [rows][cols];
		for (int i = 0; i < chart.length; i++) {
			for (int j = 0; j < chart[0].length; j++) {
				chart[i][j] = "";
			}
		}
		for (Name name:names) {
			while (true) {
				int r = (int) ((Math.random() * rows) + 0.1);
				int c = (int) ((Math.random() * cols) + 0.1);
				if (chart[r][c] == "") {
					chart[r][c] = (name.getLastName() + ", " + name.getFirstName());
					break;
				}
			}
		}
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < chart.length; i++) {
			for (int j = 0; j < chart[i].length; j++) {
				str += padWithSpaces(chart[i][j]);
			}
			str += "\n";
		}
		return str;
	}

	public String padWithSpaces(String str) {
		for (int a = str.length(); a < 35; a++) {
			str += " ";
		}
		return str;
	}

	public static void main(String[] args) {
		
		SeatingChart msjones = new SeatingChart();
	}
}