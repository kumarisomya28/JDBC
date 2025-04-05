package com.ems.model;

import java.util.Objects;

public class Employee {
	public Employee(int id,String ename,String job) {
		this.id=id;
		this.ename=ename;
		this.job=job;
	}
	
	public Employee(){
		
	}
	
	private int id;
	private String ename;
	private String job;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", job=" + job + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ename, id, job);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(ename, other.ename) && id == other.id && Objects.equals(job, other.job);
	}
	
	
	
	
	

}
