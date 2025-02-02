
/*
 * we can give many catch blocks for one try block

 * while excetuting it chooses catch it want.
 * 
 * we can give how many catch block we want but at thed ww have to give the generic exception catch block at the end of all catch blocks
 * catch (Exception e) {
		System.out.println("problem");
	}
	like this.
	----->it should not be the first catch block. it will give the error because if we give it as
	first all exceptions are catched by that block and the other catch blocks will not able to execute.
 */

package corejavaexceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DifferenttypesOfExceptions {
	public static void main(String []args)
	{
		System.out.println("connection established");
	  try
	  {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter the numerator:");
			int a=sc.nextInt();
			System.out.println("enter the denominator:");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			
			System.out.println("enter the size of the array");
			int n=sc.nextInt();
			int []arr=new int[n];
			System.out.println("enter the data of the array");
			int data=sc.nextInt();
			System.out.println("enter the index of the data to be inserted");
			int index=sc.nextInt();
			arr[index]=data;
			System.out.println(arr[index]);
			
	  }
	  	
	  catch(ArithmeticException a)
	  {
		  System.out.println("give non zero deno");
	  }
	  catch(NegativeArraySizeException n)
	  {
		  System.out.println("be positive");
	  }
	  catch (InputMismatchException e) 
	  {
		System.out.println("enter int data");
	  }
	  catch(ArrayIndexOutOfBoundsException a)
	  {
		  System.out.println("be in your limits");
	  }
	  catch (Exception e) {
			System.out.println("problem");
		}

	  
	  System.out.println("connection terminated");
	
}
}
