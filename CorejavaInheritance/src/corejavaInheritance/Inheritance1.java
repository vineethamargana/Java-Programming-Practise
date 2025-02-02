
/*
  inheritence :it is the process of one class acquiring the properties and behaviour of 
  another class.
  
  advantages:
  1.code reusability
  2.reduces development time and effort
  3.increases profitability.
 */

package corejavaInheritance;
class Parent
{
	//properties
	String skinColour="brown";
	float height=5.8f;
	String noseStructure="normal";
	//behaviour
	void noSmoke()
	{
		System.out.println("I will not smoke");
	}
	
}
class Child extends Parent //inheritance
{
	//whatever the parent class has that would be came to child class
}

public class Inheritance1 {
	public static void main(String []args)
	{
		Child c=new Child();
		System.out.println(c.skinColour);
		System.out.println(c.height);
		System.out.println(c.noseStructure);
		c.noSmoke();
	}

}
