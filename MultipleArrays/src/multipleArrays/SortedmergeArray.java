package multipleArrays;

import java.util.Scanner;

public class SortedmergeArray {
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
	int []v=printrepeatingelements(a,b);
	for(int i=0;i<v.length;i++)
	{
		System.out.print(v[i]+" ");
	}
}

 static int[] printrepeatingelements(int[] a, int[] b)
{
  int i=0,j=0,k=0;
  int[] r=new int[a.length+b.length];
		  while(i<a.length && j<b.length)
		  {
				if(b[j]<=a[i])
				{
					r[k++]=b[j++];
				}
				else
				{
					r[k++]=a[i++];
				}
		  }
		  while(j<b.length)
		  {
			  r[k++]=b[j++];
		  }
		  while(i<a.length)
		  {
			  r[k++]=a[i++];
		  }
		  return r;
 }
 }
