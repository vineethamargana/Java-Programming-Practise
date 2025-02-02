package corejavaInheritance;
/*
 * rules:
    1.please keep the access modifier of overriden method if u want to change it should increase the visbility but not decrease
    2.u can change the primitive data type of overriden method
    we cannot change the retun type
    3.if u want to change the return type of overridden method ...then the return type of overriden method 
    and parent class method there should be "is a" retationship or covaraient relationship.
    4.u cannot change the no of parameters of overriddden method
 */
class Animal
{
	
}
class Tiger extends Animal
{
	
}
class Parent55
{
	Animal disp()
	{
		System.out.println("hi");
		Animal a=new Animal();
		return a;
	}
}
class Child55 extends Parent55
{
	// @Override
	/*Animal disp()
	{
		System.out.println("hi");
		Animal a=new Animal();
		return a;
	}*/   //both methods can work because tiger extending the animal there is inheritance relationship
    @Override	
	Tiger disp() 
	{
		System.out.println("hello");
		Tiger a=new Tiger();
		return a;
	}
}
public class RulesOfInheritance1 {

}
