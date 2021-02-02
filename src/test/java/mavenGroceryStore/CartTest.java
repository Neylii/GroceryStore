package mavenGroceryStore;

import static org.junit.Assert.*;

import org.junit.Test;

// TestClass for Cart
public class CartTest {

	private Cart testCart;
	private Article art1;
	private Article art2;

	// Creates objects for easy use throughout the testing.
	public CartTest() {
		testCart = new Cart();
		art1 = new Article("Apple", 10);
		art2 = new Article("Banana", 10);
	}

	@Test
	public void testAddArticleToCart() {
		testCart.addArticleToCart(art1);
		testCart.addArticleToCart(art2);

		assertEquals(2, testCart.getCart().size());
	}

	@Test
	public void testRemoveArticleFromCart() {
		testCart.addArticleToCart(art1);
		testCart.addArticleToCart(art2);
		testCart.removeArticleFromCart(art1);

		assertFalse(testCart.getCart().containsKey(art1));
	}

	@Test
	public void testPrintCart() {
		testCart.addArticleToCart(art1);
		testCart.addArticleToCart(art1);

		assertEquals("You have: \n" + 1 + " : Apple x " + 2 + "\n", testCart.printCart());
	}
}