package stringtraversal2;

import java.util.Scanner;

public class StringToAsciiConverterThai24 {
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
    	for(int i=0;i<s.length();i++)
    	{
    		t=t+(int)s.charAt(i)+" ";
    	}
    	return t;
    }
}
