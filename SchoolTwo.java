public class SchoolTwo {
	private Arraylist <Student> studentList;
	private Arraylist <Elective> electiveList;

 	private Elective getElectiveByName(String name) {
		for (int i = 0; i < this.getElectiveListSize(); i++) {
			Elective elective = electiveList.get(i);
			String  electiveName  = elective.getName();
			if (electiveName.equals(name))  {
				return elective;
			}
		}
		return null;
	}

	public void assignElectiveToStudents() {
		for (int i = 0; i < studentList.size ; i++) {
			Student student = studentList.get(i);
		
			for (int j = 0; j < 3; j++) {
				if (student.getChoice(j).getClassSize() < student.getChoice(j).getMaxClassSize()) {
					student.assignElective(student.getChoice(j).getElectiveByName);
				}
			}
		}
	}

	public ArrayList studentsWithoutElectives() {
		Arraylist <Student> studentsWithoutAnElective;
		for (Student student : studentList) {
			if (!(student.hasElective())) {
				studentsWithoutAnElective.add(student);
			}
		}
	}
}