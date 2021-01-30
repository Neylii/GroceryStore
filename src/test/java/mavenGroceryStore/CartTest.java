package mavenGroceryStore;

import static org.junit.Assert.*;

import org.junit.Test;

public class CartTest {

	@Test
	public void testAddItemToCart() {
		Cart myCart = new Cart();
		Article art1 = new Article("Apple", 10);
		Article art2 = new Article("Banana", 10);
		myCart.addItemToCart(art1);
		myCart.addItemToCart(art2);
		
		assertEquals(2, myCart.getCart().size());
	}

	@Test
	public void testRemoveItemFromCart() {
		Cart myCart = new Cart();
		Article art1 = new Article("Apple", 10);
		Article art2 = new Article("Banana", 10);
		myCart.addItemToCart(art1);
		myCart.addItemToCart(art2);
		myCart.removeItemFromCart(art2);
		
		assertFalse(myCart.getCart().contains(art2));
	}

	@Test
	public void testCheckItemInCart() {
		Cart myCart = new Cart();
		Article art1 = new Article("Apple", 10);
		Article art2 = new Article("Apple", 10);
		myCart.addItemToCart(art1);
		myCart.addItemToCart(art2);

		assertEquals("Apple : 2" + "\n", myCart.checkItemInCart(myCart.getCart()));
	}
}
