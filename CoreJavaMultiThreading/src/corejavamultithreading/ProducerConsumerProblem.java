/*
  Wait() and notify() are the two methods used in the producer and consumer problem which are used o built the communication between the threads
  these methods should be given in synchromised environment.
 */

package corejavamultithreading;
class Queue
{
	private int data;
    boolean dataIsPresent=false;
	public synchronized void setData(int data)
	{
		if(dataIsPresent==false)
		{
			this.data = data;
			System.out.println("producer produced"+data);
			dataIsPresent = true;
			notify(); //method from the object so we can call directly
		}
		else
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public synchronized void getData() 
	{
		if(dataIsPresent==true)
		{
			System.out.println("consumer consumes"+data);
		    dataIsPresent = false;
		    notify(); //method from the object so we can call directly
		}
		else
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
		
}
class Producer extends Thread
{
	Queue q;
	public Producer(Queue q)
	{
		this.q=q;
	}
	@Override
	public void run() {
		int i=1;
		for( ; ; )
		{
		   q.setData(i++);
		}
	}
	
}
class Consumer extends Thread
{
	Queue q;
	public Consumer(Queue q)
	{
		this.q=q;
	}
	@Override
	public void run() {
		
		for(;;)
		{
			q.getData();
		}
	}
}

public class ProducerConsumerProblem {
	public static void main(String []args)
	{
		Queue q=new Queue();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		p.setName("Producer");
		c.setName("Consumer");
		
        p.start();
        c.start();
	}

}
