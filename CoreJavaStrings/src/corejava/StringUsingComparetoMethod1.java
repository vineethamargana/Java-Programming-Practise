
//compareTo() method usage ...it compares strings in three ways :1.equals 2.greater than 3.less than

package corejava;

public class StringUsingComparetoMethod1 {
	public static void main(String []args)
	{
		String s1="sachin";
		String s2="saurav";
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
