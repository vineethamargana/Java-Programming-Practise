package corejavapolymorphism;
class Plane17
{
	void fly()
	{
		System.out.println("planes flies");
	}
}
class Cargoplane17 extends Plane17
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
class PassengerPlane17 extends Plane17
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
class FighterPlane17 extends Plane17
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

public class Poly3 {
	public static void main(String []args)
	{
	Plane17 ref;
	Plane17 ref1=new Cargoplane17();//Cargoplane17 cp
	PassengerPlane17 pp =new PassengerPlane17();//PassengerPlane17
	FighterPlane17 fp=new FighterPlane17();
	
	/*cp.fly();
	pp.fly();
	fp.fly();*/ 
	//by this we have tight coupling ...means child object having child reference
	
	/*ref=cp;
	ref.fly();
	((Cargoplane17)(ref)).carryCargo();*/
	ref1.fly();
	((Cargoplane17)ref1).carryCargo();
	ref=pp;
	ref.fly();
	((PassengerPlane17)(ref)).carryPassenger();
	ref=fp;
	ref.fly(); //loose coupling 
	((FighterPlane17)(ref)).carryWeapens();
	}

}
