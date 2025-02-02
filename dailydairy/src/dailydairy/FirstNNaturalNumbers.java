//using same variable n in both methods
package dailydairy;
import java.util.Scanner;

public class FirstNNaturalNumbers {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		naturalNumbers(n);
		
		
	}
	static void naturalNumbers(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
		}
	}

}
