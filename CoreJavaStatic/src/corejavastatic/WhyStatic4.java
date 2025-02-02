package corejavastatic;
class Demo
{
	static
	{
		System.out.println("inside static block of demo");
	}
}

public class WhyStatic4 {
	public static void main(String []args)
	{
		//Demo d=new Demo();
		System.out.println("inside the main method");
	}

}

//output:1
//inside the main method
//output2:
//inside static block of demo
//inside the main method
