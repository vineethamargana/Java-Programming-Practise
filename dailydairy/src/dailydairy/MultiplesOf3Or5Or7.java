package dailydairy;

import java.util.Scanner;

public class MultiplesOf3Or5Or7 {
	public static void main(String []args)
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 multiplesOf3Or5Or7FirstN(n);
	}

		
 static void multiplesOf3Or5Or7FirstN(int k)
{
	int c=0;
	for(int i=1;c<k;i++)
	{
		if(i%35==0 || i%5==0 || i%7==0)
		{
		  System.out.print(i+" ");
			c++;
		}
	}
	System.out.println();
	System.out.print(c);


}

}
