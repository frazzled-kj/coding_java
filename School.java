public class School {
	private ArrayList<Classroom> classrooms;
	public School(Arraylist <Classroom> classRooms) {
		classrooms = classRooms;
	}

	public String findStudent(String teacher, int idNumber) {
		for (int i = 0; i < classroom.size;  i++) {
			if (classrooms.get(k).getTeachersName.equals(teacher)) {
				int low = 0;
				int  high = classrooms.get(i).getStudents.size - 1;
				while (low <= high) {
					int middle = (low + high) / 2;
					if (idNumber < classrooms.get(i).getStudents.get(middle).getStudentID()) {
						high = middle - 1;
					} else if (idNumber > classrooms.get(i).getStudents.get(middle).getStudentID()) {
						low = middle + 1;
					} else {
						return (classrooms.get(i).getStudents.get(middle).getStudentID());
					}
				}
			}
		}
		return "Student not found";
	}
}