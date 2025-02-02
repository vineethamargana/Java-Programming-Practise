
/*
  MULTITHREADING:
  --------------
  muliti-->many
  
  Thread: independent instructions which are exceuting independently which is part of process is called thread

  PROCESS: the collection of instructions which are there on the RAM.
  PROGRAM: the collecction of instructions which are present on the harddisk.
  creating multiple threads like this is called multi threading .it utlilises cpu time eficiently
  ex: it is mostly used in gaming.
  
  MAIN IS THE DEFAULT THREAD IN JAVA
  
  There are two ways to achieve multi threading(creating small stack which is posssible only with the thread class):
  1.extends thread
  2.implements runnable
  
  1.process of extending thread:
  ..create a object of a class which extends thread 
  ..class demo extends thread {
  }
  
  and create an object for the class and call the start method.
  thread class create a small stack in the memory which utilizes the memory well
  
  
  2.implementing runnable 
  .. create an object of thread class
  class thread
  {
  }
  
  
 */

package corejavamultithreading;

import java.util.Scanner;
class Demo1 extends Thread
{
	@Override
	public void run() {
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
class Demo2 extends Thread
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
class Demo3 extends Thread
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
public class Intro1 {
	public static void main(String []args)
	{
		Demo1 d=new Demo1();
		Demo2 e=new Demo2();
		Demo3 f=new Demo3();
		d.start();
		e.start();
		f.start();
		
	}
}
