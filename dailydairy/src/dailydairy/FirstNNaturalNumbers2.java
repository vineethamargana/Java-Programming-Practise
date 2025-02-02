//using different parameters in different methods
package dailydairy;

import java.util.Scanner;

public class FirstNNaturalNumbers2 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		naturalNumbers(n); // the variable in brackets should be same as inputs taken in main method as j is not initialized in main method	
	}
	static void naturalNumbers(int j)
	{
		for(int i=1;i<=j;i++)
		{
			System.out.print(i+" ");
		}
	}


}
