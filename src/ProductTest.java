import static org.junit.Assert.*;

import org.junit.Test;


public class ProductTest {

	@Test
	public void testGetProductCode() {
		
		Offer offer = new Offer(Offer.OFFER_TYPE_BUY_X_GET_Y_FREE, 2,5);
		Product prod = new Product("A", 10, offer);
		assertEquals("Pass", "A", prod.getProductCode());
	}

	@Test
	public void testGetProductPrice() {
		Offer offer = new Offer(Offer.OFFER_TYPE_BUY_X_GET_Y_FREE, 2,5);
		Product prod = new Product("A", 10, offer);
		assertEquals( "Pass", 10, prod.getProductPrice(), 0.0);
	}

	@Test
	public void testGetOffer() {
		Offer offer = new Offer(Offer.OFFER_TYPE_BUY_X_GET_Y_FREE, 2,5);
		Product prod = new Product("A", 10, offer);
		assertEquals( "Pass", offer, prod.getOffer());
	}

}
