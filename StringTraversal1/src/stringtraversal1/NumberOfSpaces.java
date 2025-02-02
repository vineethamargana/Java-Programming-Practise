package stringtraversal1;

import java.util.Scanner;

public class NumberOfSpaces {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//String s=sc.next(); it will the output as olleh for hello world ...the word world doesnot be considered.
		int V=countspaces(s);
		System.out.println(V);
		
	}
    static int countspaces(String s)
    {
    	int c=0;
    	for(int i=0;i<s.length();i++)
    	{
    		if(s.charAt(i)==' ')
    		{
    			c++;
    		}
    	}
    	return c;  
    	
    }

}
