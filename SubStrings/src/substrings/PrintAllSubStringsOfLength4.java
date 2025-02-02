package substrings;

import java.util.Scanner;

public class PrintAllSubStringsOfLength4 {
	static void subStrings(String s)
	{
		for(int i=0;i<=s.length()-4;i++)
		{
			String t="";
			for(int j=i;j<i+4;j++)
			{
				t=t+s.charAt(j);
			}
			System.out.println(t);
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
