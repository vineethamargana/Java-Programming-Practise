/*
  ABSTRACT AND FINAL:

  
 ABSTRACT:
 1.we can give it to class
 2.we can give it to method
 3.we cannot give it to the varaibles and constructor
 
 FINAL:
 1.we can give it to class
 2.we can give it to method
 3.we can give it to the varaibles 
 
 ABSTRACT AND FINAL COMBO:
 
 we cannot we the final and abstract combination to any one
 --->by using final keyword we cannot able to inherit or modify the class 
 as abstract class is incomplete ...in java we cannot able to create object to incomplete class...if anyone want to complete the complete we use inheritance
 but by making the abstract class final one can not able to inherit it...so we cannot make abstract class as final 
 same for methods and variables also:
 by making abstract method as final we cannot able to override it.
 */

package corejavaabstraction;
final class Demo
{
	
}
abstract class Demo1
{
	
}
abstract final class Demo2
{
	
}

public class AbstractAndFinalCombo {
	public static void main(String []args)
	{
		
	}

}
