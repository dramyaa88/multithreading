package demo.threads;

public class Prime extends Thread {
	public void run()
	{
	int m=0;
	int flag=0;
	for(int i=2;i<500;i++)
	{
		m = i/2;
		flag =0;
		for(int j=2;j<=m;j++)
		{
			if(i%j==0)
			{
				System.out.println(i+" is not a prime number");
				flag =1;
				break;
			}
		}
		if(flag == 0)
			System.out.println(i+" is a prime");
	}
	}

}
