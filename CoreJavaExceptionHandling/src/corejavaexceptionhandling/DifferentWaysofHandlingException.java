/*
  DIFFERENT WAYS OF HANDLING EXCEPTION:
  1.handling the exception(try-catch)
  2.rethrowing on exception(try-catch-throw-throws-finally)
  3.ducking on exception(throws)
  
  RETHROWING ON EXCEPTION:
  throw should in side the catch 
  throws should be in the method signature
  
  DUCKING ON EXCEPTION:
  escaping from exception
  
 ****************** for every type of exeption therre is  an in build class in java
  and by seeing the exception the jvm will create an objecgt for it and handle the exception
  error is also a in build class in java **********************
  
  the e in the catch block is the reference in the object creation 
  
 */

package corejavaexceptionhandling;

import java.util.Scanner;

class deom1{
	public void alpha() throws Exception
	{
		System.out.println("connection2 established");
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the numerator:");
		int a=sc.nextInt();
		System.out.println("enter the denominator:");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
		System.out.println("connection2 terminatd");*/
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the numerator:");
			int a=sc.nextInt();
			System.out.println("enter the denominator:");
			int b=sc.nextInt();
			int c=a/b;
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println("handled in aplha");
			throw e; //rethrowing
		}
		 finally
	        {
	    		System.out.println("connection2 terminatd");
	        }	
		}
}

public class DifferentWaysofHandlingException {
	public static void main(String []args)
	{
		System.out.println("connection1 established");
		deom1 d=new deom1();
		try
		{
			d.alpha();
		}
		catch(Exception e)
		{
			System.out.println("handled in main");
		}
		System.out.println("connection2 terminatd");
       
	}
}
