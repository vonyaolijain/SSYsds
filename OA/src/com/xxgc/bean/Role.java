package com.xxgc.bean;

public class Role {
private int id;
private String rname;
private String rdesc;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRname() {
	return rname;
}
public void setRname(String rname) {
	this.rname = rname;
}
public String getRdesc() {
	return rdesc;
}
public void setRdesc(String rdesc) {
	this.rdesc = rdesc;
}

public Role() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Role [id=" + id + ", rname=" + rname + ", rdesc=" + rdesc + "]";
}



}
