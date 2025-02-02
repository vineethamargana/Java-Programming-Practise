package stringtraversal1;

import java.util.Scanner;

public class NumberOfVowels {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//String s=sc.next(); it will the output as olleh for hello world ...the word world doesnot be considered.
		int V=countspaces(s);
		System.out.println(V);
		
	}
    static int countspaces(String s)
    {
    	int co=0;
    	for(int i=0;i<s.length();i++)
    	{
    		char c=s.charAt(i);
    	//	if(c>='A' && c<='Z' || c>='a' && c<='z')
    	//	{
    		  if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )	
    		   {
    			co++;
    		   }
    	//	}
    	}
    	return co;  
    	
    }


}
