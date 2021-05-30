public boolean findEmployeeForChild(Child c) {
	for (Employee employee : employeeList) {
		if (employee.canTeach(c.getAge()) == true && employee.childrenAssigned <= maxRatio) {
			e.assignChil(c);
			return true;
		}
	}
	return false;
}

public boolean runDayCare(Child c) {
	int count = 0;
	for (Child child : children) {
		if (findEmployeeForChild(child) == false) {
			return false;
	}
	return true;
}

public boolean addChild(Child c) {
	if (findEmployeeForChild(c) == true) {
		children.add(c);
		return true;
	}
	return false;
}