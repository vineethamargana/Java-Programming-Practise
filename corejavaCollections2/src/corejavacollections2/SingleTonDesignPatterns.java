/*
    DESIGN PATTERN:
    ---------------
    it is proven solution for the existing problem.
    problem:
   .......... 
    when we tell the new to create an object more than one times it gives the different objects.
    we dont want different objects instead we should have the same object i.e the putputs of the more than one object should be same reference. 
     
    solution:
   ...........
   1.singleton design pattern 
   2.factory design pattern
   1.singleton design pattern:
   -------------------------------
     . should avoid anyone i.e programmer to create an object.
     .we know that constructor is the one the enables the creation of object.
     .so when we should build the constructor in such a way that "new " should not be able to access the constructor.
     .so make the constructor as private constructor.
     .and then we will not able to create an object for that class in other class.
     .so create the object in the same class in a method ,and make the method as static because if the
      method is instance we have to create the objecct of the class where the method is present.As we make the constructor as private wee cannot able to create
      the object so that we also cannot able to call the constructor. so make the method as static.
class Dog
{
	static Dog d;
	private Dog()
	{
		
	}
	static Dog getInstance() //we should make it as static because if it is instance we cannot able to access directly without creating object.
	{
		//static Dog d; //as static methods cannot able to access the instance mems we should make this as the static
		
		if(d==null) //first check whether the object is empty or not then only create the new object.
		{
			//Dog d=new Dog();
			d=new Dog();
			
		}
		return d;
		
	}
}	
      
    ---> there are two types of singleton patterns.
    ---------------------------------------------------
         1.early.
        ..........
            whenever the class is loaded that time the object should get created.this can be acheived by making the object as static.
            As we static members are same for all .it gives the same address.like below...
class Dog
{

	static Dog d=new Dog();
	private Dog()
	{
		
	}
	static Dog getInstance() //we should make it as static because if it is instance we cannot able to access directly without creating object.
	{
		return d;
	}
}
        
         2.lazy:
        ..........
        it is created after some time after class is loaded.
class Dog
{
	static Dog d;
	private Dog()
	{
		
	}
	static Dog getInstance() //we should make it as static because if it is instance we cannot able to access directly without creating object.
	{
		//static Dog d; //as static methods cannot able to access the instance mems we should make this as the static
		
		if(d==null) //first check whether the object is empty or not then only create the new object.
		{
			//Dog d=new Dog();
			d=new Dog();
			
		}
		return d;
		
	}
}	
    
    
    SINGLETON DESIGN PATTERN:
    -------------------------
 */

package corejavacollections2;
class Doggy
{
	static Doggy d;
	//static Dog d=new Dog();
	private Doggy()
	{
		
	}
	static synchronized Doggy getInstance() //we should make it as static because if it is instance we cannot able to access directly without creating object.
	{
		//return d;
		
		//static Dog d; //as static methods cannot able to access the instance mems we should make this as the static
		
		if(d==null) //first check whether the object is empty or not then only create the new object.
		{
			//Dog d=new Dog();
			d=new Doggy();
			
		}
		return d;
	}
}
 
public class SingleTonDesignPatterns {
	public static void main(String[] args) 
	{
		//Dog d=new Dog(); will give error because the constructor is made as private.
		Doggy d1=Doggy.getInstance();
		System.out.println(d1);
		Doggy d2=Doggy.getInstance(); //so when we create the second object it checks whether the d=null or not as it is not true it returns the same object or address of the same object.
		System.out.println(d2);
		Doggy d3=Doggy.getInstance();
		System.out.println(d3);
		
		
	}

}
