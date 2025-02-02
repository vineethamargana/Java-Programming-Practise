
/*
we cannot able to create object for incomplete classes that is abstract classes


   
 */
package corejavaabstraction;
abstract class Bird
{
	abstract void eat();
	abstract void fly();
}
abstract class Eagle extends Bird
{
	@Override 
	void fly()
	{
		  System.out.println("eagle flies at higher heights");
	}	
}
class SerpantEagle extends Eagle
{
	@Override 
	void eat()
	{
		System.out.println("serpant eagle eats snakes");
	}
}
class GoldenEagle extends Eagle
{
	@Override 
	void eat()
	{
		System.out.println("golden eagle eats fishes");
	}
}
class BirdFamily
{
//	void behave(Bird b)
//	{
//		b.eat();
//		b.fly();
//	}
	void behave1(Eagle e)
	{
		e.eat();
		e.fly();
	}
}
public class Examplebird {
	public static void main(String []args)
	{
		SerpantEagle sp=new SerpantEagle();
		GoldenEagle gp=new GoldenEagle();
	  /*sp.eat();
		sp.fly();
		gp.eat();
		gp.fly(); */
		BirdFamily bf=new BirdFamily();
//		bf.behave(sp);
//		bf.behave(gp);
		bf.behave1(sp);
		bf.behave1(gp);
		
		
	}

}
