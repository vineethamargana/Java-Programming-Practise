
/*
  MULTILVEVEL:A parent can have only one direct child
  linear and involves at least 3 classes.  
 */
package corejavaInheritance;
class Grandparent2
{
	float height=5.7f;
	
	void exercise()
	{
		System.out.println("i will exercise daily");
	}
}
class parent2 extends Grandparent2
{
	
}
class Child2 extends parent2
{
	
}

public class MultilevelInheritance {
	public static void main(String []args)
	{
		Child2 c=new Child2();
		//parent2 c=new parent2();
		System.out.println(c.height);
		c.exercise();
	}

}
