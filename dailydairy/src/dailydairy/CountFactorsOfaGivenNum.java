package dailydairy;

import java.util.Scanner;

public class CountFactorsOfaGivenNum {
	public static void main(String []args)
	{
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int v=countfactorsOfaNum(n);
      System.out.print(v);
	}
	static int countfactorsOfaNum(int k)
	{ 
		int c=0;
        for(int i=1;i<=k;i++) // if we give i=0 the output will be error
        {
        	if(k%i==0)
        	{
        		//System.out.print(i+" ");
        		c++;
        	}	
        }
        return c;
}
}

