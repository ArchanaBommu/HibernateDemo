package com.orm.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {

	@Id
	@Column(name="cno")
	private Integer sno;
	@Column
	private String name;
	
	@ManyToMany(mappedBy="courses" , cascade=CascadeType.ALL)
	private Set<Trainer> trainer;
	
	
	
	public Set<Trainer> getTrainer() {
		return trainer;
	}
	public void setTrainer(Set<Trainer> trainer) {
		this.trainer = trainer;
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course(Integer sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [sno=" + sno + ", name=" + name + "]";
	}
	
}
