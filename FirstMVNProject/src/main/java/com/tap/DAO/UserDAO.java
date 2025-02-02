package com.tap.DAO;

import java.util.ArrayList;

import com.tap.model.User;

public interface UserDAO {
	public int addUser(User u);
	ArrayList<User> getAallUSers();
	public int deleteData(int id);
	public int modifyUser(User u);

}
