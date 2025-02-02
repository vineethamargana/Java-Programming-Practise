package arraypairs;

import java.util.Scanner;

public class MinPairProduct {
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
 	  int k=l*sl;
 	  int m=s*ss;
 	  int n=l*s;
 	  int t=(k<m)?k:m;
 	  return (t<n)?t:n;
   }

}
