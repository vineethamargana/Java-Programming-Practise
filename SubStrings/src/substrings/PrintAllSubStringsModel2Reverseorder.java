package substrings;

import java.util.Scanner;

public class PrintAllSubStringsModel2Reverseorder {
	static void subStrings(String s)
	{
        for(int size = s.length(); size >=1; size--) 
		{
		for(int i=0;i<=s.length()-size;i++)
		{
			String t="";
			for(int j=i;j<i+size;j++)
			{
				t=t+s.charAt(j);
			}
			System.out.println(t);
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
