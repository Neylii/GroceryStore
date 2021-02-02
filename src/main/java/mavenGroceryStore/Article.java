package mavenGroceryStore;

import java.util.Map;

public class Article {
	private String name;
	private int price;

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
	
	public static int sumArticlesInCart(Map<Article, Integer> cart) {
		int sum = 0;
		for (Map.Entry<Article, Integer> entry : cart.entrySet()) {
			sum += entry.getKey().getPrice() * entry.getValue();
		}
		return sum;
	}
}
