package corejavamultithreading;
class Bathroom0
{
	 void bathroom() //multiple threads can access
	{
		try 
		{
			//Thread t=Thread.currentThread(); 
			//t.getName();
			//or
			//String t=Thread.currentThread().getName();
			String name=Thread.currentThread().getName();
			System.out.println(name+" is executing stmt1");
			Thread.sleep(3000);
			System.out.println(name+" is executing stmt2");
			Thread.sleep(3000);
			System.out.println(name+" is executing stmt3");
			Thread.sleep(3000);
			System.out.println(name+" is executing stmt4");
			Thread.sleep(3000);
			System.out.println(name+" is executing stmt5");
			Thread.sleep(3000);
		synchronized(this) // synchronised block //only one thread can access ...observe the output also in synchronization to understand well
		{
			System.out.println(name+" is executing stmt6");
			Thread.sleep(3000);
			System.out.println(name+" is executing stmt7");
			Thread.sleep(3000);
			System.out.println(name+" is executing stmt8");
		}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
class Boy0 extends Thread
{
	Bathroom0 ba;
	@Override
	
	public void run() {
		ba.bathroom();
	}
	public Boy0(Bathroom0 ba)
	{
		this.ba=ba;
	}
}
class Girl0 extends Thread
{
	Bathroom0 ba;
	@Override
	public void run() {
		ba.bathroom();
	}
	public Girl0(Bathroom0 ba)
	{
		this.ba=ba;
	}
}
class Others0 extends Thread
{
	Bathroom0 ba;
	@Override
	public void run() {
		ba.bathroom();
	}
	public Others0(Bathroom0 ba)
	{
		this.ba=ba;
	}
}

public class Synchronization2 {
	public static void main(String []args)
	{
		Bathroom0 ba=new Bathroom0();
		Boy0 b=new Boy0(ba);
		Girl0 g=new Girl0(ba);
		Others0 o=new Others0(ba);
		
		b.setName("Boy");
		g.setName("Girl");
		o.setName("others"); 
		
		  b.start();
		  g.start();
		  o.start();
		
	}

	

}
