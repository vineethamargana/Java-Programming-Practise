
//to use the methods which are not there in immutable string class but there in mutable string class we have to convert the immutable string to mutable

package corejava;

public class ConvertingImmutabletoMutable {
	public static void main(String []args)
	{
		String s=new String("Tap");
		StringBuffer sb=new StringBuffer(s); 
		System.out.println(sb.reverse());
		
	}
	

}
