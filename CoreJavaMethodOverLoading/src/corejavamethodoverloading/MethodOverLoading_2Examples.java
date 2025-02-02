
//method overloading with implicit type casting or type promotion

//ambiguity....................

package corejavamethodoverloading;
class Addition
{
	/*void add(char a,int b)
	{
		System.out.println("char and int");
	}*/
	void add(int a,char b)
	{
		System.out.println("int and char");
	}
	/*void add(byte a,int b)
	{
		System.out.println("byte and int");
	}*/
}
public class MethodOverLoading_2Examples {
	public static void main(String []args)
	{
	  Addition c=new Addition();
	  c.add(90,'k');
	  //c.add(90,89);
	  //as there is print statement in the method we dont have to write the print statement in main method
	  //if we write return in add method then we have to write print here other wise there will be error.
	
	  c.add('A','B'); //IMPLICIT type casting will happen here.
	  //c.add('A', 'B'); 
	  //it will give error ---it checks the three condition and when comes to fourth condition as both the methods can to implict type casting it gets confused
	  //i.e ambiguity --- both are similar
	}

}
