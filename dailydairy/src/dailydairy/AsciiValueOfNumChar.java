package dailydairy;

import java.util.Scanner;

public class AsciiValueOfNumChar {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    if(n>=48 && n<=57)
	{
		System.out.println("Yes");
		System.out.println((char)n);

	}
	else
	{
		System.out.println("No");
	}
		
	}

}
