package corejavastatic;

public class WhyStatic3 {
	
	static int a; //declare here and initialize in static block for good programming practise
	static
	{
		a=78;
	}
	static 
	{
		//a=45; it can be initialised here also
		System.out.println(a);
	}
	static 
	{
		System.out.println("INDIA"); //as static blocks execute frst india will be printed first
		//rather than pakisthan
	}
	
	public static void main(String[] args)
	{
		System.out.println("PAKISTAN");
	}

}
