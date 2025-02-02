package dailydairy;

import java.util.Scanner;

public class GcdOrHcfUsingEuclidSubtraction {
	public static void main(String []args)
	{
	 Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int m=sc.nextInt();
     int v= gcdusingeuclid(n,m);
     System.out.print(v);
	}
	static int gcdusingeuclid(int n,int m)
	{
		for(int i=1;i<=n;i++)
		{
			if(n==m)
			{
				return n;  
			}
			else if(n>m)
			{
				n=n-m;
			}
			else
			{
				m=m-n;
			}
		}
		return 1;
	}

}
