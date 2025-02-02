package stringtraversal2;

import java.util.Scanner;

public class SpaceCountInStringThai23 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//String s=sc.next(); it will the output as olleh for hello world ...the word world doesnot be considered.
		int V=count(s);
		System.out.println(V);
		
	}
    static int count(String s)
    {
    	int co=0;
    	for(int i=0;i<s.length();i++)
    	{
    		char c=s.charAt(i);
    		if((c==' '))
    		{
    			co++; 
    		}
    	}
    	return co;
    }

}
