package dailydairy;
import java.util.Scanner;

public class FirstnPrimeNumbers {
	
		public static void main(String[] args) 
		{
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 firstNprimes(n);
		

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
	static void firstNprimes(int n)
	{
		int c=0;
		for(int i=2;c<n;i++)
		{
			if(primeCheck(i))
			{
				System.out.print(i+" ");
				c++;
			}
		}

	}

	}



