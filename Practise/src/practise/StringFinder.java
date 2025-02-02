package practise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringFinder {
	static String stringing(String s)
	{
		String t="";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(char c:set)
		{
			t=t+c;
		}
		return t;
	}
	static void longest(String s)
	{
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String v=stringing(s);
		System.out.println(v);
	}

}
