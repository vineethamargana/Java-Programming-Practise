package dailydairy;

import java.util.Scanner;

public class CountDigitsinaNumber {
	public static void main(String []args)
	{
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int v= countDigits(n);
      System.out.print(v);
	}
	static int countDigits(int k)
	{
		int c=0;
		while(k>0) //if we give c here as c is equal to 0 it will terminate the loop and  return 0 as c is initialized as 
                    // if the condition is c<0 it again gives 0 as c=0 ...if we give c==0 then loop will iterate one time and output will be 1
		{
			//k=k%10; // the output will not display
			k=k/10;
			c++;// whenever we divide the n value by 10 the result will be stored again in n and , it increase the count value till n value becomes 0 
			    // as we do not give the count in the condition of while it will increase whenever we divide the value by 10
			
		}
		return c;   
	}
}
