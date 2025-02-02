package subarrays;

import java.util.Scanner;

public class CountofZerosAndOnes2 {
public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		subarrrays(ar);
		
	}
	static void subarrrays(int[] ar)
	{
		//int count1=0,count0=0; don't write this here because we have to make them as zero for further iterations.
		for(int size=ar.length;size>1;size--)
		{
			for(int i=0;i<ar.length-size;i++)
			{
				int count1=0,count0=0;
				for(int j=i;j<i+size;j++)
				{
					if(ar[j]==0)
					{
						count0++;
					}
					else if(ar[j]==1)
					{
						count1++;
					}
				}
				if(count0==count1)
				{
					for(int j=i;j<i+size;j++)
					{
						System.out.print(ar[j]+" ");
					}
					System.out.println();
				}
				
			}
		}
	}

}
