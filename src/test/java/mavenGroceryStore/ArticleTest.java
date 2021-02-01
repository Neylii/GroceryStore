package mavenGroceryStore;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArticleTest {
	
	private Cart myCart;
	private Article art1;
	private Article art2;
	
	// To simplify testing
	public ArticleTest() {
		myCart = new Cart();
		art1 = new Article("Apple", 10);
		art2 = new Article("Banana", 10);
	}
	
	@Test
	public void testRightName() {
		assertEquals("Apple", art1.getName());
	}
	
	@Test
	public void testRightPrice() {
		assertEquals(10, art1.getPrice());
	}

    @Test
    public void testRightSumArticlesInCart() {
    	myCart.addItemToCart(art1);
    	myCart.addItemToCart(art2);
    	
        assertEquals(20, Article.sumArticlesInCart(myCart.getCart()));
    }

    @Test
    public void testWrongSumArticlesInCart() {
        assertFalse(Article.sumArticlesInCart(myCart.getCart()) == 10);
    }
}
