package stringtraversal2;

import java.util.Scanner;

public class SumOfDigitsAndoncatenateThai26 {
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
    	int sum=0;
    	for(int i=0;i<s.length();i++)
    	{
    		char c=s.charAt(i);
    	    if(c>='0' && c<='9')
    		{
    			sum=sum+c-48;
    		}
    	    else
    	    {
    	    	t=t+c;
    	    }
    	}
    	return t+sum;
    }
    	



}
