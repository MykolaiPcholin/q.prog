package fourth;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number = scan.nextInt();
		long result = 1;
		
		if ((number > 4) && (number < 16)) {
			for (int i = 1; i <= number; i++ ) {
				result *= i; 
			}
			System.out.println("The factorial of " + number + " is: " + result);
		} else {
			System.out.println("Count it by yourself, because I can`t");
		}
		scan.close();
	}

}
