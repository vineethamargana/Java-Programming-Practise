package subarrays;

import java.util.Scanner;

public class SumUsingBreak {
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
	subArrays(a,k);
}

 static void subArrays(int[] a,int k)
  {
for(int s=a.length;s>=1;s--)
 {
   for(int i=0;i<=a.length-s;i++)
   {
	   int sum=0;
	   for(int j=i;j<i+s;j++)
	   {
		   sum=sum+a[j];
	   }
	   if(sum==k)
	   {
		   for(int j=i;j<i+s;j++)
		   {
	         System.out.print(a[j]+" ");
		   }
		   System.out.println();
		   break; //break will execute only one loop for better understanding see the sum using return program.
       }
	  // System.out.println();
  }
  }
  }



}
