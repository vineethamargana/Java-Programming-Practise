package com.tap.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="employee123")
public class Employee {
	
	@Id
	@Column(name="emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="emp_proj123", joinColumns = @JoinColumn(name="employee_id"), 
	inverseJoinColumns = @JoinColumn(name = "project_id"))
	private List<Projects> projects;
	
	public Employee() {
		super();
	}

	public Employee(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Employee(int emp_id, String name, String email) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.email = email;
	}

	/**
	 * @return the emp_id
	 */
	public int getEmp_id() {
		return emp_id;
	}

	/**
	 * @param emp_id the emp_id to set
	 */
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	

	/**
	 * @return the projects
	 */
	public List<Projects> getProjects() {
		return projects;
	}

	/**
	 * @param projects the projects to set
	 */
	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	

}
