package stringtraversal1;

import java.util.Scanner;

public class NumberPrinterThai11 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		numChars(s);
	}

	 static void numChars(String s) 
	 {
		 int co=0;
       for(int i=0;i<s.length();i++)
       {
    	   char c=s.charAt(i);
    	   if(c>='0' && c<='9')
    	   {
    	   System.out.print(s.charAt(i)+" ");
    	   co++;
    	   }
       }
       if(co==0)
       {
    	   System.out.println("No valid nums found.");
       }
	}

}


/*
 output:
1.
TapAcademy2024
2 0 2 4 

2.
Hello World!
No valid nums found.
 */
