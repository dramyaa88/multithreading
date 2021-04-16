package demo.threads;

public class NumbersThread {
	
	public static void main(String[] args) {
		
		System.out.println("Im main thread");
		//new thread (thread class)
		EvenThread thread1 = new EvenThread();
		Prime thread3 = new Prime();
		
		//new thread using Runnable interface
		OddThread oddthread = new OddThread();
		
		//pass the runnable object into the thread class
		Thread thread2 = new Thread(oddthread);
		
		// start the threads
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		
		
	}

}
