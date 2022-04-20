package com.training.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Student stud1 = new Student("Sara", 32, "B");
		Student stud2 = new Student("Mark", 12, "C");
		Student stud3 = new Student("Dave", 19, "A");
		Student stud4 = new Student("Kevin", 23, "B");
//		new object created in heap memory.
		Student stud5 = new Student("Sara", 12, "B");
		
		Set<Student> studentSet = new TreeSet<>();
		
//		to sort a hashset
//		Set<Student> studentSet = new TreeSet<>();
		
//		Map<String, Student> studentMap = new HashMap<>();
		
//		studentMap.put("1", stud1);
//		studentMap.put("2", stud2);
//		studentMap.put("3", stud3);
//		studentMap.put("4", stud4);
//		studentMap.put("5", stud5);
		
//		for(Map.Entry<String, Student> entry : studentMap.entrySet()) {
//			String key = entry.getKey();
//			Student student = entry.getValue();
//			System.out.println("Name: " +student.getName() + " Grade: " + student.getGrade());
//		}
		
//		List<Student> studentList = new ArrayList<>();
//		
		studentSet.add(stud1);
		studentSet.add(stud2);
		studentSet.add(stud3);
		studentSet.add(stud4);
		
		for(Student student:studentSet) {
			System.out.println("Name: " + student.getName() + " rollNo: " + student.getRollNo());
		}
		
		
//		
//	Set <Integer> values = new HashSet<>();
////	List<Integer> values = new ArrayList<>();
//	values.add(2);
//	values.add(6);
//	values.add(8);
//	values.add(3);
//	values.add(2); //Does not print if in set because it's a duplicate value
//	
//	for(int num : values) {
//		System.out.println(num);
//	}

//	for(Student student: studentSet) {
//		System.out.println("Name " + student.getName() );
//	}
	

	}

}
