package subarrays;

import java.util.Scanner;

public class SumSubArray {
	public static void main(String args[])
	{
	Scanner scanner = new Scanner(System.in);
	int n=scanner.nextInt();
	int []a=new int[n];
	for (int i = 0; i < a.length; i++) 
	{
		a[i]=scanner.nextInt();	
	}
	int s=scanner.nextInt();
	countoccurance(a,s);
}

 static void countoccurance(int[] a,int s)
  {
	 //int sum=0;
   for(int i=0;i<=a.length-s;i++)
   {
	   int sum=0;
	   for(int j=i;j<i+s;j++)
	   {
		  //System.out.println(a[j]+" "); 
		   sum=sum+a[j];
	   }
	   System.out.println(sum); 
	   //sum=0;
   }

}

}
