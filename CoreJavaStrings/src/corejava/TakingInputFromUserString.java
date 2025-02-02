
//to ways to take the input from the user 
//next().......takes the values upto space
//nextLine()  .... takes the values after the space

package corejava;

import java.util.Scanner;

public class TakingInputFromUserString {
	public static void main(String []args)
	{
         Scanner sc=new Scanner(System.in);
       //  String s=sc.next();
         String s=sc.nextLine();
         char c=sc.next().charAt(0); // to scan a charcter this is the syntax ...
         //as there is no inbuild method to scan a character we have to take it as  a string and we have to convert it to vhar as shown above
         // see the output by giving string as input
         System.out.println(c);
	}
}
