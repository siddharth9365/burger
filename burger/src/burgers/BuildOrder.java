package burgers;

import java.util.Scanner;

public class BuildOrder {
	public static void printBurgerMenu() {
		System.out.printf("\t\t-----------------------------------------------------------------------------\n\n");
		System.out.print("\t\t\t\t\t\tSubway Burgers");
		System.out.printf("\n\n\t\t-----------------------------------------------------------------------------");
		System.out.println("\n\t\t1. Basic hamburger on a White roll with Sausage.\n\t\t COST :- 3.60");
		System.out.println("\n\t\t2. Healthy hamburger  on a Brown rye roll with Bacon.\n\t\t COST :- 5.67");
		System.out.println("\n\t\t3. Deluxe hamburger  on a White roll with Sausage & Bacon.\n\t\t COST :- 14.54");
		System.out.println("\n\t\t4. Exit");
		System.out.println("\n\t\tEnter your choice from 1-4");
	}

	public static void printToppingMenu() {
		int count = 1;
		for (Topping topping : Topping.values()) {
			System.out.println(count++ + ". " + topping + " - $" + topping.getPrice());
		}
		System.out.println("14. Exit");
		System.out.println("\nEnter your choice from 1-" + (Topping.values().length+1));
	}

	public static Hamburger getBurgerType() {
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			sc.next();
		}
		int choice = sc.nextInt();
		Hamburger hamburger = null;
		switch (choice) {
		case 1:
			hamburger = new Hamburger();
			break;

		case 2:
			hamburger = new HealthyBurger();
			break;

		case 3:
			hamburger = new DeluxBurger();
			break;

		default:
			System.err.println("Invalid Choice...");
			break;

		}
		return hamburger;
	}

	public static void main(String[] args) {
		boolean flag = false;
		do {
			printBurgerMenu();
			Hamburger hamburger = getBurgerType();
			boolean innerFlag = true;
			Scanner sc = new Scanner(System.in);
			do {
				printToppingMenu();
				while (!sc.hasNextInt()) {
					sc.next();
				}
				int choice = sc.nextInt();
				if (choice < 1 && choice > (Topping.values().length + 1)) {
					System.err.println("Invalid Choice...");
				} else if (choice == 14) {
					innerFlag = false;
				} else {
					hamburger.addToppings(Topping.values()[choice]);
				}
			} while (innerFlag);
			System.out.println(hamburger);
			double subtotal = 0;
			for (Topping topping : hamburger.getToppings()) {
				System.out.println("Added " + topping + " for an extra $" + topping.getPrice());
				subtotal += topping.getPrice();
			}
			System.out.println("Total price :: " + (hamburger.getPrice() + subtotal));
			System.out.println("Do you want another burger??(Y/N)");
			char ans = 'H';
			while( ans != 'Y' && ans != 'N'){
				ans = sc.next().charAt(0);
			}
			flag = ans == 'Y';
		} while (flag);
	}
}
