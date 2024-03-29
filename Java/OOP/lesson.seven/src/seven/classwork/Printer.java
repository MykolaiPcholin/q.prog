package seven.classwork;

public class Printer {
	
	private Long threadId = null;
	
	public synchronized void printText(String text) {
		Long currentThreadId = Thread.currentThread().getId();
		
		for (; threadId != null && threadId == currentThreadId;) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		
	    System.out.print(text + " ");
	    
	    threadId = currentThreadId;
	    notifyAll();
	}
	
}
