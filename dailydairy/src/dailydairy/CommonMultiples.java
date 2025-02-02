package dailydairy;

import java.util.Scanner;

public class CommonMultiples {
	public static void main(String []args)
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
      int a=sc.nextInt();
       int b=sc.nextInt();
       multiplesOfaGivenNum(n,a,b);  
     // System.out.print(v);
	}
	static void multiplesOfaGivenNum(int s,int k,int l)
	{ 
		int c=0;
        for(int i=1; i<=s;i++)  
        {
        	   if(i%k==0 && i%l==0)
        	   {
               System.out.print(i+" ");	
               c++;
        	   }
	
        }
        System.out.println();	
        System.out.print(c);	
	}

}
