package seventh;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length:");
		int arrayLength = scan.nextInt();
		
		int[] arrOfElemnts = new int[arrayLength];
		for (int i = 0; i < arrOfElemnts.length; i++) {
			arrOfElemnts[i] = rnd.nextInt(-10, 10);
		}
		System.out.println("Your random array is: " + Arrays.toString(arrOfElemnts));
		System.out.println("Max number of array is: " + maxNumber(arrOfElemnts));
		scan.close();
	}
	
	public static int maxNumber(int[] arrOfElemnts) {
		
		int maxNumber = arrOfElemnts[0];
		
		for (int i = 0; i < arrOfElemnts.length; i++) {
			if (maxNumber < arrOfElemnts[i]) {
				maxNumber = arrOfElemnts[i];
			}
		}
		return maxNumber;
	}
}
