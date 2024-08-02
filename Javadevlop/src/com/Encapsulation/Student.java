package com.Encapsulation;

public class Student {
	String name;
	int rollno;
	String dep;
	int mobileno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", dep=" + dep + ", mobileno=" + mobileno + "]";
	}

	
	
}
