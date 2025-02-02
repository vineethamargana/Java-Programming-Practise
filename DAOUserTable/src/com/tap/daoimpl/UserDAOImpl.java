package com.tap.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.tap.dao.UserDAO1;
import com.tap.model.User;
import com.tap.util.MyConnectionUser;

public class UserDAOImpl implements UserDAO1{
	
	private MyConnectionUser myCon;
	private Connection connection;
	private PreparedStatement pstmt;
	
	public UserDAOImpl()
	{
		myCon = MyConnectionUser.getMyConnectionUser();
		connection=myCon.connect();
	}

	@Override
	public int insertUser(User e) {
		try 
		{
			pstmt=connection.prepareStatement("INSERT INTO User(user_id,username,password,email,address,role,createDate,lastLogindata) values(?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, e.getUser_id());
			pstmt.setString(2, e.getUsername());
			pstmt.setString(3, e.getPassword());
			pstmt.setString(4, e.getEmail());
			pstmt.setString(5, e.getAddress());
			pstmt.setString(6, e.getRole());
			pstmt.setInt(7, e.getCreateDate());
			pstmt.setInt(8, e.getLastLoginData());
			
			return pstmt.executeUpdate();
		} 
		catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteUser(int user_id) {
		return 0;
	}

	@Override
	public List<User> fetchAllUser() {
		return null;
	}

	@Override
	public User fetchUser(int user_id) {
		return null;
	}

//	@Override
//	public int updateSalOnId(int id, int salary) {
//		return 0;
//	}

}
