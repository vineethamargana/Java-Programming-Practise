package stringtraversal2;

import java.util.Scanner;

public class IndexOfgivenChar {
	static int printIndex(String s,char c)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=sc.next().charAt(0);
		int v=printIndex(s,c);
		System.out.println(v);
		
	}

}
