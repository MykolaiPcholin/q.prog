package eighth;

import java.util.Arrays;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] randArray = new int[10][10];
		Random rnd = new Random();
		for (int i = 0; i < randArray.length; i++) {
			for (int j = 0; j < randArray[i].length; j++) {
				randArray[i][j] = rnd.nextInt(0, 100);
			}
		}
		
		arrayWriter(randArray);
	}
	public static void arrayWriter (int[][] randArray) {
		File fileArray = new File (".//src//eighth//", "fileArray.txt");
		
		try (PrintWriter pw = new PrintWriter(fileArray)) {
			for (int[] row : randArray) {
				pw.println(Arrays.toString(row));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
