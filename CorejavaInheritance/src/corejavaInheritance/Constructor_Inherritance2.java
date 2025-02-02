package corejavaInheritance;
class GrandParentt
{
	public GrandParentt() {
        System.out.println("inside grandparent constructor");
	}
	public GrandParentt(float a)
	{
		System.out.println("inside i param grandparent constructor");
	}
}
class parentt extends GrandParentt
{
	public parentt() {
       System.out.println("inside parent constructor");
	}
	public parentt(String a) 
	{
		//here super() is given by java it goes to non parameterised constructor
		super(24.5f);
	    System.out.println("inside 1 param parent constructor");
	}
	
}
class childd extends parentt
{
	public childd() {
       System.out.println("inside child class");
	}
	public childd(int a) {
		//here super() is given by java it goes to non parameterised constructor
		//super(24.5f); //we cannot able to this
		   super("max");
	       System.out.println("inside 1 param child class");
		}
}
public class Constructor_Inherritance2 {
	public static void main(String []args)
	{
		childd c=new childd(11);
	}

}
/*
 * output:
inside grandparent constructor
inside parent constructor
inside 1 param child class

 */
