
/*
   EXCEPTION HANDLING:
   java creates a report on exception and give it to rts and then rts checks for try and catch and then excetutes based on try and catch
   
   EXCEPTION:
   ----------
   exception handling is an unusaul event during the program execution when it have faulty input leads to abrupt termination
   ex:suicide,book my show
   
   RTS(run time system): it is a software in java.
   DEH(default expection handler)it is a software :it catches and read the error which was thrown by rts.
   then brupt termination happens and loss of data.
   
   JDK:JAVA DEVELOPMENT KIT (it is collection of software)
   it contains:
   1.java compiler
   2.hvm
   4.rts
   3.thread schedule
   5.deh
   6.class loader
   
   ex:first aid kit
   cricket tool kit
   
   HANDLING:
   exceptions should must be handling...that is even if exception occurs we should control abrupt termination
   for this try and catch are required
   
   UDEH:USER DEFINED EXCEPTION HANDLING
   is used inexception handling by using try and catch.
  
   try{}
   it is block .we should give the exception which may occur in it i.e the is risky code
   and it should be used along with the catch{} block
   
   
 */

package corejavaexceptionhandling;

import java.util.Scanner;

public class Into1 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("connection established");
		System.out.println("enter the numerator:");
		int a=sc.nextInt();
		System.out.println("enter the denominator:");
		int b=sc.nextInt();
		/*
		int c=a/b;
		System.out.println(c);
		System.out.println("connection terminated");*/
		int c=0;
		try {
			c=a/b;
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("give non-zero denominator");
		}
		System.out.println(c);
		System.out.println("connection terminated");

	}


}
/*
 * normal termination:
----------------------
enter the numerator:
100
enter the denominator:
10
10
connection terminated



*abrupt termination:
---------------------
connection established
enter the numerator:
100
enter the denominator:
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at CoreJavaExceptionHandling/corejavaexceptionhandling.Into1.main(Into1.java:24)
	
	
OUTPUT USING EXCEPTION HANDLING:
--------------------------------
connection established
enter the numerator:
100
enter the denominator:
0
give non-zero denominator
0
connection terminated


 */
