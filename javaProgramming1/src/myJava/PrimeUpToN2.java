package myJava;

import java.util.Scanner;

public class PrimeUpToN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			int n2=sc.nextInt();
		    Prime(n1,n2);
		}
		static boolean checkPrime(int n1,int n2)
		{
			if(n1==1 || n2==1)
			{
				return false;
			}
			for(int i=n1;i*i<=n2;i++) //i<= root n 
			{
				if(n2%i==0)
				{
					return false;
				}
			}
			return true;
		}
        static void Prime(int n1,int n2)
        {
        	int c=0;
            for(int i=2;c<n2;i++)
            {
        	if(checkPrime())
        	{
        		System.out.print(i+" ");
        		c++;
        	}
        }
        }
}
