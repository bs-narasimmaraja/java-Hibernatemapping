package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Student1 {
	@Id
	private int id;
	private String name;
	private int age;
	private int yop;
	@ManyToMany
	private List<Course1> courses;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public List<Course1> getCourses() {
		return courses;
	}

	public void setCourses(List<Course1> courses) {
		this.courses = courses;
	}
	
	
	
	
}
