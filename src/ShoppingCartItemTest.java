import static org.junit.Assert.*;

import org.junit.Test;


public class ShoppingCartItemTest {

	@Test
	public void testGetproduct() {
		
		Offer offer = new Offer(Offer.OFFER_TYPE_BUY_X_GET_Y_FREE,2,5);
		Product prod = new Product("A", 10, offer);
		ShoppingCartItem cartItem = new ShoppingCartItem(prod, 10);
		assertEquals("Pass",prod, cartItem.getproduct());
		
	}

	@Test
	public void testGetquantity() {
		Offer offer = new Offer(Offer.OFFER_TYPE_BUY_X_GET_Y_FREE,2,5);
		Product prod = new Product("A", 10, offer);
		ShoppingCartItem cartItem = new ShoppingCartItem(prod, 10);
		assertEquals("Pass", 10, cartItem.getquantity(), 0.0);
	}

}
