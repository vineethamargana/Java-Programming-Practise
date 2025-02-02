
/*
   is a relation--->inheritance ...arrow symbol
   has a relation---> Agregation and composition     
  
   aggregation ...loose bond ...diamond empty
   composition....tight bong...filled daimond
   we should follow encapsulation
 */

package AandC;
//Aggregation
class Charger
{
	private String brand;
	private float voltage;
	
	public Charger(String brand, float voltage)
	{
		super();
		this.brand = brand;
		this.voltage = voltage;
	}
	
	public String getBrand()
	{
		return brand;
	}
	public float getVoltage() 
	{
		return voltage;
	}
}

//composition
class Os
{
	private String name;
	private int size;
	public Os(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
}

class Mobile 
{
	Os o=new Os("android",1);//tight bond so create object
	void hasA(Charger c)
	{
	   System.out.println(c.getBrand());	
	   System.out.println(c.getVoltage());
	}
    
}

public class AandC1 {
	public static void main(String []args)
	{
		//mobile is there
		Charger c=new Charger("samsung",12.0f);
		Mobile m=new Mobile();
		System.out.println(m.o.getName());
		System.out.println(m.o.getSize());	
		m.hasA(c); //methods can also takes objects
		
		//mobile is gone
		m=null; //making mobile object garbage 
		//all of this does not work because we make the object empty 
		//System.out.println(m.o.getName());
		//System.out.println(m.o.getSize());
		//m.hasA(c);
		
		
	}

}
