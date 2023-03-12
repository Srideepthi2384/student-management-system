package com.lpu.studentmanagementsystem.model;

public class SemWiseMarks {

	private String sem;

	private String subject;

	private float marksObtained;

	private Integer toatalMarks;

	public SemWiseMarks() {
		super();
	}

	public SemWiseMarks(String sem, String subject, float marksObtained, Integer toatalMarks) {
		super();
		this.sem = sem;
		this.subject = subject;
		this.marksObtained = marksObtained;
		this.toatalMarks = toatalMarks;
	}

	public String getSem() {
		return sem;
	}

	public void setSem(String sem) {
		this.sem = sem;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public float getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(float marksObtained) {
		this.marksObtained = marksObtained;
	}

	public Integer getToatalMarks() {
		return toatalMarks;
	}

	public void setToatalMarks(Integer toatalMarks) {
		this.toatalMarks = toatalMarks;
	}

	@Override
	public String toString() {
		return "SemWiseMarks [sem=" + sem + ", subject=" + subject + ", marksObtained=" + marksObtained
				+ ", toatalMarks=" + toatalMarks + "]";
	}

}
