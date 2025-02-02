package arraypairs;

import java.util.Scanner;

public class Countpairs {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of array:");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.print("enter the elements:");
	for(int i=0;i<a.length;i++)		
	{
		a[i]=sc.nextInt();
	}
	int v=printPairs(a);
	System.out.print(v);
}
	static int printPairs(int[] a)
	{
		int c=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				c++;
		    }
	    }
		return c;
	}


}
