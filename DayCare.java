public class DayCare {
	private ArrayList <Employee> employeeList;
	private ArrayList <Child> children;	
	private int maxRatio;

	public DayCare(int maxRatio) {
		employeeList = new ArrayList<Employee>();
		children = new ArrayList<Child>();
		this.maxRatio = maxRatio;
	}

	public boolean findEmployeeForChild(Child c) {
		for (Employee employee : employeeList) {
			if (employee.canTeach(c.getAge()) == true && employee.childrenAssigned() <= maxRatio) {
				e.assignChild(c);
				return true;
			}
		}
		return false;
	}

	public boolean runDayCare() {
		for (Child child : children) {
			if (findEmployeeForChild(child) == false) {
				return false;
		}
		return true;
	}
}

	public boolean addChild(Child c) {
		if (findEmployeeForChild(c) == true) {
			children.add(c);
			return true;
		}
		return false;
	}
}