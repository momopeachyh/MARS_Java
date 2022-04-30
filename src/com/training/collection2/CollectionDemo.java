package com.training.collection2;

import java.util.*;


public class CollectionDemo {

	public static void main(String[] args) {
		Person stud1 = new Person ("Philward", 12, "F");
		Person stud2 = new Person ("Annie", 34, "D");
		Person stud3 = new Person ("Gemima", 29, "C");
		Person stud4 = new Person ("Darcy", 66, "B");
		
		List<Person> personSet = new ArrayList<>();
		
//		treeset works because Person class has comparable
//		Set<Person> personSet = new TreeSet<>();
		personSet.add(stud1);
		personSet.add(stud2);
		personSet.add(stud3);
		personSet.add(stud4);
		
	
//		to sort arraylist, use sort method on collections class
//		Collections.sort(personSet);
//		
		
		Collections.sort(personSet, new NameComparator());
		for(Person person:personSet) {
			System.out.println(person.getFirstName() + " " + person.getId());	
		}
	}

}
