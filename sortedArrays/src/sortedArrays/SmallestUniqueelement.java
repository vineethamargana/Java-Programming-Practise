
//wrong
package sortedArrays;

import java.util.Scanner;

public class SmallestUniqueelement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int v=Repeating(a);
		System.out.println(v);
		//Repeating(a);
	}
	static int Repeating(int[] a)
	{
		int c=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				c++;
			}
			else 
			{
				if(c==1)
				{
					return a[i];
					
				}
				c=1;
			}	
	    }
		return a[a.length-1];
	
		
	
	}
	
}

