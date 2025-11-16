package com.tnsif.streamex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFunctionDemo {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Nashik", "", "Bangalore", "", "Chennai", "Mumbai", "Pune"); // source
		System.out.println("List of Cities is " + strList);
// retrieve the stream
		Stream<String> stream = strList.stream();

		// Counting the empty strings
		long count = streamFunctions.countEmptyStrings(stream);
		System.out.printf("List %s has %d empty strings \n", strList, count);
		// System.out.println("List "+strList+" has "+count+" empty strings");
// Counting String with length more than 8

		count = streamFunctions.countStrings(strList.stream(), 8);
		System.out.printf("List %s has %d strings of length more than 8 \n", strList, count);

		// Remove all empty Strings from List
		List<String> filteredList = streamFunctions.nonEmptyStringList(strList.stream());
		System.out.printf("Original List : %s, List without Empty Strings : %s \n", strList, filteredList);
// Strings with length more than 6
		filteredList = streamFunctions.getStrings(strList.stream(), 6);
		System.out.printf("Original List : %s, Cities length more than 6: %s %n", strList, filteredList);

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		// retrieve the stream
		Stream<Integer> stream1 = numbers.stream();
// List of square of all distinct numbers
		List<Integer> filteredNumberList = streamFunctions.getSquareList(stream1);
		System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, filteredNumberList);

		// Get count, min, max, sum, and average for numbers
		streamFunctions.showStatistics(numbers.stream());

	}

}
