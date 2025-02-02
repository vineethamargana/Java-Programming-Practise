
/*
  and also private members cannoy be inherited

  and constructors never get inherited but they will get executed because of super()
 */
package corejavaInheritance;
class GrandParen
{
	public GrandParen() {
        System.out.println("inside grandparent constructor");
	}
	public GrandParen(float a)
	{
		this();
		System.out.println("inside i param grandparent constructor");
	}
}
class paren extends GrandParentt
{
	public paren() {
		super(24.5f);
       System.out.println("inside parent constructor");
	}
	public paren(String a) 
	{
		//here super() is given by java it goes to non parameterised constructor
		this();
	    System.out.println("inside 1 param parent constructor");
	}
}
class chil extends parentt
{
	public chil() {
		super("max");
       System.out.println("inside child class");
	}
	public chil(int a) {
		   this();
	       System.out.println("inside 1 param child class");
		}
}

public class Constructor_chaining3 {
	public static void main(String []args)
	{
		chil c=new chil(11);
	}

}
