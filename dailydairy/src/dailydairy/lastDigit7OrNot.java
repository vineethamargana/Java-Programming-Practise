package dailydairy;

import java.util.Scanner;

public class lastDigit7OrNot {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
   /* if(n%10==7) 
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}*/
		//System.out.println((n%10==7)?"yes":"no");
		String s=(n%10==7)?"yes":"no";
		System.out.print(s);
	}

}
