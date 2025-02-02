package corejavacollections;

import java.util.ArrayList;

public class ArrayListCounting11 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
	    al.add(10);
	    al.add(20);
	    al.add(30);
	    al.add(40); 
	    
	    //traditional for loop:
	    for(int i=0;i<al.size();i++)
	    {
	    	System.out.println(al.get(i));
	    }
	}
 

}
