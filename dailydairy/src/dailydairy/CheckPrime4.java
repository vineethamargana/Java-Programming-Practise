package dailydairy;

import java.util.Scanner;

public class CheckPrime4 {
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 boolean s=primeCheck(n);
	 System.out.print(s);
	

}
static boolean primeCheck(int n)
{
	 if(n<=1)
	{
		return false;
	}
	for(int i=2;i*i<=n;i++)//i<=root n
	{
		
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
    }


}
