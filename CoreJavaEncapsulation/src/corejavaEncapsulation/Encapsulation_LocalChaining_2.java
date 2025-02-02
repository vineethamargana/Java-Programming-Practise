package corejavaEncapsulation;
class Bank2
{
	private int an;
	private int pw;
	
	public int getAn() {
		return an;
	}
	public void setAn(int an) {
		this.an = an;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
}


public class Encapsulation_LocalChaining_2 {
	public static void main(String []args)
	{
		Bank2 b=new Bank2();
		b.setAn(314);
		b.setPw(678);
		System.out.println(b.getPw());
		System.out.println(b.getAn());
	}
	
}
