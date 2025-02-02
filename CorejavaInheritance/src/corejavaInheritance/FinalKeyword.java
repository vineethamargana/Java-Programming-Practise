
/*
  final ---> keyword
  1.by giving final to a varaible we have make it consTANT WE CANNOT CHANGE IT FURTHER
  2.by giving final to method we can inherit the methods we cannot override it
  3.we cannot able to inherit a class which is having final
  
  
  USE SUPER KEYWORD TO GET THE PARENT CLASS VARIABLE VALUE 
  EX. 
  int i=9;
  void disp()
  {
  s.op(i); it contains 9
  s.o.p(super.i) it contains the value which is given in parent class//this  ...in the child class ...if we want parent class value
  } 
 */

package corejavaInheritance;

//using final for variables
class Display1
{
	int k=9;
	final float PI=3.14f;
	void change()
	{
		//PI=4.14f; // we cannot able change the values which is givem by final
		k=89;
		System.out.println(PI);
		System.out.println(k);
	}
}

//using final for methods
class parent98
{
	final void disp()
	{
		System.out.println("ji");
	}
}
class child98 extends parent98
{
	/*final void disp()
	{
		System.out.println("ji");
	}*/
	
}

// using final for class
final class Parent78
{
	
}
/*class child78 extends Parent78
{
	
}*/


public class FinalKeyword {
	public static void main(String []args)
	{
		Display1 d=new Display1();
		d.change();
	}

}
