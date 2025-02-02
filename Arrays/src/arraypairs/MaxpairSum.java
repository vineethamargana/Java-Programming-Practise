package arraypairs;

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
		//int w=secondLargest(a);
		System.out.print(v);
		
	}
      static int largest(int []a)
      {
    	 int l=Integer.MIN_VALUE;	 
    	 int sl=Integer.MIN_VALUE;	  
    	  for(int i=0;i<a.length;i++)
    	  {
    		  if(a[i]>l)
    		  {
    			  sl=l;
    			  l=a[i];
    		  }
    		  else  if(a[i]>sl)
    		  {
    			  sl=a[i];
    		  }
    	  }
    	  return l+sl;
      }
     

}
