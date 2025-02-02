package javadaily;

public class MethodOverloading {
	class Calculator
	{
		
     	void add()
	    {
	       System.out.print(10+20);
	    }
     	int add(int a,int b)
     	{
     		return a+b;
     	}
     	float add(int a,float b)
     	{
     		return a+b;
     	}
     	double add(double a,double b)
     	{
     		return a+b;
     	}
	}
	public static void main(String args[])
	{
		Calculator calc=new Calculator( );
		System.out.println(calc.add(20,30));
	}   
}
