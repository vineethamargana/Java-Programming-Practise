
/*
   mixture of single level and heirachial and multilevel

   the inheritance which is a mixture of two or more inheritance types is called hybrid inheritanace
 */

package corejavaInheritance;
class Grandparent
{
	float height=5.7f;
	
	void exercise()
	{
		System.out.println("i will exercise daily");
	}
}
class parent8 extends Grandparent
{
	
}
class child15 extends parent8
{
	
}
class child11 extends parent8
{
	
}
class child12 extends parent8
{
	
}


public class HybridInheritance {
	public static void main(String []args)
	{
		child15 c4=new child15();
		child11 c5=new child11();
		child12 c6=new child12();
		
		System.out.println(c4.height);
		c4.exercise();
		System.out.println(c5.height);
		c5.exercise();
		System.out.println(c6.height);
		c6.exercise();
	}


}
