package eight.classwork;

import java.lang.reflect.Field;

public class MainClasswork {
	public static void main(String[] args) {
		
		Cat cat1 = new Cat("Tiger", 4);
		Cat cat2 = new Cat("Tiger", 4);
		
		System.out.println(cat1.toString());
		System.out.println(cat1 == cat2);
		System.out.println(cat1.equals(cat2));
		
		System.out.println(cat1.hashCode());
		System.out.println(cat2.hashCode());
		
		System.out.println("-------------------");
		
		try {
			Cat cat3 = cat1.clone();
			System.out.println(cat1 == cat3);
			System.out.println(cat1.getClass());
			System.out.println(cat3.getClass());
			System.out.println(cat3.equals(cat1));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-------------------");
		
		Class catClass1 = cat1.getClass();
		Class catClass2 = Cat.class;
		
		Field[] fields1 = catClass1.getDeclaredFields();
		Field[] fields2 = catClass2.getDeclaredFields();
		
		for (int i = 0; i < fields1.length; i++) {
			System.out.println(fields1[i]);
		}
		
		for (int i = 0; i < fields2.length; i++) {
			System.out.println(fields2[i]);
		}
		
		System.out.println("-------------------");
		
		try {
		      Field catAge = catClass2.getDeclaredField("age");
		      catAge.setAccessible(true);
		      catAge.setInt(cat1, 100);
		    } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }

		System.out.println(cat1.toString());
		
	}
}
