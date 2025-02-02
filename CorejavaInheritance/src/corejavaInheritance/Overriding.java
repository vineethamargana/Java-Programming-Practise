
/*
 * SEE THE TYPES OF METHODS INHERITANCE CLASS TO LEARN ABOUT CONVENTIONS
 * =====================================================================
 * 
 * 
  types of methods:
  1.inherited methods --- inherited from parent class to child class ... 
  we dont have to call them seperately in child class use the keyword extends the methods will automatically called
  2.overridden --- modified in child class which are inherited from parent class
  3.specialised --- not there in parent class and only there in child class
 */


package corejavaInheritance;
class Plane
{
	//methods which can be inherited
	void takeOff()
	{
		System.out.println("plane is taking off");
	}
	void fly()
	{
		System.out.println("plane flies");
	}
	void land()
	{
		System.out.println("plane lands");
	}
}
class CargoPlane extends Plane
{
	void fly()
	{
		System.out.println("passenger plane flies at low heights");
	}
	void carryCargo()
	{
		System.out.println("carries cargo");
	}
}
class passengerPlane extends Plane
{
	void fly() //overrided method
	{
		System.out.println("passenger plane flies at medium heights");
	}
	void carryPassenger() //speacilised method
	{
		System.out.println("carries passengers");
	}
	
}
class Fighterplane extends Plane
{
	void fly() //overrided method
	{
		System.out.println("passenger plane flies at higher heights");
	}
	void carryweapons() //speacilised method
	{
		System.out.println("carries weapons ");
	}
	
}



public class Overriding {
	public static void main(String []args)
	{
		CargoPlane c=new CargoPlane();
		passengerPlane p=new passengerPlane();
		Fighterplane f=new Fighterplane();
		
		
		c.takeOff();
		c.fly();
		c.land();
		c.carryCargo();
		System.out.println();
		p.takeOff();
		p.fly();
		p.land();
		p.carryPassenger();
		System.out.println();
		f.takeOff();
		f.fly();
		f.land();
		f.carryweapons();
		
	}

}
