package com.tap.dao;

import java.util.List;

import com.tap.model.Employee;

public interface EmployeeDAO {
	int insertEmp(Employee e);
	int deleteEmp(int empid);
	List<Employee> fetchAllEmp();
	Employee fetchEmp(int id);
	int updateSalOnId(int id,int salary);

}
