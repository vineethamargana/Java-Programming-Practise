package substrings;

import java.util.Arrays;
import java.util.Scanner;

public class StringSortThai1 {
	static char[] sortString(String s)
	//static Stirng sortString(String s)...2
	{
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		return (ch);
		//return new String(ch);....2
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next(); 
		//String r=sortString(s); ...2
		char[] r=sortString(s);
		System.out.println(r);
	}

}
