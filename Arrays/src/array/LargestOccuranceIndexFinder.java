package array;

import java.util.Scanner;

public class LargestOccuranceIndexFinder {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=sc.next().charAt(0);
        System.out.println(s.lastIndexOf(c));
	}

}
