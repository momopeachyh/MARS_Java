package com.training.collection;

import java.util.*;


public class HashCodeSet {

	public static void main(String[] args) {
		Student stud1 = new Student("Sara", 32, "B");
		Student stud2 = new Student("Mark", 12, "C");
		Student stud3 = new Student("Dave", 19, "A");
		Student stud4 = new Student("Kevin", 23, "B");
		Student stud5 = new Student("Sara", 32, "B");

		Set<Student> studentList = new HashSet<>();
		studentList.add(stud1);
		studentList.add(stud2);
		studentList.add(stud3);
		studentList.add(stud4);
		studentList.add(stud5);
		
		for(Student student:studentList) {
			System.out.println(student.getStudentName());
		}
		
	}

}
