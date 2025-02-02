package com.tap.DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.tap.DAO.UserDAO;
import com.tap.model.User;

public class UserDAOImpl implements UserDAO {
    
	ArrayList<User> userList = new ArrayList<User>();
	private static final String ADD_USER_QUERY = "insert into `user`(`name`,`email`,`phonenumber`,`password`,`address`) values (?,?,?,?,?)";
	private static final String GET_ALL_USERS = "select * from user";
	private static final String DELETE_USER = "delete from `user` where `id` =?";
	private static final String MODIFY_USER ="update `user` set `name` = ?,`email` = ?,`phonenumber` = ?,`address` = ? where `id` =?";
	
	private Connection con;
	String url="jdbc:mysql://localhost:3306/jee123";
	String username="root";
	String password="Vineetha48@";
	private PreparedStatement pstmt;
	private int x;
	private Statement stmt;
	private ResultSet resultset;
	
	
	public UserDAOImpl()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public int addUser(User u) {
		try 
		{
			
	        pstmt = con.prepareStatement(ADD_USER_QUERY);
	        pstmt.setString(1,u.getName());
	        pstmt.setString(2,u.getEmail());
	        pstmt.setString(3,u.getPhonenumber() );
	        pstmt.setString(4,u.getPassword());
	        pstmt.setString(5,u.getAddress() );
 
	        x = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
     return x;
	}

	@Override
	public ArrayList<User> getAallUSers() 
	{
		try 
		{
			stmt = con.createStatement();
			resultset = stmt.executeQuery(GET_ALL_USERS);
			userList = extractUsersFromResultSet(resultset);
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return userList;	
	}
	
	ArrayList<User> extractUsersFromResultSet(ResultSet res)
	{
		try
		{
			while(res.next())
			{
				userList.add(new User(res.getInt("id"),
						res.getString("name"),
						res.getString("email"),
						res.getString("phonenumber"),
						res.getString("password"),
						res.getString("address")));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return userList;
	}

	@Override
	public int deleteData(int id) 
	{
		try
		{
			pstmt = con.prepareStatement(DELETE_USER);
			pstmt.setInt(1, id);
			x=pstmt.executeUpdate();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return x;
	}

	@Override
	public int modifyUser(User u) 
	{
		try 
		{
			pstmt = con.prepareStatement(MODIFY_USER);
			pstmt.setString(1, u.getName());
			pstmt.setString(2, u.getEmail());
			pstmt.setString(3, u.getPhonenumber());
			pstmt.setString(4, u.getAddress());
			
			pstmt.setInt(5, u.getId());
			
			x = pstmt.executeUpdate();
		} 
		catch (Exception e) 
		{
		   e.printStackTrace();
		}
		
	 return x;
	}
	
	

}
