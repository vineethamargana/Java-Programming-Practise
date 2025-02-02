package myJava;
import java.util.Scanner;

public class Hcfday6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		highestCommon(n1,n2);
	}
	static void highestCommon(int n1,int n2)
	{
		int hcf=1;
		for(int i=1;i<=n1 && i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				hcf=i;
			}
		}
		System.out.print(hcf);
		

	}

}
