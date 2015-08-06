package com.dlp.java.demo.lambda;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class DemoComparatorSort {
	public static void main(String[] args) {
		List<Person> personList = getPersonList();

		System.out.println("List before sorting");
		printList(personList);

		System.out.println("\nList after age based sorting");
		Comparator<Person> ageComparator = (person1, person2) -> person1
				.getAge() - person2.getAge();
		personList = getPersonList();
		personList.sort(ageComparator);
		printList(personList);

		System.out.println("\nList after age based sorting in reverse order");
		personList = getPersonList();
		personList.sort(ageComparator.reversed());
		printList(personList);

		System.out.println("\nList after name based sorting");
		Comparator<Person> nameComparator = (person1, person2) -> person1
				.getName().compareTo(person2.getName());
		personList = getPersonList();
		personList.sort(nameComparator);
		printList(personList);

		System.out.println("\nList after name based sorting in revere order");
		personList = getPersonList();
		personList.sort(nameComparator.reversed());
		printList(personList);

	}

	private static void printList(List<Person> personList) {
		personList.forEach(person -> System.out.print(person + " "));
	}

	private static List<Person> getPersonList() {
		List<Person> personList = new LinkedList<Person>();
		personList.add(new Person("b", 10));
		personList.add(new Person("c", 30));
		personList.add(new Person("a", 20));
		return personList;
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + "[" + age + "]";
	}

}
