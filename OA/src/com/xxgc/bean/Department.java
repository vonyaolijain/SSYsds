package com.xxgc.bean;

public class Department {
  private int deid;
  private String departmentname;
  private String ddesc;
  
public int getDeid() {
	return deid;
}
public void setDeid(int deid) {
	this.deid = deid;
}
public String getDepartmentname() {
	return departmentname;
}
public void setDepartmentname(String departmentname) {
	this.departmentname = departmentname;
}


public String getDdesc() {
	return ddesc;
}
public void setDdesc(String ddesc) {
	this.ddesc = ddesc;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}

public Department(int deid, String departmentname, String ddesc) {
	super();
	this.deid = deid;
	this.departmentname = departmentname;
	this.ddesc = ddesc;
}
@Override
public String toString() {
	return "Department [deid=" + deid + ", departmentname=" + departmentname + ", ddesc=" + ddesc + "]";
}


  
  
}
