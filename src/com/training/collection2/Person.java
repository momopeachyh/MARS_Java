package com.training.collection2;

public class Person {
//	public class Person implements Comparable<Person> {
String firstName;
int id;
String grade;

public Person(String firstName, int id, String grade) {
	super();
	this.firstName = firstName;
	this.id = id;
	this.grade = grade;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
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

//@Override
//public int compareTo(Person o) {
//	to display names in alphabetical order
//	typecasting o, if you want to (if you use this, don't use generic in line 3 and use stud.getFirstName() below)
//	Person stud = (Person)o;
//	return this.getFirstName().compareTo(o.getFirstName());

//	to sort names by id
//	if(this.getId() > o.getId()) {
//		return 1;
//	} else if(this.getId() < o.getId()) {
//		return -1;
//	} else {
//		return 0;
//	}
//}

}
