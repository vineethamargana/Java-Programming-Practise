package sortedArrays;

import java.util.Scanner;

public class CommonRepeatingOddElementsinSortedArrays {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int []a=new int[n];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=scanner.nextInt();	
		}
		int m=scanner.nextInt();
		int []b=new int[m];
		for (int i = 0; i < b.length; i++) 
		{
			b[i]=scanner.nextInt();	
		}
		printrepeatingelements(a,b);
	}

	 static void printrepeatingelements(int[] a, int[] b)
	{
		int i=0,j=0;
		boolean h=false;
		while(i<a.length && j< b.length)
		{
			if(a[i]==b[j] && a[i]%2!=0 && b[j]%2!=0)
			{
				h=true;
				System.out.print(a[i]);
				i++;
				j++;
			}
			else if(a[i]<b[j])
			{
				i++;
			}
			else
			{
				j++;
			}
		}
		if(h==false)
		{
			System.out.print("No common odd elements found.");
		}
	}

}



