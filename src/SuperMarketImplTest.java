import static org.junit.Assert.*;

import org.junit.Test;


public class SuperMarketImplTest {

	@Test
	public void testCheckout() {
		
		SuperMarketImpl superMarket = new SuperMarketImpl();
		double invoiceVal = superMarket.checkout("ABBACBBAB");
		assertEquals("Test pass", 240.00, invoiceVal, 0.0);
				
	}

	@Test
	public void testCheckout2() {
		
		SuperMarketImpl superMarket = new SuperMarketImpl();
		double invoiceVal = superMarket.checkout("ABBACBBABB");
		assertEquals("Test pass", 290.00, invoiceVal, 0.0);
				
	}
	
	@Test
	public void testCheckout3() {
		
		SuperMarketImpl superMarket = new SuperMarketImpl();
		double invoiceVal = superMarket.checkout("ABBACBBABBD");
		assertEquals("Test pass", 0.0, invoiceVal, 0.0);
				
	}
	
	@Test
	public void testCheckout4() {
		
		SuperMarketImpl superMarket = new SuperMarketImpl();
		double invoiceVal = superMarket.checkout(null);
		assertEquals("Test pass", 0.0, invoiceVal, 0.0);
				
	}
}
