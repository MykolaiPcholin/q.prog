package fifth;

import java.util.Arrays;
import java.util.Random;

public class First {

	public static void main(String[] args) {
		// this program will count odd numbers in an array of random numbers
		Random rnd = new Random ();
		
		int[] firstArray = new int[10];
		
		int oddCounter = 0;
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = rnd.nextInt(0, 100);
			if (firstArray[i] %2 != 0) {
				oddCounter++;
			}
		}
		System.out.println("Random array is: " + Arrays.toString(firstArray));
		System.out.println("Counter of odd nubers: " + oddCounter);
	}

}
