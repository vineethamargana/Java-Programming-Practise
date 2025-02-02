package subarrays;

import java.util.Scanner;

public class PrintSubArrays {
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
	// int sum=0;
   for(int i=0;i<=a.length-s;i++) //must give i<=a.length if we does not give equal to = the last sub array will not be printed
   {
	   //int sum=0;
	   for(int j=i;j<i+s;j++)
	   {
		  System.out.print(a[j]+" ");
		  // must print a[j] the i will be printed according to size i.e if we give 5 as first element 5 5 5 will be the first sub array.
	   }
	   System.out.println();
   }

}
}