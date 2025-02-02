package corejavamethodoverloading;
class Calculator48
{
	int add(int a,int b)
	{
		return a+b;
	}
	double add(int a,double b)
	{
		return a+b;
	}
	double add(int a,float b,double c)
	{
		return a+b+c;
	}
	float add(float a,int b)
	{
		return a+b;
	}
}

public class MethodoverloadinginCoreJAVA1 {
	public static void main(String []args)
	{
		int i=10,j=20,k=30;
		float l=10.5f,o=30.5f;
		double p=100.5;
		Calculator48 c=new Calculator48();
		System.out.println(c.add(i, j));
		System.out.println(c.add(i, p));
		System.out.println(c.add(i, l, p));
		System.out.println(c.add(k,o));
	}

}
