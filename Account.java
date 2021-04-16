package demo.threads;

public class Account {
	
	synchronized void getTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
			try {
				Thread.sleep(400);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}

class MyThread1 extends Thread{
	Account t;
	MyThread1(Account t)
	{
		this.t = t;
	}
	public void run()
	{
		t.getTable(5);
	}
}

class MyThread2 extends Thread
{
	Account t;
	MyThread2(Account t)
	{
		this.t = t;
	}
	public void run()
	{
		t.getTable(6);
	}
}


