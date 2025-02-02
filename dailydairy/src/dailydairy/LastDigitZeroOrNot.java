package dailydairy;

import java.util.Scanner;

public class LastDigitZeroOrNot {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    if(n%10==0) //same condition for checking whether the given number is multiple of 10 or not
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}
		
	}
}


