/*
 Main method can be overloaded
 but the execution will only start from the main method which is having Srting args[].
 the main method with string args[] is compulsary
 */

package corejavamethodoverloading;

public class MethodOverloadingMainMethod_3 {
	
	public static void main(String []args)
	{
		System.out.println("String []args");
		main(); //we dont have to create an object as it is in the same class. object means giving reference to class.
	}
	public static void main()
	{
	  System.out.println("null");	
	}
	public static void main(int a)
	{
		System.out.println("int");
	}
	public static void main(int a,int b)
	{
		System.out.println("int and int");
	}

}
