
//index of first occurrence and last occurrence separately .two for loops are shown
package array;

import java.util.Scanner;

public class Indexofkvalueinarray {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of array:");
	int n=sc.nextInt();
	System.out.print("enter the numder to check the occurance:");
	int k=sc.nextInt();
	int[] a=new int[n];
	System.out.print("enter the elements:");
	for(int i=0;i<a.length;i++)
	{ 
		a[i]=sc.nextInt();
	}
	 
	 int v=occurance(a,k);  
	 System.out.print(v);
	  
   }
	
   static int occurance(int[] a,int k)
   {
	   for(int i=a.length-1;i>=0;i--)
	 //  for(int i=0;i<a.length;i++)
	    {
		  if(a[i]==k)
		  {
		    return i;
			
	      }
        }
	   return -1;
}
}
