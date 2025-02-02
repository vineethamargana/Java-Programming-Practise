package corejavaabstraction;

import java.util.Scanner;
abstract class Inherit
{
   float area;
   abstract void acceptInput();
   abstract void calcArea();
   void dispArea()
	{
		System.out.println("The area is " +area);
	}
}
class Square extends Inherit
{
	private float side; //encapsulation
	//private float area;
	void acceptInput()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the side:");
	  side=sc.nextFloat();
	}
	void calcArea()
	{
		area=side*side;
	}
	/*void dispArea()
	{
		System.out.println("The area is" +area);
	}*/
	
}
class Rectangle extends Inherit
{
	float length;
	float width;
	//float area;
	void acceptInput()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the length:");
	  length=sc.nextFloat();
	  System.out.println("enter the width:");
	  width=sc.nextFloat();
	}
	void calcArea()
	{
		area=length*width;
	}
	/*void dispArea()
	{
		System.out.println("The area is" +area);
	}*/
	
}
class Circle extends Inherit
{
	float radius;
	//double area;
	void acceptInput()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the radius:");
	  radius=sc.nextFloat();
	}
	void calcArea()
	{
		area=(3.14f*radius*radius);
	}
	/*void dispArea()
	{
		System.out.println("The area is" +area);
	}*/	
}
class Poly
{
	void calculation(Inherit in)
	{
		in.acceptInput();
		in.calcArea();
		in.dispArea();
	}
}
public class Pillars4class {
	public static void main(String []args)
	{
		Square s=new Square();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Poly p=new Poly();
		p.calculation(s);
		System.out.println("-------------------");
		p.calculation(r);
		System.out.println("-------------------");
		p.calculation(c); 
		
	}

}
