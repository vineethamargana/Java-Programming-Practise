package array;

import java.util.Scanner;

public class MaxpairSum {
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
		int v=largest(a);
		int w=secondLargest(a);
		System.out.print(v+w);
		
	}
      static int largest(int []a)
      {
    	  int l=Integer.MIN_VALUE;
    	  for(int i=0;i<a.length;i++)
    	  {
    		  if(a[i]>l)
    		  {
    			  l=a[i];
    		  }
    	  }
    	  return l;
      }
      static int secondLargest(int []a)
      {
    	  int k=largest(a);
    	  int sl=Integer.MIN_VALUE;
    	  for(int i=0;i<a.length;i++)
    	  {
    		  if(a[i]>sl && a[i]!=k)
    		  {
    			  sl=a[i];
    		  }
    	  }
    	  return sl;
      }
}
