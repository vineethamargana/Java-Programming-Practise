package dailydairy;

import java.util.Scanner;

public class CheckPrime3 {
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 String s=primeCheck(n);
	 System.out.print(s);
	

}
static String primeCheck(int n)
{
	if(n==1)
	{
		return "not Prime";
	}
	for(int i=2;i<=n/2;i++)
	{
		
		if(n%i==0)
		{
			return "not prime";
		}
	}
	return "prime";
    }

}
