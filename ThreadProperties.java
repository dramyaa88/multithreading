package demo.threads;

public class ThreadProperties {
	
	public static void main(String[] args) {
		System.out.println("ID of the main thread "+Thread.currentThread().getId());
		System.out.println("Main thread name "+Thread.currentThread().getName());
		System.out.println("Priority "+Thread.currentThread().getPriority());
		
		
		System.out.println("IsDeamon "+Thread.currentThread().isDaemon());
		System.out.println("Get State method "+Thread.currentThread().getState());
		System.out.println("IsALive property "+Thread.currentThread().isAlive());
	}

}
