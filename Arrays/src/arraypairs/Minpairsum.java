package arraypairs;

import java.util.Scanner;

public class Minpairsum {
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
		//int w=secondLargest(a);
		System.out.print(v);
		
	}
      static int largest(int []a)
      {
    	 int s=Integer.MAX_VALUE;	 
    	 int ss=Integer.MAX_VALUE;	  
    	  for(int i=0;i<a.length;i++)
    	  {
    		  if(a[i]<s)
    		  {
    			  ss=s;
    			  s=a[i];
    		  }
    		  else  if(a[i]<ss)
    		  {
    			  ss=a[i];
    		  }
    	  }
    	  return s+ss;
      }

}
