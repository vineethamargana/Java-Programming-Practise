
/*
 * advantages of polymorphism:
 * 1.code flexibilty...the code is flexibile for all objects. ex: like job lo timings ..oue avalaibility
 * 
 */
package corejavapolymorphism;
class Plane18
{
	void fly()
	{
		System.out.println("planes flies");
	}
}
class Cargoplane18 extends Plane18
{
	@Override
	void fly() {
		System.out.println("cargo plane flies at low heights");
	}
	void carryCargo()
	{
		System.out.println("cargo plane carry cargo");
	}
}
class PassengerPlane18 extends Plane18
{
	@Override
	void fly() 
	{
		System.out.println("passenger plane flies at medium heights");
	}
	void carryPassenger()
	{
		System.out.println("carry passengers to differrent places");
	}
}
class FighterPlane18 extends Plane18
{
	@Override
	void fly() {
		System.out.println("Fighter plane flies at higher heights");

	}
	void carryWeapens()
	{
		System.out.println("carry weapons for military");
	}
}
class Airport
{
	static void permit(Plane18 ref) //as we made it static object need not be created
	{
		ref.fly();
	}
}


public class Poly4 {
	public static void main(String []args)
	{
	Plane18 ref;
	Cargoplane18 cp=new Cargoplane18();
	PassengerPlane18 pp=new PassengerPlane18();
	FighterPlane18 fp=new FighterPlane18(); 
	
	ref=cp;
	((Cargoplane18)ref).carryCargo();
	//Airport a=new Airport();
	Airport.permit(cp);
	Airport.permit(pp);
	Airport.permit(fp);
	}


}
