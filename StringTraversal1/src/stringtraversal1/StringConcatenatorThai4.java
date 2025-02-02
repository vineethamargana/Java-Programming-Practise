package stringtraversal1;

import java.util.Scanner;

public class StringConcatenatorThai4 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		//using inbuilt method
		//System.out.println(s1.concat(s2));
		String r=printAllChars(s1,s2);
		System.out.println(r);
	}

	 static String printAllChars(String s1,String s2) 
	 {
		 String ns1="";
		 String ns2="";
       for(int i=0;i<s1.length();i++)
       {
           ns1 =ns1+s1.charAt(i);
       }
       for(int i=0;i<s2.length();i++)
       {
           ns2=ns2+s2.charAt(i);
       }
       return ns1+ns2;
	}
}
/*
 * output:
Tap
Academy
TapAcademy
*/
