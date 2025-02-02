package dailydairy;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		float a=3.142f*r*r;
		double area=3.142*r*r;
		System.out.println(a);
		System.out.println(area);
		System.out.printf("%.4f",a);
		System.out.println();
		System.out.printf("%.4f",area);


}
}
