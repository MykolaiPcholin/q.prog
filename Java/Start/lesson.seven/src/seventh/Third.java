package seventh;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Third {

	public static void main(String[] args) {
		// this program will implement the linear search method
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length:");
		int arrayLength = scan.nextInt();
		
		int[] arrOfElemnts = new int[arrayLength];
		for (int i = 0; i < arrOfElemnts.length; i++) {
			arrOfElemnts[i] = rnd.nextInt(-10, 10);
		}
		System.out.println("Your random array is: " + Arrays.toString(arrOfElemnts));
		System.out.println("Enter searching element:");
		int searchingElement = scan.nextInt();
		System.out.println("Your element is on " + lineSearcher(arrOfElemnts, searchingElement) + " index in array.");
		scan.close();
	}
	public static int lineSearcher (int[] arrOfElemnts, int searchingElement) {
		
		for (int i = 0; i < arrOfElemnts.length; i++) {
			if (arrOfElemnts[i] == searchingElement) {
				return i;
			}
		}
		
		return -1;
	}
}
