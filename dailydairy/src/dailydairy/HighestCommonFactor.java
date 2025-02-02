package dailydairy;

import java.util.Scanner;

public class HighestCommonFactor {
	public static void main(String []args)
	{
	 Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int m=sc.nextInt();
     int v=hcf(n,m);
    System.out.print(v);
	}
	static int hcf(int k,int l)
	{ 
		int j=(k<l)?k:l;
       for(int i=j; i>=1;i--) // if we give i=0 the output will be error
       {
       	if(k%i==0 && l%i==0)
       	{
       		return i;
       	}	
       }
       return -1;
}
}
