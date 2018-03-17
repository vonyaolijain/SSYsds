package com.xxgc.bean;

public class Student {
    private Integer id;

    private String name;

    private String address;

    private Integer cid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", cid=" + cid + "]";
	}
}