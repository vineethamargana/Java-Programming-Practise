package com.tap.model;

public class User {
	private int user_id,createDate,lastLoginData;
	private String username,password,email,address,role;
	public User() {
		super();
	}
	public User(int user_id, int createDate, int lastLoginData, String username, String password, String email,
			String address, String role) {
		super();
		this.user_id = user_id;
		this.createDate = createDate;
		this.lastLoginData = lastLoginData;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.role = role;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getCreateDate() {
		return createDate;
	}
	public void setCreateDate(int createDate) {
		this.createDate = createDate;
	}
	public int getLastLoginData() {
		return lastLoginData;
	}
	public void setLastLoginData(int lastLoginData) {
		this.lastLoginData = lastLoginData;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", createDate=" + createDate + ", lastLoginData=" + lastLoginData
				+ ", username=" + username + ", password=" + password + ", email=" + email + ", address=" + address
				+ ", role=" + role + "]";
	}
	

}


