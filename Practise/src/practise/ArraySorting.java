package practise;

import java.util.Scanner;

public class ArraySorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		findingsmallThreeNums(ar);
	}
	static void findingThreeNums(int []ar)
	{
		int first=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		int three=Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>first)
			{
				three=sec;
				sec=first;
				first=ar[i];	
			}
			else if(ar[i]>sec)
			{
				three=sec;
				sec=ar[i];
				
			}
			else if(ar[i]>three)
			{
				three=ar[i];
			}
		}
		System.out.println(first+" "+sec+" "+three);
	}
	static void findingsmallThreeNums(int []ar)
	{
		int first=Integer.MAX_VALUE;
		int sec=Integer.MAX_VALUE;
		int three=Integer.MAX_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<first)
			{
				three=sec;
				sec=first;
				first=ar[i];	
			}
			else if(ar[i]<sec)
			{
				three=sec;
				sec=ar[i];
				
			}
			else if(ar[i]<three)
			{
				three=ar[i];
			}
		}
		System.out.println(first+" "+sec+" "+three);
	}

}
