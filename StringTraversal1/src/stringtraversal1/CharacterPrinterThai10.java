package stringtraversal1;

import java.util.Scanner;

public class CharacterPrinterThai10 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		printAllChars(s);
	}

	 static void printAllChars(String s) 
	 {
		 int co=0;
       for(int i=0;i<s.length();i++)
       {
    	   char c=s.charAt(i);
    	   if(c>='a' && c<='z' || c>='A' && c<='Z')
    	   {
    	   System.out.print(s.charAt(i)+" ");
    	   co++;
    	   }
       }
       if(co==0)
       {
    	   System.out.println("No valid chars found.");
       }
	}
}

/*
 output:
1. Hello World!
H e l l o W o r l d 

2.12345
No valid chars found.
*/
