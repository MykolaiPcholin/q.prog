package fifth;

import java.util.Arrays;
import java.util.Random;

public class Third {

	public static void main(String[] args) {
		// this program will create a second array of random numbers twice more than the first
		Random rnd = new Random();

		int[] firstArray = new int[15];
		
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = rnd.nextInt(0, 100);
		}
		System.out.println("First array: " + Arrays.toString(firstArray));
		int[] secondArray = Arrays.copyOf(firstArray, 30);
		
		for (int j = 0; j < secondArray.length; j++) {
			if (j > 14) {
				secondArray[j] = secondArray[j-15] * 2;
			}
		}
		System.out.println("Second array: " + Arrays.toString(secondArray));
	}

}



















//
//public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
//public static int[] resultArray;
//
//public static void main(String[] args) {
//    resultArray=    new int[firstArray.length+secondArray.length];
//    for (int i = 0; i < firstArray.length; i++) {
//        resultArray[i]=firstArray[i];
//    }
//    for (int i =  resultArray.length-firstArray.length; i < resultArray.length; i++) {
//        resultArray[i]=secondArray[i-firstArray.length];
//    }