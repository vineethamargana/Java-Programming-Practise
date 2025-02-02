package dailydairy;

import java.util.Scanner;

public class LastDigit57OrNot {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
   /* if(n%100==57) 
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}*/
		//System.out.println((n%100==57)?"yes":"no");
		String s=(n%100==57)?"yes":"no";
		System.out.println(s);
	}
}
