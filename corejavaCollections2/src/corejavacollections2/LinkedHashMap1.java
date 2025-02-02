/*
 * ASSIGNMENT:
 * TRY ALL THE things that we have done for hashmap 
   LINKED HASHMAP():
   -----------------
   1.it doesnot preserves the order of insertion.
   2.completely same as hashmap
 */


package corejavacollections2;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap lm=new LinkedHashMap();
		lm.put(18,"virat");
		lm.put(12, "rohit");
		lm.put(13,"kohli");
		System.out.println(lm);
	}

}
