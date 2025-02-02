package dailydairy;

import java.util.Scanner;

public class EliminateLast2Digits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n/100;
		int b=n%100;
		int c=n-b;
		System.out.println(a);
		System.out.print(c);

	}
}
