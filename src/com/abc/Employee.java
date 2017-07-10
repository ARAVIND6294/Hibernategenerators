package com.abc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee 
{
	@Id
	@Column(name="eid")
	@GeneratedValue(strategy=GenerationType.AUTO)
  private int eid;
	//@Transient
	@Column(name="name")
  private String ename;
	@Column(name="salary")
  private String esalary;
  public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEsalary() {
	return esalary;
}
public void setEsalary(String esalary) {
	this.esalary = esalary;
}

}
