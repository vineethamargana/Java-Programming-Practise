package com.tap.hii;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


class Demo implements Comparator<Employee>
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


public class SortingUsingComparator {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Demo d=new Demo();
		TreeSet<Employee> ts=new TreeSet<Employee>(d);
		System.out.println("enter the number of employees:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			Employee e=new Employee();
			System.out.println("enter the details of "+i+" employee");
			String input=sc.next();
			String[] arr=input.split(",");

			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setEmail(arr[2]);
			e.setDepartment(arr[3]);
			e.setSalary(Integer.parseInt(arr[4]));
			
			ts.add(e);
		}
	    System.out.println(ts);
	 
	}

	 }
	

