package com.xxgc.bean;

import org.springframework.stereotype.Component;

@Component
public class Department {
    private Integer deid;

    private String departmentname;

    private String ddesc;

    public Integer getDeid() {
        return deid;
    }

    public void setDeid(Integer deid) {
        this.deid = deid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getDdesc() {
        return ddesc;
    }

    public void setDdesc(String ddesc) {
        this.ddesc = ddesc == null ? null : ddesc.trim();
    }

	@Override
	public String toString() {
		return "Department [deid=" + deid + ", departmentname=" + departmentname + ", ddesc=" + ddesc + "]";
	}
    
}