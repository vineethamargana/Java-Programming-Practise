/*
  DUCKING ON EXCEPTION:
  escaping from exception ex:excaping from cricket ball thrown byjj bowler
 */

package corejavaexceptionhandling;

import java.util.Scanner;

class deom11{
	public void alpha() throws Exception
	{
		System.out.println("connection2 established");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numerator:");
		int a=sc.nextInt();
		System.out.println("enter the denominator:");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
		System.out.println("connection2 terminated");
		sc.close();
	}
}

public class DuckingonException {
	public static void main(String []args) throws Exception 
	{
		System.out.println("connection1 established");
		deom11 d=new deom11();
		d.alpha();
		System.out.println("connection1 terminatd");
	}

}
