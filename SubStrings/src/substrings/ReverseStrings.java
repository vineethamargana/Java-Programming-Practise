package substrings;

import java.util.Scanner;

public class ReverseStrings {
	static void reverse(String s)
    {
    	String v="";
    	int c=0;
    	//for(int i=s.length()-1;i>=0;i--)
    	for(int i=0;i<s.length()-1;i++)
    	{
    		if(s.charAt(i)!=' ' && s.charAt(i+1)!=' ')
    		{
    		  v=v+s.charAt(i);
    		  c++;
    		}
    		else
    		{
    			System.out.print(v+c+" ");
    			v="";
    			c=0;
    		}
    	}
    	System.out.println(v+c);
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		// String V=reverse(s);
		reverse(s);
		//System.out.println(V);
		
	}
    
}
