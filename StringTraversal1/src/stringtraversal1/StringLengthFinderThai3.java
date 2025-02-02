package stringtraversal1;

import java.util.Scanner;

public class StringLengthFinderThai3 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	  //using inbuilt method
	  //System.out.println(s.length());
		int length=lengthofString(s);
		System.out.println(length);
	}

	 static int lengthofString(String s) 
	 {
		 int length=0;
       for(int i=0;i<s.length();i++)
       {
    	   length++;
       }
       return length;
	 }
}

/* output:
hello
5
*/


