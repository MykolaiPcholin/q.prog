package homework;

public class MainHomework {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    Thread mainThread = Thread.currentThread();
	    System.out.println(mainThread.getName() + " start");
	    
	    int[] numbersArray = new int [100];
	    
	    for (int i = 1; i <= numbersArray.length; i++) {
	    	FactorialCounter task = new FactorialCounter(i);
	    	Thread thread = new Thread(task);
	    	thread.start();
	    }

	    System.out.println(mainThread.getName() + " end");

	  }

	}
