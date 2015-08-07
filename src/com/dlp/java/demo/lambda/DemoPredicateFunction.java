package com.dlp.java.demo.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoPredicateFunction {
	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java", "DotNet", "Scala",
				"C++", "Haskell", "Lisp");

		// using filterScan method Predicate function
		System.out.println("Language which starts with J");
		filterScan(languages, (str) -> str.startsWith("J"));

		// using filterScanAdvance method with stream API
		System.out.println("\n\nLanguage which ends with a");
		filterScanAdvance(languages, (str) -> str.endsWith("a"));

		// using inline stream API with predicate
		System.out.println("\n\nLanguage which has length more than 4");
		languages.stream().filter((language) -> language.length() > 4)
				.forEach((str) -> System.out.print(str + " "));

		// combining predicate with and
		System.out
				.print("\n\nName, which starts with 'J' and four letter long is : ");
		Predicate<String> startsWithJ = (str) -> str.startsWith("J");
		Predicate<String> fourLetterLong = (str) -> str.length() == 4;
		languages.stream().filter(startsWithJ.and(fourLetterLong))
				.forEach((str) -> System.out.print(str + " "));

		// combining predicate with or
		System.out
				.print("\n\nName, which starts with 'J' or four letter long is : ");
		languages.stream().filter(startsWithJ.or(fourLetterLong))
				.forEach((str) -> System.out.print(str + " "));

	}

	private static void filterScan(List<String> languages,
			Predicate<String> condition) {
		for (String str : languages) {
			if (condition.test(str))
				System.out.print(str + " ");
		}
	}

	private static void filterScanAdvance(List<String> languages,
			Predicate<String> condition) {
		languages.stream().filter(condition)
				.forEach((str) -> System.out.print(str + " "));
	}

}
