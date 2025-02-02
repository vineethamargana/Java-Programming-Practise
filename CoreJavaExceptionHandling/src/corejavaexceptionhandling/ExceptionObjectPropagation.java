/*
 creating exception not in main method but in a different method
 ..if we donot give try and catch in the below program the rts will check every method whether
 the udeh is there are not ...
 if we have more than one method we can give try and catch anywhere we want.
 
 STATIC SEGMENT IS ALSO CALLED AS METHOD AREA OR META SPACE.
 STACK FRAME IS ALSO CALLED AS ACTIVATION RECORD.
 */


package corejavaexceptionhandling;
import java.util.Scanner;
class Dem1
{
	public void alpha()
	{
		System.out.println("connection4 established");
		/*try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the numerator:");
			int a=sc.nextInt();
			System.out.println("enter the denominator:");
			int b=sc.nextInt();
			int c=a/b;
		}
		catch(Exception e)
		{
			System.out.println("give non zero denominator");
		}
		System.out.println("connection4 terminatd");
	}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numerator:");
		int a=sc.nextInt();
		System.out.println("enter the denominator:");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("connection4 terminatd");
	}
}
class Dem2
{
	public void beta()
	{
		System.out.println("connection3 established");
		try {
			Dem1 d1=new Dem1();
			d1.alpha();
		}
		catch(Exception e)
		{
			System.out.println("give non zero denominator");
		}
		System.out.println("connection3 terminatd");
	}
}
class Dem3
{
	public void gamma()
	{
		System.out.println("connection2 established");
		Dem2 d2=new Dem2();
		d2.beta();
		System.out.println("connection2 terminatd");
	}
}
public class ExceptionObjectPropagation {
	public static void main(String []args)
	{
		System.out.println("connection1 established");
		Dem3 d3=new Dem3();
		d3.gamma();
		System.out.println("connection1 terminatd");
	}
}