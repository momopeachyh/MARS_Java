package com.training.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 2, 3, 6, 5, 7, 9); //create list of numbers

		Stream<Integer> numberStream = numbers.stream(); //create stream on numbers collection
		Stream<Integer> squaredValue = numberStream.map(a -> a*a); //call intermediate map method on numbers
	
		List<Integer> updatedNumbers =squaredValue.collect(Collectors.toList());
		List<Integer> newNumbers = numbers.stream().map(a->a*a).collect(Collectors.toList());
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		List<Integer> sortedSquaredNumbers = numbers.stream().map(a->a*a).sorted().collect(Collectors.toList());
//		List<Integer> evenList = numbers.stream().filter(x->(x%2==0)).collect(Collectors.toList());
		numbers.stream().filter(x->(x%2==0)).forEach(y->System.out.println(y));
//		Same output as line 20. 21 is method reference
		numbers.stream().filter(x->(x%2==0)).forEach(System.out::println);
		int sumEven = numbers.stream().filter(x->(x%2==0)).reduce(0,(ans, y) -> ans+y);
		
//		System.out.println(updatedNumbers);
//		System.out.println(newNumbers);
//		System.out.println(sortedNumbers);
//		System.out.println(sortedSquaredNumbers);
//		System.out.println("sum of even numbers: " + sumEven);
//		System.out.println(evenList);
		
		List<String> colors = Arrays.asList("red", "blue", "green", "yellow");
		Stream<String> colorStream = colors.stream();
//		help with line 35, please
//		Stream<String> colorStreamHi = colorStream.map())
//		List<String> colorsHi = colors.stream().map(null)
		
	}

}
// Intermediate operation: map, filter, sort
// terminal operation: collect, forEach, reduce

//Demonstrate different stream operations in a collection of Strings
