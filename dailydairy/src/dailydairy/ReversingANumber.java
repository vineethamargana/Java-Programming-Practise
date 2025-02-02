package dailydairy;

import java.util.Scanner;

public class ReversingANumber {
	public static void main(String []args)
	{
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int v= reversingNum(n);
      System.out.print(v);
    }
    static int reversingNum(int n)
    {
    	int last,r=0;
    	while(n>0)
    	{
    	
    	    last=n%10;
    	    r=r*10+last;
    	    n=n/10;
    	    //return l;
    	}
    	   
    	return r;

    }
}

