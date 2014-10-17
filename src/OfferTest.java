import static org.junit.Assert.*;

import org.junit.Test;


public class OfferTest {

	@Test
	public void testGetOfferType() {
		Offer offer = new Offer(Offer.OFFER_TYPE_BUY_X_GET_Y_FREE, 2,5);
		assertEquals("Pass", Offer.OFFER_TYPE_BUY_X_GET_Y_FREE, offer.getOfferType());
	}

	@Test
	public void testGetOfferValue() {
		Offer offer = new Offer(Offer.OFFER_TYPE_DOLLAROFF, 10);
		assertEquals("Pass", 10, offer.getOfferValue(),0.0);
	}

	@Test
	public void testGetMultiplier() {
		Offer offer = new Offer(Offer.OFFER_TYPE_BUY_X_GET_Y_FREE, 10,2);
		assertEquals("Pass", 2, offer.getMultiplier());
	}

	@Test
	public void testGetMultiplier2() {
		Offer offer = new Offer(Offer.OFFER_TYPE_BUY_X_GET_Y_FREE, 10);
		assertEquals("Pass", 0, offer.getMultiplier());
	}

}
