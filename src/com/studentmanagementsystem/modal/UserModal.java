package com.studentmanagementsystem.modal;

import java.util.Arrays;
import java.util.List;

public class UserModal {

	private String userName;
	private String password;
	private String address;
	private String doj;
	private Boolean isStaff;
	private String course;
	private String branch;
	private String section;
	private List<String> subjects;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public Boolean getIsStaff() {
		return isStaff;
	}

	public void setIsStaff(Boolean isStaff) {
		this.isStaff = isStaff;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "UserModal [userName=" + userName + ", password=" + password + ", address=" + address + ", doj=" + doj
				+ ", isStaff=" + isStaff + ", course=" + course + ", branch=" + branch + ", section=" + section
				+ ", subjects=" + subjects + "]";
	}

}
