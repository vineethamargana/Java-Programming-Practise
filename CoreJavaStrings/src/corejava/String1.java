/*
 the string is a series of characters enclosed with in double quotes.
 in java strings are objects 
 Strings have build in class as String 
 two types of strings
 1.mutable 
 2.immutable
 
 Immutable Strings:
 creation 
 1.String s=new String("java");
 2.String s="java";
 3.char[] c={'j','a','v','a'};
 4.String s=new String(c);
 
 
 As objects are created in heap segments Strings are created in heap segment.
 references of them are created in stack segment
 in heap Specially for strings String pool is Created .
 
 String pool is divided in two parts :
 1.Constant pool - without new ,newer allows duplicates.
 2.non constant pool- with new, allows duplicates.
 
 
 
 */

package corejava;

public class String1 {
	
	public static void main(String []args)
	{
		String s1="JAVA";
		String s2="JAVA";
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
		if(s1.equals(s2))
		{
			System.out.println("values are equal");
		}
		else
		{
			System.out.println("values are unequal");
		}
	}
}
