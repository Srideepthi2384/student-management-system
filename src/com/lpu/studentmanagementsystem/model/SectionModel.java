package com.lpu.studentmanagementsystem.model;

import java.util.List;

public class SectionModel {

	private String sectionName;

	private String inchargeName;

	private List<StudentModel> students;

	public SectionModel() {
		super();
	}

	public SectionModel(String sectionName, String inchargeName, List<StudentModel> students) {
		super();
		this.sectionName = sectionName;
		this.inchargeName = inchargeName;
		this.students = students;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getInchargeName() {
		return inchargeName;
	}

	public void setInchargeName(String inchargeName) {
		this.inchargeName = inchargeName;
	}

	public List<StudentModel> getStudents() {
		return students;
	}

	public void setStudents(List<StudentModel> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "SectionModel [sectionName=" + sectionName + ", inchargeName=" + inchargeName + ", students=" + students
				+ "]";
	}

}
