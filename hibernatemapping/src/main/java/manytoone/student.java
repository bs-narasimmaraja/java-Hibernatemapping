package manytoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class student {
	@Id
	@GeneratedValue(strategy =(GenerationType.IDENTITY))
	private int id;
	private String name;
	private String degree;
	private String stream;
	
	@ManyToOne
	private college college1;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getStream() {
		return stream;
	}


	public void setStream(String stream) {
		this.stream = stream;
	}


	public college getCollege1() {
		return college1;
	}


	public void setCollege1(college college1) {
		this.college1 = college1;
	}
	
	
}
