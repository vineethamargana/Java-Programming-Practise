package com.tap.main;


import com.tap.dao.UserDAO1;
import com.tap.daoimpl.UserDAOImpl;
import com.tap.model.User;

public class UserDemo {

	public static void main(String[] args) {

		int user_id=1,createDate=23,lastLoginData=34;
		 String username="vineetha",password="hii",email="hii@gmail.com",address="btm",role="software engineer";
		 
		 User u=new User(user_id,createDate,lastLoginData,username,password,email,address,role);
		 UserDAO1 usDAO=new UserDAOImpl();
		 System.out.println("Status:"+UserDAO1.insertUser(u));

	}

}
 