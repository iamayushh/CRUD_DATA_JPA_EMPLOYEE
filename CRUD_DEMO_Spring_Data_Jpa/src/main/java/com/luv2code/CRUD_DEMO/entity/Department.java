package com.luv2code.CRUD_DEMO.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int DepId;
	private String deptName;
	private int deptSalaty;
	public Department() {
		
		// TODO Auto-generated constructor stub
	}
	public Department(String deptName, int deptSalaty) {
	
		this.deptName = deptName;
		this.deptSalaty = deptSalaty;
	}
	public int getDepId() {
		return DepId;
	}
	public void setDepId(int depId) {
		DepId = depId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptSalaty() {
		return deptSalaty;
	}
	public void setDeptSalaty(int deptSalaty) {
		this.deptSalaty = deptSalaty;
	}
	@Override
	public String toString() {
		return "Department [DepId=" + DepId + ", deptName=" + deptName + ", deptSalaty=" + deptSalaty + "]";
	}
	
	
	
	

}
