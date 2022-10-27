package eighth;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input the name of file to save your text:");
		Scanner scan = new Scanner(System.in);
		String nameFile = scan.nextLine();
		System.out.println("Input your text to save into the file:");
		
		String textLine = scan.nextLine();
		
		saveTextToFile(nameFile, textLine);
		
		scan.close();
	}
	
	public static void saveTextToFile(String nameFile, String textLine) {
		File dir1 = new File(".//src//eighth//");
		File file1 = new File(dir1, nameFile + ".txt");
		try (PrintWriter pw = new PrintWriter(file1)){
			pw.println(textLine);
			System.out.println("Your text was saved to file " + nameFile + ".txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
