package arraypairs;

import java.util.Scanner;

public class EvenPairs {
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
	printPairs(a);
}
	static void printPairs(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]%2==0 && a[j]%2==0)
				{
				System.out.println(a[i]+"  "+a[j]);
			    }
		    }
	    }
	}


}
