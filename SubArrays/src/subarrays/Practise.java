package subarrays;

import java.util.Scanner;

public class Practise {

	static void subStrings(String s)
	{
		//for(int size=1;size<=s.length();size++)
		int vc=0,cc=0;
        for(int size = s.length(); size >=1; size--) 
		{
		for(int i=0;i<=s.length()-size;i++)
		{
			String t="";
			for(int j=i;j<i+size;j++)
			{
				char c=s.charAt(j);
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
			if(vc>=cc)
			{
				for(int j=i;j<i+size;j++)
				{
					System.out.println(s.charAt(j));
				}
				
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
