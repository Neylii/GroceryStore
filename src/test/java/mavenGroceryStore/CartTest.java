package mavenGroceryStore;

import static org.junit.Assert.*;


import org.junit.Test;

// TestClass for Cart
public class CartTest {
	
	private Cart myCart;
	private Article art1;
	private Article art2;
	
	// Creates objects for easy use throughout the testing.
	public CartTest() {
		myCart = new Cart();
		art1 = new Article("Apple", 10);
		art2 = new Article("Banana", 10);
	}

	@Test
	public void testAddItemToCart() {
		myCart.addItemToCart(art1);
		myCart.addItemToCart(art2);
		
		assertEquals(2, myCart.getCart().size());
	}

	@Test
	public void testRemoveItemFromCart() {
		myCart.addItemToCart(art1);
		myCart.addItemToCart(art2);
		myCart.removeItemFromCart(art2);
		
		assertFalse(myCart.getCart().contains(art2));
	}

	@Test
	public void testCheckItemInCart() {
		myCart.addItemToCart(art1);
		myCart.addItemToCart(art1);

		assertEquals("Apple : 2" + "\n", myCart.checkItemInCart(myCart.getCart()));
	}
}
