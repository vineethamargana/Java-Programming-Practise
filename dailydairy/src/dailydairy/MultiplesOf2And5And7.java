//first n multiples of 2 ,5,7 and there count //the count and n value will be same in the result
package dailydairy;

import java.util.Scanner;

public class MultiplesOf2And5And7
{
	public static void main(String []args)
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 multiplesOr2Or5Or7FirstN(n);
	}

		
 static void multiplesOr2Or5Or7FirstN(int k)
{
	int c=0;
	for(int i=1;c<k;i++)
	{
		if(i%2==0 || i%5==0 || i%7==0)
		{
		  System.out.print(i+" ");
			c++;
		}
	}
	System.out.println();
	System.out.print(c);


}
}
