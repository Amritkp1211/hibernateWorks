package com.bean;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="Department")
public class Department {
	 private int did;
	 private String dname,location;
	 private Collection<Employee> emp;
	 
	 @Id
	 @GenericGenerator(name="inc",strategy = "increment")
	 @GeneratedValue(generator ="inc")
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	@Column(name="DNAME")
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Column(name="LOCATION")
     public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "dept")
	public Collection<Employee> getEmp() {
		return emp;
	}
	public void setEmp(Collection<Employee> emp) {
		this.emp = emp;
	}

}
