package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course1 {
	@Id
	private int id;
	private String name;
	private String duration;
	@ManyToMany
	List<Student1> students ;
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
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public List<Student1> getStudents() {
		return students;
	}
	public void setStudents(List<Student1> students) {
		this.students = students;
	}
	
	
}
