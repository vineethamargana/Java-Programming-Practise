/*
 
 */
package corejavaexceptionhandling;

import java.util.Scanner;
class InvalidInputException extends Exception
{
  @Override
  public String getMessage()
  {
	  return "Invalid input";
  }
}
class ATM
{
	int pin=1234;
	int p;
	
	public void accepyInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the pin");
		p=sc.nextInt();
	}
	public void verify() throws Exception
	{
		if(pin==p)
		{
			System.out.println("collect ur money");
		}
		else
		{
			InvalidInputException ie=new InvalidInputException();
			//System.out.println("invalid input!");
			System.out.println(ie.getMessage());
			throw ie;
		}
	}
}
class Bank 
{
	public void init()
	{
		ATM a=new ATM();
		try
		{
			a.accepyInput();
			a.verify();
		}
		catch(Exception e)
		{
			try {
				a.accepyInput();
				a.verify();
			}
			catch(Exception f)
			{
				try
				{
					a.accepyInput();
					a.verify();
				}
				catch(Exception g)
				{
					System.out.println("card blocked !!! contact your bankl");
				}
			}
		}
	}
}
public class CustomException2 {
	public static void main(String []args)
	{
		Bank b=new Bank();
		b.init();
	}
	

}
