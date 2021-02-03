package mavenGroceryStore;

import static org.junit.Assert.*;

import org.junit.Test;

public class GroceryStoreTest {

	@Test
	public void testName() {
		GroceryStore gs = new GroceryStore("Ica Kvantum");
		assertEquals("Ica Kvantum", gs.getName());
	}
	
	@Test
	public void testAddArticle() {
		GroceryStore gs = new GroceryStore("Ica Kvantum");
		gs.addArticle("Banana", 5);
		assertEquals("Banana", gs.getArticles().get(0).getName());
	}
	
	@Test
	public void testAddArticleWithNegativePrice() { 
		GroceryStore gs = new GroceryStore("Ica Kvantum");
		assertThrows(IllegalArgumentException.class, () -> gs.addArticle("Banana", -10));
	}
	
	@Test
	public void testAddArticleThatAlreadyExist() {
		GroceryStore gs = new GroceryStore("Ica Kvantum");
		gs.addArticle("Banana", 5);
		assertThrows(IllegalArgumentException.class, () -> gs.addArticle("BaNana ", 5));
	}
}
