//counting
package array;

import java.util.Scanner;

public class Occuranceofagivenvalueinarray {
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
	   int c=0;
	   for(int i=0;i<a.length;i++)
	    {
		  if(a[i]==k)
		  {
			c++;
			
	      }
        }
	   return c;

}
}