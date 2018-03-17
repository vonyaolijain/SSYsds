package com.xxgc.bean;

import java.util.List;

public class Clas {
private Integer id;
private String cname;
private List<Student> stu;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
@Override
public String toString() {
	return "Clas [id=" + id + ", cname=" + cname + "]";
}
public Clas() {
	super();
	// TODO Auto-generated constructor stub
}
public List<Student> getStu() {
	return stu;
}
public void setStu(List<Student> stu) {
	this.stu = stu;
}


}
