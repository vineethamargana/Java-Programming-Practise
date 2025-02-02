package sortedArrays;

import java.util.Scanner;

public class CoutOccuranceOfSmallestElement {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int []a=new int[n];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=scanner.nextInt();	
		}
		countoccurance(a);
	}

	 static void countoccurance(int[] a)
	{
		 int m=Integer.MAX_VALUE;
		 int c=0;
		 for (int i = 0; i < a.length; i++)
		 {
			 if(a[i]<m)
			 {
				 m=a[i];
		     }
		}
		 for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==m)
			{
				c++;
			}
		}
		 System.out.println(c);
		 
	}
	

}
