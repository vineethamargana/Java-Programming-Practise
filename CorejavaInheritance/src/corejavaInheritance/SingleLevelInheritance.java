
/*
   every class has properties (variables) and behaviour(methods).]
   
   SINGLE LEVEL INHERITANCE:
   one parent and one child.
   
 */

package corejavaInheritance;
class parent1
{
	float height;
	void noAlcohol()
	{
		System.out.println("i will not drink");
	}
}
class Child1 extends parent1
{
	
}

public class SingleLevelInheritance {
	public static void main(String []args)
	{
		Child1 c=new Child1();
		System.out.println(c.height);
		c.noAlcohol();
	}

}
