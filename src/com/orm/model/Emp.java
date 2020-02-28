package com.orm.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	
@Id
private Integer eno;
@Column
private String name;
@Column
private String city;
@Column
private String desig;

@OneToOne(mappedBy="employee", cascade=CascadeType.ALL)
private Contact contact;

public Contact getContact() {
	return contact;
}
public void setContact(Contact contact) {
	this.contact = contact;
}
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="dno")
Dept dept;
public Dept getDept() {
	return dept;
}
public void setDept(Dept dept) {
	this.dept = dept;
}
public Integer getEno() {
	return eno;
}
public void setEno(Integer eno) {
	this.eno = eno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}
public Emp(Integer eno, String name, String city, String desig) {
	super();
	this.eno = eno;
	this.name = name;
	this.city = city;
	this.desig = desig;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Emp [eno=" + eno + ", name=" + name + ", city=" + city + ", desig=" + desig + "]";
}



}
