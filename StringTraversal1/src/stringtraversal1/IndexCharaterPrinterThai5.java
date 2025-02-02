package stringtraversal1;

import java.util.Scanner;

public class IndexCharaterPrinterThai5 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int index=sc.nextInt();
		//using inbuild method 
		/*if(index<s.length())
		{
			System.out.println(s.charAt(index));
		}
		else
		{
			System.out.println("invalid index");
		}*/
		printAllChars(s,index);
	}

	 static void printAllChars(String s,int index) 
	 {
		 int c=0;
       for(int i=0;i<s.length();i++)
       {
    	  if(i==index)
    	  {
    		  c++;
    		  System.out.println(s.charAt(i));
    	  }
       }
       if(c==0)
       {
    	   System.out.println("invalid index");
       }
	}

}

/*
 output:
1.Tap Academy
4
A
2.Testing
7
invalid index
 */
