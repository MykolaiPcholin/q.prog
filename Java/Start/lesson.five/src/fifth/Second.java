package fifth;

import java.util.Arrays;
import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// this program will be able to create an array of your size and values
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size below:");
		int number = scan.nextInt();
		int[] firstArray = new int[number];
		
		for (int i = 0; i < firstArray.length ; i++) {
			System.out.println("Enter array element value below:");
			firstArray[i] = scan.nextInt();
		}
		System.out.println("Your array: " + Arrays.toString(firstArray));
		
		scan.close();
	}
	
}
