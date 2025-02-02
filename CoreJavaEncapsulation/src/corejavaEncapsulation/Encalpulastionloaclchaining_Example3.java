
/*
  CONSTRUCTOR CHAINING:/

  --------------------
  it is of two types
  1.local chaining
    --->chaining is happening in the same class.
    
  2.constructor chaning from one class to another class
    --->will be learn in inheritance
    
    differnce between this and this()
    1.this() should be only given in constructors but not methods
      this keyword can be given in both constructors and methods
    2.this() should be the first statement in the constructor
      this keword cannot be the first statement.
    3.this() is a constructor call
      this is a keyword.
    4.this() used in constructor local chaining
      this keyword is used to overrcome shadowing problem
 */



package corejavaEncapsulation;

class Dog
{
	private String name;
	private int age;
	private float cost;
	Dog(String name)
	{
		this();
		//this(4);
		this.name=name;
		//this.cost=cost;
	}
	Dog(int age)
	{
		this.age=age;
		this.cost=15_000;
	}
	Dog()
	{
		this(4);
		System.out.println("Inside zero param constructor");
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public float getCost() {
		return cost;
	}
}
public class Encalpulastionloaclchaining_Example3 {
	public static void main(String []args)
	{
		Dog d=new Dog("maxy"); // _ and $ only we should use.
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d.getCost());
		
	}

}
