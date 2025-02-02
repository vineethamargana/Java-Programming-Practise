package dailydairy;

import java.util.Scanner;

public class LeastCommonFactor {
	public static void main(String []args)
	{
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int v=lcf(n,m);
      System.out.print(v);
	}
	static int lcf(int k,int l)
	{ 
		int j=(k<l)?k:l;
        for(int i=1; i<=j;i++)  
        {
        	if(k%i==0 && l%i==0)
        	{
        		return i; 		
        	}	
        }
        return 0;
}

}
