package stringtraversal2;

import java.util.Scanner;

public class LongestPalingromeingivenString {
	static boolean palindrmeCheck(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i) == s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
			return false;
			}
		}
		return true;
	}
	static String longestPalindrome(String s)
	{
		for(int size=s.length();size>=1;size--)
		{
		  for(int i=0;i<=s.length()-size;i++)
		  {
			  String ns="";
			  for(int j=i;j<i+size;j++)
			  {
				  ns=ns+s.charAt(j);
			  }
			  if(palindrmeCheck(ns))
			  {
				  return ns;
			  }
		  }
		}
		return "no";
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//int l=sc.nextInt();
		String v=longestPalindrome(s);
	    System.out.println(v);
	}

}
