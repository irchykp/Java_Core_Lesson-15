package ua.lviv.lgs;

import java.util.Scanner;

public class Application {
	public static void menu() {
		System.out.println("Enter 1 to add person ...");
		System.out.println("Enter 2 to add pet...");
		System.out.println("Enter 3 to delete pet...");
		System.out.println("Enter 4 to delete person ...");
		System.out.println("Enter 5 to delete specific pet from all person...");
		System.out.println("Enter 6 to get zooclub ...");
		System.out.println("Enter 7 to exit ...");
	}

	public static void main(String[] args) {
		ZooClub zc = new ZooClub();
		
		boolean work = true;
		while (work) {
			menu();
			Scanner scanner = new Scanner(System.in);
			int i = scanner.nextInt();

			switch (i) {
			case 1:
				zc.addPerson();
				break;

			case 2:
				zc.addPet();
				break;

			case 3:
				zc.deletePet();
				break;

			case 4:
				zc.deletePerson();
				break;

			case 5:
				zc.deleteSpecificPet();
				break;

			case 6:
				zc.getZooClub();
				break;

			case 7:
			default:
				work = false;
				break;
			}
		}
	}
}