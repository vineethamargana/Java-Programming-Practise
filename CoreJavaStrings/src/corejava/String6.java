package corejava;

public class String6 {
	public static void main(String []args)
	{
		String s1=new String("Java");
		String s2=new String("JAVA");
		if(s1==s2)
		{
			System.out.println("ref are equal");
		}
		else
		{
			System.out.println("ref are unequal");

		}
		//boolean res=s1.equals(s2);
		//if(res==true)
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("values are equal");
		}
		else
		{
			System.out.println("values are unequal");
		}
	}


}
