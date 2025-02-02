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
@Table(name="projects123")
public class Projects {
	
	@Id
	@Column(name="Proj_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int proj_id;
	@Column(name="projectname")
	private String projectname;
	@Column(name="budget")
	private float budget;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="emp_proj123", joinColumns = @JoinColumn(name="project_id"), 
	inverseJoinColumns = @JoinColumn(name = "employee_id"))
	private List<Employee> emp;
	
	public Projects() {
		super();
	}

	public Projects(String projectname, float budget) {
		super();
		this.projectname = projectname;
		this.budget = budget;
	}

	public Projects(int proj_id, String projectname, float budget) {
		super();
		this.proj_id = proj_id;
		this.projectname = projectname;
		this.budget = budget;
	}

	/**
	 * @return the proj_id
	 */
	public int getProj_id() {
		return proj_id;
	}

	/**
	 * @param proj_id the proj_id to set
	 */
	public void setProj_id(int proj_id) {
		this.proj_id = proj_id;
	}

	/**
	 * @return the projectname
	 */
	public String getProjectname() {
		return projectname;
	}

	/**
	 * @param projectname the projectname to set
	 */
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	/**
	 * @return the budget
	 */
	public float getBudget() {
		return budget;
	}

	/**
	 * @param budget the budget to set
	 */
	public void setBudget(float budget) {
		this.budget = budget;
	}

	
	/**
	 * @return the emp
	 */
	public List<Employee> getEmp() {
		return emp;
	}

	/**
	 * @param emp the emp to set
	 */
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Projects [proj_id=" + proj_id + ", projectname=" + projectname + ", budget=" + budget + "]";
	}
	
	
	
	

}
