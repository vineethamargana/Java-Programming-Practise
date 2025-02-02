/*
 * CORE JAVA: JSE (JAVA STANDARD EDITION)
 * Advanced java: JEE(jakartha enterprise edition)
  compare method: compareTo()
  compareTo method: compareTo()
  
  **********************
  +ve---data1>data2
  -ve---data1<data2
   0 ---data1==data2
  
  low to high:
  -----------
  +ve= swap
  -ve= no swap
   0 = no swap
   
   high to low:
   ------------
   +ve= swap
   -ve=no Swap
    0 = remove
  ***********************
  
  DIFFERENCE BETWEEN COMPARABLE AND COMPARATOR:
  -----------------------------------------------
  1.COMPARABLE:
     . natural ordering (compares based on any one of the values)
     . compareTo(-)
     . compareTo having only 1 parameter
     . we should override compareTo() inside a class which is a programmer is sorting
  
  2.COMPARATOR:
     . customised sorting or ordering
     . comapre(-,-)
     . compareTo having 2 parameter
     . we should override compareTo() inside a different class.

  
  CUSTOMIZED SORTING:
 */


package corejavacollections2;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Dem1 implements Comparator<Employee>
{
   @Override
    public int compare(Employee e1, Employee e2) {
	   Integer i1=e1.getId();
	   Integer i2=e2.getId();
	   return i1.compareTo(i2);
	   
    }   
}
class Dem2 implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}
class Dem3 implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEmail().compareTo(e2.getEmail());
	}
}
class Dem4 implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getDepartment().compareTo(e2.getDepartment());
	}
}
class Dem5 implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) {
		Integer s1=e1.getSalary();
		Integer s2=e2.getSalary();
		return s1.compareTo(s2);
	}
}
class Dem6 implements Comparator<Employee>
{
   @Override
    public int compare(Employee e1, Employee e2) {
	   Integer i1=e1.getId();
	   Integer i2=e2.getId();
	   return  -1*i1.compareTo(i2);  
    }   
}

class Employee1  
{
	private int id;
	private String name;
	private String email;
	private String department;
	private int salary;
	public Employee1() {
		
	}
	public Employee1(int id, String name, String email,String department,int salary) 
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


public class Sorting2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Dem1 d1=new Dem1();//id (low to high)
		Dem2 d2=new Dem2();//name
		Dem3 d3=new Dem3();//email
		Dem4 d4=new Dem4();//department
		Dem5 d5=new Dem5();//salary
		Dem6 d6=new Dem6();//ID(high to low)
//		TreeSet<Employee> al=new TreeSet<Employee>(d3); //use this while implemeting the comparator interface
		
		TreeSet<Employee> ts=null;
		System.out.println("sort based on:\n 1.ID(low to high)\n 2.ID(high to low)\n 3.NAME\n 4.EMAIL\n 5.DEPARTMENT\n 6.SALARY\n");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:ts= new TreeSet<Employee>(d1);
			break;
		case 2:ts= new TreeSet<Employee>(d6);
			break;
		case 3:ts= new TreeSet<Employee>(d2);
		    break;	
		case 4:ts= new TreeSet<Employee>(d3);
			break;
		case 5:ts= new TreeSet<Employee>(d4);
			break;
		case 6:ts= new TreeSet<Employee>(d5);
			break;
		default:System.out.println("invalid input");
		    break;
		}
		
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
			
			ts.add(e);
		}
	    System.out.println(ts);
	 
	}

}
