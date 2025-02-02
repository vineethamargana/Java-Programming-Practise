/*
  TREEMAP:
 ---------
 1. it gives the output in sorted order based on the key value.
 2. homogeneous and hetergeneous:
    keys: only homogeneus
    values: both homogenous and heterogenous
 3. duplicates:
    keys: not allowed.
    values: allowed.
 4. null:
    keys: no 
    values: yes ,multiple also
 5.preserves the order of insertion: no
 6.constructors:4
   a.Treemap()
   b.TreeMap(comparator<? super k> comparator)
   c.TreeMap(Map<? extends k, ? extends v> m) 
   d.TreeMap(sortedMap<,? extends V>m)
 7.default capacity:0
 8.internal data structure:
   balanced binary tree 
        or
   balanced binary search tree 
        or
   red black tree
 9.methods:
   check all the methods we have seen in hashmap whether they are working for this or not.
 10.Accessbility:
   check the accessibilty same as the hashmap 
 11.heirarchy
 12. when to use?
    ---> when we the output in sorted order use it.
 13.Disadvantage:
    order of insertion is not preserved.
 */


package corejavacollections2;

import java.util.TreeMap;

public class TreeMap1 {
     public static void main(String[] args) {
    	TreeMap lm=new TreeMap();
 		lm.put(18,"virat");
 		lm.put(12, "rohit");
 		lm.put(13,"kohli");
 		System.out.println(lm);
	}
}
