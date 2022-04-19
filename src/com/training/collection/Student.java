package com.training.collection;

public class Student implements Comparable<Student>{

	private String name;
	private int rollNo;
	private String grade;
	public Student(String name, int rollNo, String grade) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public int compareTo(Student o) {
//		Sorts treeset items by name
//		return this.getName().compareTo(o.getName()); 
//		sorts treeset items (students) by roll number
		if(this.getRollNo() > o.getRollNo()) {
			return 1;
		} else if(this.getRollNo() < o.getRollNo()) {
			return -1;
		} else {
			return 0;
		}
	
	}
}
