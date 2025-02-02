package stringtraversal2;

import java.util.Scanner;

public class RemoveAllSpacesAcceptOne {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//String s=sc.next(); it will the output as olleh for hello world ...the word world doesnot be considered.
		 String V=count(s);
		System.out.println(V);
		
	}
    static String count(String s)
    {
    	String t="";
    	int si=0,ei=-1;
    	for(int i=0;i<s.length();i++)
    	{
    		char c=s.charAt(i);
    		if(c!=' ' )
    		{
                si=i;
                break;
    		}
    		
    	}
    	for(int i=s.length()-1;i>=0;i++)
    	{
    		char c=s.charAt(i);
    		if(c!=' ' )
    		{
                ei=i;
                break;
    		}
    		
    	}
        for (int i = si; i <=ei; i++) 
        {
        	//char c=s.charAt(i);
        	if(s.charAt(i)!=' ' || (s.charAt(i)==' ' && s.charAt(i+1)!=' '))
		    t=t+s.charAt(i);
		}			
    		
    	return t;
    }

}
