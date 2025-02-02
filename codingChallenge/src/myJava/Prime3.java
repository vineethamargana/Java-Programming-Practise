package myJava;
import java.util.Scanner;

public class Prime3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String r= checkPrime(n);
		System.out.print(r);
	}
	static String checkPrime(int n)
	{
		if(n==1)
		{
				//System.out.print("not prime");
			return "not prime";
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return " not prime";
			}
		}
		return "prime";
	}

}
