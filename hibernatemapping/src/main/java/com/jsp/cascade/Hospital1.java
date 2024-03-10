package com.jsp.cascade;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
@Entity
public class Hospital1 {
	@Id
	private int id;
	private String ceo;
	private String name;
	
	@OneToMany
	@Cascade(CascadeType.ALL)
	private List<Branch1> branches;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Branch1> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch1> branches) {
		this.branches = branches;
	}
}
