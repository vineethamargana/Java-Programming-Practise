package corejavamultithreading;

import java.util.Scanner;

class SingleRun extends Thread
{
	@Override
	public void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(name.equals("Thread-0"))
		{
			add();
		}
		else if(name.equals("Thread-1"))
		{
			printChars();
		}
		else
		{
			printNums();
		}
	}
	public void add()
	{
		    System.out.println("adding started");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the num1");
			int n1=sc.nextInt();
			System.out.println("enter the num2");
			int n2=sc.nextInt();
			int res=n1+n2;
			System.out.println(res);
			System.out.println("addition completed");
	}
	public void printChars()
	{
				System.out.println("printing chars started");
				for(int i=65;i<=75;i++)
				{
					System.out.println((char)i);
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				System.out.println("printing chars ended");
	}
   public void printNums()
   {
	    System.out.println("printing nums started");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("printing nums ended");
   }

public class UsingSingleRunMethod {
	public static void main(String []args)
	{
		SingleRun s1=new SingleRun();
		SingleRun s2=new SingleRun();
		SingleRun s3=new SingleRun();
		s1.start();
		s2.start();
		s3.start();
		
		
	}
}

}
