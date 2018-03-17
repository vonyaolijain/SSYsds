package com.xxgc.bean;

public class Power {
private int pid;
private String pname;
private String pdesc;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}

public String getPdesc() {
	return pdesc;
}
public void setPdesc(String pdesc) {
	this.pdesc = pdesc;
}
@Override
public String toString() {
	return "Power [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + "]";
}


}
