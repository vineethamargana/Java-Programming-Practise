package multipleArrays;

import java.util.Scanner;

public class CountofSubArrayswhoseSumisk222 {
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
	count(a,k);
}

 static void count(int[] a,int k)
  {
	 int c=0;
   for(int s=1;s<=a.length;s++)
   {
   for(int i=0;i<=a.length-s;i++)
   {
	   int sum=0;
	   for(int j=i;j<i+s;j++)
	   {
		  //System.out.println(a[j]+" "); 
		   sum=sum+a[j];
	   }
	   if(sum==k)
	   {
		   c++;
	   }
	   
   }

   }
   System.out.println(c);

}

}
