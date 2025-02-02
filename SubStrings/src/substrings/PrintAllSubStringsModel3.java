package substrings;

import java.util.Scanner;

public class PrintAllSubStringsModel3 {
	static void subStrings(String s)
	{
		//for(int size=1;size<=s.length();size++)
		{
		for(int i=0;i<=s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String t="";
				for(int k=i;k<=j;k++)
				{
				  t=t+s.charAt(k);
				}
				 System.out.println(t);
			}
		}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//int size=sc.nextInt();
		subStrings(s);
	}

}
