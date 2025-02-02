package sortedArrays;

import java.util.Scanner;

public class FirstElementNotInSortingOrder {
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
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<a[i-1])
			{
			    return a[i];
			}
		}
		return -1;
	}

}
