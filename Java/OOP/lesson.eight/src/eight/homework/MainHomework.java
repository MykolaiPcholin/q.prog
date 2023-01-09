package eight.homework;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import eight.homework.GroupOverflowException;
import eight.homework.StudentAddingByDataScanner;

public class MainHomework {

	public static void main(String[] args) {
		Student student1 = new Student("Mykolai", "Pcholin", Gender.MALE, 100, "JavaOOP");
		Student student2 = new Student("Anna", "Shevchenko", Gender.FEMALE, 101, "JavaOOP");
		Student student3 = new Student("Taras", "Shevchenko", Gender.MALE, 102, "JavaOOP");
		Student student4 = new Student("Myhailo", "Bazolyak", Gender.MALE, 103, "JavaOOP");
		Student student5 = new Student("Tetiana", "Vovk", Gender.FEMALE, 104, "JavaOOP");
		Student student6 = new Student("Elizabeth", "Grinka", Gender.FEMALE, 105, "JavaOOP");
//		Student student7 = new Student("Petro", "Gavrylishin", Gender.MALE, 106, "JavaOOP");
		Student student7 = new Student("Oleksyi", "Arestovich", Gender.MALE, 110, "JavaOOP");
		Student student8 = new Student("Stepan", "Bandera", Gender.MALE, 107, "JavaOOP");
//		Student student9 = new Student("Lesya", "Kosach-Kvitka", Gender.FEMALE, 108, "JavaOOP");
		Student student10 = new Student("Tyler", "Derden", Gender.MALE, 109, "JavaOOP");
		Student student11 = new Student("Oleksyi", "Arestovich", Gender.MALE, 110, "JavaOOP");
		
		
		Group gr = new Group();
		gr.setGroupName("JavaOOP");
		
		try {
			gr.addStudent(student1);
			gr.addStudent(student2);
			gr.addStudent(student3);
			gr.addStudent(student4);
			gr.addStudent(student5);
			gr.addStudent(student6);
			gr.addStudent(student7);
			gr.addStudent(student8);
//			gr.addStudent(student9);
			gr.addStudent(student10);
			gr.addStudent(student11);
		} catch (GroupOverflowException e) {
			System.out.println("Group overflow");
		} finally {
			System.out.println("Thank you for using our program");
		}
		
		try {
			gr.searchStudentByLastName("Pcholin");
			gr.searchStudentByLastName("Zelenskyi");
		} catch (StudentNotFoundException e) {
			System.out.println("Catch block - Student not found");
		}
		
		//________________________HW4________________________________
//		StudentAddingByDataScanner data = new StudentAddingByDataScanner();
//		try {
//			gr.addStudent(data.addingData());
//		} catch (GroupOverflowException e) {
//			e.printStackTrace();
//		}
//		gr.sortStudentsByLastName();
		
		//________________________HW5________________________________
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			GroupeFileStorage.saveGroupeToCSV(gr);
//			System.out.println("Group saved to CSV");
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			System.out.println("Group not saved to CSV");
//			e1.printStackTrace();
//		}
//		
//		String createGroup  = sc.nextLine();
//		File file = new File(createGroup + ".csv");
//		
//		
//				
//		System.out.println("Enter directory to search:");
//		File workFolder = new File(sc.nextLine());
//		System.out.println("Enter group name to search:");
//		String searchedGroupName = sc.nextLine();
//		String groupNameFile = searchedGroupName + ".csv";
//		
//		try {
//			Group groupLoaded = GroupeFileStorage.loadGroupFromCSV(file);
//			groupLoaded.sortStudentsByLastName();
//			System.out.println("Group loaded from CSV");
//		} catch (IOException | GroupOverflowException e1) {
//			// TODO Auto-generated catch block
//			System.out.println("Group not loaded from CSV");
//			e1.printStackTrace();
//		}
//		
//		try {
//			File fileGroup = GroupeFileStorage.findFileByGroupName(groupNameFile, workFolder);
//			if (searchedGroupName.equals(gr.getGroupName())) {
//				System.out.println("Group file created " + fileGroup.getAbsolutePath());
//			} else {
//				System.out.println("Group file not found");
//			}
//		} catch (IOException | NullPointerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		sc.close();
		
		//________________________HW8________________________________
		gr.checkDuplicatesStudents();
	}

}