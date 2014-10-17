import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.PortableInterceptor.SUCCESSFUL;


public class SuperMarketImplTest {

	@Test
	public void testCheckoutList1() {
		String s = "ABBACBBAB";
		SuperMarketImpl superMarketTest = new SuperMarketImpl();
		if (superMarketTest.checkout(s) != 240)
		{
			fail("Not yet implemented");//("ABBACBBAB list tested as successful");
		}
	}
		
		public void testCheckoutList2() {
			String s = "ABBACBBABD";
			SuperMarketImpl superMarketTest = new SuperMarketImpl();
			if (superMarketTest.checkout(s) != 0)
			{
				fail("Not yet implemented");//("ABBACBBAB list tested as successful");
			}		
	}

}
