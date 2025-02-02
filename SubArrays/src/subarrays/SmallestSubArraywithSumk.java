package subarrays;

import java.util.Scanner;

public class SmallestSubArraywithSumk {
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
	 boolean r=false;
for(int s=1;s<=a.length;s++)
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
		   r=true;
		   for(int j=i;j<i+s;j++)
		   {
	         System.out.print(a[j]+" ");
		   }
		   System.out.println();
		   return; //return will terminate the method and execute only one time.
       }
	  // System.out.println();
  }
  }
if(r==false) {
	System.out.print("no subarrays found.");
}

  }


}
