
// two ways writing for loop for printing is shown

package array;
import java.util.Scanner;

public class Arrayintro {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.print("enter the elements:");
		for(int i=0;i<a.length;i++)
	   //for(int i=0;i!=a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		 printelements(a);
	}
		
   static void printelements(int[] a)
	{
		System.out.print("the elements are:");
		for(int i=0;i<a.length;i++)
		//for(int i=0;i!=a.length;i++)
		    {
				System.out.print(a[i]+" ");
			}
	}
		
}


