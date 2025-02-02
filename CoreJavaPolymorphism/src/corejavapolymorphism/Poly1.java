/*
 * ONE IS TO MANY IS CALLED POLYMORPHISM...it is a greek word ...we can also say child object parent reference.
 * EX:carbon,water etc
 TIGHT COUPLING: child object ...child reference
 LOOSE COUPLING: child object ...parent referrence ...POLYMORPHISM
 
 
 */

package corejavapolymorphism;
class Plane01
{
	void fly()
	{
		System.out.println("planes flies");
	}
}
class Cargoplane01 extends Plane01
{
	@Override
	void fly() {
		System.out.println("cargo plane flies at low heights");
	}
}
class PassengerPlane01 extends Plane01
{
	@Override
	void fly() {
		System.out.println("passenger plane flies at medium heights");
	}
}
class FighterPlane01 extends Plane01
{
	@Override
	void fly() {
		System.out.println("Fighter plane flies at higher heights");

	}
}
public class Poly1 {
	
	public static void main(String []args)
	{
		Plane01 ref;
		Cargoplane01 cp=new Cargoplane01();
		PassengerPlane01 pp=new PassengerPlane01();
		FighterPlane01 fp=new FighterPlane01();
		
		/*cp.fly();
		pp.fly();
		fp.fly();*/ 
		//by this we have tight coupling ...means child object having child reference
		
		ref=cp;
		ref.fly();
		ref=pp;
		ref.fly();
		ref=fp;
		ref.fly(); //loose coupling 
		
		
	}

}
