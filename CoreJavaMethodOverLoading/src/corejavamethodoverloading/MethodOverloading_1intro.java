/*
  DEF:  multiple methods with the same name inside the same class is known as method overloading...
  one method is doing only one work.
  
  process of overrloading: how the naming confusion overcomed by java.
  1.name of the method
  2.number of paraments
  3.type of parameters
  *.type casting
  
  what is overloaded in method overloading?
  A. nothing is overloaded in method overloading it is just illusion of programmer that one method is doing all the work
  but nothing is overloaded.
   
  compile time polymorphism: greek word
  method overloading is an example for compile time polymorphism.
  -------------------------
  
  poly ---one is having many forms.
  ex:human as son,husband,father,brother,grand father...
  ex:carbon is -----having polyformic nature-----co2,coal,graphite,daimond
  ex:water-----solid,liquid,gas
  
  it is called polymorphism because there are many methods with the same name and it is managed by the java compiler during the comiplation.
  it is also known as:
  1.static binding
  2.early binding
  3.virtual or false polymorphism.
  
  what does not work in method overloading?
  A. multiple methods with same name and same parameters but different parameters.
  return type does not participate in method overloading.
  
  ---> return type will not participate in method overloading. because when binding happens it look only after the return type part.
 */
 
package corejavamethodoverloading;
class Calculator
{
	int add()
	{
		return 100+200;
	}
	int add(int a,int b)
	{
		return a+b;
	}
	float add(int a,float b)
	{
		return a+b;
	}
	double add(float a,double b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	double add(int a,float b,double c)
	{
		return a+b+c;
	}
}
 
public class MethodOverloading_1intro {
	public static void main(String []args) //jvm starts execution from main method
	{
		Calculator c=new Calculator(); //object is created in the heap segment.
		System.out.println(c.add(20.0f,78.9));
		System.out.println(c.add(233,33));
		System.out.println(c.add(123, 8934.9f,291.78));
		float s=c.add();
		System.out.println(s);
	}

}
