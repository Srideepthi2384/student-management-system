package com.lpu.studentmanagementsystem.model;

import java.time.LocalDate;
import java.util.List;

public class StudentModel extends UserDetailsModel {

	private Integer courseDuration;

	private LocalDate doj;

	private String course;

	private String branch;

	private String section;

	private List<SemWiseMarks> semWiseMarksList;

	public StudentModel() {
		super();
	}

	public StudentModel(Integer courseDuration, LocalDate doj, String course, String branch, String section,
			List<SemWiseMarks> semWiseMarksList) {
		super();
		this.courseDuration = courseDuration;
		this.doj = doj;
		this.course = course;
		this.branch = branch;
		this.section = section;
		this.semWiseMarksList = semWiseMarksList;
	}

	public Integer getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(Integer courseDuration) {
		this.courseDuration = courseDuration;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
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

	public List<SemWiseMarks> getSemWiseMarksList() {
		return semWiseMarksList;
	}

	public void setSemWiseMarksList(List<SemWiseMarks> semWiseMarksList) {
		this.semWiseMarksList = semWiseMarksList;
	}

	@Override
	public String toString() {
		return "StudentDetailsModel [courseDuration=" + courseDuration + ", doj=" + doj + ", course=" + course
				+ ", branch=" + branch + ", section=" + section + ", semWiseMarksList=" + semWiseMarksList + "]";
	}

}
