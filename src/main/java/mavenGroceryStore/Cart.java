package mavenGroceryStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class creates a cart which serves as a grocery cart for 
 * the user to put selected Articles in.
 * 
 * @author emma.fredriksson
 */
public class Cart {
	private List<Article> cart;

	/**
	 * Constructor sets the cart to an ArrayList.
	 */
	public Cart() {
		cart = new ArrayList<Article>();
	}

	public List<Article> getCart() {
		return cart;
	}

	/**
	 * Adds Article from the grocery store to cart.
	 * 
	 * @param Article to be added.
	 */
	public void addItemToCart(Article article) {
		cart.add(article);
	}

	/**
	 * Removes Article from cart.
	 * 
	 * @param Article to be removed
	 */
	public void removeItemFromCart(Article article) {
		if (cart.contains(article)) {
			cart.remove(cart.indexOf(article));
		}
	}

	/**
	 * This method counts the frequency of Articles in the ArrayList. 
	 * Maps them to a TreeMap and thereafter loops through the Map. 
	 * Make use of a StringBuilder to print out the content of the list, 
	 * one entry on a new row.
	 * 
	 * @param cart the ArrayList to count.
	 * @return The content of the ArrayList as a string.
	 */
	public String checkItemInCart(List<Article> cart) {
		Map<String, Integer> artCount = new TreeMap<>();
		for (Article article : cart) {
			if (artCount.containsKey(article.getName())) {
				Integer sumOfArt = artCount.get(article.getName());
				artCount.put(article.getName(), ++sumOfArt);
			} else {
				artCount.put(article.getName(), 1);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, Integer> entry : artCount.entrySet()) {
			sb.append((entry.getKey() + " : " + entry.getValue() + "\n"));
		}
		return sb.toString();
	}
}