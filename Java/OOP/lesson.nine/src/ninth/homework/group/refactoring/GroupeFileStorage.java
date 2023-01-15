package ninth.homework.group.refactoring;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GroupeFileStorage {
	public static void saveGroupeToCSV(Group gr) throws IOException {
		CSVStringConverter cv = new CSVStringConverter();
		//""
		File file = new File(gr.getGroupName().toString() + ".csv");
		try (PrintWriter pw = new PrintWriter(file)) {
			Object[] studentsSaver = gr.getStudents().toArray();
			for (int i = 0; i < studentsSaver.length; i++) {
				pw.println(cv.toStringRepresentation((Student) studentsSaver[i]));
			}
		}
	}
	public static Group loadGroupFromCSV(File file) throws IOException, GroupOverflowException {
		CSVStringConverter cv = new CSVStringConverter();
		Group group = new Group();
		try (Scanner sc = new Scanner(file)) {
			if (sc.hasNextLine()) {
				group.addStudent(cv.fromStringRepresentation(sc.nextLine()));
			}
		}
		return group;
	}
	public static File findFileByGroupName(String groupName, File workFolder) throws IOException {
		File[] files = workFolder.listFiles();
		File findGroupFile = null;
		
		for (File f : files) {
			if (f.getName().equals(groupName)) {
				findGroupFile = f;
			}
		}
		return findGroupFile;
	}
}
