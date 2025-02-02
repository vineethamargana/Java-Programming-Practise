/*
  MAP: 

  ----
  map is a collection of key value pair
  syntax:map<key,value>
  ex: map<jersynum,name>
  
  HashMap: HAshmap is same as the hashset the only difference is that map stores key,value or object pair where set stores only values or objects
  --------
  --->Hash function and hash table comes into picture
  --->Hash there are bucket locations in the HAsh table ... the bucket locations now contain the
    key,value pair 
  1.the default or current capacity of hashmap is 16
  2.it does not preserve the order of insertion
  3.put() is used to add the data into the map instead of add()
  4.Accesing the keys and values:
    if we want to access the key,value ,key value sepeartly
    iterator method is not there inside the hashmap so we need to convert into list,queue,set,collection 
    which are having iterator method
    check it again: traditional for loop is not possible because there is no get method
    a.keys: keySet() ...return type is set interface
      --->enhanced for loop
      --->iterator
    b.values: values()...return type is Collection interface
      --->iterator
      --->enhanced for loop
    c.key and value pair: entrySet() ...return type is Set
      --->iterator
      --->enhanced for loop
    d.containsKey(): if we give key as parameter then it returns true or false.
    e.containsValue(): if we give value as parameter then it returns true or false.
    f.isEmpty(): if the map is empty it gives true.if it is not empty it gives false.
    g.size(): checks the size and gives the int as output.
    h.clear(): it clears the map and gives the empty set.
    
    
  5.Duplicates: key can never be duplicates but values can be
      a. values can be duplicate 
      b. keys can not be duplicate because the hashing which is done by hashfunction is done on the bases of key.
  6.null: we can store null
     a. ->key can be null 
        ->multiples null can not be given as null because keys can not be duplicate
     b. ->values can be null
        ->multiple nulls can be given 
  7.homogeneous and heterogenous: we can give both homo and heterogeneous data to both key and value ...but it is recommended
    to give key as simple and integer values for making hashing easy
    key: we can give homo and hetero both
    value: we can give homo and hetero both
  8.how to use?
    create the object of hashmap insert the data and start using.
  9.constructors:
    a.HashMap(int initialCapacity,float loadFactor)// we can give the initial capacity,load factor
    b.HashMap(int initialCapacity)//we can give the initial capacity
    c.HashMap(int initialCapacity,DEFAULT_LOAD_FACTOR)
    d.HashMap() //capacity:16
  10.load factor:0.75
  11.internal data structure: hashing :hash function + hash table
  12.in-built methods:
     a.put(_,_):
       to insert the data into the map.
     b.get(key):
       we have to give key in the get method the it returns the value of it.
     c.remove():
       ->remove(object key)
       ->remove(object key,object value)
 13.when to use?
    --->best for insertion ...O(1).
    --->good for Accessing ...O(1).
 14.Disadvantage:
    --->it will not preserve the order of insertion
 */

package corejavacollections2;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(18, "virat");
		hm.put(45, "rohit");
		hm.put(07, "dhoni");
		//hm.put(07, "dadesh");
		System.out.println(hm); //{18=virat, 7=dhoni, 45=rohit}
		//get():
		System.out.println(hm.get(07));//dhoni
		
		//containsKey():
		System.out.println(hm.containsKey(18));
		
		//containsValue():
		System.out.println(hm.containsValue("virat"));
		
		//isEmpty():
		System.out.println(hm.isEmpty());
		
		//size():
		System.out.println(hm.size());
		
		//remove:
		//remove(object key)
		hm.remove(07);
		System.out.println(hm); //{18=virat, 45=rohit}
		//
		hm.remove(07,"dhoni");
		System.out.println(hm); //{18=virat, 45=rohit}
		
		//clear():
		hm.clear();
		System.out.println(hm);
		
		/*
		hm.put(18, "virat");
		hm.put(45, "rohit");
		hm.put(07, "dhoni");
		
		//System.out.println(hm); //{18=virat, 7=dhoni, 45=rohit}
		
		//accessing key,value,keyvalues
		//accessing keys
		
		Set s=hm.keySet();
		System.out.println(s);//[18, 7, 45]
		//using enhanced for loop
		for(Object a:s)
		{
			System.out.println(a);
		}
		//using iterator
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		 
		//accessing values
		
		Collection c=hm.values();
		System.out.println(c);//[virat, dhoni, rohit]
		//using iterator
		Iterator itr1=c.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		//using enhanced for loop
		for(Object a:c)
		 {
			System.out.println(a);
		 }
		
        //accessing key value
		
		Set set=hm.entrySet();
		System.out.println(set); //[18=virat, 7=dhoni, 45=rohit]
		//using iterator
		Iterator itr2=set.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		//using enhanced for loop
		for(Object a:set)
		  {
			System.out.println(a);
		  }
		*/
	}

}
