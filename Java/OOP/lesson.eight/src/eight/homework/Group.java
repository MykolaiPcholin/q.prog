package eight.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

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
				System.out.println(students[i]);
				return;
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
	
	public void sortStudentsByLastName() {
		Arrays.sort(students, Comparator.nullsFirst(new StudentsNameComparator()));
		
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println(students[i]);
			}
		}
	}
	
	public void checkDuplicatesStudents () {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				for (int j = 0; j < students.length ; j++) {
					if (i == j) {
						continue;
					} else if (students[i].equals(students[j])) {
						System.out.println("You have next duplickate students:");
						System.out.println(students[i]);
						System.out.println("Do you want to delete duplickate students? yes / no");
						
						Scanner sc = new Scanner(System.in);
						String answer = sc.nextLine();
						if (answer.equalsIgnoreCase("yes")) {
							removeStudentByID(students[i].getId());
							System.out.println("Duplickate students removed:");
							sortStudentsByLastName();
						}
						sc.close();
						return;
					}
				}
			}
			
		}
		System.out.println("You have all unique students");
	}
	
	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", students=" + Arrays.toString(students) + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(students);
		result = prime * result + Objects.hash(groupName);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		return Objects.equals(groupName, other.groupName) && Arrays.equals(students, other.students);
	}
	
	
}