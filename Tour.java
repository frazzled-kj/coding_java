public class Tour {
	private int actDate;
	private int startTime;
	private int endTime;
	private String activity;

	Tour (int dateAct, int timeStart, int timeEnd, String activityName) {
		actDate = dateAct;
		startTime = timeStart;
		endTime = timeEnd;
		activity = activityName;
	}

	public int getActDate() {return actDate;}
	public int getStartTime() {return startTime;}
	public int getEndTime() {return endTime;}
	public String getActivity() {return activity;}	
}