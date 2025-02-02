package com.tap.dao;

import java.util.List;

import com.tap.model.User;

public interface UserDAO1 {
	int insertUser(User e);//inserting users
	int deleteUser(int user_id);//deleting users
	List<User> fetchAllUser(); //fetchng all users
	User fetchUser(int id); //fetching specific user
	//int updateSalOnId(int id,int salary); //upating users


}
