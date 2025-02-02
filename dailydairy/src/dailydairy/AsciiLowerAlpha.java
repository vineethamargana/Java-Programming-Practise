package dailydairy;

import java.util.Scanner;

public class AsciiLowerAlpha {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    if(n>=97 && n<=122)
	{
		System.out.println("Yes");
		System.out.println((char)n);

	}
	else
	{
		System.out.println("No");
		System.out.println(n);
	}
		
	}
}


