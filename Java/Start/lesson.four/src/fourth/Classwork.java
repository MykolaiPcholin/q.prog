package fourth;

import java.util.Scanner;

public class Classwork {

	public static void main(String[] args) {
		
//		int sum = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter first number");
//		int firstNumber = scan.nextInt();
//		System.out.println("Enter second number");
//		int secondNumber = scan.nextInt();
//		
//		if (firstNumber == secondNumber) {
//			System.out.println(firstNumber);
//		} else if (firstNumber < secondNumber) {
//			for (int currentNumber = firstNumber; currentNumber <= secondNumber; currentNumber++) {
//				sum = sum + currentNumber;
//			}
//		} else {
//			for (int currentNumber = secondNumber; currentNumber <= firstNumber; currentNumber++) {
//				sum = sum + currentNumber;
//			}
//		}
//		System.out.println(sum);
		
//		int w;
//		int h;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter w");
//		int w = scan.nextInt();
//		System.out.println("Enter h");
//		int h = scan.nextInt();
//		
//		for (int i = 1; i <= h; i++) {
//			for (int j = 1; j <= w; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height");
		int height = scan.nextInt();
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height; j++) {
				if (i + j <= height) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
