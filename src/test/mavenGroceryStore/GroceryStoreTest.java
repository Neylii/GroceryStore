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
}
