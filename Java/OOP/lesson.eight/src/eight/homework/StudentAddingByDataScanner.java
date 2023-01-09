package eight.homework;

import java.util.Scanner;

public class StudentAddingByDataScanner extends Student{

	public StudentAddingByDataScanner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentAddingByDataScanner(String name, String lastName, Gender gender, int id, String groupName) {
		super(name, lastName, gender, id, groupName);
		// TODO Auto-generated constructor stub
	}
	
	public Student addingData() {
			Scanner scan = new Scanner(System.in); 
			System.out.println("Enter students name");
			String name = scan.nextLine();
			
			System.out.println("Enter students lastname");
			String lastName = scan.nextLine();
			
			System.out.println("Enter students gender MALE or FEMALE");
			String gender = scan.nextLine();
			
			
			System.out.println("Enter students group name");
			String groupName = scan.nextLine();
			
			System.out.println("Enter students id");
			int id = scan.nextInt();
			
			
			
			
			Student student = new Student();
			
			student.setName(name);
			student.setLastName(lastName);
			
			if(gender.equals("MALE")) {
				student.setGender(Gender.MALE);
			} else if (gender.equals("FEMALE")) {
				student.setGender(Gender.FEMALE);
			} else {
				System.out.println("Wrong gender of studet! Please input MALE or FEMALE!");
			}
			
			student.setId(id);
			student.setGroupName(groupName);
			
			scan.close();
			return student;
		
	}
}
