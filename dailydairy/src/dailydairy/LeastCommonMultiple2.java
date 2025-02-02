package dailydairy;

import java.util.Scanner;

public class LeastCommonMultiple2 {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
     lcm(a,b);  
   // System.out.print(v);
	}
	static void lcm(int s,int k)
	{ 
      for(int i=1; i<=s*k;i++)  
      {
      	   if(i%s==0 && i%k==0)
      	   {
             System.out.print(i);
             break;
      	   }
	
      }
	}

}
