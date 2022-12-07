package third;

import java.util.Arrays;

public class Group{
	private String groupName;
	private Student[] students = new Student[10];
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	public void addStudent(Student student) throws GroupOverflowException{
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
			}
		}
		throw new GroupOverflowException();
	}
	
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException{
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getLastName().equals(lastName)) {
					System.out.println("The student " + lastName +" is in the group");
					return students[i];
				}
			}
		}
		System.out.println("The student " + lastName +" isn`t in the group");
		throw new StudentNotFoundException();
	}
	
	public boolean removeStudentByID(int id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getId() == id) {
					students[i] = null;
					System.out.println("It`s done. Student with id " + id +" isn`t in the group now.");
					return true;
				}
			}
		}
		System.out.println("Class block - Student not found");
		return false;
	}
	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", students=" + Arrays.toString(students) + "]";
	}
	
	
}
