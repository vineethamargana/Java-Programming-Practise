
/*
  this --- is a keyword
  this()--- is a this call
  this() should be the first statement in the constructor .
 */

package corejavaEncapsulation;
class Bank5
{
	private int accNo;
	private int passwd;
	public Bank5(int accNo,int passWd)
	{
		this();
		this.accNo=accNo;
		this.passwd=passWd;
	}
	public Bank5()
	{
		System.out.println("inside zerro-parameterr constructor");
	}
	public int getAccNo() {
		return accNo;
	}
	public int getPasswd() {
		return passwd;
	}
}
public class Encapsulationlocalchaining_3 {
	public static void main(String []args)
	{
		Bank5 b1=new Bank5(56,7879);
		System.out.println(b1.getAccNo());
		System.out.println(b1.getPasswd());
	}

}
