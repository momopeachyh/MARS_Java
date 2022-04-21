package com.training.collection;
import java.util.*;

public class Student {
	private String studentName;
	private int id;
	private String grade;
	
	public Student(String studentName, int id, String grade) {
		super();
		this.studentName = studentName;
		this.id = id;
		this.grade = grade;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentName, id, grade);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(grade, other.grade) && id == other.id && Objects.equals(studentName, other.studentName);
	}
	
	
}
