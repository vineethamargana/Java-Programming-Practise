package com.tap.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.tap.dao.EmployeeDAO;
import com.tap.model.Employee;
import com.tap.util.MyConnection;

public class EmployeeDAOImpl implements EmployeeDAO
{

	private MyConnection myCon;
	private Connection connection;
	private PreparedStatement pstmt;
	
	public EmployeeDAOImpl()
	{
		myCon = MyConnection.getMyConnection();
		connection=myCon.connect();
	}

	@Override
	public int insertEmp(Employee e) {
		try 
		{
			pstmt=connection.prepareStatement("INSERT INTO EMPLOYEE(empid,empname,dpt,salary) values(?,?,?,?)");
			pstmt.setInt(1, e.getEmpid());
			pstmt.setString(2, e.getEmpname());
			pstmt.setString(3, e.getdpt());
			pstmt.setInt(4, e.getSalary());
			
			return pstmt.executeUpdate();
		} 
		catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteEmp(int empid) {
		return 0;
	}

	@Override
	public List<Employee> fetchAllEmp() {
		return null;
	}

	@Override
	public Employee fetchEmp(int id) {
		return null;
	}

	@Override
	public int updateSalOnId(int id, int salary) {
		return 0;
	}

}
