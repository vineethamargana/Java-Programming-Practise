package dailydairy;

import java.util.Scanner;

public class SmallestAmongTwo {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
   /* if(n<m)
	{
		System.out.println(n);
	}
	else
	{
		System.out.println(m);
	}*/
	System.out.println((n<m)?n:m);
	}


}
