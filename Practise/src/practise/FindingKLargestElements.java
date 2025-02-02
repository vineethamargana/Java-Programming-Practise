package practise;

import java.util.Arrays;
import java.util.Scanner;

public class FindingKLargestElements {
	static void findklargest(int ar[],int k)
	{
		Arrays.sort(ar);
//		for(int i=ar.length-1;i>=k;i--)
//		{
//			System.out.print(ar[i]+" ");
//		}
		int i=0;
		
	}
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int ar[]=new int[n];
	   for(int i=0;i<ar.length;i++)
	   {
		   ar[i]=sc.nextInt();
	   }
	   int k=sc.nextInt();
	   findklargest(ar,k);
	}
}
