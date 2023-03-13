package com.lpu.studentmanagementsystem.model;

import java.util.List;

public class BranchModel {

	private String name;

	private List<SectionModel> sections;

	public BranchModel() {
		super();
	}

	public BranchModel(String name, List<SectionModel> sections) {
		super();
		int x;
		this.name = name;
		this.sections = sections;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SectionModel> getSections() {
		return sections;
	}

	public void setSections(List<SectionModel> sections) {
		this.sections = sections;
	}

	@Override
	public String toString() {
		return "BranchModel [name=" + name + ", sections=" + sections + "]";
	}

}
