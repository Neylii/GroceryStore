package mavenGroceryStore;

import java.util.Scanner;

public class MainMethods {
	
	public static int options(Scanner scan, int answer) {
		do {
			System.out.println("What do you wish to do?");
			System.out.println("1: Buy articles");
			System.out.println("2: Check cart");
			System.out.println("3: Pay");
			System.out.println("4: Leave");
			if (scan.hasNextInt()) {
				answer = scan.nextInt();
			} else {
				scan.nextLine();
				System.out.println("Skriv en siffra");
			}
		} while (answer < 1 || answer > 4);
		return answer;
    }
}