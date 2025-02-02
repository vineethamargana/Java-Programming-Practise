package corejavamultithreading;
class Warrior extends Thread
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
			synchronized (res1) 
			{
				System.out.println("karna acquired "+res1);
				Thread.sleep(3000);
				synchronized (res2)
				{
					System.out.println("karna acquired "+res2);
					Thread.sleep(3000);
				}
				synchronized (res3)
				{
					System.out.println("karna acquired "+res3);
					Thread.sleep(3000);
				}	
			}	
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
}

public class Mahabaratha {
	public static void main(String []args)
	{
		Warrior w1=new Warrior();
		Warrior w2=new Warrior();
		w1.setName("Arjuna");
		w2.setName("Karna");
		w1.start();
		w2.start();
		
		
	}

}
