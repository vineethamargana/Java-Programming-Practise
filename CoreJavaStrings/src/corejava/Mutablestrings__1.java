/*
  Immutable String:
  we use --- String
  
  Mutable String:
  we use---
  1;stringbuffer
  2;string builder
 */
//--------------------------------------------------------------------------------------
// these are immutable Strings----------------------------------------------------------
package corejava;

public class Mutablestrings__1 {
	public static void main(String []args)
	{
		String s="RajaRamMohanRoy";
		//String s1=s.toLowerCase();
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.contains("Mohan"));//double quotes must
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('R'));
		System.out.println(s.lastIndexOf('R'));//single quotes must
		System.out.println(s.isEmpty());
		System.out.println(s.substring(5));
		System.out.println(s.substring(4,9)); //last index is exclusive so last index is not considered.
		System.out.println(s.length());
		//System.out.println(s.toCharArray(7)); //it is an array ...this method must have the reference otherwise garbage collector will erase the data
		char []arr=s.toCharArray();
		System.out.println(arr[7]);
		//System.out.println(s[7]); //it will not work.
		
	}

}
