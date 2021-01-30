package mavenGroceryStore;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArticleTest {
	
	@Test
	public void testName() {
		Article apple = new Article("Apple", 8);
		assertEquals("Apple", apple.getName());
	}

}
