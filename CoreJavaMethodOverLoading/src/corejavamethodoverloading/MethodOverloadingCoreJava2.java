package corejavamethodoverloading;
class Rectangle
{
	float area(int i,int b)
	{
		return i*b; 
	}
	/*double area(double l,double b)
	{
		return l*b;
	}*/
}

public class MethodOverloadingCoreJava2 {
	public static void main(String []args)
	{
		
		Rectangle r=new Rectangle();
		System.out.println(r.area(10,20));
	}

}
