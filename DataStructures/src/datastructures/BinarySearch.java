package datastructures;

import java.util.Scanner;

public class BinarySearch {
	static int binarySearch(int ar[],int k)
	{
		int low=0,high=ar.length-1,mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(k==ar[mid])
			{
				return mid;
			}
			else if(k<ar[mid])
			{
				high=mid-1;
				//low=low;
			}
			else
			{
				low=mid+1;
				//high=high;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int res=binarySearch(ar,k);
		System.out.println(res);
	}

}
