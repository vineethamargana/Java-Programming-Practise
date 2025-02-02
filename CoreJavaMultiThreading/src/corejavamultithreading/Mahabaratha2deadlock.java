/*
  DEAD LOCK condition:
 ---------------------
 two or more threads who are in the block state who are dependending on each other remain in the
 block state forever is called dead lock condition.
 
 Interdependency:
 depending on each other
 ex: 448,449
 
 live lock:
-------------
 the threads will be executing and running from one state to another ,they are not blocked
 but they are running but they will never go to the dead state.
 
 
 Starvation:
------------- 
the thread wants to get a chance to exceute but it doesnot go there ..it is starving or hungry to exceute

 */

/*
 Producer and consumer problem:
--------------------------------
 */


package corejavamultithreading;
class Warrior1 extends Thread
{
	String res1="Brahmastra";
	String res2="Pasupathsra";
	String res3="Sarpassthra";
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		if(name.equals("Arjuna"))
		{
			arjuna();
		}
		else
		{
			karna();
		}
	}
	public void arjuna()
	{
		try 
		{
		
			Thread.sleep(3000);
			synchronized (res1) 
			{
				System.out.println("arjuna acquired "+res1);
				Thread.sleep(3000);
				synchronized (res2)
				{
					System.out.println("arjuna acquired "+res2);
					Thread.sleep(3000);
				}
				synchronized (res3)
				{
					System.out.println("arjuna acquired "+res3);
					Thread.sleep(3000);
				}	
			}	
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void karna()
	{
		try 
		{
		
			Thread.sleep(3000);
			synchronized (res3) 
			{
				System.out.println("karna acquired "+res3);
				Thread.sleep(3000);
				synchronized (res2)
				{
					System.out.println("karna acquired "+res2);
					Thread.sleep(3000);
				}
				synchronized (res1)
				{
					System.out.println("karna acquired "+res1);
					Thread.sleep(3000);
				}	
			}	
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	 
		
	}
}


public class Mahabaratha2deadlock {
	public static void main(String []args)
	{
		Warrior1 w1=new Warrior1();
		Warrior1 w2=new Warrior1();
		w1.setName("Arjuna");
		w2.setName("Karna");
		w1.start();
		w2.start();
		
		
	}


}
