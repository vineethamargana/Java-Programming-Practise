package dailydairy;

import java.util.Scanner;

public class PrimeNumsBwnN1andN2 {
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int n1=sc.nextInt();
	 int n2=sc.nextInt();
	 primebwnN1andN2(n1,n2);

}
static boolean primeCheck(int n)
{
	if(n==1)
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
static void primebwnN1andN2(int n1,int n2)
{
	int c=0;
	for(int i=n1;i<=n2;i++)
	{
		if(primeCheck(i))
		{
			System.out.print(i+" ");
			c++;//counting prime numbers between n1 and n2
		}
	}
	System.out.println();
	System.out.print(c);
}




}
