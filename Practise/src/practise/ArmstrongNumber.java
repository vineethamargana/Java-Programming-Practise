package practise;

import java.util.Scanner;

public class ArmstrongNumber {
	static void isArmStrong(int n)
	{
		int k=n;
		int r=0;
		int s=0;
		while(n!=0)
		{
			r=r%10;
			s=s+r*r*r;
			n=n/10;
		}
	    if(k==n)
	    {
	    	System.out.println(k);
	    }
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		int ar[]=new int[n];
//		for(int i=0;i<ar.length;i++)
//		{
//			ar[i]=sc.nextInt();
//		}
		isArmStrong(n);
	}

}
