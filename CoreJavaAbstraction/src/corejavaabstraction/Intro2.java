/*
  impure abstraction: the class is atleast one complete mthod it is called abstract class

  pure abstraction: the class is having only abstract methods is called pure abstraction
  
  we cannot able to create object for incomplete methods 
  
  
 */

package corejavaabstraction;
abstract class Calculator
{
	void add()
	{
		System.out.println("ADD" +(100+200));
	}
	void sub()
	{
		System.out.println("SUB" +(200-100));
	}
	void mul()
	{
		
	}
	void div()
	{
		
	}
}

public class Intro2 {
	public static void main(String []args)
	{
		Calculator calc=new Calculator();
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}

}
