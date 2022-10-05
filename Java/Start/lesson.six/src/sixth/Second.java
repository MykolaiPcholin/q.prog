package sixth;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// this program will find the longest word in a text string
		
		System.out.println("Enter text string below:");
		Scanner scan = new Scanner(System.in);
		String textString = scan.nextLine();
		
		String[] arrayText = textString.split("[ ]");
		String longestWord = "";
		
		for (int i = 0; i < arrayText.length; i++) {
			if (longestWord.length() < arrayText[i].length()) {
				longestWord = arrayText[i];
			}
		}
		System.out.println("The longest word in text string is: " + longestWord);
		scan.close();
	}

}
