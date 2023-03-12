package com.lpu.studentmanagementsystem.model;

public class LoginModel {

	private String userName;

	private String password;

	private Boolean isAdmin;

	private String type;

	public LoginModel(String userName, String password, Boolean isAdmin, String type) {
		super();
		this.userName = userName;
		this.password = password;
		this.isAdmin = isAdmin;
		this.type = type;
	}

	public LoginModel() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "LoginModel [userName=" + userName + ", password=" + password + ", isAdmin=" + isAdmin + ", type=" + type
				+ "]";
	}

}
