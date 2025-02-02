package dailydairy;

import java.util.Scanner;

public class CountCommonfactorsBwnTwoNumbers {
	public static void main(String []args)
	{
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int v=commonfactorsbwnNandM(n,m);
      System.out.println();
      System.out.print(v);
	}
	static int commonfactorsbwnNandM(int k,int l)
	{ 
		int c=0;
		int j=(k<l)?k:l;
        for(int i=1; i<=j;i++) // if we give i=0 the output will be error
       //for(int i=1;i<=k && i<=l;i++)  ----- method 1 
        {
        	if(k%i==0 && l%i==0)
        	{
        		System.out.print(i+" "); 
        		c++;
        	}	
        }
        return c;
}

}
