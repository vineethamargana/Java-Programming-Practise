package dailydairy;

import java.util.Scanner;

public class MultiplesOf3Or5Or7uptoN
{
  public static void main(String []args)
	{
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int v= multiplesOr3Or5Or7TillN(n);
      System.out.println();
      System.out.print(v);
    }

static int multiplesOr3Or5Or7TillN(int k)
{
    int c=0;
   for(int i=1;i<=k;i++)
   {
	 if(i%3==0 || i%5==0 || i%7==0)
	  {
	    System.out.print(i+" ");
		c++;
	  }
   }
 //System.out.println();
//System.out.print(c);
   return c;

}
}



