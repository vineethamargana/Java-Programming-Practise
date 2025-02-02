package sortedArrays;

import java.util.Scanner;

public class CountOccuranceOfInteger {
	public static void main(String args[])
	{
	Scanner scanner = new Scanner(System.in);
	int n=scanner.nextInt();
	int []a=new int[n];
	for (int i = 0; i < a.length; i++) 
	{
		a[i]=scanner.nextInt();	
	}
	int k=scanner.nextInt();
	countoccurance(a,k);
}

 static void countoccurance(int[] a,int k)
  {
   int i=0;
   int c=0;
   for(i=0;i<a.length;i++)
   {
	   if(a[i]==k)
	   {
		   c++;
	   }
	   
   }
   if(a[a.length-1]==k)
   {
	   c++;
   }
   System.out.print(c);
   }
 }
