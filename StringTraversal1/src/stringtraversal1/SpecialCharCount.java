package stringtraversal1;

import java.util.Scanner;

public class SpecialCharCount {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//String s=sc.next(); it will the output as olleh for hello world ...the word world doesnot be considered.
		 count(s);
		//System.out.println(V);
		
	}
    static void count(String s)
    {
    	int count=0;
    	for(int i=0;i<s.length();i++)
    	{
    		char c=s.charAt(i);
    		if(!((c>='A' && c<='Z' ) || (c>='a' && c<='z' ) || (c>='0' && c<='9')))
    		{
    			System.out.print(c+" ");
    			count++;
    		}
    	}
    	if(count==0)
    	{
    		System.out.println("No Special chars found.");
    	}
    	}

}
