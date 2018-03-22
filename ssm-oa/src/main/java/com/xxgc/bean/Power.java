package com.xxgc.bean;

public class Power {
    private Integer pid;

    private String pname;

    private String pdesc;

    private String purl;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc == null ? null : pdesc.trim();
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl == null ? null : purl.trim();
    }

	@Override
	public String toString() {
		return "Power [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + ", purl=" + purl + "]";
	}
    
}