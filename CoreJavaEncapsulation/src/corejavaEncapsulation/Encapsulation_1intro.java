
/*
 OOPS---OBJECT ORIENTED PROGRAMMING SYSTEM

 IT IS A SYSTEM WITH 4 PILLARS
 1.encapsulation
 2.inheritance
 3.polymorphism
 4.abstraction
 
 object is a instance of a class ...or it is a real entity of a class
 */
/*
   ENCAPSULATION:
   an object having important part ...giving security to it is called encapsulation
   
 */

package corejavaEncapsulation;
class Ac
{
	String coolant; // not giving security
}
class HumanBeing
{
	// giving securiy---50% of encapsulation
	private String brain;
	private String heart;
	// giving controlled access ---another 50% of encapsulation.
	//setters and getters are used to give comrolled access  they act like remote.
	public void setter(String x,String y)
	{
		brain =x;
		heart =y;
	}
	// getter names should be different like getter1 and getter2 like that
	public String  getter1()
	{
		return brain;
	}
	public String  getter2() 
	{
		return heart;
	}
}

public class Encapsulation_1intro {
	public static void main(String []args)
	{
		Ac a=new Ac();
		System.out.println(a.coolant);//output is null.
		HumanBeing hb=new HumanBeing();
		//System.out.println(hb.brain);//it will give error with out using setters and getters.
		//System.out.println(hb.brain);
		//System.out.println(hb.heart);// these also give error after using setter and getter in another class so we have to access them like below.
		hb.setter("grey", "red");
		System.out.println(hb.getter1());
		System.out.println(hb.getter2());
	}

}
