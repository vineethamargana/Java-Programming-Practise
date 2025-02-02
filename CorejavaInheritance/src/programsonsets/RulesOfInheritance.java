
/*
 * rules:
    1.please keep the access modifier of overriden method if u want to change it should increse the visbility but not decrese
    2.u can change the primitive data type of overriden method
    3.if u want to the return type of overridden method but the return type of overriden method 
    and parent class method there should be is a retationship or covaraient relationship.
    4.u cannot change the no of parameters of overriddden method
 */

package programsonsets;
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
	}*/   //both methods can work because tiger extending he animal there is inheritance relationship
    @Override	
	Tiger disp() 
	{
		System.out.println("hello");
		Tiger a=new Tiger();
		return a;
	}
}
public class RulesOfInheritance {

}
