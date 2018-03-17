package com.xxgc.bean;

public class Email {
 private int id;
 private String etitle;
 private String econtent;
 private String etime;
 private int estate;
 private int eid;
 private int eids;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEtitle() {
	return etitle;
}
public void setEtitle(String etitle) {
	this.etitle = etitle;
}
public String getEcontent() {
	return econtent;
}
public void setEcontent(String econtent) {
	this.econtent = econtent;
}
public String getEtime() {
	return etime;
}
public void setEtime(String etime) {
	this.etime = etime;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public int getEids() {
	return eids;
}
public void setEids(int eids) {
	this.eids = eids;
}
public int getEstate() {
	return estate;
}
public void setEstate(int estate) {
	this.estate = estate;
}
public Email() {
	super();
	// TODO Auto-generated constructor stub
}
public Email(String etitle, String econtent, String etime, int estate, int eid, int eids) {
	super();
	this.etitle = etitle;
	this.econtent = econtent;
	this.etime = etime;
	this.estate = estate;
	this.eid = eid;
	this.eids = eids;
}

 
 
 
}
