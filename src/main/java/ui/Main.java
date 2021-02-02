package ui;

import java.util.List;
import java.util.Scanner;

import mavenGroceryStore.Article;
import mavenGroceryStore.Cart;
import mavenGroceryStore.GroceryStore;
import mavenGroceryStore.MainMethods;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		GroceryStore ica = new GroceryStore("Ica");
		Cart cart = new Cart();

		ica.addArticle("Banana", 5);
		ica.addArticle("Apple", 7);
		ica.addArticle("Chocolate", 15);

		System.out.printf("Welcome to %s! \n", ica.getName());

		int answer = 0;
		// main loop, runs as long as user is in the store(not saying leave)
		do {
			List<Article> allArticles = ica.getArticles();
			// loop that asks what the user wants to do
			answer = MainMethods.options(scan, answer);
			// if customer answers 4 they stop the loop
			if (answer == 4) {
				break;
			} else if (answer == 1) {
				// This loop will continue until customer doesn't want to add anything to the
				// cart
				answer = MainMethods.itemLoop(scan, cart, answer, allArticles);
			} else if (answer == 2) {
				System.out.println(cart.printCart());
				MainMethods.displayRemoveArticles(scan, cart, answer);
			} else if (answer == 3) {
				System.out.printf("Your total is: %dkr /n", Article.sumArticlesInCart(cart.getCart()));
				break;
			}
		} while (true);
		System.out.printf("Thank you for coming to %s! Please come again.", ica.getName());

		scan.close();
	}

}
