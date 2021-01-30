package mavenGroceryStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Cart {
	private List<Article> cart;

	public Cart() {
		cart = new ArrayList<Article>();
	}

	public List<Article> getCart() {
		return cart;
	}

	public void addItemToCart(Article a) {
		cart.add(a);
	}

	public void removeItemFromCart(Article a) {
		if (cart.contains(a)) {
			cart.remove(cart.indexOf(a));
		}
	}

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