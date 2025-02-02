
/*
  who can access static variables: ANY ONE CAN ACCESS STATIC VARIABLES
  1.static blocks
  2.static methods
  3.instance blocks
  4.instance methods
  5.constructor
  
  who can access instance variables:
  1.accept static family all can access
  STATIC FAMILY CAN NOT ACCESS INSTANCE FAMILY
  
  WHY?
  A:because without creating memory we cannot access them
  
  WHO CANNOT ACCESS INSTANCE variables:
  1.static blocks
  2.static methods  
 */

package corejavastatic;
class Access
{
	//int a,b;
	static int a,b;
	static
	{
		a=10;
		b=20;
	}
	static void met()
	{
		a=30;
		b=40;
	}
	
	{
		a=67;
		b=57;
	}
	void met2()
	{
		a=78;
		b=90;
	}
	Access()
	{
		a=90;
		b=78;
	}
}
public class AccessingStaticvariables {
	public static void main(String []args)
	{
		Access a=new Access();
	}

}
