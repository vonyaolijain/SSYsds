package com.xxgc.bean;

public class Employee {
   private int id;
   private String username;
   private String password;
   private String name;
   private String sex;
   private int age;
   private String time;
   private String deid;
   private String pid;
   private String rid;
   private  String departmentname;
   private String pname;
   private String rname;

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRname() {
	return rname;
}
public void setRname(String rname) {
	this.rname = rname;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
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
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


public String getDeid() {
	return deid;
}
public void setDeid(String deid) {
	this.deid = deid;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}



public String getDepartmentname() {
	return departmentname;
}
public void setDepartmentname(String departmentname) {
	this.departmentname = departmentname;
}


public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public String getRid() {
	return rid;
}
public void setRid(String rid) {
	this.rid = rid;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", time=" + time + ", deid="
			+ deid + ", departmentname=" + departmentname + "]";
}
public Employee(int id, String username, String password, String name, String sex, int age, String time, String deid,
		String pid, String rid, String departmentname, String pname, String rname) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.name = name;
	this.sex = sex;
	this.age = age;
	this.time = time;
	this.deid = deid;
	this.pid = pid;
	this.rid = rid;
	this.departmentname = departmentname;
	this.pname = pname;
	this.rname = rname;
}



   
   
   
}
