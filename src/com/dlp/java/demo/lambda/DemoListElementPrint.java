package com.dlp.java.demo.lambda;

import java.util.LinkedList;
import java.util.List;

public class DemoListElementPrint {

	public static void main(String[] args) {
		List<String> stringList = getStringList();
		// lambda expression to print the list element
		stringList.forEach(string -> System.out.println(string));
	}

	private static List<String> getStringList() {
		List<String> stringList = new LinkedList<String>();
		stringList.add("text1");
		stringList.add("text2");
		stringList.add("text3");
		return stringList;
	}
}
