/*
 * Assignment: do all the things that done for hashset
 * 
 * all the properties are same as hashset except the order of insertion.
  LINKED HASHSET:
  ---------------
  1.preserves the order of insertion
 */

package corejavacollections2;

import java.util.LinkedHashSet;

public class LinkedhashSet1 {
	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		hs.add(45.4);
		hs.add("hii");
		hs.add('j');
		hs.add('j');
		hs.add(null);
		System.out.println(hs);
	}
}
