package dailydairy;

import java.util.Scanner;

public class AsciiUpperRangeCheck {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    if(n>=65 && n<=90)
	{
		System.out.println("yes");
		System.out.println((char)n);
	}
	else
	{
		System.out.println("No");
	}
	}
}
