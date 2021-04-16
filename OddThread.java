package demo.threads;

public class OddThread implements Runnable{
	@Override
	public void run()
	{
		System.out.println("Im odd thread");
		for(int i=1;i<5;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd "+i);
			}
		}
	}

}
