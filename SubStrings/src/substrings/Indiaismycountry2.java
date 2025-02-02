package substrings;

import java.util.Scanner;

public class Indiaismycountry2 {
	static int countWords(String s)
	{
		int count=0;
		for (int i = 0; i <s.length(); i++) 
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		return count+1; // if we give count it will give space count ...to get word count we have to use count+1	
	}
	static String[] split(String s)
	{
		int wordCount=countWords(s);
		String[] arr=new String[wordCount];
		int j=0;
		String t="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				t=t+s.charAt(i);
			}
			else if(t.length()>0)
			{
				arr[j]=t;
				j++;
				t="";
			}
		}
		arr[j]=t;
		return arr;
	}
	static String reverse(String s)
	{
		String t="";
		for (int i = 0; i < s.length(); i++) 
		{
			t=s.charAt(i)+t;
		}
		return t;
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().trim(); 
		// trim is used to remove the spaces before and after the string which have more words but it doesnot remove the spaces in between the string
		String[] arr=split(s);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(reverse(arr[i])+" ");
		}
		
	}


}
