/*
 ****************IMPORTANT**************

 *
 *Assignment : compare based on the salary,email,name,department by creating different class like demo2,demo3 etc use compare() implementing comparator class.
 
Sorting:
----------
sorting can be done easily for the interger object,float object,....
but it gives exception for the employee object.

1. This:THIS IS THE REFERENCE FOR THE CURRENTLY EXECUTING OBJECT.
   -----
it is keyword.
for every current executing object there will be two references one is this ...which is given by jvm 
and the other the reference which is given by us.
it is given as the reference for the object before our reference ...so there will be two 
references for our object.one is the "this" reference and other is the reference given by us.

2.***we have two ways to compare:***
-------------------------------------
a.compareTo(): which is implemented from comparable interface
-------------
compares the string in different ways and it returns the output as integer.
to get the compareTo method we have this in the comparible interface ...so we have to implement the comparable interface

b.compare(): which is implemented from comparator interface
------------
the comparator interface should be implement using another class


  -----> the difference between compare() and compareTo() is 
   1. the compareTo() is the method in the comparable interface where compare() is the abstarct method in comparator interface
   2.compareTo() accepts only one parameter but compare() accepts two parameters

3.sort():
----------
internally the comparison will happen by using compareTo() method
sort method calls compareTo() method and after comparison it gives the output as +ve,-ve ,0
and based on those values sort() swap the output.
//see pg:317

sort method is in collections class there compareTo method is in Integer class,String class,Double class,Float class,Byte class,Character
class,Boolean Class, StringBuilder class, StringBuffer class 

   
 */


package corejavacollections2;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Demo1 implements Comparator<Employee>
{
   @Override
    public int compare(Employee e1, Employee e2) {
	   Integer i1=e1.getId();
	   Integer i2=e2.getId();
	   return i1.compareTo(i2);
	   
    }   
}
class Employee  
{
	private int id;
	private String name;
	private String email;
	private String department;
	private int salary;
	public Employee() {
		
	}
	public Employee(int id, String name, String email,String department,int salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.email=email;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString()
	{
		return id+" "+name+" "+email+" "+department+" "+salary;
	}
	
}

/*
//class Employee implements Comparable<Employee> 
{
	private int id;
	private String name;
	private String email;
	private String department;
	private int salary;
	public Employee() {
		
	}
	public Employee(int id, String name, String email,String department,int salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.email=email;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString()
	{
		return id+" "+name+" "+email+" "+department+" "+salary;
	}
	
//	@Override
//	public int compareTo(Employee e2) 
//	{
//		Employee e1=this; 
//		Integer id1=e1.id; //Auto boxing:without telling new it is boxed
//		Integer id2=e2.id;
//		int n=id1.compareTo(id2); //comparision based on ids so integer
//		return n;
//		
//		//or
////		if(id1>id2)
////		{
////			return 1;
////		}
////		else if(id1<id2)
////		{
////			return -1;
////		}
////		else 
////		{
////			return 0;
////		}
//	}
//	
	
	
	
	@Override  //based on name : it is by default string so we need not required to mention the object type
	public int compareTo(Employee e2) {
		Employee e1=this;
  		String name1=e1.name;
  		String name2=e2.name;
//  		int n=name1.compareTo(name2);
//   		return n;
  		
  		//if names are same compare based on email ids. as emailid is unique
  		if(name1.equals(name2))
  		{
  			return e1.email.compareTo(e2.email);
  		}
  		return e1.name.compareTo(e2.name);
     }
	
	
	
//	@Override //based on salary
//	public int compareTo(Employee e2) {
//		Employee e1=this; 
//		Integer s1=e1.salary; //Auto boxing:without telling new it is boxed
//		Integer s2=e2.salary;
//		return s1.compareTo(s2);
		
//	}
	
}*/

public class Sorting {
	public static void main(String[] args) {
//		ArrayList a=new ArrayList();
//		a.add(10);
//		a.add(20);
//		a.add(79);
//		a.add(78);
//		a.add(45);
//		System.out.println(a);
//		Collections.sort(a);
//		System.out.println(a);
		
//		Employee e=new Employee();
//		System.out.println(e); // try it by removing the sortring method
//		System.out.println(e.getId()+" "+e.getDepartment()+" "+e.getName()+" "+e.getSalary());

		
		//hardcode
/*		Employee e1=new Employee(1,"tim","IT",1000000);
		Employee e2=new Employee(3,"jeeva","it",200000);
		Employee e3=new Employee(2,"raju","it",70000);
		ArrayList al=new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);*/
		
		
		//taking input from user. and using arraylist sorting method 
	/*	Scanner sc=new Scanner(System.in);
		ArrayList<Employee> al=new ArrayList<Employee>();
		System.out.println("enter the number of employees (employee objects)");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			Employee e=new Employee();
			System.out.println("enter the details of "+i+" employee");
			String input=sc.next();
			String[] arr=input.split(",");
//			int id=Integer.parseInt(arr[0]);
//			e.setId(id);
			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setDepartment(arr[2]);
			e.setSalary(Integer.parseInt(arr[3]));
//			System.out.println(e);
			
			al.add(e);
		}
	    System.out.println(al);
	    Collections.sort(al);
	    System.out.println(al);
	    */
	    
		
		//using treeset ...treeset has in-built sort method so we need not need to give it.by default it has compareTo().but it will not store duplicates.
		Scanner sc=new Scanner(System.in);
		Demo1 d=new Demo1();
		TreeSet<Employee> al=new TreeSet<Employee>(d); //use this while implemeting the comparator interface
		//TreeSet<Employee> al=new TreeSet<Employee>(); //use this while implemeting the comparable interface
		System.out.println("enter the number of employees (employee objects)");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			Employee e=new Employee();
			System.out.println("enter the details of "+i+" employee");
			String input=sc.next();
			String[] arr=input.split(",");
//			int id=Integer.parseInt(arr[0]);
//			e.setId(id);
			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setEmail(arr[2]);
			e.setDepartment(arr[3]);
			e.setSalary(Integer.parseInt(arr[4]));
//			System.out.println(e);
			
			al.add(e);
		}
	    System.out.println(al);
	 
	}

}
