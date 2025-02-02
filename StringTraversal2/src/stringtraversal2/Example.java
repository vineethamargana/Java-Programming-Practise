package stringtraversal2;

import java.util.Scanner;

public class Example {
	static void print(String s)
	{
		String t="";
		//String r="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a' && c<='z')
			{
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				t=t+c;
			}
			}
		}
		if(t.equals(s))
		{
			System.out.println(s);
		}
		else
		{
			System.out.println("-1");
		}
	}
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		print(s);
    } 

}
