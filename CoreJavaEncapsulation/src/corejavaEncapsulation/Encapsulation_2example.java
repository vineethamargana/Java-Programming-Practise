
/*
   bathroom in the home example
 */

package corejavaEncapsulation;
class Bank
{
	private int an;
	private int pw;
	public void setter(int x,int y)
	{
		an=x;
		pw=y;
	}
	public int getter1()
	{
		return an;
	}
	public int getter2()
	{
		return pw;
	}
}

public class Encapsulation_2example {
	public static void main(String []args)
	{
		Bank b=new Bank();
		b.setter(314, 6578);
		System.out.println(b.getter1());
		System.out.println(b.getter2());
	}

}
