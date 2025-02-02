
/*
  java compiler will only insert constructor when only if u didnt give the constructor


 */

package corejavaEncapsulation;
class Bank4
{
	private int accNo;
	private int passwd;
	/*public Bank4()
	{
		System.out.println("constructor is executed");
	}*/
	public Bank4(int accNo,int passWd)
	{
		this.accNo=accNo;
		this.passwd=passWd;
		
	}
	public Bank4()
	{
		this(78, 67);
		//if you remove this ,constructor then we will get error.
	}
	public int getAccNo() {
		return accNo;
	}
	public int getPasswd() {
		return passwd;
	}
	
}

public class Encapsulation_localChaining2 {
	public static void main(String []args)
	{
		Bank4 b1=new Bank4(56,7879);
		System.out.println(b1.getAccNo());
		System.out.println(b1.getPasswd());
		Bank4 b2=new Bank4();
		System.out.println(b2.getAccNo());
		System.out.println(b2.getPasswd());
	}

}
