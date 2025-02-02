package array;

import java.util.Scanner;

public class Largestreapeating {
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
	       int v=  largest(a);
		   System.out.println(v);
	}
	static int largest(int[] a)
	{
		for(int i=1;i<a.length-1;i++)
		{
			//for(int j=i+1;j<a.length;j++)
		//	{

				if(a[i]==a[i+1])
				{
                   return a[i];
				}
	    }
		
	return -1;

}
}
