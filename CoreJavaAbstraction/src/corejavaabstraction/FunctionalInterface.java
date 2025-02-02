
/*
  functional interfaces:

  functional interfaces are such interfaces which are having only one abstract method.
  and it can have another methods such as static methods,private methods,default methods,private static methods
  
  some of the inbuild functional interfaces are:
  1.Runnable
  2.Prediacte
  3.Supplier
  
  nested class or inner class:
  the class inside an other class is called nested class also ccalled as inner class.
  this is more secure...ex:attached bathroom
  
  anonyous inner or anonymous class: ex:attached washroom with no toilet board.
  we cannot create the object of anonymous like inner and outer class 
  whenever we create anonymous class we have to create the object while creating the class itself
  and we have to end it with semicoloumn.
  
  lamba expression:
  ()-> it is denoted as shown ...ends with semicoloumn.
  ()--- it is method in functional interface.
  we can give the parameters in the ()
  ex:(int a)
  so that we have to give void disp(int a);
  and d.disp1(10)
  it can be done by three ways.
  LAMBA EXPRESSIONS ONLY WORK FOR FUNCTIONAL INTERFACES ...SO THAT WE CAN IMPLEMENT THE 
  INTERFACE HAVING ONLY ONE ABSTARCT METHOD
  
  ---> inner and anonymous classes are created in main method to implement interface.
  ...
  1.implementing outer class
  2.implementing inner class ...more secure than outer class
  3.implementing annoynous inner class
  4.lamba expression
 */
package corejavaabstraction;

//@FunctionalInterface
interface Display
{
	void disp1(int a);
	//void disp1();
	/*static void dis2()
	{
		
	}
	private void disp2()
	{
		
	}*/	
}
/*class Demo00 implements Display
{
	@Override
	public void disp1()
	{
		System.out.println("hello");
	}
}*///outer class


public class FunctionalInterface {

	public static void main(String[] args) {
		//inner class
		/*class Demo00 implements Display
		{
			@Override
			public void disp1()
			{
				System.out.println("hello");
			}
		}
		Display d=new Display();
		d.disp;
	   */
		
		//anonymous class
		/*Display d=new Display() //class and object together 
		{
			@Override
			public void disp1()
			{
				System.out.println("hello");
			}
		};
		d.disp1();
		*/
		//lamba expression
		/*Display d=(int a)->{ System.out.println("hello"); };
		d.disp1(10);*/
		/*Display d=(a)->{ System.out.println("hello"); };
		d.disp1(10);*/
		Display d=a->{ System.out.println("hello"); };
		d.disp1(10);
	
		
	}

}
