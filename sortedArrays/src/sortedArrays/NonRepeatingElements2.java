package sortedArrays;

import java.util.Scanner;

public class NonRepeatingElements2 {
	public static void main(String args[])
	{
	Scanner scanner = new Scanner(System.in);
	int n=scanner.nextInt();
	int []a=new int[n];
	for (int i = 0; i < a.length; i++) 
	{
		a[i]=scanner.nextInt();	
	}
	//int k=scanner.nextInt();
	nonrepeating(a);
	//System.out.println(v);
}
static void nonrepeating(int []a)
{
	int c=1;
	for(int i=0;i<a.length-1;i++) 
	{
		if(a[i]==a[i+1])
		{
			c++;
		}
		else
		{
			if(c==1)
			{
				System.out.print(a[i]+" ");
			}
			c=1;
		}
	}
	if(c==1)
	{
		System.out.print(a[a.length-1]+" ");
	}
	
}


}
