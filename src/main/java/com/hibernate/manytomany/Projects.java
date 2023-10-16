package com.hibernate.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Projects {
	@Id
	private int pid;
	private String pname;
	@ManyToMany(mappedBy = "project")
	private List<Empl> emp;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<Empl> getEmp() {
		return emp;
	}
	public void setEmp(List<Empl> emp) {
		this.emp = emp;
	}
	public Projects(int pid, String pname, List<Empl> emp) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.emp = emp;
	}
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
