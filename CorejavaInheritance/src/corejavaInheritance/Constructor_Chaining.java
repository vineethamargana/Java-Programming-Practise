
/*
  Using of SUPER();
  -----------------
  
  should use in child constructor
   
  if we wnat to call the constructor in the same class we have to use this() method
  
  if we want to call the constructor from the different class we have to use super() method
 */

package corejavaInheritance;
class parent10 //extends object
{
	public parent10() {
		//here also super will be given by java and it goes to object class
		//super(); like this
		System.out.println("inside parent consstructor");
	}
}
class Child10 extends parent10
{
	public Child10() {
		//if we dont give super here java will give it
		//super(); like this
        System.out.println("inside child constructor");
	}
}


public class Constructor_Chaining {
	public static void main(String args[])
	{
		Child10 c=new Child10();
	}

}
