package demo.threads;

public class UserThreadProperties {
	
	public static void main(String[] args) {
		EvenThread eventhread = new EvenThread();
		eventhread.setPriority(8);
		eventhread.setDaemon(true);
		eventhread.setName("Even Thread");
		OddThread obj = new OddThread();
		Thread oddthread = new Thread(obj);
		oddthread.setName("Im odd thread");
		oddthread.setPriority(9);
		
		eventhread.start();
		oddthread.start();
//		Prime obj = new Prime();
//		obj.start();
		System.out.println("Even thread ID "+eventhread.getId());
		System.out.println("Setting even thread name "+eventhread.getName());
		System.out.println("EvenThread Priority "+eventhread.getPriority());
		System.out.println("Even thread State "+eventhread.getState());
		System.out.println("EvenThread ALive "+eventhread.isAlive());
		System.out.println("Main thread alive " +Thread.currentThread().isAlive());
		System.out.println("EvenThread daemon "+eventhread.isDaemon());
		System.out.println("Odd Thread name "+oddthread.getName());
		System.out.println("Oddthread Priority "+oddthread.getPriority());
	}

}
