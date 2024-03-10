package com.jsp.cascade;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch1 {
	@Id
	private int id;
	private String manager;
	private String address;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
