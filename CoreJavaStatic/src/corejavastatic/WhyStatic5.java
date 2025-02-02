
/*
  can we give static to local variables
  ans:no
  why?
  because they are belongs to class ...they belongs to class members.
  
  can we initialize static variables in non static method
  ans:yes
 */

package corejavastatic;
class Demo11111
{
	static int b;
	void disp()
	{
		int a;
	}
}

public class WhyStatic5 {
	public static void main(String []args)
	{
		//Demo1 d=new Demo1();
		System.out.println("inside the main method");
	}

}
