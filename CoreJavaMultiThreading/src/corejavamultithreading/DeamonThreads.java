/*
 * THERE ARE TWO TYPES OF THREADS IN JAVA:
 * 1.primary threads
 * 2.secondarey threads
 
 SECONDARY THREADS:(Deamon Threads) ex:garbage collector which is not created by us l
 THE THREADS WHICH ARE USED TO HELP THE THREADS ARE CALLED DEAMON THREADS.these are used to help primary threads and used to follow the primary threads.
 these are also called as HELPER THREADS and Supporting theards
 these are also called as DEAMON THREADS
 
 process of creating deamon:
 1.identify the primary and secondary threads.
 2.primary thread--->create secondary thread.
 3.setDeamon(true).
 */

package corejavamultithreading;
class Caption extends Thread
{
	@Override
	public void run() {
		System.out.println("caption enters the ground");
		try
		{
			BattingCoach b=new BattingCoach();
			b.setName("BattingCoach");
			
			Bollingcoach bc=new Bollingcoach();
			bc.setName("Bollingcoach");
			
			b.setDaemon(true);
			bc.setDaemon(true); // making them helpers
			
			b.start();
			bc.start();
			
			Thread.sleep(3000);
			System.out.println("caption will do warm-up");
			Thread.sleep(3000);
			System.out.println("caption will do catching");
			Thread.sleep(3000);
			System.out.println("caption will do coaching");
			Thread.sleep(3000);
			System.out.println("caption will do batting");
			Thread.sleep(3000);
			System.out.println("caption will do bowling");
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("handle it");
		}
		System.out.println("caption will go to hotel");
		
	}
}
class BattingCoach extends Thread
{
	@Override
	public void run() {
		for(;;)
		{
			System.out.println("batting coaching is in ground");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Bollingcoach extends Thread
{
	@Override
	public void run() {
		for(;;)
		{
			System.out.println("bowling coaching is in ground");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class DeamonThreads {
	public static void main(String []args)
	{
		Caption c=new Caption();
		c.setName("caption");		
		c.start();
		
		
	}

}
