/*
 * SYNCHRONIZATION:
it can be given to methods and also blocks.
 -------------------
 it means locking in java.
 semaphors or monitors:
 ----------------------
 set of instructions where in only one thread is exceuting at any point of time 
 */

package corejavamultithreading;
class Bathroom
{
	synchronized void bathroom()//synchronised method
	{
		try 
		{
			//Thread t=Thread.currentThread(); 
			//t.getName();
			//or
			//String t=Thread.currentThread().getName();
			String name=Thread.currentThread().getName();
			System.out.println(name+" has entered the bathroom");
			Thread.sleep(3000);
			System.out.println(name+" is using the bathroom");
			Thread.sleep(3000);
			System.out.println(name+" has exited from the bathroom");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
class Boy extends Thread
{
	Bathroom ba;
	@Override
	
	public void run() {
		ba.bathroom();
	}
	public Boy(Bathroom ba)
	{
		this.ba=ba;
	}
}
class Girl extends Thread
{
	Bathroom ba;
	@Override
	public void run() {
		ba.bathroom();
	}
	public Girl(Bathroom ba)
	{
		this.ba=ba;
	}
}
class Others extends Thread
{
	Bathroom ba;
	@Override
	public void run() {
		ba.bathroom();
	}
	public Others(Bathroom ba)
	{
		this.ba=ba;
	}
}
public class Synchronization1 {
	public static void main(String []args)
	{
		Bathroom ba=new Bathroom();
		Boy b=new Boy(ba);
		Girl g=new Girl(ba);
		Others o=new Others(ba);
		
		b.setName("Boy");
		g.setName("Girl");
		o.setName("others");
		/*
		  b.start();
		  g.start();
		  o.start();
		 */
		
		/*try {
			b.start();
			b.join(); // join method halts the other operation upto the last statement exceutes in start methods from boy
			g.start();
			g.join();
			o.start();
			o.join();
			
		} 
		catch (Exception e) {
			// TODO: handle exception
		}*/
		
		  b.start();
		  g.start();
		  o.start();
		
	}

}
