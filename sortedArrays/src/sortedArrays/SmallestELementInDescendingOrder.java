package sortedArrays;

import java.util.Scanner;

public class SmallestELementInDescendingOrder {
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
	int v=SmallestElement(a);
	System.out.println(v);
}
static int SmallestElement(int []a)
{
	for(int i=a.length-1;i>=1;i--) 
	{
		if(a[i]==a[i-1])
		{
			return a[i];
		}
	}
	return -1;
	
}

}
