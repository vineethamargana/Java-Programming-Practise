
/*
 * static segment is also called as method area or metaspace
 * earlier it is called as permanent generation
 * 
  things to remember:
  --->as when we give code to the javacompiler ...javacompiler creates equal number of .class files were created for how many classes u have given
  ex:
  if u give two classes in a program i.e ----this is in the form of byte code
  1.class demo =---demo.class
  2.class test =---test.class
  
  jvm converts the byte code to machine level language 
  and it is given to ram which is having segments.
  
  then the jvm only takes the class which is having main method.
  then when it start executing if it wants other classes it asks the class loadder to load the required class
  
  
  1.what java needs which class that only loaded.
  2.and first time when class is loaded jvm checks for
  -.static variables
  -.static blocks
  -.static methods ...i.e in frst class it is main method
  3.and with the help of class loader it loads the nxt class
    when it loads the class second time it again checks for
   -.static variables
  -.static blocks
  -.static methods 
  4.and it follows the main method.
  5.also before calling the constructor it checks for the instance blocks and executes 
    the instance blocks afterr that constructor is loaded
     i.e after object creation and before constructor calling
     as per the program at last it execute fun2 method.
     
     
     class members:
     1.static varaibles
     2.static methods
     3.static blocks
     
     object members:
     1.instance variables
     2.instance methods
     3.instance blocks
     4.constructors
  
 */

package corejavastatic;
class Test
{
	//static variables
		static int a; //here the font of instance and static variables are diferent
		static int b;
		
		//static block
		static 
		{
			System.out.println("Inside static Block");
			a=10;
			b=20;
		}
		
		//static methods
		static void fun1()
		{
			System.out.println("inside static method");
		}
		
		
		//instance vaiables---which are present directly inside a class --- or non static variables
		int x;
		int y;
		
		//instance block ---or non static block
		{
			System.out.println("inside instance block ");
		}
		
		//instance methods
		void fun2()
		{
			System.out.println("Inside instance method");
		}
		
		//constructor
		Test()
		{
			System.out.println("inside constructor");
			x=30;
			y=70;
		}
}

public class Static1 {
	public static void main(String[] args)
	{
		Test.fun1(); //for static methods we dont have to create the object. 
		//Test.fun2(); //we can see it doesnot work for instance methods.
		Test t=new Test();
		t.fun2();
	}
	
}
/*
 Inside static Block
inside static method
inside instance block 
inside constructor
Inside instance method
*/
