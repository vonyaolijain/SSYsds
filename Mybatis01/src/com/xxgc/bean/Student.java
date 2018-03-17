package com.xxgc.bean;




public class Student {
private Integer id;
private String name;
private String address;
private Clas clas;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}
public Student(Integer id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public Clas getClas() {
	return clas;
}
public void setClas(Clas clas) {
	this.clas = clas;
}


}
