/*
 * SELECTION SORT: get the minimum and swap 
 * ---------------
  1.get the minimum from the array and place it at the first and who ever at the first goes to that index{swapping index}.
  2.then make the first one constant and again repeat the process.
 */


package sortingarrays;

import java.util.Scanner;

public class SelectionSort {
	static void selectionSort(int []ar)
	{
	   for(int i=0;i<ar.length-1;i++)
	   {
		   int minindex=i;
		   for(int j=i+1;j<ar.length;j++)
		   {
			   if(ar[j]<ar[minindex])
			   {
				   minindex=j;
			   }
		   }
		   //swap the found minimum element with the first element
		   int temp=ar[minindex];
		   ar[minindex]=ar[i];
		   ar[i]=temp;
	   }
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		selectionSort(ar);

        System.out.println("Sorted array:");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
		
	}

}
