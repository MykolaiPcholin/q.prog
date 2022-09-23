package fourth;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// this program will output the result as a multiplication table depending on the entered number
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number = scan.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int result = i * number;
			System.out.println(i + " x " + number + " = " + result);
		}
		scan.close();
	}

}
