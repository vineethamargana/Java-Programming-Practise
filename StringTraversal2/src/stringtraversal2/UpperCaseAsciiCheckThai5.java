package stringtraversal2;

import java.util.Scanner;

public class UpperCaseAsciiCheckThai5 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//String s=sc.next(); it will the output as olleh for hello world ...the word world doesnot be considered.
		 String V=asciiCheck(n);
		System.out.println(V);
		
	}
    static String asciiCheck(int n)
    {
    	if(n>=65 && n<=90)
    	{
    		return "yes";
    	}
    	else
    	{
    		return "No";
    	}
    }

}
