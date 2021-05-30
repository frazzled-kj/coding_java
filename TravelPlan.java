import java.util.ArrayList;

public class TravelPlan {
	private String destination;
	private ArrayList <Tour> plans;

	TravelPlan (String destination) {
		this.destination = destination;
	}

	public boolean checkForConflicts(Tour t) {
		for (int i = 0; i < plans.size(
			); i++) {
			if (t.getActDate() == plans.get(i).getActDate()){
				if (t.getStartTime() < plans.get(i).getStartTime() && t.getEndTime() > plans.get(i).getEndTime()) {
					return true;
				}
			}
		}
		//System.out.println(t.getActDate());
		return false;
	}

	public boolean addTour(Tour t) {
		if (!(checkForConflicts(t))) {
			return true;
		}
		return false;
			
		}

	public static void main(String[] args) {
		TravelPlan p1 = new TravelPlan("Capetown");

	}
	}
