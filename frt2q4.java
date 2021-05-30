public class School {
	privateArrayList<Classroom> classrooms;
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

public class Classroom {
	private String teacher;
	private ArrayList <Student> students;
	public Classroom(String teacherName, ArrayList <Student> studentsList) {
		teacher = teacherName;
		students = studentsList;
	}
	public Sring getTeachersName {
		return teacher;
	}

	public Arraylist getStudents {
		return students;
	}
}

public class Student {
	private int studentID;
	private String studentName;
	public Student(int idNumber, String nameStudent) {
		studentID = idNumber;
		studentName = nameStudent;
	} 
	public int getStudentID {
		return studentID;
	}
	public String nameStudent {
		return studentName;
	}
}