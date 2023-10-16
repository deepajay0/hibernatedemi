package com.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String coursename;
	private String fees;
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public Certificate(String coursename, String fees) {
		super();
		this.coursename = coursename;
		this.fees = fees;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
