
/*march 14 ,2014 jdk new versions 
 * default methods (they have method body) should be only in interfaces. they will be inherited ,and also we can override them.
 * this is allowed to support the backward compatibility ...this is allowed from java 8 version.
 */
package corejavaabstraction;
interface SeaAnimals
{
	void eat();
	void swim();
	default void communicate()
	{
		System.out.println("sea animals communicate with each other");
	}
}
class Shark implements SeaAnimals
{
	@Override
	public void eat() {
		System.out.println("shark eats humans");	
	}
	@Override
	public void swim() {
		System.out.println("sharks swims faster");	
	}
}
class Dolphin implements SeaAnimals
{
	@Override
	public void eat() {
		System.out.println("dolphin no eats humans");	
	}
	@Override
	public void swim() {
		System.out.println("dolphins not swims faster");	
	}
	@Override
	public void communicate() {
		System.out.println("dolphin also communicate");
	}
	
}

public class InterfacewithDefaultmethods {
	public static void main(String []args)
	{
		Shark s=new Shark();
		Dolphin d=new Dolphin();
		s.eat();
		s.swim();
		s.communicate();
		d.eat();
		d.swim();
		d.communicate();
	}

}
