package mavenGroceryStore;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class creates a cart which serves as a grocery cart for the user to put
 * selected Articles in.
 * 
 * @author emma.fredriksson
 */
public class Cart {
	private List<Article> cartList;
	private Map<Article, Integer> cart;

	/**
	 * Constructor sets the cartList to an ArrayList and cart to a HashMap.
	 */
	public Cart() {
		cartList = new ArrayList<>();
		cart = new HashMap<>();
	}
	public List<Article> getCartList() {
		return cartList;
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
		if(!cartList.contains(article))
		cartList.add(article);
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
			cartList.remove(article);
		}
	}

	/**
	 * Make use of a StringBuilder to print out the content of the cart, one
	 * entry on a new row.
	 * 
	 * @return The content of the HashMap as a string.
	 */
	public String printCart() {
		StringBuilder sb = new StringBuilder();
		int i = 1;
		sb.append("\nYou have: \n");
		for (Article article : cartList) {
			sb.append(i + ": " + article.getName() + " x " + cart.get(article) + "\n");
			i++;
		}
		return sb.toString();
	}

}