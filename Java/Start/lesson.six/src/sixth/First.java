package sixth;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// this program will count the number of occurrences of a letter "b" in a string
		System.out.println("Enter text below:");
		Scanner scan = new Scanner(System.in);
		String textLine = scan.nextLine();
		
		char[] arrayTextLine = textLine.toCharArray();
		
		int countB = 0;
		for (int i = 0; i < arrayTextLine.length; i++) {
			if (arrayTextLine[i] == 'b' || arrayTextLine[i] == 'B') {
				countB++;
			}
		}
		System.out.println("Letter b occurs " + countB + " times");
		scan.close();
	}

}
