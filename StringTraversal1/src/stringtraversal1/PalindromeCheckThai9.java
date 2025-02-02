package stringtraversal1;

import java.util.Scanner;

public class PalindromeCheckThai9 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String v=palindromeCheck(s);
		System.out.println(v);
		//System.out.println((v==s)?"not palindrome":"palindrome");
	}

	 static String palindromeCheck(String s) 
	 {
		/* String ns="";
       for(int i=s.length()-1;i>=0;i--)
       {
             ns=ns+s.charAt(i);
       }
       return ns;
       */
		 int i=0,j=s.length()-1;
		 while(i<j)
		 {
		 if(s.charAt(i)==s.charAt(j))
		 {
			 i++;
			 j--;
		 }
		 else
		 {
			 return "No";
		 }
		 }
		 return "yes";		 
	}
}

/*
 output:
1. racecar
yes
2.radar
yes
3.tapAcademy
No
*/