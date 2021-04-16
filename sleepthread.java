package demo.threads;
class sleepp extends Thread{
	int table;
	sleepp(int table)
	{
		this.table = table;
	}
	public void run()
	{
		for(int i=0;i<=15;i++)
		{
			if(i==10)
			{
				try
				{
					sleepp.sleep(3000);
				}catch(InterruptedException ie)
				{
				System.out.println();
				}
			}
			System.out.println(table+"*"+i+(table*i));
		}
	}

}

public class sleepthread
{
	public static void main(String[] args) {
		sleepp thread1 = new sleepp(3);
	}
}
