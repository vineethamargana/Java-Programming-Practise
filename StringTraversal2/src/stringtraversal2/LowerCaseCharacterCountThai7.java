package stringtraversal2;

import java.util.Scanner;

public class LowerCaseCharacterCountThai7 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	//String s=sc.next(); it will the output as olleh for hello world ...the word world doesnot be considered.
	 int V=countLower(s);
	System.out.println(V);
	
}
static int countLower(String s)
{
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c>='a' && c<='z' )
		{
			count++;
		}
		
	}
	return count;
}
}
