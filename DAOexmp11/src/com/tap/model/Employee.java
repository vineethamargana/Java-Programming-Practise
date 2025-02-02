package com.tap.model;

public class Employee {
	private int empid,salary;
	private String empname,dpt;
	public Employee() {
		super();
	}
	public Employee(int empid, String empname, String dpt, int salary) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.empname = empname;
		this.dpt = dpt;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getdpt() {
		return dpt;
	}
	public void setdpt(String dpt) {
		this.dpt = dpt;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", empname=" + empname + ", department=" + dpt
				+ "]";
	}

}
