package mavenGroceryStore;

import java.util.List;

public class Article {
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Article(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public static int sumArticlesInCart(List<Article> cart) {
		int sum = 0;
		for (Article article : cart) {
			sum += article.getPrice();
		}
		return sum;
	}
}
