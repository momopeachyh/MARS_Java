package com.training.collection2;

import java.util.Comparator;

//externalizes sorting/comparable from student object
public class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
	
}

