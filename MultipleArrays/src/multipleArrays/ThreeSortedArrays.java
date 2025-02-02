package multipleArrays;

import java.util.Scanner;

public class ThreeSortedArrays {
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
	int l=scanner.nextInt();
	int c[]=new int[l];
	for(int i=0;i<c.length;i++)
	{
		c[i]=scanner.nextInt();
	}
	int []v=printrepeatingelements(a,b,c);
	for(int i=0;i<v.length;i++)
	{
		System.out.print(v[i]+" ");
	}
}

 static int[] printrepeatingelements(int[] a, int[] b,int[] c)
{
  int i=0,j=0,k=0;
  int[] r=new int[a.length+b.length+c.length];
		  while(k<r.length)
		  {
			  if(i<a.length)
			  {
				  r[k++]=a[i];
			  }
			  if(i<b.length)
			  {
				r[k++]=b[i];   
			  }
			  if(i<c.length)
			  {
				  r[k++]=c[i];
			  }
			  i++;
		  }
		  return r;
 }

}
