package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="Employee_new")
public class Employee {
  
	private int eid;
	private String fname,lname,uname;
	private Department dept;
	
	 @Id
	 @GenericGenerator(name="inc",strategy = "increment")
	 @GeneratedValue(generator ="inc")
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Column(name="FNAME")
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Column(name="LNAME")
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Column(name="UNAME")
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="DEPT")
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
}
