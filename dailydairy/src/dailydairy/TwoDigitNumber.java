package dailydairy;

import java.util.Scanner;

public class TwoDigitNumber {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	//if(n>9 && n<=100)
    if(n>=10 && n<=99)
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}
		
	}
}


