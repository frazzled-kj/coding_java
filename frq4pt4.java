public class ParkingLot{
	private Car[][] lot;
	public ParkingLot(int rows, int cols) {
		lot = new Car[rows][cols];
	}
	public int openSpaces() {
		int used = 0;
		for (int i = 0; i < lot.length; i++) {
			for (int j = 0; j < lot[r].length; j++) {
 				if (lot[i][j] != null) {
					used++;
 				}
			}
		}
		return (lot.length * lot[0].length) - used;
	}

	public boolean parkCar(Car newCar) {
		if (openSpaces() > 0) {
 			for (int i = 0; i < lot.length; i++) {
				for (int j = 0; j < lot[i].length; j++) {
					if (lot[i][j] == null) {
						lot[i][j] = newCar;
 						return true;
 					}
				}
			}
		}
		return false;
	}
}