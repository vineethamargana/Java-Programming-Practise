
/*
   INTRODUCTION:
   1.hiding the implementation but showing only the assential part or functions to the user
   2.abstract key word is used in the implementation of abstraction
   3.the method having only method signature but do not have any method body is called abstract method
   4.to make the method as abstract the class should also be abstract
   5.abstract means imcomplete
   6.if the method is incomplete the class is also incomplete so we have to name the class as abstract class
   7.we cannot create the object of abstract class in java because java will never create objects for incomplete classes.
  
   COMPLETE AND CONCRETE METHOD:
   1.the method which is having method body and method signature that is called complete method
   2.the method which is having only method signature and do not have method body is called concrete method or abstract method
 */

package corejavaabstraction;
abstract class Demoooo
{
	abstract void disp1(); //abstract method
	abstract void disp();//we can have any num of abstract classes
	void disp2()//complete method
	{
		
	}
}


public class Intro1 {
	public static void main(String []args)
	{
		//Demo d=new Demo();
	}

}
