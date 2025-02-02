package dailydairy;

import java.util.Scanner;

public class MulitipleOf35And3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%3==0 && n%5==0)//if(n%15==0)
		{
			System.out.println("BTM");		
		}
		else if(n%3==0)
		{
			System.out.println("TAP");
		}
		else if(n%5==0)
		{
			System.out.println("ACAD");
		}
	}

}
