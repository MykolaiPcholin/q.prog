package ninth.homework.group.refactoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Group{
	private String groupName;
	private List<Student> students;
	
	
	public Group(String groupName, List<Student> students) {
		super();
		this.groupName = groupName;
		this.students = new ArrayList<>(10);
	}
	
	public Group() {
		super();
		students = new ArrayList<>(10);
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	//methods
	public void addStudent(Student student) throws GroupOverflowException{
		if (students.size() < 10) {
			students.add(student);
		} else {
		throw new GroupOverflowException();
		}
	}
	
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException{
		for (Student element : students) {
			if (element.getLastName().equals(lastName)) {
				System.out.println("The student " + lastName +" is in the group");
				return element;
			}
		}
		System.out.println("The student " + lastName +" isn`t in the group");
		throw new StudentNotFoundException();
	}
	
	public boolean removeStudentByID(int id) {
		for (Student element : students) {
			if (element.getId() == id ) {
				students.remove(students.indexOf(element));
				System.out.println("It`s done. Student with id " + id +" isn`t in the group now.");
				return true;
			}
		}
		System.out.println("Class block - Student not found");
		return false;
	}
	
	public void sortStudentsByLastName() {
		Collections.sort(students, Comparator.nullsFirst(new StudentsNameComparator()));
		for (Student element : students) {
			System.out.println(element);
		}
	}
	
	public void checkDuplicatesStudents () {
		Object[] uniqueStudents = students.toArray();
		for (int i = 0; i < uniqueStudents.length; i++) {
			for (int j = 0; j < uniqueStudents.length ; j++) {
					if (i == j) {
						continue;
					} else if (uniqueStudents[i].equals(uniqueStudents[j])) {
						System.out.println("You have next duplickate students:");
						System.out.println(uniqueStudents[i]);
						System.out.println("Do you want to delete duplickate students? yes / no");
						
						Scanner sc = new Scanner(System.in);
						String answer = sc.nextLine();
						if (answer.equalsIgnoreCase("yes")) {
							students.remove(i);
							System.out.println("Duplickate students removed:");
							sortStudentsByLastName();
						}
						sc.close();
						return;
					}
			}
		}
		System.out.println("You have all unique students");
	}

	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", students=" + students + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupName, students);
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
		return Objects.equals(groupName, other.groupName) && Objects.equals(students, other.students);
	}
	
}