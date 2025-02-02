package stringtraversal1;

import java.util.Scanner;

public class Palindrome2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(isPalindrome(s));
	}
    static String isPalindrome(String s)
    {
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
    			return "not palindrome";
    		}
    	}
    	
    	return "palindrome";
    }


}
