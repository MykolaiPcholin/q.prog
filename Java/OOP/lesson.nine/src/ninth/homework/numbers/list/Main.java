package ninth.homework.numbers.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<>();
		
		myList.add("one");
		myList.add("two");
		myList.add("three");
		myList.add("four");
		myList.add("five");
		myList.add("six");
		myList.add("seven");
		myList.add("eight");
		myList.add("nine");
		myList.add("ten");

		System.out.println(myList);
		
		myList.remove(0);
		myList.remove(0);
		
		System.out.println(myList);
		
		myList.remove(7);
		
		System.out.println(myList);
		
	}
}

