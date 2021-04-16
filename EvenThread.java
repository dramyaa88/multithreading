package demo.threads;

public class EvenThread extends Thread{
	public void run()
	{
		System.out.println("Im even thread");
		for(int i=1;i<5;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even "+i);
			}
		}
	}
}
