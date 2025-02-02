package stringtraversal1;

import java.util.Scanner;

public class PrintAllCharsThai1 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		printAllChars(s);
	}

	 static void printAllChars(String s) 
	 {
       for(int i=0;i<s.length();i++)
       {
    	   System.out.println(s.charAt(i));
       }
	}

}
/*output:
hello
h
e
l
l
o
*/
