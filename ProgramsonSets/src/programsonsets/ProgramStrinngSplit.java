package programsonsets;

import java.util.Scanner;
import java.util.TreeSet;

public class ProgramStrinngSplit {
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
			System.out.println(url);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		printUniqueUrls(s);
	}

}
