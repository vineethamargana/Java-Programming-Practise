/*
   COLLECTIONS FRAMEWORK:
l
  -----------------------
  
  collections is different ,collecction is different ,collections framework is different.
  
  Framework: there is a readymade content already we have to use it thats it.
  
  java was released in 1995.
  
  OPEN SOURCE:
  ------------
  java belongs to sun microsystem1 from 1995 to 2010 which is a free bird i.e java is contributed not only to the engineers of sun microsystem to also belongs to the engineers of the entire world ....
  I.E anyone can able to the features to the java.
  
  CLOSEd SOURCE:
 --------------- 
  from 2010 it belongs to oracle ...it becames the bird in cage. that is it only contributed to the engineers of oracle 
  so,nobody except oracle can able to add the features to java.
  
  FREE LANCER(JASH BLOCH):
  ------------------------
  in the era where the java is open source ...he added a feature to java i.e collection frame work.
  
 ARRAYLIST:
 -----------
  arraylist is a in-buit class.
  
 PROPERTIES:
 -------------
 1. we have to insert data into arraylist using add() method instead indexs.
 2. we can able to add any type of data into the arraylist ...i.e: we can add homogeneous or heterogenous data.\
 3. it preserves the order of insertion. i.e in which way we add in that way only it prints
 4. it also able to store duplicate values.
 5. it is able to store null.
 6. there are three constructors in arraylist:
      a.ArrayList()
      b.ArrayList(int)
      c.ArrayList(Collection)
 7. there are total 10 memory locations in arraylist ..i.e intial capacity is equal to 10
    new capacity=old capacity*3/2+1; i.e 16 
    it will continue from 11 instead it will create new 16 locations and put the  entire old values into new locations(16).
  
 */

package corejavacollections;

import java.util.ArrayList;

public class CollectionFramework1 {
	public static void main(String []args)
	{
		ArrayList al=new ArrayList(11); //we can also give no of required locations like 11 or we can leave it empty.one parameterised constructor comes into picture.
		//al[0]=100; wrong
		al.add(100); //inserting data into arraylist
		al.add(200);
		al.add(200);
		al.add(300);
		al.add(true);
		al.add("string");
		al.add(12.34);
		al.add(null);		
		System.out.println(al);	
	}

}
