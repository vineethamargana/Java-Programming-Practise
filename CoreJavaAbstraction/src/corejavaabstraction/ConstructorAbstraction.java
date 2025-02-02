
/*
  CONSTRUCTORS IN ABSTRACTION:  WE CAN HAVE CONSTRUCTORS IN ABSTRACT CLASS USING INHERITANCE. BUT WE CANNOT MAKE A CONSTRUCTOR AS ABSTRACT
  --->to support constructor chaining we can give constructor in abstract class
  
  WHAT AN ABSTRACT CLASS CAN HAVE?
  1.static vars
  2.static blocks
  3.static methods
  4.instance vars
  5.instanace blocks
  6.instance methods
  7.constructors ...same as nrml class ...the only difference is we cannot able to create object for abstract class like nrml class
  
  
  WE CAN MAKE CLASS AS ABSTARCT
  WE CAN MAKE METHOD AS ABSTRACT
  WE CANNOT MAKE VARAIBLES AS ABSTRACT 
  WE CANNOT MAKE CONSTRUCTORS AS ABSTRACT
 */

package corejavaabstraction;
abstract class parent34
{ 
	parent34()
	{
		System.out.println("constructor inside parent class");
	}
	
}
class child34 extends parent34
{
	 child34()
	 {
		 //first statement is super(); by default if we do not give this() or super() explicitly so it parent class constructor is executed
		 System.out.println("constructor inside child class");
	 }
	 
	 //abstract child34(); we are not able to do this ...we cannot make constructor as abstract
}

public class ConstructorAbstraction {
	public static void main(String []args)
	{
		child34 c=new child34();
	}

}
