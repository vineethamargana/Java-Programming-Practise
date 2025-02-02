package dailydairy;

import java.util.Scanner;

public class ThreeDigitNumber {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	//if(n>99 && n<=1000)
    //if(n>=100 || n<=999)//it gives yes for all numbers as we write or condition... it prints yes if either one condition is true.
	if(n>100 && n<=999)
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}
		
	}
}

