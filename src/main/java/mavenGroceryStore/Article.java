package mavenGroceryStore;

import java.util.Map;

/**
 * This class creates an Article to be used in the GroceryStore.
 * 
 * @author Tom.Karlsson
 */

public class Article {
	private String name;
	private int price;

	/**
	 * Constructor to set name and price
	 * @param name name of the article
	 * @param price price of the article
	 */
	public Article(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	/**
	 * This method adds up all the articles in the cart.
	 * @param cart, the cart to sum the articles in.
	 * @return the sum of all articles in the cart
	 */
	public static int sumArticlesInCart(Map<Article, Integer> cart) {
		int sum = 0;
		for (Map.Entry<Article, Integer> entry : cart.entrySet()) {
			sum += entry.getKey().getPrice() * entry.getValue();
		}
		return sum;
	}
}
