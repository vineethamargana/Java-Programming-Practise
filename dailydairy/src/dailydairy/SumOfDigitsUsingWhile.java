package dailydairy;

import java.util.Scanner;

public class SumOfDigitsUsingWhile {
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
    	while(k>0)
    	{
    	
    	   // r=k%10;
    	   //s=s+r;  //s=s+r
    	    s+=k%10;
    	    k=k/10;
    	    //return s;
    	}
    	   
    	return s;

    }
}
