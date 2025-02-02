


package corejavaexceptionhandling;

public class CustomException1 {
	public static void main(String []args)
	{
		try
		{
			int a=100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.printStackTrace());
		}
	}

}
