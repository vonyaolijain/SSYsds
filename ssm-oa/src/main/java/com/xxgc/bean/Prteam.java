package com.xxgc.bean;

public class Prteam {
    private Integer id;

    private Integer pid;

    private Integer rid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

	@Override
	public String toString() {
		return "Prteam [id=" + id + ", pid=" + pid + ", rid=" + rid + "]";
	}
    
}