package com.rohith.webApplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rohith {
	
	@Id
	private int rid;
	private String rname;
	private String remail;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRemail() {
		return remail;
	}
	public void setRemail(String remail) {
		this.remail = remail;
	}
	@Override
	public String toString() {
		return "Rohith [rid=" + rid + ", rname=" + rname + ", remail=" + remail + "]";
	}
	

}
