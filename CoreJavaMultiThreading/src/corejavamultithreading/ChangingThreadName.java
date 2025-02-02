package corejavamultithreading;
/*class Demoo extends Thread
{
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println(t);
	}
}*/
class Demooo extends Thread
{
	@Override
	public void run() 
	{
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+ " is started to exceute");
		System.out.println(t.getName()+" is exceuting");
		System.out.println(t.getName()+" is exceuting");
		System.out.println(t.getName()+" is exceuting");
		System.out.println(t.getName()+" is exceuted");	
	}
}
public class ChangingThreadName {
public static void main(String []args)
{
	/*Demoo d=new Demoo();
	d.setName("BABA");
	d.start();*/
	Thread t=Thread.currentThread();
	System.out.println(t.getName()+" main is starting to exceute");
	System.out.println(t.getName()+" main is exceuting");
	System.out.println(t.getName()+" main is exceuting");
	
	Demooo d1= new Demooo();
	System.out.println(d1.isAlive());
	d1.start();
	System.out.println(d1.isAlive());
	try {
		d1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(d1.isAlive());
	System.out.println(t.getName()+" main is exceuting");
	System.out.println(t.getName()+" main is exceuted");
	
}
}
