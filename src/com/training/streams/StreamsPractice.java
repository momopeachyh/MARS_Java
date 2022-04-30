package com.training.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractice {

	public static void main(String[] args) {
		
		List<Vegetable> vegetables = getVegetables();
		
//		List<Vegetable> longVeg = new ArrayList<>();
//	    for (Vegetable vegetable : vegetables) {
//	      if (vegetable.getAverageLength() >= 7) {
//	        longVeg.add(vegetable);
//	      }
//	    }
//	    longVeg.forEach(System.out::println);
//	
//		}
	
		 List<Vegetable> longVeg = vegetables.stream()
			        .filter(vegetable -> vegetable.getAverageLength() >= 7)
			        .collect(Collectors.toList());
	    longVeg.forEach(System.out::println);
	}
	
	private static List<Vegetable> getVegetables() {
		
		return List.of(
				new Vegetable("zucchini", "green", 8),
				new Vegetable("broccoli", "green", 7),
				new Vegetable("corn", "yellow", 6),
				new Vegetable("eggplant", "purple", 7),
				new Vegetable("lettuce", "green", 6),
				new Vegetable("kohlrabi", "white", 4)
		);
	}
}


		
		


