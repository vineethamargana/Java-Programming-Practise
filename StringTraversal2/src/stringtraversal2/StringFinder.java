package stringtraversal2;

import java.util.Scanner;

public class StringFinder {
	static String stringFinder(String s1,String s2)
	{
		int i=0,j=0;
		String t="";
		while(i<s1.length() && j<s2.length())
		{
			if(s1.charAt(i)==s2.charAt(j))
			{ 
				t=t+s2.charAt(j);
				i++;
				j++;
			}
			else
			{
				i++;
			}
		}
		return t;
		//return j==s2.length()?"yes":"No";
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String v=stringFinder(s1,s2);
		System.out.println(v);
		System.out.println((v==s2)?"yes":"No");
		
	}

}
