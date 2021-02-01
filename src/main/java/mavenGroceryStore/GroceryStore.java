package mavenGroceryStore;

import java.util.ArrayList;
import java.util.List;

/**
 * This class creates a new Grocery store
 * You can add articles to the store that will be available for purchase
 * 
 * @author niklas.johansson
 *
 */

public class GroceryStore {
	private String name;
	private List<Article> articles;
	
	public GroceryStore(String name) {
		this.name = name;
		articles = new ArrayList<Article>();
	}
	
	/**
	 * Creates a new article and adds it to the store
	 * 
	 * @param name the name of the article you want to add
	 * @param price the price of the article you want to add
	 */
	public void addArticle(String name, int price) {
		if(price < 0) {
			throw new IllegalArgumentException("The price can't be negative.");
		}
		for(Article article : articles) {
			if(article.getName().trim().toLowerCase().equals(name.trim().toLowerCase())) {
				throw new IllegalArgumentException("The article already exists.");
			}
		}
		articles.add(new Article(name.trim(), price));
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