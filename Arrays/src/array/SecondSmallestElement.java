// we can use two seperate for loops
//or we can use two seperate methods
//or wwe can use one for loop and if else condition

package array;

import java.util.Scanner;

public class SecondSmallestElement {
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
		 int v=secSmallestElement(a);  
		 System.out.print("the smallest element is:" +v);
		
	}
		 
   static int secSmallestElement(int[] a)
	{
	    int l=Integer.MAX_VALUE;
	    int sl=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		    {
			  if(a[i]<l && a[i]!=sl)
			  {
				 sl=l;
				 l=a[i];
			  }
			  else if(a[i]<sl && a[i]!=l)
			  {
				  sl=a[i];
			  }
         	}
         return sl;
    }

}
