
/*
  HEIRACIAL INHERITANCE


 */

package corejavaInheritance;
class Parent4
{
	float height=5.8f;
	void drinkmoreWater()
	{
		System.out.println("I will drink 4 literes water everyday");
	}
}
class Child4 extends Parent4
{
	
}
class Child5 extends Parent4
{
	
}
class Child6 extends Parent4
{
	
}

public class HeirarcialInheritance {
	public static void main(String []args)
	{
		Child4 c4=new Child4();
		Child5 c5=new Child5();
		Child6 c6=new Child6();
		
		System.out.println(c4.height);
		c4.drinkmoreWater();
		System.out.println(c5.height);
		c5.drinkmoreWater();
		System.out.println(c6.height);
		c6.drinkmoreWater();
	}

}
