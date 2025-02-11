package com.tap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Empolyee {
	
	@Id
    @Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "department")
	private String department;
	@Column(name = "salary")
	private int salary;
	public Empolyee() {
		super();
	}
	public Empolyee(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
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
	public String toString() {
		return "Empolyee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	

}
