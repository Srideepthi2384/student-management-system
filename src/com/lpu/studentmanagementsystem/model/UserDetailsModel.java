package com.lpu.studentmanagementsystem.model;

public class UserDetailsModel {

	protected String name;

	protected String id;

	protected String type;

	protected Boolean isAdmin;

	protected String Address;

	public UserDetailsModel() {
		super();
	}

	public UserDetailsModel(String name, String id, String type, Boolean isAdmin, String address) {
		super();
		this.name = name;
		this.id = id;
		this.type = type;
		this.isAdmin = isAdmin;
		Address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "UserDetailsModel [name=" + name + ", id=" + id + ", type=" + type + ", isAdmin=" + isAdmin
				+ ", Address=" + Address + "]";
	}

}
