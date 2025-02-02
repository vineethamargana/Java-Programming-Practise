
/*Interfaces:
 -----------
 * interface and implements are two keywords related to each other and related to one another
 * interface is a collection of pure abstract methods.
 * interface contains incomplete methods ie abstract methods...that means the method with only
 * signature...but no method body
 * but it is not necessary to tell the method signature as abstract we if want to give we can give 
 * interrface means abstract so it is not necessary 
 * 
 * we can create reference for inteface
 */
package corejavaabstraction;

import java.util.Scanner;

interface Calculation
{
	void add();
	abstract void sub();
}
class Mycalc1 implements Calculation
{
	public void add() {
		System.out.println(100+200);

	}
	public void sub() {
		System.out.println(200-100);
	}
	
}
class Mycalc2 implements Calculation
{
	public void add() 
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public void sub()
	{
		int a=90;
		int b=80;
		System.out.println(a-b);
	}
	
}
class Mycalc3 implements Calculation
{
	public void add() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+b);
	}
	public void sub() 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a-b);
	}
	
}
class Casio
{
	void calculator(Calculation c)
	{
	      c.add();
	      c.sub();
	}
}
public class Interface1 {
	public static void main(String []args)
	{
		Mycalc1 mc1=new Mycalc1();
		Mycalc2 mc2=new Mycalc2();
		Mycalc3 mc3=new Mycalc3();
		
		/*mc1.add();
		mc1.sub();
		System.out.println("-----------------");
		mc2.add();
		mc2.sub();
		System.out.println("-----------------");
		mc3.add();
		mc3.sub();*/ // no polymorphism
		
		Casio ca=new Casio();
		ca.calculator(mc1);
		ca.calculator(mc2);
		ca.calculator(mc3); //polymorphism achieved
		
	}

}
