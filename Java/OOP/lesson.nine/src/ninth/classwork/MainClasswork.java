package ninth.classwork;

public class MainClasswork {


	 public static void main(String[] args) {
		 // TODO Auto-generated method stub
	     Container<Integer> a = new Container<>(10);
	     Container<String> b = new Container<>("Hello world");

	  ///  a.setElement("Java");
	    
	     int number = 5 + a.getElement();
	     System.out.println("Number = " + number);
	     System.out.println(a);
	     System.out.println(b);
	 }

}
