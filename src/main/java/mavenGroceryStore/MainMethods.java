package mavenGroceryStore;

import java.util.List;
import java.util.Scanner;

public class MainMethods {

	public static int options(Scanner scan, int answer) {
		do {
			System.out.println("\nWhat do you wish to do?");
			System.out.println("1: Buy articles");
			System.out.println("2: Check cart");
			System.out.println("3: Pay");
			System.out.println("4: Leave");
			if (scan.hasNextInt()) {
				answer = scan.nextInt();
			} else {
				scan.nextLine();
				System.out.println("Choose a number");
			}
		} while (answer < 1 || answer > 4);
		return answer;
	}

	public static void displayRemoveArticles(Scanner scan, Cart cart, int answer) {
		if (removeItemCheck(scan)) {
			while (true) {
				System.out.println("\nWhat article do you want to remove?");
				System.out.println("0: None");
				cart.printCart();
				if (scan.hasNextInt()) {
					answer = scan.nextInt();
					if (answer == 0) {
						break;
						// checks if customer adds an article we have
					} else if (answer < 1 || answer > cart.getCart().size()) {
						System.out.println("We dont have that article");
					} else {
					}
				} else {
					scan.nextLine();
					System.out.println("Not a number");
				}
			}
		}
	}

	private static boolean removeItemCheck(Scanner scan) {
		scan.nextLine();
		int answer;
		System.out.println("Do you wish to remove an item? (1=yes, 2=no)");
		do {
			if (scan.hasNextInt()) {
				answer = scan.nextInt();
				if (answer == 1) {
					return true;
				} else if (answer == 2) {
					return false;
				} else {
					System.out.println("Incorrect answer");
				}
			} else {
				scan.nextLine();
				System.out.println("Try again");
			}
		} while (true);
	}

	public static int itemLoop(Scanner scan, Cart cart, int answer, List<Article> allArticles) {
		while (true) {
			System.out.println("\nWhat article do you want to buy?");
			System.out.println("0: None");
			// loops all articles and shows them on screen.
			for (int i = 1; i < allArticles.size() + 1; i++) {
				System.out.printf("%d: Article: %s Price: %dkr\n", i, allArticles.get(i - 1).getName(),
						allArticles.get(i - 1).getPrice());
			}
			if (scan.hasNextInt()) {
				answer = scan.nextInt();
				if (answer == 0) {
					break;
					// checks if customer adds an article we have
				} else if (answer < 1 || answer > allArticles.size()) {
					System.out.println("We dont have that article");
				} else {
					// adds article to cart
					System.out.printf("You added %s to your cart \n", allArticles.get(answer - 1).getName());
					cart.addArticleToCart(allArticles.get(answer - 1));
				}
			} else {
				scan.nextLine();
				System.out.println("Not a number");
			}
		}
		return answer;
	}
}