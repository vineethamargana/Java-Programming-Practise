/*
 * redundant code mean repeated code.
 *  private methods cannot be inherited and we cannot able to call them without creating object  like static methods
 *  private methods are used to remove code redundancy.
 *  it is started from jdk9
 *  so we can give static,public,default to methods in interfaces
 *  
 *  
 *  static members cannot access static members but non static members can able to access static methods
 */

package corejavaabstraction;

interface Demo01
{
	//default void personallifeofStudent()
	static void personallifeofStudent()
	{
		redundantCode();
	}
	//default void professionalStudent()
	static void professionalStudent()
	{
		redundantCode();
	}
	// static void redundantCode()
	private static void redundantCode()
	{
		System.out.println("wake up with phn");
		System.out.println("sctivity with mobile");
		System.out.println("eat and sleep with mobile");
	}
}
class Demo02 implements Demo01
{
	
}

public class Defaultex2 {
	public static void main(String []args)
	{
		Demo02 d2=new Demo02();
		d2.personallifeofStudent();
		d2.professionalStudent();
		d2.redundantCode();
		
	}

}
