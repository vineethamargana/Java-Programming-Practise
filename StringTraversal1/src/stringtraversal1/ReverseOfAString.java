package stringtraversal1;

import java.util.Scanner;

public class ReverseOfAString {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//String s=sc.next(); it will the output as olleh for hello world ...the word world doesnot be considered.
		String V=reverse(s);
		System.out.println(V);
		
	}
    static String reverse(String s)
    {
    	String v="";
    	for(int i=s.length()-1;i>=0;i--)
    	{
    		v=v+s.charAt(i);
    	}
    	return v;
    }
}
