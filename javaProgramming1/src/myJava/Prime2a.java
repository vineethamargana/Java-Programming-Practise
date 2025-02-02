package myJava;
import java.util.Scanner;

public class Prime2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res=primeCheck(n);
		System.out.print(res);
		

	}
	static boolean primeCheck(int n)
	{
		int count=0;
		if(n==1)
		{
				//System.out.print("not prime");
			return false;
		}
		for(int i=2;i<=n/2;i++)
		{
			
			if(n%i==0)
			{
				count++;
			}
		}
		return ((count==0)? true:false);
}
}

