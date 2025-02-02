/*
  GENERICS: we should always use generics with collections framework
  ---------
  <generics> : we are specifying the collections Framework class that what type of data it should store.
  whenever you tell collection framework class that what  to store insidde the daimond operator
  that we call it as generics.
  this is useful when we store similar kind of data.
  ---> we should not givve shortcuts like int,float etc... we should give the Integer,Float beacause they are classes.
  
  TRY :
   try the generics with all the other classes arraylist,hashset,linkendhashset,maps also
   and try with different data types.
  
 */

package corejavacollections2;

import java.util.HashMap;
import java.util.TreeSet;

public class Generics {
public static void main(String[] args) {
	TreeSet<Integer> ts=new TreeSet<Integer>();
	HashMap<Integer, String> hs=new HashMap<Integer, String>();
	ts.add(12);
	ts.add(20);
	ts.add(30);
	System.out.println(ts);
}
}
