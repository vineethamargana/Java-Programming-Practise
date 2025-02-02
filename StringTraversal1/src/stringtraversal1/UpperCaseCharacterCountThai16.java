package stringtraversal1;

import java.util.Scanner;

public class UpperCaseCharacterCountThai16 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int v=printAllChars(s);
		System.out.println(v);
	}

	 static int printAllChars(String s) 
	 {
		 int co=0;
       for(int i=0;i<s.length();i++)
       {
    	   char c=s.charAt(i);
    	   if(c>='A' && c<='Z')
    	   {
    	      co++;
    	   }
       }
       return co;
	}

}
