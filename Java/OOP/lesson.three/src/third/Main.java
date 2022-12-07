package third;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Mykolai", "Pcholin", Gender.MALE, 100, "JavaOOP");
		Student student2 = new Student("Anna", "Shevchenko", Gender.FEMALE, 101, "JavaOOP");
		Student student3 = new Student("Taras", "Shevchenko", Gender.MALE, 102, "JavaOOP");
		Student student4 = new Student("Myhailo", "Bazolyak", Gender.MALE, 103, "JavaOOP");
		Student student5 = new Student("Tetiana", "Vovk", Gender.FEMALE, 104, "JavaOOP");
		Student student6 = new Student("Elizabeth", "Grinka", Gender.FEMALE, 105, "JavaOOP");
		Student student7 = new Student("Petro", "Gavrylishin", Gender.MALE, 106, "JavaOOP");
		Student student8 = new Student("Stepan", "Bandera", Gender.MALE, 107, "JavaOOP");
		Student student9 = new Student("Lesya", "Kosach-Kvitka", Gender.FEMALE, 108, "JavaOOP");
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
			gr.addStudent(student9);
			gr.addStudent(student10);
			gr.addStudent(student11);
		} catch (GroupOverflowException e) {
			System.out.println("Group overflow");
		} finally {
			System.out.println("Thank you for using our program");
		}
		
		try {
			Student lastName1 = gr.searchStudentByLastName("Pcholin");
			Student lastName2 = gr.searchStudentByLastName("Zelenskyi");
		} catch (StudentNotFoundException e) {
			System.out.println("Catch block - Student not found");
		}
		System.out.println(gr.removeStudentByID(22));
		System.out.println(gr.removeStudentByID(100));
		
//		try {
//			gr.removeStudentByID(100);
//		} catch (StudentNotFoundException e) {
//			e.printStackTrace();
//		}
		
	}

}
