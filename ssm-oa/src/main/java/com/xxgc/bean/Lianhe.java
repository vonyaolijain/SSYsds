package com.xxgc.bean;

public class Lianhe {
	 private Integer pid;

	    private String pname;

	    private String pdesc;

	    private String purl;
	    private Integer id;

	    private Integer pid1;

	    private Integer rid;

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
			this.pname = pname;
		}

		public String getPdesc() {
			return pdesc;
		}

		public void setPdesc(String pdesc) {
			this.pdesc = pdesc;
		}

		public String getPurl() {
			return purl;
		}

		public void setPurl(String purl) {
			this.purl = purl;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getPid1() {
			return pid1;
		}

		public void setPid1(Integer pid1) {
			this.pid1 = pid1;
		}

		public Integer getRid() {
			return rid;
		}

		public void setRid(Integer rid) {
			this.rid = rid;
		}

		@Override
		public String toString() {
			return "Lianhe [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + ", purl=" + purl + ", id=" + id
					+ ", pid1=" + pid1 + ", rid=" + rid + "]";
		}
	    
}
