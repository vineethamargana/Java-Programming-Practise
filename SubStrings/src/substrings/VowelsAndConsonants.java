package substrings;

import java.util.Scanner;

public class VowelsAndConsonants {
	static boolean vowelsAndConsonants(String s)
	{
		int vc=0,cc=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a' && c<='z' || c>='A' && c<='Z')
	    	   {
	    	   if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' ||c=='U')
	    	      { 
	    	        vc++;
	    	      }
	    	   else
	    	     {
	    		   cc++;
	    	     }
	    	  }
		}
		return vc>=cc?true:false;
	}
	static void subStrings(String s)
	{
		//for(int size=1;size<=s.length();size++)
        for(int size = s.length(); size >=1; size--) 
		{
		for(int i=0;i<=s.length()-size;i++)
		{
			String t="";
			for(int j=i;j<i+size;j++)
			{
				t=t+s.charAt(j);
			}
			if(vowelsAndConsonants(t))
			{
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
		System.out.println(9+2);
	}




}
