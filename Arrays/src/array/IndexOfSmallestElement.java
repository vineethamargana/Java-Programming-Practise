package array;

import java.util.Scanner;

public class IndexOfSmallestElement {
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
		 int v=smallestElement(a);  
		System.out.print("the smallest element is:" +v);
		
	}
		 
   static int smallestElement(int[] a)
	{
	    int min=Integer.MAX_VALUE;
	    int index=0;
		for(int i=0;i<a.length;i++)
		    {
			  if(a[i]<min)
			  {
				  min=a[i];
				  index=i;
			  }
         	}
		return index;
		/* for(int i=0;i<a.length-1;i++)
			    {
				  if(a[i]==min)
				  {
				    return i;
					
			      }
		        }
			   return -1;
		}*/
        
    }
}


