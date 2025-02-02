
/*
 * METHOD HIDING:
 1. static methods CAN BE INHERITED
 2. static methods CANNOT BE OVERRIDEN
 when we try to override the static method the inherited method will get hidden and the method acts like specilised method
 so we cannot override the static method
 
 */

package corejavaInheritance;
class Parent56
{
	static void disp()
	{
		System.out.println("hii");
	}
}
class Child56 extends Parent56
{
	//@Override
	//WITHOUT GIVING OVERRIDE AS ABOVE IT ACTS LIyKE SPECIALIZED METHOD AND CAN NOT GIVE ERROR
	//BUT WE CANNOT OVERRIDE STATIC METHODS
	static void disp()
	{
		System.out.println("hELLO");
	}
}

public class MethodHiddingFinalKeyword1 {
	public static void main(String []args)
	{
		Child56.disp();
	}

}
