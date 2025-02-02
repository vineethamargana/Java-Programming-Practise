package array;

import java.util.Scanner;

public class OccuranceofSmallestElement {
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
	 
	// int v=occurance(a); 
	int v=largestElement(a);
	 System.out.print(v);
	  
   }
	static int largestElement(int[] a)
	{ 
	    int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		    {
			  if(a[i]<min)
			  {
				  min=a[i];
			  }
         	}
     /* return min;
	}
    
	
   static int occurance(int[] a)
   {
	   int k=largestElement(a);*/
	   int c=0;
	   for(int i=0;i<a.length;i++)
	    {
		 // if(a[i]==k)
		  if(a[i]==min)
		  {
			c++;
			
	      }
        }
	   return c;

}
}
