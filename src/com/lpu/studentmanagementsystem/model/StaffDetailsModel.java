package com.lpu.studentmanagementsystem.model;

import java.util.List;

public class StaffDetailsModel extends UserDetailsModel {

	private List<String> subjects;

	private List<String> sections;

	public StaffDetailsModel(List<String> subjects, List<String> sections) {
		super();
		this.subjects = subjects;
		this.sections = sections;
	}

	public StaffDetailsModel() {
		super();
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public List<String> getSections() {
		return sections;
	}

	public void setSections(List<String> sections) {
		this.sections = sections;
	}

	@Override
	public String toString() {
		return "StaffDetailsModel [subjects=" + subjects + ", sections=" + sections + "]";
	}

}
