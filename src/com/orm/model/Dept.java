package com.orm.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dept {

@Id
private Integer dno;
@Column
private String name;

@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
private Set<Emp> employess;
public Set<Emp> getEmployess() {
	return employess;
}
public void setEmployess(Set<Emp> employess) {
	this.employess = employess;
}
public Integer getDno() {
	return dno;
}
public void setDno(Integer dno) {
	this.dno = dno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Dept(Integer dno, String name) {
	super();
	this.dno = dno;
	this.name = name;
}
public Dept() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Dept [dno=" + dno + ", name=" + name + "]";
}



}
