package dailydairy;
import java.util.Scanner;

public class DollarToInr {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int dollar=sc.nextInt();
		double inr=dollar*82.73;
		float in=dollar*82.73f;
		System.out.println(in);
	    System.out.printf("%.4f",inr);
		System.out.println();
		//if it is given output should contain upto 4 decimal points use %.4f in printf function
	    System.out.print(inr);
	}
	

}
