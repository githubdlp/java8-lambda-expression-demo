package com.dlp.java.demo.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoMapReduce {
	public static void main(String[] args) {

		List<Integer> priceExcludedTax = Arrays.asList(100, 200, 300, 400, 500);
		// adding 20% tax
		priceExcludedTax.stream().map((cost) -> cost + .20 * cost)
				.forEach(System.out::println);

		// adding 20% tax and creating a list
		System.out.println("List of price including tax : "
				+ priceExcludedTax.stream().map((cost) -> cost + .20 * cost)
						.collect(Collectors.toList()));

		// adding 20% tax and formatting with a comma
		System.out.println("Formatted price including tax : "
				+ priceExcludedTax.stream()
						.map((cost) -> String.valueOf(cost + .20 * cost))
						.collect(Collectors.joining(", ")));

		// adding up price after tax
		System.out.println("Total price : "
				+ priceExcludedTax.stream().map((cost) -> cost + .20 * cost)
						.reduce((sum, cost) -> sum + cost).get());

	}
}
