package stringtraversal1;

import java.util.Scanner;

public class SpecialCharacterPrinterThai19 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		printAllChars(s);
		//System.out.println(v);
	}

	 static void printAllChars(String s) 
	 {
		 int co=0;
       for(int i=0;i<s.length();i++)
       {
    	   char c=s.charAt(i);
    	   if(!(c>='0' && c<='9' || c>='a' && c<='z' || c>='A' && c<='Z'))
    	   {
    		  System.out.print(c+" ");
    	      co++;
    	   }
       }
       if(co==0)
       {
    	   System.out.print("No Specials found.");
       }
	}

}
