package mavenGroceryStore;

import java.util.Map;
import java.util.HashMap;

/**
 * This class creates a cart which serves as a grocery cart for the user to put
 * selected Articles in.
 * 
 * @author emma.fredriksson
 */
public class Cart {
	Map<Article, Integer> cart;

	/**
	 * Constructor sets the cart to a HashMap.
	 */
	public Cart() {
		cart = new HashMap<>();
	}

	public Map<Article, Integer> getCart() {
		return cart;
	}

	/**
	 * Adds Article from the grocery store to cart.
	 * 
	 * @param Article to be added.
	 */
	public void addArticleToCart(Article article) {
		if (cart.containsKey(article)) {
			Integer articleCount = cart.get(article);
			cart.put(article, ++articleCount);
		} else {
			cart.put(article, 1);
		}
	}

	/**
	 * Removes Article from cart.
	 * 
	 * @param Article to be removed
	 */
	public void removeArticleFromCart(Article article) {
		if (cart.containsKey(article)) {
			Integer sumOfArt = cart.get(article);
			cart.put(article, --sumOfArt);
		}
		if (cart.containsKey(article) && cart.containsValue(0)) {
			cart.remove(article);
		}
	}

	/**
	 * Make use of a StringBuilder to print out the content of the HashMap, one
	 * entry on a new row.
	 * 
	 * @return The content of the HashMap as a string.
	 */
	public String printCart() {
		StringBuilder sb = new StringBuilder();
		int i = 1;
		sb.append("You have: \n");
		for (Map.Entry<Article, Integer> entry : cart.entrySet()) {
			sb.append(i + " : " + entry.getKey().getName() + " x " + entry.getValue() + "\n");
			i++;
		}
		return sb.toString();
	}

}