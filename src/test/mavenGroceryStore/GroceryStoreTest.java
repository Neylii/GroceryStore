package mavenGroceryStore;

import static org.junit.Assert.*;

import org.junit.Test;

public class GroceryStoreTest {

	@Test
	public void testName() {
		GroceryStore gs = new GroceryStore("Ica Kvantum");
		assertEquals("Ica Kvantum", gs.getName());
	}
}
