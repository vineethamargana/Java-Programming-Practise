package dailydairy;

import java.util.Scanner;

public class LargestAmong4 {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();	
	int l=sc.nextInt();
	int k=sc.nextInt();

	int v=n>m?n:m;
	int s=l>k?l:k;
	int e=v>s?v:s;
	System.out.println(e);
	}

}
