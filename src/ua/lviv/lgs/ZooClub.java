package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {

	private Map<Person, List<Animal>> map = new HashMap<>();

	public Map<Person, List<Animal>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Animal>> map) {
		this.map = map;
	}

	public void addPerson() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name of person...");
		String name = scanner.next();

		System.out.println("Enter age of person... !");
		int age = scanner.nextInt();

		map.put(new Person(name, age), new ArrayList<>());
	}

	public void addPet() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name of person !");
		String name = scanner.next();

		System.out.println("Enter type of pet !");
		String petType = scanner.next();

		System.out.println("Enter name of pet !");
		String petName = scanner.next();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				next.getValue().add(new Animal(petType, petName));
			}
		}
	}

	public void deletePet() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name of person !");
		String personName = scanner.next();

		System.out.println("Enter name of pet !");
		String petName = scanner.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(personName)) {
				Iterator<Animal> iterator2 = next.getValue().iterator();
				while (iterator2.hasNext()) {
					if (iterator2.next().getName().equals(petName)) {
						iterator2.remove();
					}
				}

			}
		}
	}

	public void deletePerson() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name of person...");
		String name = scanner.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				iterator.remove();
			}
		}
	}

	public void deleteSpecificPet() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter type of pet...");
		String type = scanner.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();

			Iterator<Animal> iterator2 = next.getValue().iterator();
			while (iterator2.hasNext()) {
				if (iterator2.next().getType().equals(type)) {
					iterator2.remove();
				}
			}
		}
	}

	public void getZooClub() {
		System.out.println(map);
	}

}
