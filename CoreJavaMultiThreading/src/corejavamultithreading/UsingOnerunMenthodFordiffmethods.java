package corejavamultithreading;
class Demoo1 extends Thread
{
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getThreadGroup());
		
	}
}
public class UsingOnerunMenthodFordiffmethods {
	public static void main(String []args)
	{
		Demoo1 d=new Demoo1();
		//d.setName("BABA");
		d.setPriority(3);
		d.start();
	}

}
