package com.lpu.studentmanagementsystem.model;

public class RegistrationModel {

	private String userName;

	private String id;

	private String type;

	private Boolean isAdmin;

	private String address;

	public RegistrationModel() {
		super();
	}

	public RegistrationModel(String userName, String id, String type, Boolean isAdmin, String address) {
		super();
		this.userName = userName;
		this.id = id;
		this.type = type;
		this.isAdmin = isAdmin;
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "RegistrationModel [userName=" + userName + ", id=" + id + ", type=" + type + ", isAdmin=" + isAdmin
				+ ", address=" + address + "]";
	}

}
