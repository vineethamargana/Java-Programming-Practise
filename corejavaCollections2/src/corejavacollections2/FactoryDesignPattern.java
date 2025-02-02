/*
  FACTORY DESIGN PATTERN:
  -----------------------
 1. it is acheived by polymorphism.
 */

package corejavacollections2;
interface Animal
{
	
}
class AnimalFactory
{
	static Animal createInstance(String name)
	{
		if(name.equalsIgnoreCase("Dog"))
		{
			return new Dogg();
		}
		else if(name.equalsIgnoreCase("Cat"))
		{
			return new Catt();
		}
		else if(name.equalsIgnoreCase("Rat"))
		{
			return new Ratt();
		}
		
		return null;
	}
}
class Dogg implements Animal
{
	
}
class Catt implements Animal
{
	
}
class Ratt implements Animal
{
	
}

public class FactoryDesignPattern {
	public static void main(String[] args)
	{
		Animal dog =AnimalFactory.createInstance("dog");
		Animal cat=AnimalFactory.createInstance("cat");
		Animal rat=AnimalFactory.createInstance("rat");
		Animal lion=AnimalFactory.createInstance("lion");
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(rat);
		System.out.println(lion);
		
	}

}
