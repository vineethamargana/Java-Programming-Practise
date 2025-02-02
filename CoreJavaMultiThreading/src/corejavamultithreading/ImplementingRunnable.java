package corejavamultithreading;

import java.util.Scanner;

class Demo11 implements Runnable
{
	    @Override
	    public void run() {
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
}
class Demo22 implements Runnable
{
	@Override
	    public void run() {
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
}
class Demo33 implements Runnable
{
	    @Override
	    public void run() {
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
}
public class ImplementingRunnable {
	public static void main(String []args)
	{
		Demo11 d=new Demo11();
		Demo22 e=new Demo22();
		Demo33 f=new Demo33();
		
		Thread t1=new Thread(d);
		Thread t2=new Thread(e);
		Thread t3=new Thread(f);
		t1.start();
		t2.start();
		t3.start();

		
	}

}
