package eighth;
import java.io.File;
import java.util.Scanner;
public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your directory");
		Scanner scan = new Scanner(System.in);
		String directory = scan.nextLine();
		catalogViewer(directory);
		
		scan.close();
	}
	
	public static void catalogViewer(String directory) {
		
		File folder = new File(directory);
		File[] files = folder.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				System.out.println(files[i]);
			} else {
				System.out.println("Wrong path to directory");
			}
		}
	}
}
