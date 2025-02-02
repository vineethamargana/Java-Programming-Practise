package dailydairy;

import java.util.Scanner;

public class SmallestAmongThree {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();	
	int l=sc.nextInt();
	int v=n<m?n:m;
	int s=v<l?v:l;
	System.out.println(s);
	}
}
