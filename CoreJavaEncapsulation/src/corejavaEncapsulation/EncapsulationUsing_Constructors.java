
/*
 Constructor:
 -----------
 
 constructor name is same as of class name without any return type.
 constructor is a specailised setter whose name is same as class name without any return type.
 if we give any return type it acts like method.
 
 there is no specialised getters like setter i.e constructor.
 
 constructor is called during the object creation.
 Setters are called after the object creation.
 
 if we havent created any constructor javacompiler will create a constructor which is called default-zero parameterised constructor.
 */

package corejavaEncapsulation;
class Bank3
{
	private int accNo;
	private int passwd;
	public Bank3(int accNo,int passwd)
	{
		this.accNo=accNo;
		this.passwd=passwd;
	}
	public int getAccNo() {
		return accNo;
	}
	public int getPasswd() {
		return passwd;
	}
	
}

public class EncapsulationUsing_Constructors 
{
	public static void main(String []args)
	{
      Bank3 b=new Bank3(232,345);   
      System.out.println(b.getAccNo());
      System.out.println(b.getPasswd());
	}
}

