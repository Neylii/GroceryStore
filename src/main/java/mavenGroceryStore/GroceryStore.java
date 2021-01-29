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