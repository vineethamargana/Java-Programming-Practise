package corejava;

public class String2_3 {
	public static void main(String []args)
	{
		String s1="java";
		String s2="python";
		String s3=s1+s2;
		String s4=s1+s2;
		
		if(s3==s4)
		{
			System.out.println("ref are equal");
		}
		else
		{
			System.out.println("ref are unequal");
		}
		if(s3.equals(s4))
		{
			System.out.println("values are equal");
		}
		else
		{
			System.out.println("values are unequal");

		}
		
		
	}

}
