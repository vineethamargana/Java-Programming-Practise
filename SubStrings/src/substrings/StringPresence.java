package substrings;

import java.util.Scanner;

public class StringPresence {
	static String subStrings(String s1,String s2)
	{
		for(int i=0;i<=s1.length()-s2.length();i++)
		{
			String t="";
			for(int j=i;j<i+s2.length();j++)
			{
				t=t+s2.charAt(j);
			}
			if(t.equals(s2))
			{
			  return "yes";
			}
		}
		return "No";
		}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String res=subStrings(s1,s2);
		System.out.println(res);
	}


}
