import java.util.ArrayList;

public class SuperMarketImpl implements SuperMarket {

/**
 * 
 */
public SuperMarketImpl()
{
	this.initialize();
}
private double totalDiscountAmount;
private double totalUndiscountedAmount;
private double totalInvoiceAmount; 
private static Product[] product;


/* (non-Javadoc)
 * @see SuperMarket#checkout(java.lang.String)
 */
public double checkout(String items) {

	ArrayList<ShoppingCartItem> shoppingCart = new ArrayList<ShoppingCartItem>();
	
	
	if(validateInputString(items))
	{
		for (int i = 0; i < product.length ; i++)
		{
			int count = 0;
			
			for ( int j = 0; j < items.length() ; j++)
			{
				if (product[i].getProductCode().equals(String.valueOf(items.charAt(j))))
				{
					count = count+1; 
				}
			}
			
			if (count > 0)
			{
				shoppingCart.add(new ShoppingCartItem(product[i], count));
			}

		}
		
	}
	else
		System.out.println("Items list entered is null or has invalid product");
	
	if(!shoppingCart.isEmpty())
	{
		for ( int i = 0; i < shoppingCart.size() ; i++)
		{
			totalDiscountAmount = totalDiscountAmount + calculateDiscountAmount(shoppingCart.get(i).getproduct(),shoppingCart.get(i).getquantity());
			totalUndiscountedAmount = totalUndiscountedAmount + (shoppingCart.get(i).getproduct().getProductPrice() * shoppingCart.get(i).getquantity());
		}
		totalInvoiceAmount = totalUndiscountedAmount - totalDiscountAmount;
	}

	return totalInvoiceAmount;
	
	}


/**
 * @param s
 * @return
 */
private boolean validateInputString(String s)
{
	boolean matchFound = false ;
	if ( s!= null && s.length()>0)
	{
		for (int i = 0; i < s.length(); i++)
		{
			matchFound = false;
			
			for ( int j = 0; j < product.length  ; j++)
			{
				if ((String.valueOf(s.charAt(i)).equals(product[j].getProductCode())))
				{
					matchFound = true;
					break;
				}
			}
			if (!matchFound)
			{
				break;				
			}
	
		}
	}
	
	
	return matchFound
		;
}

/**
 * 
 */
public void initialize()
	{
		Offer [] offers = new Offer[1];
		//offers[0] = new Offer("dollaroff", 2, new int[]{0,0});
		//offers[1] = new Offer("discountpercent", 0.3, new int[]{0,0});
		
		offers[0] = new Offer(Offer.OFFER_TYPE_BUY_X_GET_Y_FREE, 0, new int[]{5,2});
		
		
		this.product  = new Product[3];
		product[0]= new Product ("A", 20);
		product[1]= new Product ("B", 50, offers[0]);
		product[2]= new Product ("C", 30);
		
	}
	public static void main(String[] args) {

		SuperMarketImpl superMarket = new SuperMarketImpl();


		
		if(args != null && args.length > 0)
		{
			System.out.println(args[0]);
			System.out.println(superMarket.checkout(args[0]));

		}
		else
			System.out.println("Input String is null");
		
	}


	/**
	 * @param p
	 * @param q
	 * @return
	 */
	private double calculateDiscountAmount(Product p, int q)
	{
		double discountAmount = 0;
		
		if(Offer.OFFER_TYPE_BUY_X_GET_Y_FREE.equals(p.getOffer().getOfferType()))
		{
			discountAmount = 
					Math.floor(q/p.getOffer().getbuyXgetYfree()[0]) * p.getOffer().getbuyXgetYfree()[1] * p.getProductPrice();			
		}
		else if(Offer.OFFER_TYPE_DOLLAROFF.equals(p.getOffer().getOfferType()))
		{
			discountAmount = p.getOffer().getFactor();
			
		}
		else if(Offer.OFFER_TYPE_PERCENT_DISCOUNT.equals(p.getOffer().getOfferType()))
		{
			discountAmount = p.getProductPrice() * p.getOffer().getFactor();			
		}
				
		return discountAmount;
		
	}
	
}
