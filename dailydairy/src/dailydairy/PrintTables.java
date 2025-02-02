package dailydairy;

import java.util.Scanner;

public class PrintTables {
	public static void main(String []args)
	{
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      printTables(n,k);
	}
	static void printTables(int n,int k)
      {
    	  for(int i=1;i<=k;i++)
    	  {
    		  System.out.println(n+"X"+i+"="+n*i);
    	  }
      }

}
