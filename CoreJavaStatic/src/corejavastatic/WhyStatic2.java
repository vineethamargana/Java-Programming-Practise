
/*
   using static: to utilise the memory efficiently we have to use static
   who is common for all the objects he shoould be take as static
   ex:nationality---for the aadhar card creation for different people
   rate of interest for farmers as shown below
   college name for same college students 
   
 */

package corejavastatic;

import java.util.Scanner;

class Farme
{
	float p; //principle amount
	float t; //time
	static float r; //rate of interest
	float si;
	
	static 
	{
		r=2.5f; // it takes only 4 bytes for the entire program by using static
		//to this the memory is created in method area i.e static segment 
		//which takes the very less memory for the entire program as r should be hardcoded by us;
	}
	void acceptInput() //with out using any method we cant able to use print statement
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the principle amount");
	p=sc.nextFloat();
	System.out.println("enter the time duration");
	t=sc.nextFloat();
	
	/*r=2.5f; 
	it takes more space as objects are created more.
	i.e 4*30,000(if 30,000 farmer objects are created)
	*/
	}
	void calculate()
	{
	  si=(p*t*r)/100;
	}
	void display()
	{
		System.out.println("the simple interest is:"+si);
	}
	
}

public class WhyStatic2 {
	public static void main(String []args)
	{
		Farme f1=new Farme();
		f1.acceptInput();
		f1.calculate();
		f1.display();
	    System.out.println();
		Farme f2=new Farme();
		f2.acceptInput();
		f2.calculate();
		f2.display(); 
		
	}
}
