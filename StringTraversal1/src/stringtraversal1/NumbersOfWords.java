package stringtraversal1;

import java.util.Scanner;

public class NumbersOfWords {
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
    		//if(s.charAt(i)==' ') // it gives wrong output if we give input with two spaces side by side
    		if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') //it also gives wrong output when we space at starting so use return statement with terminate operator	
    		{
    			c++;
    		}
    	}
    	//return c+1;  
    	return s.charAt(0)==' '?c:c+1;
    }
    }
