package mavenGroceryStore;

import static org.junit.Assert.*;

import org.junit.Test;

public class GroceryStoreTest {
	private GroceryStore gs;

	public GroceryStoreTest() {
		gs = new GroceryStore("Ica Kvantum");
	}

	@Test
	public void testName() {
		assertEquals("Ica Kvantum", gs.getName());
	}

	@Test
	public void testAddArticle() {
		gs.addArticle("Banana", 5);
		assertEquals("Banana", gs.getArticles().get(0).getName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddArticleWithNegativePrice() {
		gs.addArticle("Banana", -10);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddArticleThatAlreadyExist() {
		gs.addArticle("Banana", 5);
		gs.addArticle("Banana", 5);
	}
}
