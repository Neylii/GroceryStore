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

	public String getName() {
		return name;
	}

	public List<Article> getArticles() {
		return articles;
	}
}