package mavenGroceryStore;

import java.util.ArrayList;
import java.util.List;

public class GroceryStore {
	private String name;
	private List<Article> articles;
	
	public GroceryStore(String name) {
		this.name = name;
		articles = new ArrayList<Article>();
	}
	
	public void addArticle(String name, int price) {
		if(price < 0) {
			throw new IllegalArgumentException("The price can't be negative.");
		}
		for(Article article : articles) {
			if(article.getName().toLowerCase().equals(name.toLowerCase())) {
				throw new IllegalArgumentException("The article already exists.");
			}
		}
		articles.add(new Article(name, price));
		}

	public String getName() {
		return name;
	}

	public List<Article> getArticles() {
		return articles;
	}
	
	public String toString() {
		return String.format("Welcome to %s!", name);
	}
}