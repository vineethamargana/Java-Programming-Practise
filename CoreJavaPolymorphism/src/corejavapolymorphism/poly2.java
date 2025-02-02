
/*
  CREATING SPECIALISED METHODS USING POLYMORPHISM
  --->we cannot able to access the specialised methods using parent references
  
  SO DO DOWN CASTING
  --->down casting means making the parent ref to act like child  ... it is like explicit type casting because explicitly we are making parent to behave like child
  
 ...> whenever there is a mathematical operation(+,-,*,/ etc) then the return type is always int ...so get byte as output we have to do explicit type casting
 */

package corejavapolymorphism;
class Parent01
{
	void cry()
	{
		System.out.println("parents should never cry");
	}
}
class Child01 extends Parent01
{
	@Override
	void cry() 
	{
		System.out.println("child01 cries at lower voice ");
	}
	void code()
	{
		System.out.println("child01 knows java");
	}
}
class Child02 extends Parent01
{
	@Override
	void cry() 
	{
		System.out.println("child02 cries at medium voice ");
	}
	void code()
	{
		System.out.println("child02 knows c");
	}
}
class Child03 extends Parent01
{
	@Override
	void cry()
	{
		System.out.println("child03 cries at higher voice ");
	}
	void code()
	{
		System.out.println("child03 knows python");
	}
}
public class poly2 
{
   public static void main(String args[])
   {
	   Parent01 ref;
	   Child01 c1=new Child01();
	   Child02 c2=new Child02();
	   Child03 c3=new Child03();
	   
	 /*c1.cry();
	   c2.cry();
	   c3.cry();*/
	   ref=c1;
	   ref.cry();
	   //ref.code(); //not possible because parents dont know the special talents of child
	   ((Child01)(ref)).code(); //telling the parent to act like child ...brackets are important
	   ref=c2;
	   ref.cry();
	   ((Child02)(ref)).code();
	   ref=c3;
	   ref.cry();
	   ((Child03)(ref)).code();
	   
	   
	   
   }
}
