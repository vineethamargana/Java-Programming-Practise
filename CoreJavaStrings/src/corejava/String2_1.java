
//String concatenation
//  + in between two strings will concate two strings

package corejava;

public class String2_1 {
	public static void main(String []args)
	{
		String s1="java";
		String s2="python";
		String s3="java"+"python";
		String s4="java"+"python";
		
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
