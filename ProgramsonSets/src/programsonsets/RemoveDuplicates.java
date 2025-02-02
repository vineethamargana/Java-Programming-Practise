
/*
    using sets it doesnot allow 
    
    FOR STRINGS WE CANNOT USE FOR EACH LOOP WE HAVE TO USE TRADITIONAL FOR LOOP.
    
    using Integer ,Character like that it is called wrapper class. u can see in hashset creation
     
    converting wrapper class to primitive ---> auto boxing
    converting primitive to wrapper class ---> boxing
 */

package programsonsets;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicates {
	//static void removeDuplicates(String s)
	static String removeDuplicates(String s)
	{
		//HashSet<Character> set=new HashSet<Character>();
		//LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		TreeSet<Character> set=new TreeSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		//if we want to return the output as a string then
		String t="";
		for(char X:set)
		{
			t=t+X+" ";
		}
		return t;
		/*for(Character x:set) //for(Char x:set)
		{
			System.out.print(x+" ");
		}*/
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//removeDuplicates(s);
		String r=removeDuplicates(s);
		System.out.print(r);
		
	}
}

/*
 output : when we use HashSet:
 mississippi
 psim
 
 output : when we use LinkedHashSet:
 mississippi
 misp
 
output : when we use TreeSet:
mississippi
imps
 
 */
