package dailydairy;

import java.util.Scanner;

public class MultiplesOf3And5And7 {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	/*if(n%5==0 && n%3==0 && n%7==0)
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}*/
	String s=((n%5==0 && n%3==0 && n%7==0)?"yes":"No");
	System.out.print(s);
	
		
	}
}


