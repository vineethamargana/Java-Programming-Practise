
//two  ways to change mutable string to immutable string
//String s=new String(sb);
//sb.toString(); method

package corejava;

public class ConvertingMutableToImmutable {
	public static void main(String []args)
	{
	   StringBuffer sb=new StringBuffer("Tap"); //mutable
	  // String s=new String(sb);
	   String s= sb.toString();
	   System.out.println(s.toLowerCase());
	}


}
