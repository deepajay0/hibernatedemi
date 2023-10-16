package com.hibernate.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Empl {
	@Id
	private int eid;
	private String name;
	@ManyToMany
	private List<Projects> project;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Projects> getProject() {
		return project;
	}

	public void setProject(List<Projects> project) {
		this.project = project;
	}

	public Empl(int eid, String name, List<Projects> project) {
		super();
		this.eid = eid;
		this.name = name;
		this.project = project;
	}

	public Empl() {
		super();
		
	}
	
	
}
