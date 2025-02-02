package myJava;

import java.util.Scanner;

public class PrimeUpToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int k=sc.nextInt();
		    Prime(k);
		}
		static boolean checkPrime(int n)
		{
			if(n==1)
			{
				return false;
			}
			for(int i=2;i*i<=n;i++) //i<= root n 
			{
				if(n%i==0)
				{
					return false;
				}
			}
			return true;
		}
        static void Prime(int n)
        {
        	int c=0;
            for(int i=2;c<n;i++)
            {
        	if(checkPrime(i))
        	{
        		System.out.print(i+" ");
        		c++;
        	}
        }
        }
}
	

