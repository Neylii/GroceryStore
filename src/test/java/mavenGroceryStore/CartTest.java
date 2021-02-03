package mavenGroceryStore;

import static org.junit.Assert.*;

import org.junit.Test;

// TestClass for Cart
public class CartTest {

	private Cart testCart;
	private Article art1;
	private Article art2;

	// Creates object for easy use throughout the testing.
	public CartTest() {
		testCart = new Cart();
		art1 = new Article("Apple", 10);
		art2 = new Article("Banana", 10);
	}

	// Check that a new HashMap in cart returns 'true' for isEmpty
	@Test
	public void testHashMapInCartIsEmpty() {

		assertTrue(testCart.getCart().isEmpty());
	}

	// Check that a new ArrayList in cart returns 'true' for isEmpty
	@Test
	public void testArrayListInCartIsEmpty() {

		assertTrue(testCart.getCartList().isEmpty());
	}

	// Test that size of HashMap increases as articles are added
	@Test
	public void testAddArticleToCart() {
		testCart.addArticleToCart(art1);
		testCart.addArticleToCart(art2);

		assertEquals(2, testCart.getCart().size());
	}

	// Test that size of ArrayList increases as articles are added
	@Test
	public void testAddArticleToCartList() {
		testCart.addArticleToCart(art1);
		testCart.addArticleToCart(art2);

		assertEquals(2, testCart.getCartList().size());
	}

	// Test thats the value of an added article increases from 1 to 2 when adding the same
	// article
	@Test
	public void testIncreaseValueOfAddingSameArticle() {
		testCart.addArticleToCart(art1);
		testCart.addArticleToCart(art1);

		assertEquals("2", testCart.getCart().get(art1).toString());
	}

	// Test thats the value of an article decreases from 2 to 1 when removing
	// the same article
	@Test
	public void testDecreaseValueOfRemovingSameArticle() {
		testCart.addArticleToCart(art1);
		testCart.addArticleToCart(art1);
		testCart.removeArticleFromCart(art1);

		assertEquals("1", testCart.getCart().get(art1).toString());
	}

	// Test that containsKey returns 'false' when whole article has been removed
	@Test
	public void testRemoveWholeArticleFromCart() {
		testCart.addArticleToCart(art1);
		testCart.removeArticleFromCart(art1);

		assertFalse(testCart.getCart().containsKey(art1));
	}

	// Test excepted output of StringBuilder
	@Test
	public void testPrintCart() {
		testCart.addArticleToCart(art1);
		testCart.addArticleToCart(art1);

		assertEquals("\nYou have: \n" + 1 + ": Apple x " + 2 + "\n", testCart.printCart());
	}
}