package sortedArrays;

import java.util.Scanner;

public class RepeatingElements3Thai {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int []a=new int[n];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=scanner.nextInt();	
		}
		int m=scanner.nextInt();
		int []b=new int[m];
		for (int i = 0; i < b.length; i++) 
		{
			b[i]=scanner.nextInt();	
		}
		printrepeatingelements(a,b);
	}

	 static void printrepeatingelements(int[] a, int[] b)
	{
		int i=a.length-1,j=0;
		while(i<a.length && j< b.length)
		{
			if(a[i]==b[j])
			{
				System.out.print(a[i]+" ");
				i--;
				j++;
			}
			else if(a[i]>b[j])
			{
				j++;
			}
			else
			{
				i--;
			}
			
			/* else if(a[i]<b[j])
			{
				i--;
			}
			else
			{
				j++;
			}*/
			 
		}
	}

}
