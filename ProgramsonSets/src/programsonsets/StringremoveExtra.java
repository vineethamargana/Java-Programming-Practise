package programsonsets;

import java.util.Scanner;
import java.util.TreeSet;

public class StringremoveExtra {
	static void printUniqueUrls(String s)
	{
		String[] arr=s.split(",");
		TreeSet<String> set=new TreeSet<String>();
		for (int i = 0; i < arr.length; i++) 
		{
			set.add(arr[i]);
		}
		for(String url:set)
		{
			//System.out.println(url);
			String []temp=url.split("\\."); // using only . will give error because it is belongs to metadata ...metadata has seperate work ...so to split a string where . is there we have to write like mentioned
			System.out.println(temp[1]);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		printUniqueUrls(s);
	}


}
