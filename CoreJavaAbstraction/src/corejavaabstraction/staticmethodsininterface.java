
/*
 * we cannot create object for interface ...we can give reference for interfaces
 * but using only references we cannot access the content ..it should have object
 *
 *so we can able to access the methods in java by making them as static (from java 8 version)
 *
 *static methods will get inherited by the other class but they cannot be overrided ...when we try to override it the 
 *inherited method will get hidded(method hidding).
 *
 *static methods in interface cannot be inherited so they also will not be overrided.
 *
 
 march 14 ,2014 jdk new versions
 
 */
package corejavaabstraction;
interface Demo11
{
	static  void disp()
	{
		System.out.println("hi");
	}
}
class Demo22 implements Demo11
{
	
}

public class staticmethodsininterface {
	public static void main(String args[])
	{
	   Demo11.disp();	
	}

}
