package stringtraversal1;

import java.util.Scanner;

public class ReverseStringThai8 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String v=reverseString(s);
		System.out.println(v);
	}

	 static String reverseString(String s) 
	 {
		 String ns="";
       for(int i=s.length()-1;i>=0;i--)
       {
             ns=ns+s.charAt(i);
       }
       return ns;
	}

}

/* output:
1.TApAcademy
ymedacApAT

2.Racecar
racecaR
*/
