package dailydairy;

import java.util.Scanner;

public class AbsoluteValue {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    if(n>0)
	{
		System.out.println(n);
	}
	else
	{
		System.out.println(-n);
	}
	}
}
