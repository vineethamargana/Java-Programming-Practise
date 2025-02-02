package dailydairy;

import java.util.Scanner;

public class SumOfAllDigitsInANumber {
	public static void main(String []args)
	{
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int v= sumOfDigits(n);
      System.out.print(v);
    }
    static int sumOfDigits(int k)
    {
    	int r,s=0;
    	for( ;k>0; ) // if we initialize i as there is no use of i it will take more memory .so for loop can be initialized like this also
    	{
    	    r=k%10;
    	    s=s+r;
    	    k=k/10;
    	   // return s; //if we write return statement here the loop will terminate after returning 1 value for example if we give 345 the output will be 5 
    	              //also if we return statement in the loop i.e for loop we have to write extra return statement out of the loop otherwise the output will be error
    	}
    	return s;

    }
}
