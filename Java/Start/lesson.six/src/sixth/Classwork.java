package sixth;

import java.util.Scanner;

public class Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//	    String nickName;
//	    System.out.println("Input nick name");
//	    nickName = sc.nextLine();
//
//	    String tempNickName = nickName.toUpperCase();
//	    char[] sym = tempNickName.toCharArray();
//
//	    boolean isCorrect = true;
//
//	    for (int i = 0; i < sym.length; i++) {
//	      if (!((sym[i] >= 'A' && sym[i] <= 'Z') || (sym[i] >= '0' && sym[i] <= '9') || (sym[i] == '_'))) {
//	        isCorrect = false;
//	        break;
//	      }
//	    }
//	    if (isCorrect) {
//	      System.out.println("nickName: " + nickName + " correct");
//	    } else {
//	      System.out.println("nickName: " + nickName + " incorrect");
//	    }
		
		Scanner sc = new Scanner(System.in);
	    String code;
	    System.out.println("Input code");
	    code = sc.nextLine();
	    char[] arr = code.toCharArray();
	    int count1 = 0;
	    int count2 = 0;
	    for (int i = 0; i < arr.length; i++) {
		    if (arr[i] == '{') {
		    	count1++;
		    }
		    if (arr[i] == '}') {
		    	count2++;
		    }
	    }
	    if (count1 == count2) {
	    	System.out.println("Good code");
	    } else {
	    	System.out.println("Bad code");
	    }
	    sc.close();
	}

}
