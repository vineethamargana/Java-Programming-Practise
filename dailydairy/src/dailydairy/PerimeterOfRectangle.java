package dailydairy;
import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int w=sc.nextInt();
		int p=2*(l+w);
		System.out.print(p);
}
}
