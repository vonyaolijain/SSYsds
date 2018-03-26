package com.xxgc.bean;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Role {
    private Integer id;

    private String rname;

    private String rdesc;

    private List<Power> power;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRdesc() {
        return rdesc;
    }

    public void setRdesc(String rdesc) {
        this.rdesc = rdesc == null ? null : rdesc.trim();
    }

	
	public List<Power> getPower() {
		return power;
	}

	public void setPower(List<Power> power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", rname=" + rname + ", rdesc=" + rdesc + ", power=" + power + "]";
	}

	
}