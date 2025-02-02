package corejava;

public class StringusingComparetoMethod4 {
	public static void main(String []args)
	{
		String s1="java";
		String s2="javac"; 
		int res=s1.compareTo(s2); // the result of compare to must be stored in integer type because it gives integer values as result.
		System.out.println(res);
		if(res==0)
		{
			System.out.println("strings are equal");
		}
		else if(res>0)
		{
			System.out.println("s1>s2");
		}
		if(res<0)
		{
			System.out.println("s1<s2");
		}
		
	}

}
