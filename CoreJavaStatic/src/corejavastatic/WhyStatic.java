
/*
  
 */

//simple interst program

package corejavastatic;

import java.util.Scanner;

class Farmer
{
	float p; //principle amount
	float t; //time
	float r; //rate of interest
	float si;
	void acceptInput() //with out using any method we cant able to use print statement
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the principle amount");
	p=sc.nextFloat();
	System.out.println("enter the time duration");
	t=sc.nextFloat();
	r=2.5f;
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

public class WhyStatic {
	public static void main(String []args)
	{
		Farmer f1=new Farmer();
		f1.acceptInput();
		f1.calculate();
		f1.display();
	    System.out.println();
		Farmer f2=new Farmer();
		f2.acceptInput();
		f2.calculate();
		f2.display(); 
		
	}
  
}
