
//encapsulation using conventions:
//shadowing problem
//this is reference to an object which is given by java.
//getter should match with instance variables.
//we can use multiple setters and getters i.e equal no of setters and getters.

package corejavaEncapsulation;
class Bank1
{
	private int an;
	private int pw;
	public void setter(int an,int pw)
	{
		this.an=an;//right side instance variable and left side local varable.
		this.pw=pw;//if we dont put this the output we will get is 0 and 0. because of shadowing problem.
	}
	public int getAn()
	{
		return an;
	}
	public int getId()
	{
		return pw;
	}
}

public class Encapsulation_LocalChaining 
{
	public static void main(String []args)
	{
		Bank1 b=new Bank1();
		b.setter(314, 6578);
		System.out.println(b.getId());
		System.out.println(b.getAn());
	}

 
}

