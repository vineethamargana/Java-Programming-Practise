package stringtraversal1;

import java.util.Scanner;

public class OddIndexCharaterPrinterThai6 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		printAllChars(s);
	}

	 static void printAllChars(String s) 
	 {
		 int c=0;
       for(int i=1;i<s.length();i=i+2)
       {
    	   System.out.print(s.charAt(i)+" ");
    	   c++;
       }
       if(c==0)
       {
    	   System.out.println("No characters found at odd index.");
       }
	}
}
/*
 output:
1. TapAcademy
a A a e y 

2.testing
e t n 
*/
