
/*
   upcasting:
     -->implicit
     -->child object parent reference ...child to parent
     -->polymorphism 
     -->loose coupling all are same
   
   downcasting:
     -->explicit
     -->parent reference to child type
     -->making the parent to act like child
   
 */
package corejavapolymorphism;
class Parent17
{
	void cry()
	{
		System.out.println("parents should never cry");
	}
	void code()
	{
		System.out.println("parents dont know coding");
	}
}
class Child17 extends Parent17 
{
	@Override
	void cry() 
	{
		System.out.println("child01 cries at lower voice ");
	}
	@Override
	void code()
	{
		System.out.println("child01 knows java");
	}
}
class Child18 extends Parent17 
{
	@Override
	void cry() 
	{
		System.out.println("child02 cries at medium voice ");
	}
	@Override
	void code()
	{
		System.out.println("child02 knows c");
	}
}
class  Child19 extends Parent17
{
	@Override
	void cry()
	{
		System.out.println("child03 cries at higher voice ");
	}
	@Override
	void code()
	{
		System.out.println("child03 knows python");
	}
}
class Family
{
	void behave(Parent17 ref)
	{
		ref.cry();
		ref.code();
	}
}
public class Poly5 {
	 public static void main(String args[])
	   {
		   
		   Child17 c1=new Child17();
		   Child18 c2=new Child18();
		   Child19 c3=new  Child19();  
		   Family f=new Family();
		   f.behave(c1);
		   f.behave(c2);
		   f.behave(c3);
	   }

}
