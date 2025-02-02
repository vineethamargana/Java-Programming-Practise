package myJava;
import java.util.Scanner;

public class Prime4 {

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
			return "not prime";
		}
		for(int i=2;i*i<=n;i++) //i<= root n 
		{
			if(n%i==0)
			{
				return "not prime";
			}
		}
		return "prime";
	}

}
