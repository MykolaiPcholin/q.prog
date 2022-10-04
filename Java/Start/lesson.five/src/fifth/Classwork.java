package fifth;

import java.util.Arrays;
import java.util.Random;

public class Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();

	    int[] array = new int[10];
	    int count = 0;
	    for (int i = 0; i < array.length; i++) {
	      array[i] = rnd.nextInt(-5, 6);
	      if (array[i] > 0) {
		    	count ++;
		    }
	    }
	    
	    System.out.println(Arrays.toString(array));
	    System.out.println(count);
	}

}
