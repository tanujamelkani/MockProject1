/*
 * Offer describes the offer on a product
 */
public class Offer {
	
	private String offerType; //buyXgetYfree, dollaroff, discountpercent, nooffer
	private double factor; //holds the discount for dollaroff or discountpercent
	private int[] buyXgetYfree;//holds the numerical value of offer: buyXgetYfree[0] is buy X, buyXgetYfree[1] is Y items free
	
	//String constants to hold the type of offer
	public static final String OFFER_TYPE_BUY_X_GET_Y_FREE = "buyXgetYfree";
	public static final String OFFER_TYPE_DOLLAROFF = "dollaroff";
	public static final String OFFER_TYPE_PERCENT_DISCOUNT = "discountpercent";
	public static final String OFFER_TYPE_NONE = "nooffer";
	/**
	 * @param type
	 * @param factor
	 * @param buyXgetYfree
	 */
	public Offer (String type, double factor, int[] buyXgetYfree)
	{
		this.offerType = type;
		this.factor = factor;
		this.buyXgetYfree = buyXgetYfree;
	}
	/**
	 * @param type
	 */
	public Offer (String type)
	{
		this.offerType = type;
	}
	
	/**
	 * @return
	 */
	public String getOfferType() {
		return offerType;
	}
	/**
	 * @param offerType
	 */
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	/**
	 * @return
	 */
	public double getFactor() {
		return factor;
	}
	/**
	 * @param factor
	 */
	public void setFactor(double factor) {
		this.factor = factor;
	}
	/**
	 * @return
	 */
	public int[] getbuyXgetYfree() {
		return buyXgetYfree;
	}
	/**
	 * @param buyXgetYfree
	 */
	public void setbuyXgetYfree(int[] buyXgetYfree) {
		this.buyXgetYfree = buyXgetYfree;
	}
	

}
