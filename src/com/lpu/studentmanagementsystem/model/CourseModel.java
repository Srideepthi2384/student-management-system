package com.lpu.studentmanagementsystem.model;

import java.util.List;

public class CourseModel {

	private String courseName;

	private List<BranchModel> branches;

	public CourseModel() {
		super();
	}

	public CourseModel(String courseName, List<BranchModel> branches) {
		super();
		this.courseName = courseName;
		this.branches = branches;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<BranchModel> getBranches() {
		return branches;
	}

	public void setBranches(List<BranchModel> branches) {
		this.branches = branches;
	}

	@Override
	public String toString() {
		return "CourseModel [courseName=" + courseName + ", branches=" + branches + "]";
	}

}
