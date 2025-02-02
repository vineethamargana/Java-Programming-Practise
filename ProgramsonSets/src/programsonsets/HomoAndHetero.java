/*
 * HASHSET

  hashsets can be homogeneous or heterogeneous i.e: it can store same type of data or 
  different types of data .
  i.e:homogenous: [10,78,8,5,4] all integeres,or all floats..or all doubles like that
  but we have to write like this
 ---> Hashset<Integer> set=new Hashset<Integer>();
  
  heterogeneous:[10,true,king,8.9,'g',7.9f] all this 
 --->HashSet set=new HashSet();
*/
package programsonsets;

import java.util.HashSet;

public class HomoAndHetero {
	public static void main(String []args) 
	{
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(50);
		set.add(75);
		set.add(20);
		set.add(100);
		//set.add("string");` we can not add them because we had make the hashset as homogeneous
		//set.add(true);

		System.out.println(set);
	}
}
